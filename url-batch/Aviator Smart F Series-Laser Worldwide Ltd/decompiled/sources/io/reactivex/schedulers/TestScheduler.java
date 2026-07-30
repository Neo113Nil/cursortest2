package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class TestScheduler extends Scheduler {
    long counter;
    final Queue<TimedRunnable> queue = new PriorityBlockingQueue(11);
    volatile long time;

    static final class TimedRunnable implements Comparable<TimedRunnable> {
        final long count;
        final Runnable run;
        final TestWorker scheduler;
        final long time;

        TimedRunnable(TestWorker testWorker, long j8, Runnable runnable, long j9) {
            this.time = j8;
            this.run = runnable;
            this.scheduler = testWorker;
            this.count = j9;
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.time), this.run.toString());
        }

        @Override // java.lang.Comparable
        public int compareTo(TimedRunnable timedRunnable) {
            long j8 = this.time;
            long j9 = timedRunnable.time;
            return j8 == j9 ? ObjectHelper.compare(this.count, timedRunnable.count) : ObjectHelper.compare(j8, j9);
        }
    }

    public TestScheduler() {
    }

    public void advanceTimeBy(long j8, TimeUnit timeUnit) {
        advanceTimeTo(this.time + timeUnit.toNanos(j8), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j8, TimeUnit timeUnit) {
        triggerActions(timeUnit.toNanos(j8));
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new TestWorker();
    }

    @Override // io.reactivex.Scheduler
    public long now(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.time, TimeUnit.NANOSECONDS);
    }

    public void triggerActions() {
        triggerActions(this.time);
    }

    private void triggerActions(long j8) {
        while (true) {
            TimedRunnable peek = this.queue.peek();
            if (peek == null) {
                break;
            }
            long j9 = peek.time;
            if (j9 > j8) {
                break;
            }
            if (j9 == 0) {
                j9 = this.time;
            }
            this.time = j9;
            this.queue.remove(peek);
            if (!peek.scheduler.disposed) {
                peek.run.run();
            }
        }
        this.time = j8;
    }

    public TestScheduler(long j8, TimeUnit timeUnit) {
        this.time = timeUnit.toNanos(j8);
    }

    final class TestWorker extends Scheduler.Worker {
        volatile boolean disposed;

        final class QueueRemove implements Runnable {
            final TimedRunnable timedAction;

            QueueRemove(TimedRunnable timedRunnable) {
                this.timedAction = timedRunnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                TestScheduler.this.queue.remove(this.timedAction);
            }
        }

        TestWorker() {
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.Scheduler.Worker
        public long now(@NonNull TimeUnit timeUnit) {
            return TestScheduler.this.now(timeUnit);
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable, long j8, @NonNull TimeUnit timeUnit) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            long nanos = TestScheduler.this.time + timeUnit.toNanos(j8);
            TestScheduler testScheduler = TestScheduler.this;
            long j9 = testScheduler.counter;
            testScheduler.counter = 1 + j9;
            TimedRunnable timedRunnable = new TimedRunnable(this, nanos, runnable, j9);
            TestScheduler.this.queue.add(timedRunnable);
            return Disposables.fromRunnable(new QueueRemove(timedRunnable));
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            TestScheduler testScheduler = TestScheduler.this;
            long j8 = testScheduler.counter;
            testScheduler.counter = 1 + j8;
            TimedRunnable timedRunnable = new TimedRunnable(this, 0L, runnable, j8);
            TestScheduler.this.queue.add(timedRunnable);
            return Disposables.fromRunnable(new QueueRemove(timedRunnable));
        }
    }
}
