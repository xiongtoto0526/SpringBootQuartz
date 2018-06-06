package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.demo")
@MapperScan("com.example.demo.dao")
@SpringBootApplication
public class DemoApplication {


    // add jobName: com.example.demo.job.NewJob   group: 1  expression: 0/3 * * * * ?
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
