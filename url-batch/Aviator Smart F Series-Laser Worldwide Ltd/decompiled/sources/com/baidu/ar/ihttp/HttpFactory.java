package com.baidu.ar.ihttp;

import com.baidu.ar.ab;
import com.baidu.ar.d6;

/* loaded from: classes.dex */
public final class HttpFactory {

    /* renamed from: a, reason: collision with root package name */
    public static volatile d6 f2501a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile int f2502b;

    /* renamed from: c, reason: collision with root package name */
    public static Object f2503c = new Object();

    public static d6 a() {
        if (f2501a != null) {
            return f2501a;
        }
        if (isAvailable()) {
            synchronized (f2503c) {
                try {
                    if (f2501a == null) {
                        f2501a = (d6) ab.a("com.baidu.ar.http.HttpRequestFactory");
                    }
                } finally {
                }
            }
        }
        return f2501a;
    }

    public static boolean isAvailable() {
        if (f2502b == 1) {
            return true;
        }
        if (f2502b == -1) {
            return false;
        }
        synchronized (f2503c) {
            f2502b = 1;
        }
        return true;
    }

    public static IHttpRequest newRequest() {
        d6 a8 = a();
        if (a8 != null) {
            return a8.newRequest();
        }
        return null;
    }

    public static void release() {
        if (f2501a != null) {
            f2501a.release();
            f2501a = null;
        }
    }
}
