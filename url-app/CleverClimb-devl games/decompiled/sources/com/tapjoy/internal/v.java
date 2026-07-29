package com.tapjoy.internal;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private static String f8519a = "pool.ntp.org";

    /* renamed from: b, reason: collision with root package name */
    private static long f8520b = 20000;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f8521c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile String f8522d;
    private static volatile long e;
    private static volatile long f;
    private static volatile long g;
    private static volatile long h;
    private static volatile long i;

    static {
        a(false, "System", System.currentTimeMillis(), SystemClock.elapsedRealtime(), Long.MAX_VALUE);
    }

    private static synchronized void a(boolean z, String str, long j, long j2, long j3) {
        synchronized (v.class) {
            f8521c = z;
            f8522d = str;
            e = j;
            f = j2;
            g = j3;
            h = e - f;
            i = (SystemClock.elapsedRealtime() + h) - System.currentTimeMillis();
        }
    }

    public static boolean a() {
        String str = f8519a;
        long j = f8520b;
        gl glVar = new gl();
        if (!glVar.a(str, (int) j)) {
            return false;
        }
        a(true, "SNTP", glVar.f8208a, glVar.f8209b, glVar.f8210c / 2);
        return true;
    }

    public static long b() {
        return SystemClock.elapsedRealtime() + h;
    }

    public static long a(long j) {
        return j + h;
    }

    public static boolean c() {
        return f8521c;
    }
}
