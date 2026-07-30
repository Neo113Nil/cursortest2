package com.anythink.expressad.foundation.g.f;

import android.net.TrafficStats;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f19383a;

    /* renamed from: b, reason: collision with root package name */
    private static long f19384b;

    /* renamed from: c, reason: collision with root package name */
    private static long f19385c;

    /* renamed from: com.anythink.expressad.foundation.g.f.a$a, reason: collision with other inner class name */
    public static class C0122a {

        /* renamed from: a, reason: collision with root package name */
        private static a f19389a = new a(0);

        private C0122a() {
        }
    }

    private a() {
    }

    public static a a() {
        return C0122a.f19389a;
    }

    public static long b() {
        return f19384b;
    }

    private synchronized void c() {
        if (f19383a == 0) {
            f19383a = SystemClock.elapsedRealtime();
            f19385c = TrafficStats.getTotalRxBytes();
        }
    }

    private synchronized void d() {
        try {
            if (f19383a != 0 && f19385c != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - f19383a;
                if (elapsedRealtime != 0) {
                    try {
                        if (TrafficStats.getTotalRxBytes() != -1) {
                            long totalRxBytes = ((TrafficStats.getTotalRxBytes() - f19385c) * 1000) / elapsedRealtime;
                            if (totalRxBytes == 0) {
                                f19384b = 1L;
                            } else {
                                f19384b = totalRxBytes;
                            }
                        } else {
                            f19384b = 0L;
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void e() {
        f19385c = 0L;
        f19383a = 0L;
    }

    public /* synthetic */ a(byte b9) {
        this();
    }
}
