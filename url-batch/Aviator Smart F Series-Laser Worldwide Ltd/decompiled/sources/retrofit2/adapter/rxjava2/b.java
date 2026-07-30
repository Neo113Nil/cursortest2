package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.u;

/* loaded from: classes5.dex */
final class b extends Observable {
    private final retrofit2.b originalCall;

    private static final class a implements Disposable, retrofit2.d {
        private final retrofit2.b call;
        private volatile boolean disposed;
        private final Observer<? super u> observer;
        boolean terminated = false;

        a(retrofit2.b bVar, Observer<? super u> observer) {
            this.call = bVar;
            this.observer = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // retrofit2.d
        public void onFailure(retrofit2.b bVar, Throwable th) {
            if (bVar.isCanceled()) {
                return;
            }
            try {
                this.observer.onError(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(new CompositeException(th, th2));
            }
        }

        @Override // retrofit2.d
        public void onResponse(retrofit2.b bVar, u uVar) {
            if (this.disposed) {
                return;
            }
            try {
                this.observer.onNext(uVar);
                if (this.disposed) {
                    return;
                }
                this.terminated = true;
                this.observer.onComplete();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                if (this.terminated) {
                    RxJavaPlugins.onError(th);
                    return;
                }
                if (this.disposed) {
                    return;
                }
                try {
                    this.observer.onError(th);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(new CompositeException(th, th2));
                }
            }
        }
    }

    b(retrofit2.b bVar) {
        this.originalCall = bVar;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super u> observer) {
        retrofit2.b clone = this.originalCall.clone();
        a aVar = new a(clone, observer);
        observer.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        clone.enqueue(aVar);
    }
}
