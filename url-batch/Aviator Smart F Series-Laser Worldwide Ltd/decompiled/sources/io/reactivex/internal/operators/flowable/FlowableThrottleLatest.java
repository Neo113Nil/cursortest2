package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableThrottleLatest<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean emitLast;
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    static final class ThrottleLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final c downstream;
        final boolean emitLast;
        long emitted;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        d upstream;
        final Scheduler.Worker worker;

        ThrottleLatestSubscriber(c cVar, long j8, TimeUnit timeUnit, Scheduler.Worker worker, boolean z7) {
            this.downstream = cVar;
            this.timeout = j8;
            this.unit = timeUnit;
            this.worker = worker;
            this.emitLast = z7;
        }

        @Override // p7.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.latest;
            AtomicLong atomicLong = this.requested;
            c cVar = this.downstream;
            int i8 = 1;
            while (!this.cancelled) {
                boolean z7 = this.done;
                if (z7 && this.error != null) {
                    atomicReference.lazySet(null);
                    cVar.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                boolean z8 = atomicReference.get() == null;
                if (z7) {
                    if (z8 || !this.emitLast) {
                        atomicReference.lazySet(null);
                        cVar.onComplete();
                    } else {
                        T andSet = atomicReference.getAndSet(null);
                        long j8 = this.emitted;
                        if (j8 != atomicLong.get()) {
                            this.emitted = j8 + 1;
                            cVar.onNext(andSet);
                            cVar.onComplete();
                        } else {
                            cVar.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                        }
                    }
                    this.worker.dispose();
                    return;
                }
                if (z8) {
                    if (this.timerFired) {
                        this.timerRunning = false;
                        this.timerFired = false;
                    }
                } else if (!this.timerRunning || this.timerFired) {
                    T andSet2 = atomicReference.getAndSet(null);
                    long j9 = this.emitted;
                    if (j9 == atomicLong.get()) {
                        this.upstream.cancel();
                        cVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                        this.worker.dispose();
                        return;
                    } else {
                        cVar.onNext(andSet2);
                        this.emitted = j9 + 1;
                        this.timerFired = false;
                        this.timerRunning = true;
                        this.worker.schedule(this, this.timeout, this.unit);
                    }
                }
                i8 = addAndGet(-i8);
                if (i8 == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            this.latest.set(t7);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p7.d
        public void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                BackpressureHelper.add(this.requested, j8);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.timerFired = true;
            drain();
        }
    }

    public FlowableThrottleLatest(Flowable<T> flowable, long j8, TimeUnit timeUnit, Scheduler scheduler, boolean z7) {
        super(flowable);
        this.timeout = j8;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.emitLast = z7;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new ThrottleLatestSubscriber(cVar, this.timeout, this.unit, this.scheduler.createWorker(), this.emitLast));
    }
}
