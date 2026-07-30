package com.baidu.platform.comapi.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f9836a = Executors.newSingleThreadExecutor(new b("Single"));

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f9837b = Executors.newFixedThreadPool(4, new b("FixedPool"));

    /* renamed from: c, reason: collision with root package name */
    private static final Handler f9838c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private static final ExecutorService f9839d = f.a("DefaultPool");

    public static ExecutorService a() {
        return f9839d;
    }

    public static ExecutorService b() {
        return f9837b;
    }

    public static ExecutorService c() {
        return f9836a;
    }

    public static void a(Runnable runnable, long j8) {
        f9838c.postDelayed(runnable, j8);
    }
}
