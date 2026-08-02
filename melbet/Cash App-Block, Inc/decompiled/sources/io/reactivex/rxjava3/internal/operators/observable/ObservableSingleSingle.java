package io.reactivex.rxjava3.internal.operators.observable;

import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
public final class ObservableSingleSingle extends Single {
    public final /* synthetic */ int $r8$classId;
    public final Observable source;

    public final class SingleElementObserver implements Observer, Disposable {
        public boolean done;
        public final SingleObserver downstream;
        public Disposable upstream;
        public Object value;

        public SingleElementObserver(SingleObserver singleObserver) {
            this.downstream = singleObserver;
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
            Object obj = this.value;
            this.value = null;
            if (obj == null) {
                obj = null;
            }
            SingleObserver singleObserver = this.downstream;
            if (obj != null) {
                singleObserver.onSuccess(obj);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.done) {
                UnsignedBytes.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.done) {
                return;
            }
            if (this.value == null) {
                this.value = obj;
                return;
            }
            this.done = true;
            this.upstream.dispose();
            this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public /* synthetic */ ObservableSingleSingle(Observable observable, int i) {
        this.$r8$classId = i;
        this.source = observable;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        int i = this.$r8$classId;
        Observable observable = this.source;
        switch (i) {
            case 0:
                observable.subscribe(new SingleElementObserver(singleObserver));
                break;
            default:
                observable.subscribe(new ObservableTake$TakeObserver(singleObserver));
                break;
        }
    }
}
