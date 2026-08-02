package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
final class zzcaa extends ScheduledThreadPoolExecutor implements AutoCloseable {
    zzcaa(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ForkJoinPool commonPool;
        if (Build.VERSION.SDK_INT > 23) {
            commonPool = ForkJoinPool.commonPool();
            if (this == commonPool) {
                return;
            }
        }
        if (isTerminated()) {
            return;
        }
        shutdown();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                z = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z2) {
                    shutdownNow();
                }
                z2 = true;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }
}
