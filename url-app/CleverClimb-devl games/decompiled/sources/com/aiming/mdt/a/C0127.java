package com.aiming.mdt.a;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.aiming.mdt.a.ʼʽˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0127 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static final int f389 = Runtime.getRuntime().availableProcessors();

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static final ThreadFactory f390 = new ThreadFactoryC0084();

    /* renamed from: ʽ, reason: contains not printable characters */
    private static ThreadPoolExecutor f391;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(Math.max(2, Math.min(f389 - 1, 4)), (f389 << 1) + 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), f390);
        f391 = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f391.setRejectedExecutionHandler(new RejectedExecutionHandlerC0062());
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static void m476(Runnable runnable) {
        f391.execute(runnable);
    }
}
