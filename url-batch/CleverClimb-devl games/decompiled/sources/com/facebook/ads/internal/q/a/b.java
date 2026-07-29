package com.facebook.ads.internal.q.a;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f5394a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f5395b;

    public static synchronized String a(String str) {
        synchronized (b.class) {
            if (!a()) {
                return null;
            }
            return System.getProperty("fb.e2e." + str);
        }
    }

    public static synchronized boolean a() {
        boolean z;
        synchronized (b.class) {
            if (!f5395b) {
                f5394a = "true".equals(System.getProperty("fb.running_e2e"));
                f5395b = true;
            }
            z = f5394a;
        }
        return z;
    }

    public static synchronized boolean b(String str) {
        boolean z;
        synchronized (b.class) {
            z = !TextUtils.isEmpty(a(str));
        }
        return z;
    }
}
