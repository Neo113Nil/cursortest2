package com.cmplay.base.util;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: BackgroundThread.java */
/* loaded from: classes.dex */
public class e extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    private static e f4010a;

    /* renamed from: b, reason: collision with root package name */
    private static Handler f4011b;

    public e() {
        super("cloud_thread", 0);
    }

    private static void a() {
        if (f4010a == null) {
            f4010a = new e();
            f4010a.start();
            f4011b = new Handler(f4010a.getLooper());
        }
    }

    public static void a(Runnable runnable) {
        a(runnable, 0L);
    }

    public static void a(Runnable runnable, long j) {
        synchronized (e.class) {
            a();
            f4011b.postDelayed(runnable, j);
        }
    }
}
