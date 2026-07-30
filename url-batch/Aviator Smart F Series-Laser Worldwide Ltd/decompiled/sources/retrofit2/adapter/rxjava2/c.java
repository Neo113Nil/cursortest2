package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.u;

/* loaded from: classes5.dex */
final class c extends Observable {
    private final retrofit2.b originalCall;

    private static final class a implements Disposable {
        private final retrofit2.b call;
        private volatile boolean disposed;

        a(retrofit2.b bVar) {
            this.call = bVar;
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
    }

    c(retrofit2.b bVar) {
        this.originalCall = bVar;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super u> observer) {
        boolean z7;
        retrofit2.b clone = this.originalCall.clone();
        a aVar = new a(clone);
        observer.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        try {
            u execute = clone.execute();
            if (!aVar.isDisposed()) {
                observer.onNext(execute);
            }
            if (aVar.isDisposed()) {
                return;
            }
            try {
                observer.onComplete();
            } catch (Throwable th) {
                th = th;
                z7 = true;
                Exceptions.throwIfFatal(th);
                if (z7) {
                    RxJavaPlugins.onError(th);
                    return;
                }
                if (aVar.isDisposed()) {
                    return;
                }
                try {
                    observer.onError(th);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(new CompositeException(th, th2));
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z7 = false;
        }
    }
}
