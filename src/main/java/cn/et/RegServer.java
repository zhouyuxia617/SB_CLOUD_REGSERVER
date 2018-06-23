package cn.et;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心（第三步）
 */
@SpringBootApplication
@EnableEurekaServer
public class RegServer {

	/*
	 * http://localhost:8761访问以下，所有的微服务都注册在这个注册中心
	 */
	public static void main(String[] args) {
		SpringApplication.run(RegServer.class, args);
	}
}
