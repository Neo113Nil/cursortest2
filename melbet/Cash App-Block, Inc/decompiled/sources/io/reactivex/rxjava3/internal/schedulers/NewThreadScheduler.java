package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes9.dex */
public final class NewThreadScheduler extends Scheduler {
    public static final RxThreadFactory THREAD_FACTORY = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);
    public final ThreadFactory threadFactory = THREAD_FACTORY;

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Scheduler.Worker createWorker() {
        return new NewThreadWorker(this.threadFactory);
    }
}
