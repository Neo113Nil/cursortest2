package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableConcatMapMaybe<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
    final int prefetch;
    final Flowable<T> source;

    static final class ConcatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d {
        static final int STATE_ACTIVE = 1;
        static final int STATE_INACTIVE = 0;
        static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final c downstream;
        long emitted;
        final ErrorMode errorMode;
        R item;
        final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        final int prefetch;
        final SimplePlainQueue<T> queue;
        volatile int state;
        d upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapMaybeObserver<R> inner = new ConcatMapMaybeObserver<>(this);

        static final class ConcatMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final ConcatMapMaybeSubscriber<?, R> parent;

            ConcatMapMaybeObserver(ConcatMapMaybeSubscriber<?, R> concatMapMaybeSubscriber) {
                this.parent = concatMapMaybeSubscriber;
            }

            void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r8) {
                this.parent.innerSuccess(r8);
            }
        }

        ConcatMapMaybeSubscriber(c cVar, Function<? super T, ? extends MaybeSource<? extends R>> function, int i8, ErrorMode errorMode) {
            this.downstream = cVar;
            this.mapper = function;
            this.prefetch = i8;
            this.errorMode = errorMode;
            this.queue = new SpscArrayQueue(i8);
        }

        @Override // p7.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            c cVar = this.downstream;
            ErrorMode errorMode = this.errorMode;
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            AtomicLong atomicLong = this.requested;
            int i8 = this.prefetch;
            int i9 = i8 - (i8 >> 1);
            int i10 = 1;
            while (true) {
                if (this.cancelled) {
                    simplePlainQueue.clear();
                    this.item = null;
                } else {
                    int i11 = this.state;
                    if (atomicThrowable.get() == null || (errorMode != ErrorMode.IMMEDIATE && (errorMode != ErrorMode.BOUNDARY || i11 != 0))) {
                        if (i11 == 0) {
                            boolean z7 = this.done;
                            T poll = simplePlainQueue.poll();
                            boolean z8 = poll == null;
                            if (z7 && z8) {
                                Throwable terminate = atomicThrowable.terminate();
                                if (terminate == null) {
                                    cVar.onComplete();
                                    return;
                                } else {
                                    cVar.onError(terminate);
                                    return;
                                }
                            }
                            if (!z8) {
                                int i12 = this.consumed + 1;
                                if (i12 == i9) {
                                    this.consumed = 0;
                                    this.upstream.request(i9);
                                } else {
                                    this.consumed = i12;
                                }
                                try {
                                    MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.mapper.apply(poll), "The mapper returned a null MaybeSource");
                                    this.state = 1;
                                    maybeSource.subscribe(this.inner);
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    this.upstream.cancel();
                                    simplePlainQueue.clear();
                                    atomicThrowable.addThrowable(th);
                                    cVar.onError(atomicThrowable.terminate());
                                    return;
                                }
                            }
                        } else if (i11 == 2) {
                            long j8 = this.emitted;
                            if (j8 != atomicLong.get()) {
                                R r8 = this.item;
                                this.item = null;
                                cVar.onNext(r8);
                                this.emitted = j8 + 1;
                                this.state = 0;
                            }
                        }
                    }
                }
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            }
            simplePlainQueue.clear();
            this.item = null;
            cVar.onError(atomicThrowable.terminate());
        }

        void innerComplete() {
            this.state = 0;
            drain();
        }

        void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.errorMode != ErrorMode.END) {
                this.upstream.cancel();
            }
            this.state = 0;
            drain();
        }

        void innerSuccess(R r8) {
            this.item = r8;
            this.state = 2;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.inner.dispose();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (this.queue.offer(t7)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        @Override // p7.d
        public void request(long j8) {
            BackpressureHelper.add(this.requested, j8);
            drain();
        }
    }

    public FlowableConcatMapMaybe(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, ErrorMode errorMode, int i8) {
        this.source = flowable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i8;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new ConcatMapMaybeSubscriber(cVar, this.mapper, this.prefetch, this.errorMode));
    }
}
