package ru.rustore.sdk.reactive.observable;

import androidx.lifecycle.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.core.TakeCountException;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes3.dex */
public final class ObservableTakeFirst$subscribe$wrappedObserver$1<T> implements ObservableObserver<T>, Disposable {
    final /* synthetic */ ObservableObserver<T> $downstream;
    private final AtomicBoolean disposed = new AtomicBoolean();
    private final AtomicInteger emitCounterLeft;
    private final AtomicReference<Disposable> upstreamDisposable;

    ObservableTakeFirst$subscribe$wrappedObserver$1(ObservableTakeFirst<T> observableTakeFirst, ObservableObserver<T> observableObserver) {
        int i4;
        this.$downstream = observableObserver;
        i4 = ((ObservableTakeFirst) observableTakeFirst).limit;
        this.emitCounterLeft = new AtomicInteger(i4);
        this.upstreamDisposable = new AtomicReference<>(null);
    }

    private final void onCompleteInternal() {
        if (this.disposed.compareAndSet(false, true)) {
            this.$downstream.onComplete();
            Disposable andSet = this.upstreamDisposable.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
        }
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
        Disposable andSet;
        if (!this.disposed.compareAndSet(false, true) || (andSet = this.upstreamDisposable.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public boolean isDisposed() {
        return this.disposed.get();
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onComplete() {
        if (this.disposed.compareAndSet(false, true)) {
            if (this.emitCounterLeft.get() > 0) {
                this.$downstream.onError(new TakeCountException("onComplete() called before all emits reached"));
            } else {
                onCompleteInternal();
            }
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onError(Throwable e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        if (this.disposed.compareAndSet(false, true)) {
            this.$downstream.onError(e4);
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onNext(T t4) {
        if (this.emitCounterLeft.decrementAndGet() != 0) {
            this.$downstream.onNext(t4);
        } else {
            this.$downstream.onNext(t4);
            onCompleteInternal();
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onSubscribe(Disposable d4) {
        Disposable andSet;
        Intrinsics.checkNotNullParameter(d4, "d");
        r.a(this.upstreamDisposable, null, d4);
        if (isDisposed() && (andSet = this.upstreamDisposable.getAndSet(null)) != null) {
            andSet.dispose();
        }
        this.$downstream.onSubscribe(this);
    }
}
