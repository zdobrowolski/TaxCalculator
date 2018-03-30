package com.zdobrowo.accounting.repositories;


import com.zdobrowo.accounting.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mbart on 28.02.2016.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
