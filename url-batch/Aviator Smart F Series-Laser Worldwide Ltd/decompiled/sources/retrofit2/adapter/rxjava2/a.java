package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.u;

/* loaded from: classes5.dex */
final class a extends Observable {
    private final Observable<u> upstream;

    /* renamed from: retrofit2.adapter.rxjava2.a$a, reason: collision with other inner class name */
    private static class C0404a implements Observer {
        private final Observer<Object> observer;
        private boolean terminated;

        C0404a(Observer<Object> observer) {
            this.observer = observer;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.terminated) {
                return;
            }
            this.observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.terminated) {
                this.observer.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            RxJavaPlugins.onError(assertionError);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.observer.onSubscribe(disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(u uVar) {
            if (uVar.isSuccessful()) {
                this.observer.onNext(uVar.body());
                return;
            }
            this.terminated = true;
            HttpException httpException = new HttpException(uVar);
            try {
                this.observer.onError(httpException);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(new CompositeException(httpException, th));
            }
        }
    }

    a(Observable<u> observable) {
        this.upstream = observable;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<Object> observer) {
        this.upstream.subscribe(new C0404a(observer));
    }
}
