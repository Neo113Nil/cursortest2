package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableMergeWithSingle<T> extends AbstractFlowableWithUpstream<T, T> {
    final SingleSource<? extends T> other;

    static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean cancelled;
        int consumed;
        final c downstream;
        long emitted;
        final int limit;
        volatile boolean mainDone;
        volatile int otherState;
        final int prefetch;
        volatile SimplePlainQueue<T> queue;
        T singleItem;
        final AtomicReference<d> mainSubscription = new AtomicReference<>();
        final OtherObserver<T> otherObserver = new OtherObserver<>(this);
        final AtomicThrowable error = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();

        static final class OtherObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final MergeWithObserver<T> parent;

            OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t7) {
                this.parent.otherSuccess(t7);
            }
        }

        MergeWithObserver(c cVar) {
            this.downstream = cVar;
            int bufferSize = Flowable.bufferSize();
            this.prefetch = bufferSize;
            this.limit = bufferSize - (bufferSize >> 2);
        }

        @Override // p7.d
        public void cancel() {
            this.cancelled = true;
            SubscriptionHelper.cancel(this.mainSubscription);
            DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        void drainLoop() {
            c cVar = this.downstream;
            long j8 = this.emitted;
            int i8 = this.consumed;
            int i9 = this.limit;
            int i10 = 1;
            int i11 = 1;
            while (true) {
                long j9 = this.requested.get();
                while (j8 != j9) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        cVar.onError(this.error.terminate());
                        return;
                    }
                    int i12 = this.otherState;
                    if (i12 == i10) {
                        T t7 = this.singleItem;
                        this.singleItem = null;
                        this.otherState = 2;
                        cVar.onNext(t7);
                        j8++;
                    } else {
                        boolean z7 = this.mainDone;
                        SimplePlainQueue<T> simplePlainQueue = this.queue;
                        T poll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                        boolean z8 = poll == null;
                        if (z7 && z8 && i12 == 2) {
                            this.queue = null;
                            cVar.onComplete();
                            return;
                        } else {
                            if (z8) {
                                break;
                            }
                            cVar.onNext(poll);
                            j8++;
                            i8++;
                            if (i8 == i9) {
                                this.mainSubscription.get().request(i9);
                                i8 = 0;
                            }
                            i10 = 1;
                        }
                    }
                }
                if (j8 == j9) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        cVar.onError(this.error.terminate());
                        return;
                    }
                    boolean z9 = this.mainDone;
                    SimplePlainQueue<T> simplePlainQueue2 = this.queue;
                    boolean z10 = simplePlainQueue2 == null || simplePlainQueue2.isEmpty();
                    if (z9 && z10 && this.otherState == 2) {
                        this.queue = null;
                        cVar.onComplete();
                        return;
                    }
                }
                this.emitted = j8;
                this.consumed = i8;
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                } else {
                    i10 = 1;
                }
            }
        }

        SimplePlainQueue<T> getOrCreateQueue() {
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(Flowable.bufferSize());
            this.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                DisposableHelper.dispose(this.otherObserver);
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (compareAndSet(0, 1)) {
                long j8 = this.emitted;
                if (this.requested.get() != j8) {
                    SimplePlainQueue<T> simplePlainQueue = this.queue;
                    if (simplePlainQueue == null || simplePlainQueue.isEmpty()) {
                        this.emitted = j8 + 1;
                        this.downstream.onNext(t7);
                        int i8 = this.consumed + 1;
                        if (i8 == this.limit) {
                            this.consumed = 0;
                            this.mainSubscription.get().request(i8);
                        } else {
                            this.consumed = i8;
                        }
                    } else {
                        simplePlainQueue.offer(t7);
                    }
                } else {
                    getOrCreateQueue().offer(t7);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t7);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this.mainSubscription, dVar, this.prefetch);
        }

        void otherError(Throwable th) {
            if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                SubscriptionHelper.cancel(this.mainSubscription);
                drain();
            }
        }

        void otherSuccess(T t7) {
            if (compareAndSet(0, 1)) {
                long j8 = this.emitted;
                if (this.requested.get() != j8) {
                    this.emitted = j8 + 1;
                    this.downstream.onNext(t7);
                    this.otherState = 2;
                } else {
                    this.singleItem = t7;
                    this.otherState = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.singleItem = t7;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // p7.d
        public void request(long j8) {
            BackpressureHelper.add(this.requested, j8);
            drain();
        }
    }

    public FlowableMergeWithSingle(Flowable<T> flowable, SingleSource<? extends T> singleSource) {
        super(flowable);
        this.other = singleSource;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(cVar);
        cVar.onSubscribe(mergeWithObserver);
        this.source.subscribe((FlowableSubscriber) mergeWithObserver);
        this.other.subscribe(mergeWithObserver.otherObserver);
    }
}
