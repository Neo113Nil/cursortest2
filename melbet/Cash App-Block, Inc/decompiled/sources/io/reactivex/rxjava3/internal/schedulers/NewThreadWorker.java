package io.reactivex.rxjava3.internal.schedulers;

import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class NewThreadWorker extends Scheduler.Worker {
    public volatile boolean disposed;
    public final ScheduledThreadPoolExecutor executor;

    public NewThreadWorker(ThreadFactory threadFactory) {
        boolean z = SchedulerPoolFactory.PURGE_ENABLED;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(SchedulerPoolFactory.PURGE_ENABLED);
        this.executor = scheduledThreadPoolExecutor;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.disposed) {
            return;
        }
        this.disposed = true;
        this.executor.shutdownNow();
    }

    @Override // io.reactivex.rxjava3.core.Scheduler.Worker
    public final Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.disposed ? EmptyDisposable.INSTANCE : scheduleActual(runnable, j, timeUnit, null);
    }

    public final ScheduledRunnable scheduleActual(Runnable runnable, long j, TimeUnit timeUnit, DisposableContainer disposableContainer) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, disposableContainer);
        if (disposableContainer != null && !disposableContainer.add(scheduledRunnable)) {
            return scheduledRunnable;
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.executor;
        try {
            scheduledRunnable.setFuture(j <= 0 ? scheduledThreadPoolExecutor.submit((Callable) scheduledRunnable) : scheduledThreadPoolExecutor.schedule((Callable) scheduledRunnable, j, timeUnit));
            return scheduledRunnable;
        } catch (RejectedExecutionException e) {
            if (disposableContainer != null) {
                disposableContainer.remove(scheduledRunnable);
            }
            UnsignedBytes.onError(e);
            return scheduledRunnable;
        }
    }
}
