package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class q33 implements o33 {
    /* synthetic */ q33(p33 p33Var) {
    }

    @Override // com.google.android.gms.internal.ads.o33
    public final ExecutorService a(ThreadFactory threadFactory, int i7) {
        return b(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.o33
    public final ExecutorService b(int i7, ThreadFactory threadFactory, int i8) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i7, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.o33
    public final ExecutorService d(int i7) {
        return b(1, Executors.defaultThreadFactory(), 2);
    }
}
