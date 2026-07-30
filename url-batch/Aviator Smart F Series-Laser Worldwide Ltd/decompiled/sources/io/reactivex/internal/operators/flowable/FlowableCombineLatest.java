package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableMap;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.b;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableCombineLatest<T, R> extends Flowable<R> {

    @Nullable
    final b[] array;
    final int bufferSize;
    final Function<? super Object[], ? extends R> combiner;
    final boolean delayErrors;

    @Nullable
    final Iterable<? extends b> iterable;

    static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final c downstream;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested;
        final CombineLatestInnerSubscriber<T>[] subscribers;

        CombineLatestCoordinator(c cVar, Function<? super Object[], ? extends R> function, int i8, int i9, boolean z7) {
            this.downstream = cVar;
            this.combiner = function;
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i8];
            for (int i10 = 0; i10 < i8; i10++) {
                combineLatestInnerSubscriberArr[i10] = new CombineLatestInnerSubscriber<>(this, i10, i9);
            }
            this.subscribers = combineLatestInnerSubscriberArr;
            this.latest = new Object[i8];
            this.queue = new SpscLinkedArrayQueue<>(i9);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
            this.delayErrors = z7;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p7.d
        public void cancel() {
            this.cancelled = true;
            cancelAll();
        }

        void cancelAll() {
            for (CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.subscribers) {
                combineLatestInnerSubscriber.cancel();
            }
        }

        boolean checkTerminated(boolean z7, boolean z8, c cVar, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z7) {
                return false;
            }
            if (this.delayErrors) {
                if (!z8) {
                    return false;
                }
                cancelAll();
                Throwable terminate = ExceptionHelper.terminate(this.error);
                if (terminate == null || terminate == ExceptionHelper.TERMINATED) {
                    cVar.onComplete();
                } else {
                    cVar.onError(terminate);
                }
                return true;
            }
            Throwable terminate2 = ExceptionHelper.terminate(this.error);
            if (terminate2 != null && terminate2 != ExceptionHelper.TERMINATED) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                cVar.onError(terminate2);
                return true;
            }
            if (!z8) {
                return false;
            }
            cancelAll();
            cVar.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainOutput();
            } else {
                drainAsync();
            }
        }

        void drainAsync() {
            c cVar = this.downstream;
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.queue;
            int i8 = 1;
            do {
                long j8 = this.requested.get();
                long j9 = 0;
                while (j9 != j8) {
                    boolean z7 = this.done;
                    Object poll = spscLinkedArrayQueue.poll();
                    boolean z8 = poll == null;
                    if (checkTerminated(z7, z8, cVar, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z8) {
                        break;
                    }
                    try {
                        cVar.onNext(ObjectHelper.requireNonNull(this.combiner.apply((Object[]) spscLinkedArrayQueue.poll()), "The combiner returned a null value"));
                        ((CombineLatestInnerSubscriber) poll).requestOne();
                        j9++;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        cancelAll();
                        ExceptionHelper.addThrowable(this.error, th);
                        cVar.onError(ExceptionHelper.terminate(this.error));
                        return;
                    }
                }
                if (j9 == j8 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), cVar, spscLinkedArrayQueue)) {
                    return;
                }
                if (j9 != 0 && j8 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j9);
                }
                i8 = addAndGet(-i8);
            } while (i8 != 0);
        }

        void drainOutput() {
            c cVar = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            int i8 = 1;
            while (!this.cancelled) {
                Throwable th = this.error.get();
                if (th != null) {
                    spscLinkedArrayQueue.clear();
                    cVar.onError(th);
                    return;
                }
                boolean z7 = this.done;
                boolean isEmpty = spscLinkedArrayQueue.isEmpty();
                if (!isEmpty) {
                    cVar.onNext(null);
                }
                if (z7 && isEmpty) {
                    cVar.onComplete();
                    return;
                } else {
                    i8 = addAndGet(-i8);
                    if (i8 == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        void innerComplete(int i8) {
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    if (objArr[i8] != null) {
                        int i9 = this.completedSources + 1;
                        if (i9 != objArr.length) {
                            this.completedSources = i9;
                            return;
                        }
                        this.done = true;
                    } else {
                        this.done = true;
                    }
                    drain();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void innerError(int i8, Throwable th) {
            if (!ExceptionHelper.addThrowable(this.error, th)) {
                RxJavaPlugins.onError(th);
            } else {
                if (this.delayErrors) {
                    innerComplete(i8);
                    return;
                }
                cancelAll();
                this.done = true;
                drain();
            }
        }

        void innerValue(int i8, T t7) {
            boolean z7;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    int i9 = this.nonEmptySources;
                    if (objArr[i8] == null) {
                        i9++;
                        this.nonEmptySources = i9;
                    }
                    objArr[i8] = t7;
                    if (objArr.length == i9) {
                        this.queue.offer(this.subscribers[i8], objArr.clone());
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z7) {
                this.subscribers[i8].requestOne();
            } else {
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() {
            Object poll = this.queue.poll();
            if (poll == null) {
                return null;
            }
            R r8 = (R) ObjectHelper.requireNonNull(this.combiner.apply((Object[]) this.queue.poll()), "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) poll).requestOne();
            return r8;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p7.d
        public void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                BackpressureHelper.add(this.requested, j8);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i8) {
            if ((i8 & 4) != 0) {
                return 0;
            }
            int i9 = i8 & 2;
            this.outputFused = i9 != 0;
            return i9;
        }

        void subscribe(b[] bVarArr, int i8) {
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.subscribers;
            for (int i9 = 0; i9 < i8 && !this.done && !this.cancelled; i9++) {
                bVarArr[i9].subscribe(combineLatestInnerSubscriberArr[i9]);
            }
        }
    }

    static final class CombineLatestInnerSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final CombineLatestCoordinator<T, ?> parent;
        final int prefetch;
        int produced;

        CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i8, int i9) {
            this.parent = combineLatestCoordinator;
            this.index = i8;
            this.prefetch = i9;
            this.limit = i9 - (i9 >> 2);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            this.parent.innerValue(this.index, t7);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, this.prefetch);
        }

        public void requestOne() {
            int i8 = this.produced + 1;
            if (i8 != this.limit) {
                this.produced = i8;
            } else {
                this.produced = 0;
                get().request(i8);
            }
        }
    }

    final class SingletonArrayFunc implements Function<T, R> {
        SingletonArrayFunc() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // io.reactivex.functions.Function
        public R apply(T t7) {
            return FlowableCombineLatest.this.combiner.apply(new Object[]{t7});
        }
    }

    public FlowableCombineLatest(@NonNull b[] bVarArr, @NonNull Function<? super Object[], ? extends R> function, int i8, boolean z7) {
        this.array = bVarArr;
        this.iterable = null;
        this.combiner = function;
        this.bufferSize = i8;
        this.delayErrors = z7;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        int length;
        b[] bVarArr = this.array;
        if (bVarArr == null) {
            bVarArr = new b[8];
            try {
                Iterator it = (Iterator) ObjectHelper.requireNonNull(this.iterable.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            b bVar = (b) ObjectHelper.requireNonNull(it.next(), "The publisher returned by the iterator is null");
                            if (length == bVarArr.length) {
                                b[] bVarArr2 = new b[(length >> 2) + length];
                                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                                bVarArr = bVarArr2;
                            }
                            bVarArr[length] = bVar;
                            length++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            EmptySubscription.error(th, cVar);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        EmptySubscription.error(th2, cVar);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, cVar);
                return;
            }
        } else {
            length = bVarArr.length;
        }
        int i8 = length;
        if (i8 == 0) {
            EmptySubscription.complete(cVar);
        } else {
            if (i8 == 1) {
                bVarArr[0].subscribe(new FlowableMap.MapSubscriber(cVar, new SingletonArrayFunc()));
                return;
            }
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(cVar, this.combiner, i8, this.bufferSize, this.delayErrors);
            cVar.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.subscribe(bVarArr, i8);
        }
    }

    public FlowableCombineLatest(@NonNull Iterable<? extends b> iterable, @NonNull Function<? super Object[], ? extends R> function, int i8, boolean z7) {
        this.array = null;
        this.iterable = iterable;
        this.combiner = function;
        this.bufferSize = i8;
        this.delayErrors = z7;
    }
}
