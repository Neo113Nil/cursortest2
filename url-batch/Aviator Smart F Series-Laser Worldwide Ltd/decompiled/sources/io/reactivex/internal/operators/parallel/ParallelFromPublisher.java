package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import p7.b;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {
    final int parallelism;
    final int prefetch;
    final b source;

    static final class ParallelDispatcher<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4470634016609963609L;
        volatile boolean cancelled;
        volatile boolean done;
        final long[] emissions;
        Throwable error;
        int index;
        final int limit;
        final int prefetch;
        int produced;
        SimpleQueue<T> queue;
        final AtomicLongArray requests;
        int sourceMode;
        final AtomicInteger subscriberCount = new AtomicInteger();
        final c[] subscribers;
        d upstream;

        final class RailSubscription implements d {

            /* renamed from: j, reason: collision with root package name */
            final int f17006j;

            /* renamed from: m, reason: collision with root package name */
            final int f17007m;

            RailSubscription(int i8, int i9) {
                this.f17006j = i8;
                this.f17007m = i9;
            }

            @Override // p7.d
            public void cancel() {
                if (ParallelDispatcher.this.requests.compareAndSet(this.f17006j + this.f17007m, 0L, 1L)) {
                    ParallelDispatcher parallelDispatcher = ParallelDispatcher.this;
                    int i8 = this.f17007m;
                    parallelDispatcher.cancel(i8 + i8);
                }
            }

            @Override // p7.d
            public void request(long j8) {
                long j9;
                if (SubscriptionHelper.validate(j8)) {
                    AtomicLongArray atomicLongArray = ParallelDispatcher.this.requests;
                    do {
                        j9 = atomicLongArray.get(this.f17006j);
                        if (j9 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f17006j, j9, BackpressureHelper.addCap(j9, j8)));
                    if (ParallelDispatcher.this.subscriberCount.get() == this.f17007m) {
                        ParallelDispatcher.this.drain();
                    }
                }
            }
        }

        ParallelDispatcher(c[] cVarArr, int i8) {
            this.subscribers = cVarArr;
            this.prefetch = i8;
            this.limit = i8 - (i8 >> 2);
            int length = cVarArr.length;
            int i9 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i9 + 1);
            this.requests = atomicLongArray;
            atomicLongArray.lazySet(i9, length);
            this.emissions = new long[length];
        }

        void cancel(int i8) {
            if (this.requests.decrementAndGet(i8) == 0) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.sourceMode == 1) {
                drainSync();
            } else {
                drainAsync();
            }
        }

        void drainAsync() {
            Throwable th;
            SimpleQueue<T> simpleQueue = this.queue;
            c[] cVarArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i8 = this.index;
            int i9 = this.produced;
            int i10 = 1;
            while (true) {
                int i11 = 0;
                int i12 = 0;
                while (!this.cancelled) {
                    boolean z7 = this.done;
                    if (z7 && (th = this.error) != null) {
                        simpleQueue.clear();
                        int length2 = cVarArr.length;
                        while (i11 < length2) {
                            cVarArr[i11].onError(th);
                            i11++;
                        }
                        return;
                    }
                    boolean isEmpty = simpleQueue.isEmpty();
                    if (z7 && isEmpty) {
                        int length3 = cVarArr.length;
                        while (i11 < length3) {
                            cVarArr[i11].onComplete();
                            i11++;
                        }
                        return;
                    }
                    if (!isEmpty) {
                        long j8 = atomicLongArray.get(i8);
                        long j9 = jArr[i8];
                        if (j8 == j9 || atomicLongArray.get(length + i8) != 0) {
                            i12++;
                        } else {
                            try {
                                T poll = simpleQueue.poll();
                                if (poll != null) {
                                    cVarArr[i8].onNext(poll);
                                    jArr[i8] = j9 + 1;
                                    i9++;
                                    if (i9 == this.limit) {
                                        this.upstream.request(i9);
                                        i9 = 0;
                                    }
                                    i12 = 0;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.upstream.cancel();
                                int length4 = cVarArr.length;
                                while (i11 < length4) {
                                    cVarArr[i11].onError(th2);
                                    i11++;
                                }
                                return;
                            }
                        }
                        i8++;
                        if (i8 == length) {
                            i8 = 0;
                        }
                        if (i12 == length) {
                        }
                    }
                    int i13 = get();
                    if (i13 == i10) {
                        this.index = i8;
                        this.produced = i9;
                        i10 = addAndGet(-i10);
                        if (i10 == 0) {
                            return;
                        }
                    } else {
                        i10 = i13;
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        void drainSync() {
            SimpleQueue<T> simpleQueue = this.queue;
            c[] cVarArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i8 = this.index;
            int i9 = 1;
            while (true) {
                int i10 = 0;
                int i11 = 0;
                while (!this.cancelled) {
                    if (simpleQueue.isEmpty()) {
                        int length2 = cVarArr.length;
                        while (i10 < length2) {
                            cVarArr[i10].onComplete();
                            i10++;
                        }
                        return;
                    }
                    long j8 = atomicLongArray.get(i8);
                    long j9 = jArr[i8];
                    if (j8 == j9 || atomicLongArray.get(length + i8) != 0) {
                        i11++;
                    } else {
                        try {
                            T poll = simpleQueue.poll();
                            if (poll == null) {
                                int length3 = cVarArr.length;
                                while (i10 < length3) {
                                    cVarArr[i10].onComplete();
                                    i10++;
                                }
                                return;
                            }
                            cVarArr[i8].onNext(poll);
                            jArr[i8] = j9 + 1;
                            i11 = 0;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.upstream.cancel();
                            int length4 = cVarArr.length;
                            while (i10 < length4) {
                                cVarArr[i10].onError(th);
                                i10++;
                            }
                            return;
                        }
                    }
                    i8++;
                    if (i8 == length) {
                        i8 = 0;
                    }
                    if (i11 == length) {
                        int i12 = get();
                        if (i12 == i9) {
                            this.index = i8;
                            i9 = addAndGet(-i9);
                            if (i9 == 0) {
                                return;
                            }
                        } else {
                            i9 = i12;
                        }
                    }
                }
                simpleQueue.clear();
                return;
            }
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
            if (this.sourceMode != 0 || this.queue.offer(t7)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        setupSubscribers();
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        setupSubscribers();
                        dVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                setupSubscribers();
                dVar.request(this.prefetch);
            }
        }

        void setupSubscribers() {
            c[] cVarArr = this.subscribers;
            int length = cVarArr.length;
            int i8 = 0;
            while (i8 < length && !this.cancelled) {
                int i9 = i8 + 1;
                this.subscriberCount.lazySet(i9);
                cVarArr[i8].onSubscribe(new RailSubscription(i8, length));
                i8 = i9;
            }
        }
    }

    public ParallelFromPublisher(b bVar, int i8, int i9) {
        this.source = bVar;
        this.parallelism = i8;
        this.prefetch = i9;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.parallelism;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c[] cVarArr) {
        if (validate(cVarArr)) {
            this.source.subscribe(new ParallelDispatcher(cVarArr, this.prefetch));
        }
    }
}
