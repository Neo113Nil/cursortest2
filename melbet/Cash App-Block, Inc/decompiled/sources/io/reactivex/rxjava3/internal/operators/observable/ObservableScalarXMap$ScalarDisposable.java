package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.operators.QueueDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class ObservableScalarXMap$ScalarDisposable extends AtomicInteger implements QueueDisposable, Runnable {
    public final Observer observer;
    public final Object value;

    public ObservableScalarXMap$ScalarDisposable(Observer observer, Object obj) {
        this.observer = observer;
        this.value = obj;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        set(3);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.value;
    }

    @Override // io.reactivex.rxjava3.operators.QueueDisposable
    public final int requestFusion() {
        lazySet(1);
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.value;
            Observer observer = this.observer;
            observer.onNext(obj);
            if (get() == 2) {
                lazySet(3);
                observer.onComplete();
            }
        }
    }
}
