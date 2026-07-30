package com.baidu.ar;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class pe {

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, String> f2963a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static long f2964b;

    public static void a() {
        f2963a.put("time1", String.valueOf(Math.abs(System.currentTimeMillis() - f2964b) / 1000.0d));
    }

    public static void b() {
        f2963a.put("time2", String.valueOf(Math.abs(System.currentTimeMillis() - f2964b) / 1000.0d));
    }

    public static void c() {
        f2963a.put("time3", String.valueOf(Math.abs(System.currentTimeMillis() - f2964b) / 1000.0d));
    }

    public static void d() {
        f2963a.put("time4", String.valueOf(Math.abs(System.currentTimeMillis() - f2964b) / 1000.0d));
    }

    public static void e() {
        f2963a.put("time5", String.valueOf(Math.abs(System.currentTimeMillis() - f2964b) / 1000.0d));
    }

    public static Map<String, String> f() {
        return f2963a;
    }

    public static void g() {
        f2964b = System.currentTimeMillis();
        f2963a.clear();
    }
}
