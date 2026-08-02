package io.reactivex.rxjava3.internal.operators.observable;

import com.google.android.gms.measurement.internal.zzly;
import com.google.mlkit.common.sdkinternal.zzb;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.operators.mixed.SingleFlatMapObservable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class ObservableSubscribeOn extends AbstractObservableWithUpstream {
    public final /* synthetic */ int $r8$classId;
    public final Scheduler scheduler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ObservableSubscribeOn(Observable observable, Scheduler scheduler, int i) {
        super(observable);
        this.$r8$classId = i;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        int i = this.$r8$classId;
        Scheduler scheduler = this.scheduler;
        switch (i) {
            case 0:
                SingleFlatMapObservable.FlatMapObserver flatMapObserver = new SingleFlatMapObservable.FlatMapObserver(observer);
                observer.onSubscribe(flatMapObserver);
                DisposableHelper.setOnce(flatMapObserver, scheduler.scheduleDirect(new zzb(21, this, flatMapObserver), 0L, TimeUnit.NANOSECONDS));
                break;
            default:
                ObservableTimeoutTimed$TimeoutObserver observableTimeoutTimed$TimeoutObserver = new ObservableTimeoutTimed$TimeoutObserver(observer, scheduler.createWorker());
                observer.onSubscribe(observableTimeoutTimed$TimeoutObserver);
                Disposable schedule = observableTimeoutTimed$TimeoutObserver.worker.schedule(new zzly(0L, observableTimeoutTimed$TimeoutObserver), observableTimeoutTimed$TimeoutObserver.timeout, observableTimeoutTimed$TimeoutObserver.unit);
                SequentialDisposable sequentialDisposable = observableTimeoutTimed$TimeoutObserver.task;
                sequentialDisposable.getClass();
                DisposableHelper.replace(sequentialDisposable, schedule);
                ((Observable) this.source).subscribe(observableTimeoutTimed$TimeoutObserver);
                break;
        }
    }
}
