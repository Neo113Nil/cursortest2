package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
public final class BlockingFirstObserver extends CountDownLatch implements Observer, Disposable {
    public volatile boolean cancelled;
    public Throwable error;
    public Disposable upstream;
    public Object value;

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.cancelled = true;
        Disposable disposable = this.upstream;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        if (this.value == null) {
            this.error = th;
        }
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (this.value == null) {
            this.value = obj;
            this.upstream.dispose();
            countDown();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        this.upstream = disposable;
        if (this.cancelled) {
            disposable.dispose();
        }
    }
}
