package com.chartboost.sdk.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r2 {
    public static final r2 a = new r2();

    public static final class a implements ThreadFactory {
        public final String a;
        public final AtomicInteger b;

        public a(String prefix) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            this.a = prefix;
            this.b = new AtomicInteger(1);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r) {
            Intrinsics.checkNotNullParameter(r, "r");
            return new Thread(r, this.a + this.b.getAndIncrement());
        }
    }

    public static final ScheduledExecutorService a(int i, String threadPrefix) {
        Intrinsics.checkNotNullParameter(threadPrefix, "threadPrefix");
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new a(threadPrefix));
        scheduledThreadPoolExecutor.prestartAllCoreThreads();
        return scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ ScheduledExecutorService a(int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            str = "CBAsync-";
        }
        return a(i, str);
    }

    public static final ExecutorService a(int i, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, j, timeUnit, new PriorityBlockingQueue());
        threadPoolExecutor.prestartAllCoreThreads();
        return threadPoolExecutor;
    }

    public static /* synthetic */ ExecutorService a(int i, long j, TimeUnit timeUnit, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 10;
        }
        if ((i2 & 4) != 0) {
            timeUnit = TimeUnit.SECONDS;
        }
        return a(i, j, timeUnit);
    }
}
