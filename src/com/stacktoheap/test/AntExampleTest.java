package com.stacktoheap.test;

import com.stacktoheap.AntExample;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AntExampleTest {

    private AntExample antExample;

    @Before
    public void method() {
        antExample = new AntExample();
    }
    @Test
    public void testAdd5() {
        assertEquals("5 added to 5 is 10", 10, antExample.add5(5));
    }
}
