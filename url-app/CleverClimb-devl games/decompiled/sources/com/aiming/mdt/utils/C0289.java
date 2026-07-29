package com.aiming.mdt.utils;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.aiming.mdt.utils.ʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0289 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final ScheduledThreadPoolExecutor f827;

    static {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(12);
        f827 = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        f827.setMaximumPoolSize(30);
        f827.setRejectedExecutionHandler(new RejectedExecutionHandlerC0278());
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static void m980(Runnable runnable) {
        f827.execute(runnable);
    }
}
