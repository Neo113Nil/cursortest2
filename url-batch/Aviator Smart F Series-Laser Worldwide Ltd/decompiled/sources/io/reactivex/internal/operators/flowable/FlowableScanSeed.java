package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableScanSeed<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final BiFunction<R, ? super T, R> accumulator;
    final Callable<R> seedSupplier;

    static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -1776795561228106469L;
        final BiFunction<R, ? super T, R> accumulator;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final c downstream;
        Throwable error;
        final int limit;
        final int prefetch;
        final SimplePlainQueue<R> queue;
        final AtomicLong requested;
        d upstream;
        R value;

        ScanSeedSubscriber(c cVar, BiFunction<R, ? super T, R> biFunction, R r8, int i8) {
            this.downstream = cVar;
            this.accumulator = biFunction;
            this.value = r8;
            this.prefetch = i8;
            this.limit = i8 - (i8 >> 2);
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i8);
            this.queue = spscArrayQueue;
            spscArrayQueue.offer(r8);
            this.requested = new AtomicLong();
        }

        @Override // p7.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        void drain() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            c cVar = this.downstream;
            SimplePlainQueue<R> simplePlainQueue = this.queue;
            int i8 = this.limit;
            int i9 = this.consumed;
            int i10 = 1;
            do {
                long j8 = this.requested.get();
                long j9 = 0;
                while (j9 != j8) {
                    if (this.cancelled) {
                        simplePlainQueue.clear();
                        return;
                    }
                    boolean z7 = this.done;
                    if (z7 && (th = this.error) != null) {
                        simplePlainQueue.clear();
                        cVar.onError(th);
                        return;
                    }
                    R poll = simplePlainQueue.poll();
                    boolean z8 = poll == null;
                    if (z7 && z8) {
                        cVar.onComplete();
                        return;
                    }
                    if (z8) {
                        break;
                    }
                    cVar.onNext(poll);
                    j9++;
                    i9++;
                    if (i9 == i8) {
                        this.upstream.request(i8);
                        i9 = 0;
                    }
                }
                if (j9 == j8 && this.done) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        simplePlainQueue.clear();
                        cVar.onError(th2);
                        return;
                    } else if (simplePlainQueue.isEmpty()) {
                        cVar.onComplete();
                        return;
                    }
                }
                if (j9 != 0) {
                    BackpressureHelper.produced(this.requested, j9);
                }
                this.consumed = i9;
                i10 = addAndGet(-i10);
            } while (i10 != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (this.done) {
                return;
            }
            try {
                R r8 = (R) ObjectHelper.requireNonNull(this.accumulator.apply(this.value, t7), "The accumulator returned a null value");
                this.value = r8;
                this.queue.offer(r8);
                drain();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch - 1);
            }
        }

        @Override // p7.d
        public void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                BackpressureHelper.add(this.requested, j8);
                drain();
            }
        }
    }

    public FlowableScanSeed(Flowable<T> flowable, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(flowable);
        this.accumulator = biFunction;
        this.seedSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        try {
            this.source.subscribe((FlowableSubscriber) new ScanSeedSubscriber(cVar, this.accumulator, ObjectHelper.requireNonNull(this.seedSupplier.call(), "The seed supplied is null"), Flowable.bufferSize()));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
