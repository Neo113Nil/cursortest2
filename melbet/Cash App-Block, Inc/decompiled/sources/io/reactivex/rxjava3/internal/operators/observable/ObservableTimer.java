package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class ObservableTimer extends Observable {
    public final long delay;
    public final Scheduler scheduler;

    public final class TimerObserver extends AtomicReference implements Disposable, Runnable {
        public final Observer downstream;

        public TimerObserver(Observer observer) {
            this.downstream = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() == DisposableHelper.DISPOSED) {
                return;
            }
            Observer observer = this.downstream;
            observer.onNext(0L);
            lazySet(EmptyDisposable.INSTANCE);
            observer.onComplete();
        }
    }

    public ObservableTimer(long j, Scheduler scheduler) {
        this.delay = j;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        TimerObserver timerObserver = new TimerObserver(observer);
        observer.onSubscribe(timerObserver);
        Disposable scheduleDirect = this.scheduler.scheduleDirect(timerObserver, this.delay, TimeUnit.SECONDS);
        while (!timerObserver.compareAndSet(null, scheduleDirect)) {
            if (timerObserver.get() != null) {
                if (timerObserver.get() == DisposableHelper.DISPOSED) {
                    scheduleDirect.dispose();
                    return;
                }
                return;
            }
        }
    }
}
