package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* loaded from: classes9.dex */
public final class ObservableHide extends AbstractObservableWithUpstream {
    public final /* synthetic */ int $r8$classId;

    public final class HideDisposable implements Observer, Disposable {
        public final Observer downstream;
        public Disposable upstream;

        public HideDisposable(Observer observer) {
            this.downstream = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.downstream.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ObservableHide(ObservableSource observableSource, int i) {
        super(observableSource);
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        switch (this.$r8$classId) {
            case 0:
                ((Observable) this.source).subscribe(new HideDisposable(observer));
                break;
            default:
                ((Observable) this.source).subscribe(new ObservableTake$TakeObserver(observer));
                break;
        }
    }
}
