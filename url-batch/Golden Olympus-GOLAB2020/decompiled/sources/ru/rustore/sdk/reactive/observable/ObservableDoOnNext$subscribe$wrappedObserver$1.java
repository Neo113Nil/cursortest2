package ru.rustore.sdk.reactive.observable;

import androidx.lifecycle.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.core.Disposable;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes3.dex */
public final class ObservableDoOnNext$subscribe$wrappedObserver$1<T> implements ObservableObserver<T>, Disposable {
    final /* synthetic */ ObservableObserver<T> $downstream;
    final /* synthetic */ ObservableDoOnNext<T> this$0;
    private final AtomicBoolean disposed = new AtomicBoolean();
    private final AtomicReference<Disposable> upstreamDisposable = new AtomicReference<>(null);

    ObservableDoOnNext$subscribe$wrappedObserver$1(ObservableObserver<T> observableObserver, ObservableDoOnNext<T> observableDoOnNext) {
        this.$downstream = observableObserver;
        this.this$0 = observableDoOnNext;
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
            this.$downstream.onComplete();
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
        Object m243constructorimpl;
        Function1 function1;
        ObservableDoOnNext<T> observableDoOnNext = this.this$0;
        try {
            Result.Companion companion = Result.Companion;
            function1 = ((ObservableDoOnNext) observableDoOnNext).block;
            function1.invoke(t4);
            m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        ObservableObserver<T> observableObserver = this.$downstream;
        if (Result.f(m243constructorimpl)) {
            if (!isDisposed()) {
                observableObserver.onNext(t4);
            }
        }
        ObservableObserver<T> observableObserver2 = this.$downstream;
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 == null || !this.disposed.compareAndSet(false, true)) {
            return;
        }
        Disposable andSet = this.upstreamDisposable.getAndSet(null);
        if (andSet != null) {
            andSet.dispose();
        }
        observableObserver2.onError(d4);
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
