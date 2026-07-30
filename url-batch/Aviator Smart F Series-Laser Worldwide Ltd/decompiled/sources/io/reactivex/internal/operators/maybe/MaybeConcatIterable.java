package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class MaybeConcatIterable<T> extends Flowable<T> {
    final Iterable<? extends MaybeSource<? extends T>> sources;

    static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, d {
        private static final long serialVersionUID = 3520831347801429610L;
        final c downstream;
        long produced;
        final Iterator<? extends MaybeSource<? extends T>> sources;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable disposables = new SequentialDisposable();
        final AtomicReference<Object> current = new AtomicReference<>(NotificationLite.COMPLETE);

        ConcatMaybeObserver(c cVar, Iterator<? extends MaybeSource<? extends T>> it) {
            this.downstream = cVar;
            this.sources = it;
        }

        @Override // p7.d
        public void cancel() {
            this.disposables.dispose();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.current;
            c cVar = this.downstream;
            SequentialDisposable sequentialDisposable = this.disposables;
            while (!sequentialDisposable.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != NotificationLite.COMPLETE) {
                        long j8 = this.produced;
                        if (j8 != this.requested.get()) {
                            this.produced = j8 + 1;
                            atomicReference.lazySet(null);
                            cVar.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!sequentialDisposable.isDisposed()) {
                        try {
                            if (this.sources.hasNext()) {
                                try {
                                    ((MaybeSource) ObjectHelper.requireNonNull(this.sources.next(), "The source Iterator returned a null MaybeSource")).subscribe(this);
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    cVar.onError(th);
                                    return;
                                }
                            } else {
                                cVar.onComplete();
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            cVar.onError(th2);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.current.lazySet(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            this.disposables.replace(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t7) {
            this.current.lazySet(t7);
            drain();
        }

        @Override // p7.d
        public void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                BackpressureHelper.add(this.requested, j8);
                drain();
            }
        }
    }

    public MaybeConcatIterable(Iterable<? extends MaybeSource<? extends T>> iterable) {
        this.sources = iterable;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        try {
            ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(cVar, (Iterator) ObjectHelper.requireNonNull(this.sources.iterator(), "The sources Iterable returned a null Iterator"));
            cVar.onSubscribe(concatMaybeObserver);
            concatMaybeObserver.drain();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
