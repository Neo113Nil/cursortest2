package io.reactivex.rxjava3.internal.operators.observable;

import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
public final class ObservableTake$TakeObserver implements Observer, Disposable {
    public final /* synthetic */ int $r8$classId;
    public boolean done;
    public final Object downstream;
    public long remaining;
    public Disposable upstream;

    public ObservableTake$TakeObserver(Observer observer) {
        this.$r8$classId = 0;
        this.downstream = observer;
        this.remaining = 1L;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.$r8$classId) {
            case 0:
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
        Object obj = this.downstream;
        switch (i) {
            case 0:
                if (!this.done) {
                    this.done = true;
                    this.upstream.dispose();
                    ((Observer) obj).onComplete();
                    break;
                }
                break;
            default:
                if (!this.done) {
                    this.done = true;
                    ((SingleObserver) obj).onError(new NoSuchElementException());
                    break;
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        int i = this.$r8$classId;
        Object obj = this.downstream;
        switch (i) {
            case 0:
                if (!this.done) {
                    this.done = true;
                    this.upstream.dispose();
                    ((Observer) obj).onError(th);
                    break;
                } else {
                    UnsignedBytes.onError(th);
                    break;
                }
            default:
                if (!this.done) {
                    this.done = true;
                    ((SingleObserver) obj).onError(th);
                    break;
                } else {
                    UnsignedBytes.onError(th);
                    break;
                }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.downstream;
        switch (i) {
            case 0:
                if (!this.done) {
                    long j = this.remaining;
                    long j2 = j - 1;
                    this.remaining = j2;
                    if (j > 0) {
                        boolean z = j2 == 0;
                        ((Observer) obj2).onNext(obj);
                        if (z) {
                            onComplete();
                            break;
                        }
                    }
                }
                break;
            default:
                if (!this.done) {
                    long j3 = this.remaining;
                    if (j3 != 0) {
                        this.remaining = j3 + 1;
                        break;
                    } else {
                        this.done = true;
                        this.upstream.dispose();
                        ((SingleObserver) obj2).onSuccess(obj);
                        break;
                    }
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        int i = this.$r8$classId;
        Object obj = this.downstream;
        switch (i) {
            case 0:
                Observer observer = (Observer) obj;
                if (DisposableHelper.validate(this.upstream, disposable)) {
                    this.upstream = disposable;
                    if (this.remaining != 0) {
                        observer.onSubscribe(this);
                        break;
                    } else {
                        this.done = true;
                        disposable.dispose();
                        EmptyDisposable.complete(observer);
                        break;
                    }
                }
                break;
            default:
                if (DisposableHelper.validate(this.upstream, disposable)) {
                    this.upstream = disposable;
                    ((SingleObserver) obj).onSubscribe(this);
                    break;
                }
                break;
        }
    }

    public ObservableTake$TakeObserver(SingleObserver singleObserver) {
        this.$r8$classId = 1;
        this.downstream = singleObserver;
    }
}
