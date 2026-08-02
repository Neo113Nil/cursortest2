package io.reactivex.rxjava3.internal.schedulers;

import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class SingleScheduler extends Scheduler {
    public static final ScheduledExecutorService SHUTDOWN;
    public static final RxThreadFactory SINGLE_THREAD_FACTORY;
    public final AtomicReference executor;

    public final class ScheduledWorker extends Scheduler.Worker {
        public volatile boolean disposed;
        public final ScheduledExecutorService executor;
        public final CompositeDisposable tasks = new CompositeDisposable();

        public ScheduledWorker(ScheduledExecutorService scheduledExecutorService) {
            this.executor = scheduledExecutorService;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.tasks.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public final Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            if (this.disposed) {
                return emptyDisposable;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.tasks);
            this.tasks.add(scheduledRunnable);
            ScheduledExecutorService scheduledExecutorService = this.executor;
            try {
                scheduledRunnable.setFuture(j <= 0 ? scheduledExecutorService.submit((Callable) scheduledRunnable) : scheduledExecutorService.schedule((Callable) scheduledRunnable, j, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                UnsignedBytes.onError(e);
                return emptyDisposable;
            }
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        SHUTDOWN = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        SINGLE_THREAD_FACTORY = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public SingleScheduler() {
        AtomicReference atomicReference = new AtomicReference();
        this.executor = atomicReference;
        boolean z = SchedulerPoolFactory.PURGE_ENABLED;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, SINGLE_THREAD_FACTORY);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(SchedulerPoolFactory.PURGE_ENABLED);
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Scheduler.Worker createWorker() {
        return new ScheduledWorker((ScheduledExecutorService) this.executor.get());
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        AtomicReference atomicReference = this.executor;
        try {
            Future submit = j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(scheduledDirectTask) : ((ScheduledExecutorService) atomicReference.get()).schedule(scheduledDirectTask, j, timeUnit);
            do {
                future = (Future) scheduledDirectTask.get();
                if (future == ScheduledDirectTask.FINISHED) {
                    break;
                }
                if (future == ScheduledDirectTask.DISPOSED) {
                    if (scheduledDirectTask.runner == Thread.currentThread()) {
                        submit.cancel(false);
                        return scheduledDirectTask;
                    }
                    submit.cancel(scheduledDirectTask.interruptOnCancel);
                    return scheduledDirectTask;
                }
            } while (!scheduledDirectTask.compareAndSet(future, submit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            UnsignedBytes.onError(e);
            return EmptyDisposable.INSTANCE;
        }
    }
}
