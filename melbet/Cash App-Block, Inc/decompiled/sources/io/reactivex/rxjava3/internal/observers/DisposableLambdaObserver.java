package io.reactivex.rxjava3.internal.observers;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Collection;

/* loaded from: classes9.dex */
public final class DisposableLambdaObserver implements Observer, Disposable {
    public final /* synthetic */ int $r8$classId;
    public final Observer downstream;
    public Object onSubscribe;
    public Disposable upstream;

    public /* synthetic */ DisposableLambdaObserver(Observer observer, Object obj, int i) {
        this.$r8$classId = i;
        this.downstream = observer;
        this.onSubscribe = obj;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.$r8$classId) {
            case 0:
                Disposable disposable = this.upstream;
                DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                if (disposable != disposableHelper) {
                    this.upstream = disposableHelper;
                    disposable.dispose();
                    break;
                }
                break;
            case 1:
                this.upstream.dispose();
                break;
            default:
                this.upstream.dispose();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        int i = this.$r8$classId;
        Observer observer = this.downstream;
        switch (i) {
            case 0:
                Disposable disposable = this.upstream;
                DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                if (disposable != disposableHelper) {
                    this.upstream = disposableHelper;
                    observer.onComplete();
                    break;
                }
                break;
            case 1:
                observer.onComplete();
                break;
            default:
                Collection collection = (Collection) this.onSubscribe;
                this.onSubscribe = null;
                observer.onNext(collection);
                observer.onComplete();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        int i = this.$r8$classId;
        Observer observer = this.downstream;
        switch (i) {
            case 0:
                Disposable disposable = this.upstream;
                DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                if (disposable == disposableHelper) {
                    UnsignedBytes.onError(th);
                    break;
                } else {
                    this.upstream = disposableHelper;
                    observer.onError(th);
                    break;
                }
            case 1:
                try {
                    Object mo39apply = ((Function) this.onSubscribe).mo39apply(th);
                    if (mo39apply != null) {
                        observer.onNext(mo39apply);
                        observer.onComplete();
                        break;
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                        nullPointerException.initCause(th);
                        observer.onError(nullPointerException);
                        break;
                    }
                } catch (Throwable th2) {
                    Longs.throwIfFatal(th2);
                    observer.onError(new CompositeException(th, th2));
                    return;
                }
            default:
                this.onSubscribe = null;
                observer.onError(th);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.downstream.onNext(obj);
                break;
            case 1:
                this.downstream.onNext(obj);
                break;
            default:
                ((Collection) this.onSubscribe).add(obj);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        int i = this.$r8$classId;
        Observer observer = this.downstream;
        switch (i) {
            case 0:
                try {
                    ((PreviewView$1$$ExternalSyntheticLambda2) this.onSubscribe).accept(disposable);
                    if (DisposableHelper.validate(this.upstream, disposable)) {
                        this.upstream = disposable;
                        observer.onSubscribe(this);
                        break;
                    }
                } catch (Throwable th) {
                    Longs.throwIfFatal(th);
                    disposable.dispose();
                    this.upstream = DisposableHelper.DISPOSED;
                    EmptyDisposable.error(th, observer);
                    return;
                }
                break;
            case 1:
                if (DisposableHelper.validate(this.upstream, disposable)) {
                    this.upstream = disposable;
                    observer.onSubscribe(this);
                    break;
                }
                break;
            default:
                if (DisposableHelper.validate(this.upstream, disposable)) {
                    this.upstream = disposable;
                    observer.onSubscribe(this);
                    break;
                }
                break;
        }
    }
}
