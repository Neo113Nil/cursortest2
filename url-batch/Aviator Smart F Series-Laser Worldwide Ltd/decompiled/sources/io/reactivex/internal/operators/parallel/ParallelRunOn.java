package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class ParallelRunOn<T> extends ParallelFlowable<T> {
    final int prefetch;
    final Scheduler scheduler;
    final ParallelFlowable<? extends T> source;

    static abstract class BaseRunOnSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        Throwable error;
        final int limit;
        final int prefetch;
        final SpscArrayQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        d upstream;
        final Scheduler.Worker worker;

        BaseRunOnSubscriber(int i8, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            this.prefetch = i8;
            this.queue = spscArrayQueue;
            this.limit = i8 - (i8 >> 2);
            this.worker = worker;
        }

        @Override // p7.d
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public final void onNext(T t7) {
            if (this.done) {
                return;
            }
            if (this.queue.offer(t7)) {
                schedule();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // p7.d
        public final void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                BackpressureHelper.add(this.requested, j8);
                schedule();
            }
        }

        final void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.schedule(this);
            }
        }
    }

    final class MultiWorkerCallback implements SchedulerMultiWorkerSupport.WorkerCallback {
        final c[] parents;
        final c[] subscribers;

        MultiWorkerCallback(c[] cVarArr, c[] cVarArr2) {
            this.subscribers = cVarArr;
            this.parents = cVarArr2;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback
        public void onWorker(int i8, Scheduler.Worker worker) {
            ParallelRunOn.this.createSubscriber(i8, this.subscribers, this.parents, worker);
        }
    }

    static final class RunOnConditionalSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final ConditionalSubscriber<? super T> downstream;

        RunOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, int i8, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i8, spscArrayQueue, worker);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            int i8 = this.consumed;
            SpscArrayQueue<T> spscArrayQueue = this.queue;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            int i9 = this.limit;
            int i10 = 1;
            while (true) {
                long j8 = this.requested.get();
                long j9 = 0;
                while (j9 != j8) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z7 = this.done;
                    if (z7 && (th = this.error) != null) {
                        spscArrayQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.worker.dispose();
                        return;
                    }
                    T poll = spscArrayQueue.poll();
                    boolean z8 = poll == null;
                    if (z7 && z8) {
                        conditionalSubscriber.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z8) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(poll)) {
                            j9++;
                        }
                        i8++;
                        if (i8 == i9) {
                            this.upstream.request(i8);
                            i8 = 0;
                        }
                    }
                }
                if (j9 == j8) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            conditionalSubscriber.onError(th2);
                            this.worker.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            conditionalSubscriber.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (j9 != 0 && j8 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j9);
                }
                int i11 = get();
                if (i11 == i10) {
                    this.consumed = i8;
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    i10 = i11;
                }
            }
        }
    }

    static final class RunOnSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final c downstream;

        RunOnSubscriber(c cVar, int i8, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i8, spscArrayQueue, worker);
            this.downstream = cVar;
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            int i8 = this.consumed;
            SpscArrayQueue<T> spscArrayQueue = this.queue;
            c cVar = this.downstream;
            int i9 = this.limit;
            int i10 = 1;
            while (true) {
                long j8 = this.requested.get();
                long j9 = 0;
                while (j9 != j8) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z7 = this.done;
                    if (z7 && (th = this.error) != null) {
                        spscArrayQueue.clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                    T poll = spscArrayQueue.poll();
                    boolean z8 = poll == null;
                    if (z7 && z8) {
                        cVar.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z8) {
                            break;
                        }
                        cVar.onNext(poll);
                        j9++;
                        i8++;
                        if (i8 == i9) {
                            this.upstream.request(i8);
                            i8 = 0;
                        }
                    }
                }
                if (j9 == j8) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            cVar.onError(th2);
                            this.worker.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            cVar.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (j9 != 0 && j8 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j9);
                }
                int i11 = get();
                if (i11 == i10) {
                    this.consumed = i8;
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    i10 = i11;
                }
            }
        }
    }

    public ParallelRunOn(ParallelFlowable<? extends T> parallelFlowable, Scheduler scheduler, int i8) {
        this.source = parallelFlowable;
        this.scheduler = scheduler;
        this.prefetch = i8;
    }

    void createSubscriber(int i8, c[] cVarArr, c[] cVarArr2, Scheduler.Worker worker) {
        c cVar = cVarArr[i8];
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
        if (cVar instanceof ConditionalSubscriber) {
            cVarArr2[i8] = new RunOnConditionalSubscriber((ConditionalSubscriber) cVar, this.prefetch, spscArrayQueue, worker);
        } else {
            cVarArr2[i8] = new RunOnSubscriber(cVar, this.prefetch, spscArrayQueue, worker);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            c[] cVarArr2 = new c[length];
            Object obj = this.scheduler;
            if (obj instanceof SchedulerMultiWorkerSupport) {
                ((SchedulerMultiWorkerSupport) obj).createWorkers(length, new MultiWorkerCallback(cVarArr, cVarArr2));
            } else {
                for (int i8 = 0; i8 < length; i8++) {
                    createSubscriber(i8, cVarArr, cVarArr2, this.scheduler.createWorker());
                }
            }
            this.source.subscribe(cVarArr2);
        }
    }
}
