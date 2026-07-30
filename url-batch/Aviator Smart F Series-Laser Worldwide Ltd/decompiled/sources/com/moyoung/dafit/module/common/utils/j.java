package com.moyoung.dafit.module.common.utils;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* loaded from: classes4.dex */
public class j {
    private final Properties properties;

    private j() {
        Properties properties = new Properties();
        this.properties = properties;
        properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
    }

    public static j newInstance() {
        return new j();
    }

    public boolean containsKey(Object obj) {
        return this.properties.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.properties.containsValue(obj);
    }

    public Set<Map.Entry<Object, Object>> entrySet() {
        return this.properties.entrySet();
    }

    public String getProperty(String str) {
        return this.properties.getProperty(str);
    }

    public boolean isEmpty() {
        return this.properties.isEmpty();
    }

    public Set<Object> keySet() {
        return this.properties.keySet();
    }

    public Enumeration<Object> keys() {
        return this.properties.keys();
    }

    public int size() {
        return this.properties.size();
    }

    public Collection<Object> values() {
        return this.properties.values();
    }

    public String getProperty(String str, String str2) {
        return this.properties.getProperty(str, str2);
    }
}
