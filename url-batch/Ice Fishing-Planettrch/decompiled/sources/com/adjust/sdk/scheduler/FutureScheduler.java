package com.adjust.sdk.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public interface FutureScheduler {
    ScheduledFuture<?> scheduleFuture(Runnable runnable, long j);

    ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j, long j2);

    <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j);

    void teardown();
}
