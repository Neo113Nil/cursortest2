package io.reactivex.rxjava3.internal.operators.observable;

import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* loaded from: classes9.dex */
public final class ObservableDoOnEach extends AbstractObservableWithUpstream {
    public final Consumer onError;
    public final Consumer onNext;

    public final class DoOnEachObserver implements Observer, Disposable {
        public boolean done;
        public final Observer downstream;
        public final Consumer onError;
        public final Consumer onNext;
        public Disposable upstream;

        public DoOnEachObserver(Observer observer, Consumer consumer, Consumer consumer2) {
            this.downstream = observer;
            this.onNext = consumer;
            this.onError = consumer2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.done) {
                UnsignedBytes.onError(th);
                return;
            }
            this.done = true;
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                Longs.throwIfFatal(th2);
                th = new CompositeException(th, th2);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.done) {
                return;
            }
            try {
                this.onNext.accept(obj);
                this.downstream.onNext(obj);
            } catch (Throwable th) {
                Longs.throwIfFatal(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableDoOnEach(Observable observable, Consumer consumer, Consumer consumer2) {
        super(observable);
        this.onNext = consumer;
        this.onError = consumer2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ((Observable) this.source).subscribe(new DoOnEachObserver(observer, this.onNext, this.onError));
    }
}
