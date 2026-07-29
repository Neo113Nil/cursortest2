package com.facebook.ads.internal.q.a;

import java.util.UUID;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5420a = "m";

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f5421b;

    /* renamed from: c, reason: collision with root package name */
    private static double f5422c;

    /* renamed from: d, reason: collision with root package name */
    private static String f5423d;

    public static void a() {
        if (f5421b) {
            return;
        }
        synchronized (f5420a) {
            if (!f5421b) {
                f5421b = true;
                double currentTimeMillis = System.currentTimeMillis();
                Double.isNaN(currentTimeMillis);
                f5422c = currentTimeMillis / 1000.0d;
                f5423d = UUID.randomUUID().toString();
            }
        }
    }

    public static double b() {
        return f5422c;
    }

    public static String c() {
        return f5423d;
    }
}
