package com.baidu.platform.comapi.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9831a;

    /* renamed from: b, reason: collision with root package name */
    private static final int f9832b;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f9831a = availableProcessors;
        f9832b = Math.min((availableProcessors * 2) + 1, 8);
    }

    public static ExecutorService a(String str) {
        int i8 = f9832b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i8, i8, 60L, timeUnit, new LinkedBlockingQueue(), new b(str));
        try {
            threadPoolExecutor.setKeepAliveTime(60L, timeUnit);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        return threadPoolExecutor;
    }
}
