package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.subjects.SerializedSubject;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class ObservableRetryWhen$RepeatWhenObserver extends AtomicInteger implements Observer, Disposable {
    public volatile boolean active;
    public final Observer downstream;
    public final SerializedSubject signaller;
    public final ObservableSource source;
    public final AtomicInteger wip = new AtomicInteger();
    public final AtomicThrowable error = new AtomicThrowable();
    public final InnerRepeatObserver inner = new InnerRepeatObserver();
    public final AtomicReference upstream = new AtomicReference();

    public final class InnerRepeatObserver extends AtomicReference implements Observer {
        public InnerRepeatObserver() {
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            ObservableRetryWhen$RepeatWhenObserver observableRetryWhen$RepeatWhenObserver = ObservableRetryWhen$RepeatWhenObserver.this;
            DisposableHelper.dispose(observableRetryWhen$RepeatWhenObserver.upstream);
            Observer observer = observableRetryWhen$RepeatWhenObserver.downstream;
            AtomicThrowable atomicThrowable = observableRetryWhen$RepeatWhenObserver.error;
            if (observableRetryWhen$RepeatWhenObserver.getAndIncrement() == 0) {
                atomicThrowable.tryTerminateConsumer(observer);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            ObservableRetryWhen$RepeatWhenObserver observableRetryWhen$RepeatWhenObserver = ObservableRetryWhen$RepeatWhenObserver.this;
            DisposableHelper.dispose(observableRetryWhen$RepeatWhenObserver.upstream);
            Observer observer = observableRetryWhen$RepeatWhenObserver.downstream;
            AtomicThrowable atomicThrowable = observableRetryWhen$RepeatWhenObserver.error;
            if (atomicThrowable.tryAddThrowableOrReport(th) && observableRetryWhen$RepeatWhenObserver.getAndIncrement() == 0) {
                atomicThrowable.tryTerminateConsumer(observer);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            ObservableRetryWhen$RepeatWhenObserver.this.subscribeNext();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableRetryWhen$RepeatWhenObserver(Observer observer, SerializedSubject serializedSubject, ObservableSource observableSource) {
        this.downstream = observer;
        this.signaller = serializedSubject;
        this.source = observableSource;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this.inner);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        DisposableHelper.dispose(this.inner);
        if (getAndIncrement() == 0) {
            this.error.tryTerminateConsumer(this.downstream);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        DisposableHelper.replace(this.upstream, null);
        this.active = false;
        this.signaller.onNext(th);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            Observer observer = this.downstream;
            observer.onNext(obj);
            if (decrementAndGet() != 0) {
                this.error.tryTerminateConsumer(observer);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.upstream, disposable);
    }

    public final void subscribeNext() {
        if (this.wip.getAndIncrement() == 0) {
            while (((Disposable) this.upstream.get()) != DisposableHelper.DISPOSED) {
                if (!this.active) {
                    this.active = true;
                    ((Observable) this.source).subscribe(this);
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
