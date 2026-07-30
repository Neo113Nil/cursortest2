package io.reactivex.observables;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableAutoConnect;
import io.reactivex.internal.operators.observable.ObservablePublishAlt;
import io.reactivex.internal.operators.observable.ObservablePublishClassic;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import io.reactivex.internal.util.ConnectConsumer;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class ConnectableObservable<T> extends Observable<T> {
    /* JADX WARN: Multi-variable type inference failed */
    private ConnectableObservable<T> onRefCount() {
        return this instanceof ObservablePublishClassic ? RxJavaPlugins.onAssembly((ConnectableObservable) new ObservablePublishAlt(((ObservablePublishClassic) this).publishSource())) : this;
    }

    @NonNull
    public Observable<T> autoConnect() {
        return autoConnect(1);
    }

    public final Disposable connect() {
        ConnectConsumer connectConsumer = new ConnectConsumer();
        connect(connectConsumer);
        return connectConsumer.disposable;
    }

    public abstract void connect(@NonNull Consumer<? super Disposable> consumer);

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public Observable<T> refCount() {
        return RxJavaPlugins.onAssembly(new ObservableRefCount(onRefCount()));
    }

    @NonNull
    public Observable<T> autoConnect(int i8) {
        return autoConnect(i8, Functions.emptyConsumer());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> refCount(int i8) {
        return refCount(i8, 0L, TimeUnit.NANOSECONDS, Schedulers.trampoline());
    }

    @NonNull
    public Observable<T> autoConnect(int i8, @NonNull Consumer<? super Disposable> consumer) {
        if (i8 <= 0) {
            connect(consumer);
            return RxJavaPlugins.onAssembly((ConnectableObservable) this);
        }
        return RxJavaPlugins.onAssembly(new ObservableAutoConnect(this, i8, consumer));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> refCount(long j8, TimeUnit timeUnit) {
        return refCount(1, j8, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    public final Observable<T> refCount(long j8, TimeUnit timeUnit, Scheduler scheduler) {
        return refCount(1, j8, timeUnit, scheduler);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> refCount(int i8, long j8, TimeUnit timeUnit) {
        return refCount(i8, j8, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    public final Observable<T> refCount(int i8, long j8, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.verifyPositive(i8, "subscriberCount");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableRefCount(onRefCount(), i8, j8, timeUnit, scheduler));
    }
}
