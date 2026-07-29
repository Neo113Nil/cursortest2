package com.dancingbogo.skyrolline.util;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: BackgroundThread.java */
/* loaded from: classes2.dex */
public class a extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    private static a f4603a;

    /* renamed from: b, reason: collision with root package name */
    private static Handler f4604b;

    public a() {
        super("BackgroundThread", 0);
    }

    private static void a() {
        if (f4603a == null) {
            f4603a = new a();
            f4603a.start();
            f4604b = new Handler(f4603a.getLooper());
        }
    }

    public static void a(Runnable runnable) {
        a(runnable, 0L);
    }

    public static void a(Runnable runnable, long j) {
        synchronized (a.class) {
            a();
            f4604b.postDelayed(runnable, j);
        }
    }
}
