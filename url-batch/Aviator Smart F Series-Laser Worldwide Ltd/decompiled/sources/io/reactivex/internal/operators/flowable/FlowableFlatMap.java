package io.reactivex.internal.operators.flowable;

import androidx.lifecycle.g;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.b;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends b> mapper;
    final int maxConcurrency;

    static final class InnerSubscriber<T, U> extends AtomicReference<d> implements FlowableSubscriber<U>, Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit;
        final MergeSubscriber<T, U> parent;
        long produced;
        volatile SimpleQueue<U> queue;

        InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j8) {
            this.id = j8;
            this.parent = mergeSubscriber;
            int i8 = mergeSubscriber.bufferSize;
            this.bufferSize = i8;
            this.limit = i8 >> 2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, th);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(U u7) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u7, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                    }
                }
                dVar.request(this.bufferSize);
            }
        }

        void requestMore(long j8) {
            if (this.fusionMode != 1) {
                long j9 = this.produced + j8;
                if (j9 < this.limit) {
                    this.produced = j9;
                } else {
                    this.produced = 0L;
                    get().request(j9);
                }
            }
        }
    }

    static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final c downstream;
        final AtomicThrowable errs = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final Function<? super T, ? extends b> mapper;
        final int maxConcurrency;
        volatile SimplePlainQueue<U> queue;
        final AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<InnerSubscriber<?, ?>[]> subscribers;
        long uniqueId;
        d upstream;
        static final InnerSubscriber<?, ?>[] EMPTY = new InnerSubscriber[0];
        static final InnerSubscriber<?, ?>[] CANCELLED = new InnerSubscriber[0];

        MergeSubscriber(c cVar, Function<? super T, ? extends b> function, boolean z7, int i8, int i9) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = cVar;
            this.mapper = function;
            this.delayErrors = z7;
            this.maxConcurrency = i8;
            this.bufferSize = i9;
            this.scalarLimit = Math.max(1, i8 >> 1);
            atomicReference.lazySet(EMPTY);
        }

        boolean addInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                if (innerSubscriberArr == CANCELLED) {
                    innerSubscriber.dispose();
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!g.a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        @Override // p7.d
        public void cancel() {
            SimplePlainQueue<U> simplePlainQueue;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeAll();
            if (getAndIncrement() != 0 || (simplePlainQueue = this.queue) == null) {
                return;
            }
            simplePlainQueue.clear();
        }

        boolean checkTerminate() {
            if (this.cancelled) {
                clearScalarQueue();
                return true;
            }
            if (this.delayErrors || this.errs.get() == null) {
                return false;
            }
            clearScalarQueue();
            Throwable terminate = this.errs.terminate();
            if (terminate != ExceptionHelper.TERMINATED) {
                this.downstream.onError(terminate);
            }
            return true;
        }

        void clearScalarQueue() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                simplePlainQueue.clear();
            }
        }

        void disposeAll() {
            InnerSubscriber<?, ?>[] andSet;
            InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<?, ?>[] innerSubscriberArr2 = CANCELLED;
            if (innerSubscriberArr == innerSubscriberArr2 || (andSet = this.subscribers.getAndSet(innerSubscriberArr2)) == innerSubscriberArr2) {
                return;
            }
            for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                innerSubscriber.dispose();
            }
            Throwable terminate = this.errs.terminate();
            if (terminate == null || terminate == ExceptionHelper.TERMINATED) {
                return;
            }
            RxJavaPlugins.onError(terminate);
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:102:0x0191, code lost:
        
            r24.lastIndex = r3;
            r24.lastId = r13[r3].id;
            r3 = r16;
            r5 = 0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void drainLoop() {
            long j8;
            long j9;
            boolean z7;
            InnerSubscriber<T, U>[] innerSubscriberArr;
            int i8;
            long j10;
            U u7;
            c cVar = this.downstream;
            int i9 = 1;
            while (!checkTerminate()) {
                SimplePlainQueue<U> simplePlainQueue = this.queue;
                long j11 = this.requested.get();
                boolean z8 = j11 == Long.MAX_VALUE;
                long j12 = 0;
                long j13 = 0;
                if (simplePlainQueue != null) {
                    do {
                        long j14 = 0;
                        u7 = null;
                        while (true) {
                            if (j11 == 0) {
                                break;
                            }
                            U poll = simplePlainQueue.poll();
                            if (checkTerminate()) {
                                return;
                            }
                            if (poll == null) {
                                u7 = poll;
                                break;
                            }
                            cVar.onNext(poll);
                            j13++;
                            j14++;
                            j11--;
                            u7 = poll;
                        }
                        if (j14 != 0) {
                            j11 = z8 ? Long.MAX_VALUE : this.requested.addAndGet(-j14);
                        }
                        if (j11 == 0) {
                            break;
                        }
                    } while (u7 != null);
                }
                boolean z9 = this.done;
                SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                InnerSubscriber<?, ?>[] innerSubscriberArr2 = this.subscribers.get();
                int length = innerSubscriberArr2.length;
                if (z9 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    Throwable terminate = this.errs.terminate();
                    if (terminate != ExceptionHelper.TERMINATED) {
                        if (terminate == null) {
                            cVar.onComplete();
                            return;
                        } else {
                            cVar.onError(terminate);
                            return;
                        }
                    }
                    return;
                }
                int i10 = i9;
                if (length != 0) {
                    long j15 = this.lastId;
                    int i11 = this.lastIndex;
                    if (length <= i11 || innerSubscriberArr2[i11].id != j15) {
                        if (length <= i11) {
                            i11 = 0;
                        }
                        for (int i12 = 0; i12 < length && innerSubscriberArr2[i11].id != j15; i12++) {
                            i11++;
                            if (i11 == length) {
                                i11 = 0;
                            }
                        }
                        this.lastIndex = i11;
                        this.lastId = innerSubscriberArr2[i11].id;
                    }
                    int i13 = i11;
                    boolean z10 = false;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            innerSubscriberArr = innerSubscriberArr2;
                            z7 = z10;
                            break;
                        }
                        if (checkTerminate()) {
                            return;
                        }
                        InnerSubscriber<T, U> innerSubscriber = innerSubscriberArr2[i13];
                        U u8 = null;
                        while (!checkTerminate()) {
                            SimpleQueue<U> simpleQueue = innerSubscriber.queue;
                            if (simpleQueue == null) {
                                innerSubscriberArr = innerSubscriberArr2;
                                i8 = length;
                            } else {
                                innerSubscriberArr = innerSubscriberArr2;
                                i8 = length;
                                long j16 = j12;
                                while (j11 != j12) {
                                    try {
                                        u8 = simpleQueue.poll();
                                        if (u8 == null) {
                                            break;
                                        }
                                        cVar.onNext(u8);
                                        if (checkTerminate()) {
                                            return;
                                        }
                                        j11--;
                                        j16++;
                                    } catch (Throwable th) {
                                        Exceptions.throwIfFatal(th);
                                        innerSubscriber.dispose();
                                        this.errs.addThrowable(th);
                                        if (!this.delayErrors) {
                                            this.upstream.cancel();
                                        }
                                        if (checkTerminate()) {
                                            return;
                                        }
                                        removeInner(innerSubscriber);
                                        i14++;
                                        length = i8;
                                        z10 = true;
                                    }
                                }
                                if (j16 != j12) {
                                    j11 = !z8 ? this.requested.addAndGet(-j16) : Long.MAX_VALUE;
                                    innerSubscriber.requestMore(j16);
                                    j10 = 0;
                                } else {
                                    j10 = j12;
                                }
                                if (j11 != j10 && u8 != null) {
                                    innerSubscriberArr2 = innerSubscriberArr;
                                    length = i8;
                                    j12 = 0;
                                }
                            }
                            boolean z11 = innerSubscriber.done;
                            SimpleQueue<U> simpleQueue2 = innerSubscriber.queue;
                            if (z11 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                removeInner(innerSubscriber);
                                if (checkTerminate()) {
                                    return;
                                }
                                j13++;
                                z10 = true;
                            }
                            if (j11 == 0) {
                                z7 = z10;
                                break;
                            }
                            i13++;
                            length = i8;
                            if (i13 == length) {
                                i13 = 0;
                            }
                            i14++;
                            innerSubscriberArr2 = innerSubscriberArr;
                            j12 = 0;
                        }
                        return;
                    }
                }
                j8 = 0;
                j9 = j13;
                z7 = false;
                if (j9 != j8 && !this.cancelled) {
                    this.upstream.request(j9);
                }
                if (z7) {
                    i9 = i10;
                } else {
                    i9 = addAndGet(-i10);
                    if (i9 == 0) {
                        return;
                    }
                }
            }
        }

        SimpleQueue<U> getInnerQueue(InnerSubscriber<T, U> innerSubscriber) {
            SimpleQueue<U> simpleQueue = innerSubscriber.queue;
            if (simpleQueue != null) {
                return simpleQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.bufferSize);
            innerSubscriber.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        SimpleQueue<U> getMainQueue() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue == null) {
                simplePlainQueue = this.maxConcurrency == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                this.queue = simplePlainQueue;
            }
            return simplePlainQueue;
        }

        void innerError(InnerSubscriber<T, U> innerSubscriber, Throwable th) {
            if (!this.errs.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            innerSubscriber.done = true;
            if (!this.delayErrors) {
                this.upstream.cancel();
                for (InnerSubscriber<?, ?> innerSubscriber2 : this.subscribers.getAndSet(CANCELLED)) {
                    innerSubscriber2.dispose();
                }
            }
            drain();
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
            if (!this.errs.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            if (!this.delayErrors) {
                for (InnerSubscriber<?, ?> innerSubscriber : this.subscribers.getAndSet(CANCELLED)) {
                    innerSubscriber.dispose();
                }
            }
            drain();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (this.done) {
                return;
            }
            try {
                b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(t7), "The mapper returned a null Publisher");
                if (!(bVar instanceof Callable)) {
                    long j8 = this.uniqueId;
                    this.uniqueId = 1 + j8;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, j8);
                    if (addInner(innerSubscriber)) {
                        bVar.subscribe(innerSubscriber);
                        return;
                    }
                    return;
                }
                try {
                    Object call = ((Callable) bVar).call();
                    if (call != null) {
                        tryEmitScalar(call);
                        return;
                    }
                    if (this.maxConcurrency == Integer.MAX_VALUE || this.cancelled) {
                        return;
                    }
                    int i8 = this.scalarEmitted + 1;
                    this.scalarEmitted = i8;
                    int i9 = this.scalarLimit;
                    if (i8 == i9) {
                        this.scalarEmitted = 0;
                        this.upstream.request(i9);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.errs.addThrowable(th);
                    drain();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                int i8 = this.maxConcurrency;
                if (i8 == Integer.MAX_VALUE) {
                    dVar.request(Long.MAX_VALUE);
                } else {
                    dVar.request(i8);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void removeInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        i8 = -1;
                        break;
                    } else if (innerSubscriberArr[i8] == innerSubscriber) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i8 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = EMPTY;
                } else {
                    InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i8);
                    System.arraycopy(innerSubscriberArr, i8 + 1, innerSubscriberArr3, i8, (length - i8) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!g.a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
        }

        @Override // p7.d
        public void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                BackpressureHelper.add(this.requested, j8);
                drain();
            }
        }

        void tryEmit(U u7, InnerSubscriber<T, U> innerSubscriber) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j8 = this.requested.get();
                SimpleQueue<U> simpleQueue = innerSubscriber.queue;
                if (j8 == 0 || !(simpleQueue == null || simpleQueue.isEmpty())) {
                    if (simpleQueue == null) {
                        simpleQueue = getInnerQueue(innerSubscriber);
                    }
                    if (!simpleQueue.offer(u7)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u7);
                    if (j8 != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    innerSubscriber.requestMore(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue simpleQueue2 = innerSubscriber.queue;
                if (simpleQueue2 == null) {
                    simpleQueue2 = new SpscArrayQueue(this.bufferSize);
                    innerSubscriber.queue = simpleQueue2;
                }
                if (!simpleQueue2.offer(u7)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        void tryEmitScalar(U u7) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j8 = this.requested.get();
                SimpleQueue<U> simpleQueue = this.queue;
                if (j8 == 0 || !(simpleQueue == null || simpleQueue.isEmpty())) {
                    if (simpleQueue == null) {
                        simpleQueue = getMainQueue();
                    }
                    if (!simpleQueue.offer(u7)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u7);
                    if (j8 != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i8 = this.scalarEmitted + 1;
                        this.scalarEmitted = i8;
                        int i9 = this.scalarLimit;
                        if (i8 == i9) {
                            this.scalarEmitted = 0;
                            this.upstream.request(i9);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!getMainQueue().offer(u7)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }
    }

    public FlowableFlatMap(Flowable<T> flowable, Function<? super T, ? extends b> function, boolean z7, int i8, int i9) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z7;
        this.maxConcurrency = i8;
        this.bufferSize = i9;
    }

    public static <T, U> FlowableSubscriber<T> subscribe(c cVar, Function<? super T, ? extends b> function, boolean z7, int i8, int i9) {
        return new MergeSubscriber(cVar, function, z7, i8, i9);
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) subscribe(cVar, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
