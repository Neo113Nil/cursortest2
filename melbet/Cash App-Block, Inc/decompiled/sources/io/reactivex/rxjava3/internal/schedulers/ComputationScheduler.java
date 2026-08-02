package io.reactivex.rxjava3.internal.schedulers;

import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.ListCompositeDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class ComputationScheduler extends Scheduler {
    public static final int MAX_THREADS;
    public static final FixedSchedulerPool NONE;
    public static final PoolWorker SHUTDOWN_WORKER;
    public static final RxThreadFactory THREAD_FACTORY;
    public final AtomicReference pool;

    public final class EventLoopWorker extends Scheduler.Worker {
        public final ListCompositeDisposable both;
        public volatile boolean disposed;
        public final PoolWorker poolWorker;
        public final CompositeDisposable timed;

        public EventLoopWorker(PoolWorker poolWorker) {
            this.poolWorker = poolWorker;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.timed = compositeDisposable;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.both = listCompositeDisposable2;
            listCompositeDisposable2.add(listCompositeDisposable);
            listCompositeDisposable2.add(compositeDisposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.both.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public final Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.disposed ? EmptyDisposable.INSTANCE : this.poolWorker.scheduleActual(runnable, j, timeUnit, this.timed);
        }
    }

    public final class FixedSchedulerPool {
        public final int cores;
        public final PoolWorker[] eventLoops;
        public long n;

        public FixedSchedulerPool(int i, ThreadFactory threadFactory) {
            this.cores = i;
            this.eventLoops = new PoolWorker[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.eventLoops[i2] = new PoolWorker(threadFactory);
            }
        }
    }

    public final class PoolWorker extends NewThreadWorker {
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        MAX_THREADS = availableProcessors;
        PoolWorker poolWorker = new PoolWorker(new RxThreadFactory("RxComputationShutdown"));
        SHUTDOWN_WORKER = poolWorker;
        poolWorker.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        THREAD_FACTORY = rxThreadFactory;
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(0, rxThreadFactory);
        NONE = fixedSchedulerPool;
        for (PoolWorker poolWorker2 : fixedSchedulerPool.eventLoops) {
            poolWorker2.dispose();
        }
    }

    public ComputationScheduler() {
        FixedSchedulerPool fixedSchedulerPool = NONE;
        AtomicReference atomicReference = new AtomicReference(fixedSchedulerPool);
        this.pool = atomicReference;
        FixedSchedulerPool fixedSchedulerPool2 = new FixedSchedulerPool(MAX_THREADS, THREAD_FACTORY);
        while (!atomicReference.compareAndSet(fixedSchedulerPool, fixedSchedulerPool2)) {
            if (atomicReference.get() != fixedSchedulerPool) {
                for (PoolWorker poolWorker : fixedSchedulerPool2.eventLoops) {
                    poolWorker.dispose();
                }
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Scheduler.Worker createWorker() {
        PoolWorker poolWorker;
        FixedSchedulerPool fixedSchedulerPool = (FixedSchedulerPool) this.pool.get();
        int i = fixedSchedulerPool.cores;
        if (i == 0) {
            poolWorker = SHUTDOWN_WORKER;
        } else {
            PoolWorker[] poolWorkerArr = fixedSchedulerPool.eventLoops;
            long j = fixedSchedulerPool.n;
            fixedSchedulerPool.n = 1 + j;
            poolWorker = poolWorkerArr[(int) (j % i)];
        }
        return new EventLoopWorker(poolWorker);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        PoolWorker poolWorker;
        Future future;
        FixedSchedulerPool fixedSchedulerPool = (FixedSchedulerPool) this.pool.get();
        int i = fixedSchedulerPool.cores;
        if (i == 0) {
            poolWorker = SHUTDOWN_WORKER;
        } else {
            PoolWorker[] poolWorkerArr = fixedSchedulerPool.eventLoops;
            long j2 = fixedSchedulerPool.n;
            fixedSchedulerPool.n = 1 + j2;
            poolWorker = poolWorkerArr[(int) (j2 % i)];
        }
        poolWorker.getClass();
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = poolWorker.executor;
        try {
            Future submit = j <= 0 ? scheduledThreadPoolExecutor.submit(scheduledDirectTask) : scheduledThreadPoolExecutor.schedule(scheduledDirectTask, j, timeUnit);
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
