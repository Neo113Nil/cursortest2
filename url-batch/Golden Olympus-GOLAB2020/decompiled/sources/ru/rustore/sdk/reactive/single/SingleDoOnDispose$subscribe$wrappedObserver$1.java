package ru.rustore.sdk.reactive.single;

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
public final class SingleDoOnDispose$subscribe$wrappedObserver$1<T> implements SingleObserver<T>, Disposable {
    final /* synthetic */ SingleObserver<T> $downstream;
    final /* synthetic */ SingleDoOnDispose<T> this$0;
    private final AtomicBoolean disposed = new AtomicBoolean();
    private final AtomicReference<Disposable> upstreamDisposable = new AtomicReference<>(null);

    SingleDoOnDispose$subscribe$wrappedObserver$1(SingleObserver<T> singleObserver, SingleDoOnDispose<T> singleDoOnDispose) {
        this.$downstream = singleObserver;
        this.this$0 = singleDoOnDispose;
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
        Object m243constructorimpl;
        Function0 function0;
        if (this.disposed.compareAndSet(false, true)) {
            SingleDoOnDispose<T> singleDoOnDispose = this.this$0;
            try {
                Result.Companion companion = Result.Companion;
                function0 = ((SingleDoOnDispose) singleDoOnDispose).onDispose;
                function0.invoke();
                m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            SingleObserver<T> singleObserver = this.$downstream;
            Throwable d4 = Result.d(m243constructorimpl);
            if (d4 != null) {
                Disposable andSet = this.upstreamDisposable.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                singleObserver.onError(d4);
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

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onError(Throwable e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        if (this.disposed.compareAndSet(false, true)) {
            this.$downstream.onError(e4);
        }
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSubscribe(Disposable d4) {
        Disposable andSet;
        Intrinsics.checkNotNullParameter(d4, "d");
        r.a(this.upstreamDisposable, null, d4);
        if (isDisposed() && (andSet = this.upstreamDisposable.getAndSet(null)) != null) {
            andSet.dispose();
        }
        this.$downstream.onSubscribe(this);
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSuccess(T t4) {
        if (this.disposed.compareAndSet(false, true)) {
            this.$downstream.onSuccess(t4);
        }
    }
}
