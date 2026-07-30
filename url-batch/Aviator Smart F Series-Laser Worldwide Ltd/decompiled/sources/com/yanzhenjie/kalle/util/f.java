package com.yanzhenjie.kalle.util;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class f implements Executor {
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final ThreadFactory THREAD_FACTORY = new a();
    private ThreadPoolExecutor mPoolExecutor;

    static class a implements ThreadFactory {
        private final AtomicInteger mCount = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Request #" + this.mCount.getAndIncrement());
        }
    }

    public f() {
        int i8 = CPU_COUNT;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(Math.max(2, Math.min(i8 - 1, 4)), (i8 * 2) + 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), THREAD_FACTORY);
        this.mPoolExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.mPoolExecutor.execute(runnable);
    }
}
