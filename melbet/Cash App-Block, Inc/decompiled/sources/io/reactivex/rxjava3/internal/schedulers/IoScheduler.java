package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class IoScheduler extends Scheduler {
    public static final RxThreadFactory EVICTOR_THREAD_FACTORY;
    public static final long KEEP_ALIVE_TIME = Long.getLong("rx3.io-keep-alive-time", 60).longValue();
    public static final CachedWorkerPool NONE;
    public static final ThreadWorker SHUTDOWN_THREAD_WORKER;
    public static final boolean USE_SCHEDULED_RELEASE;
    public static final RxThreadFactory WORKER_THREAD_FACTORY;
    public final AtomicReference pool;

    public final class CachedWorkerPool implements Runnable {
        public final CompositeDisposable allWorkers;
        public final ScheduledExecutorService evictorService;
        public final ScheduledFuture evictorTask;
        public final ConcurrentLinkedQueue expiringWorkerQueue;
        public final long keepAliveTime;
        public final ThreadFactory threadFactory;

        public CachedWorkerPool(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            CachedWorkerPool cachedWorkerPool;
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.keepAliveTime = nanos;
            this.expiringWorkerQueue = new ConcurrentLinkedQueue();
            this.allWorkers = new CompositeDisposable();
            this.threadFactory = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, IoScheduler.EVICTOR_THREAD_FACTORY);
                cachedWorkerPool = this;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(cachedWorkerPool, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                cachedWorkerPool = this;
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            cachedWorkerPool.evictorService = scheduledExecutorService;
            cachedWorkerPool.evictorTask = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.expiringWorkerQueue;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long nanoTime = System.nanoTime();
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                ThreadWorker threadWorker = (ThreadWorker) it.next();
                if (threadWorker.expirationTime > nanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(threadWorker)) {
                    this.allWorkers.remove(threadWorker);
                }
            }
        }
    }

    public final class EventLoopWorker extends Scheduler.Worker implements Runnable {
        public final CachedWorkerPool pool;
        public final ThreadWorker threadWorker;
        public final AtomicBoolean once = new AtomicBoolean();
        public final CompositeDisposable tasks = new CompositeDisposable();

        public EventLoopWorker(CachedWorkerPool cachedWorkerPool) {
            ThreadWorker threadWorker;
            ThreadWorker threadWorker2;
            this.pool = cachedWorkerPool;
            if (cachedWorkerPool.allWorkers.disposed) {
                threadWorker2 = IoScheduler.SHUTDOWN_THREAD_WORKER;
            } else {
                while (true) {
                    if (cachedWorkerPool.expiringWorkerQueue.isEmpty()) {
                        threadWorker = new ThreadWorker(cachedWorkerPool.threadFactory);
                        cachedWorkerPool.allWorkers.add(threadWorker);
                        break;
                    } else {
                        threadWorker = (ThreadWorker) cachedWorkerPool.expiringWorkerQueue.poll();
                        if (threadWorker != null) {
                            break;
                        }
                    }
                }
                threadWorker2 = threadWorker;
            }
            this.threadWorker = threadWorker2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.once.compareAndSet(false, true)) {
                this.tasks.dispose();
                if (IoScheduler.USE_SCHEDULED_RELEASE) {
                    this.threadWorker.scheduleActual(this, 0L, TimeUnit.NANOSECONDS, null);
                    return;
                }
                CachedWorkerPool cachedWorkerPool = this.pool;
                cachedWorkerPool.getClass();
                long nanoTime = System.nanoTime() + cachedWorkerPool.keepAliveTime;
                ThreadWorker threadWorker = this.threadWorker;
                threadWorker.expirationTime = nanoTime;
                cachedWorkerPool.expiringWorkerQueue.offer(threadWorker);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            CachedWorkerPool cachedWorkerPool = this.pool;
            cachedWorkerPool.getClass();
            long nanoTime = System.nanoTime() + cachedWorkerPool.keepAliveTime;
            ThreadWorker threadWorker = this.threadWorker;
            threadWorker.expirationTime = nanoTime;
            cachedWorkerPool.expiringWorkerQueue.offer(threadWorker);
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public final Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.tasks.disposed ? EmptyDisposable.INSTANCE : this.threadWorker.scheduleActual(runnable, j, timeUnit, this.tasks);
        }
    }

    public final class ThreadWorker extends NewThreadWorker {
        public long expirationTime;

        public ThreadWorker(ThreadFactory threadFactory) {
            super(threadFactory);
            this.expirationTime = 0L;
        }
    }

    static {
        ThreadWorker threadWorker = new ThreadWorker(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        SHUTDOWN_THREAD_WORKER = threadWorker;
        threadWorker.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", max, false);
        WORKER_THREAD_FACTORY = rxThreadFactory;
        EVICTOR_THREAD_FACTORY = new RxThreadFactory("RxCachedWorkerPoolEvictor", max, false);
        USE_SCHEDULED_RELEASE = Boolean.getBoolean("rx3.io-scheduled-release");
        CachedWorkerPool cachedWorkerPool = new CachedWorkerPool(0L, null, rxThreadFactory);
        NONE = cachedWorkerPool;
        cachedWorkerPool.allWorkers.dispose();
        ScheduledFuture scheduledFuture = cachedWorkerPool.evictorTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = cachedWorkerPool.evictorService;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public IoScheduler() {
        CachedWorkerPool cachedWorkerPool = NONE;
        AtomicReference atomicReference = new AtomicReference(cachedWorkerPool);
        this.pool = atomicReference;
        CachedWorkerPool cachedWorkerPool2 = new CachedWorkerPool(KEEP_ALIVE_TIME, TimeUnit.SECONDS, WORKER_THREAD_FACTORY);
        while (!atomicReference.compareAndSet(cachedWorkerPool, cachedWorkerPool2)) {
            if (atomicReference.get() != cachedWorkerPool) {
                cachedWorkerPool2.allWorkers.dispose();
                ScheduledFuture scheduledFuture = cachedWorkerPool2.evictorTask;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = cachedWorkerPool2.evictorService;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Scheduler.Worker createWorker() {
        return new EventLoopWorker((CachedWorkerPool) this.pool.get());
    }
}
