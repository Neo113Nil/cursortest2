package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.schedulers.NewThreadWorker;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public abstract class Scheduler {

    public final class DisposeTask implements Disposable, Runnable {
        public final Runnable decoratedRun;
        public Thread runner;
        public final Worker w;

        public DisposeTask(Runnable runnable, Worker worker) {
            this.decoratedRun = runnable;
            this.w = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.runner == Thread.currentThread()) {
                Worker worker = this.w;
                if (worker instanceof NewThreadWorker) {
                    NewThreadWorker newThreadWorker = (NewThreadWorker) worker;
                    if (newThreadWorker.disposed) {
                        return;
                    }
                    newThreadWorker.disposed = true;
                    newThreadWorker.executor.shutdown();
                    return;
                }
            }
            this.w.dispose();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.runner = Thread.currentThread();
            try {
                this.decoratedRun.run();
            } finally {
            }
        }
    }

    public abstract class Worker implements Disposable {
        public abstract Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit);
    }

    static {
        Boolean.getBoolean("rx3.scheduler.use-nanotime");
        long longValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        if ("seconds".equalsIgnoreCase(property)) {
            TimeUnit.SECONDS.toNanos(longValue);
        } else if ("milliseconds".equalsIgnoreCase(property)) {
            TimeUnit.MILLISECONDS.toNanos(longValue);
        } else {
            TimeUnit.MINUTES.toNanos(longValue);
        }
    }

    public abstract Worker createWorker();

    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        Worker createWorker = createWorker();
        DisposeTask disposeTask = new DisposeTask(runnable, createWorker);
        createWorker.schedule(disposeTask, j, timeUnit);
        return disposeTask;
    }
}
