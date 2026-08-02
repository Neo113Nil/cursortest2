package io.reactivex.rxjava3.internal.operators.observable;

import com.google.android.gms.measurement.internal.zzly;
import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class ObservableTimeoutTimed$TimeoutObserver extends AtomicLong implements Observer, Disposable {
    public final Observer downstream;
    public final Scheduler.Worker worker;
    public final long timeout = 120;
    public final TimeUnit unit = TimeUnit.SECONDS;
    public final SequentialDisposable task = new SequentialDisposable();
    public final AtomicReference upstream = new AtomicReference();

    public ObservableTimeoutTimed$TimeoutObserver(Observer observer, Scheduler.Worker worker) {
        this.downstream = observer;
        this.worker = worker;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.upstream);
        this.worker.dispose();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            SequentialDisposable sequentialDisposable = this.task;
            sequentialDisposable.getClass();
            DisposableHelper.dispose(sequentialDisposable);
            this.downstream.onComplete();
            this.worker.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            UnsignedBytes.onError(th);
            return;
        }
        SequentialDisposable sequentialDisposable = this.task;
        sequentialDisposable.getClass();
        DisposableHelper.dispose(sequentialDisposable);
        this.downstream.onError(th);
        this.worker.dispose();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                SequentialDisposable sequentialDisposable = this.task;
                ((Disposable) sequentialDisposable.get()).dispose();
                this.downstream.onNext(obj);
                Disposable schedule = this.worker.schedule(new zzly(j2, this), this.timeout, this.unit);
                sequentialDisposable.getClass();
                DisposableHelper.replace(sequentialDisposable, schedule);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.upstream, disposable);
    }
}
