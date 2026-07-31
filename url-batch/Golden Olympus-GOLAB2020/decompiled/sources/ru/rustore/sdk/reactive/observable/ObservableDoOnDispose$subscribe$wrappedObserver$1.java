package ru.rustore.sdk.reactive.observable;

import androidx.lifecycle.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.core.Disposable;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes3.dex */
public final class ObservableDoOnDispose$subscribe$wrappedObserver$1<T> implements ObservableObserver<T>, Disposable {
    final /* synthetic */ ObservableObserver<T> $downstream;
    final /* synthetic */ ObservableDoOnDispose<T> this$0;
    private final AtomicBoolean disposed = new AtomicBoolean();
    private final AtomicReference<Disposable> upstreamDisposable = new AtomicReference<>(null);

    ObservableDoOnDispose$subscribe$wrappedObserver$1(ObservableObserver<T> observableObserver, ObservableDoOnDispose<T> observableDoOnDispose) {
        this.$downstream = observableObserver;
        this.this$0 = observableDoOnDispose;
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
        Object m243constructorimpl;
        Function0 function0;
        if (this.disposed.compareAndSet(false, true)) {
            ObservableDoOnDispose<T> observableDoOnDispose = this.this$0;
            try {
                Result.Companion companion = Result.Companion;
                function0 = ((ObservableDoOnDispose) observableDoOnDispose).onDispose;
                function0.invoke();
                m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            Throwable d4 = Result.d(m243constructorimpl);
            if (d4 != null) {
                Disposable andSet = this.upstreamDisposable.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                onError(d4);
            }
            if (Result.f(m243constructorimpl)) {
                Disposable andSet2 = this.upstreamDisposable.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
        }
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
        if (isDisposed()) {
            return;
        }
        this.$downstream.onNext(t4);
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
