package com.bytedance.zmn.zmn.fs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class zmn {
    private static ExecutorService fs;
    private static ExecutorService zmn;

    public static ExecutorService zmn() {
        if (zmn == null) {
            synchronized (zmn.class) {
                try {
                    if (zmn == null) {
                        zmn = new ThreadPoolExecutor(1, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.bytedance.zmn.zmn.fs.zmn.1
                            final AtomicInteger zmn = new AtomicInteger(0);

                            @Override // java.util.concurrent.ThreadFactory
                            public Thread newThread(Runnable runnable) {
                                return new Thread(null, runnable, "ALOG_UP_" + this.zmn.getAndIncrement());
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public static ExecutorService fs() {
        if (fs == null) {
            synchronized (zmn.class) {
                try {
                    if (fs == null) {
                        fs = new ThreadPoolExecutor(1, 2, 60L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ThreadFactory() { // from class: com.bytedance.zmn.zmn.fs.zmn.2
                            final AtomicInteger zmn = new AtomicInteger(0);

                            @Override // java.util.concurrent.ThreadFactory
                            public Thread newThread(Runnable runnable) {
                                return new Thread(null, runnable, "ALOG_SA_" + this.zmn.getAndIncrement());
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fs;
    }
}
