package ru.rustore.sdk.reactive.single;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.core.Disposable;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes3.dex */
public final class SingleOnErrorReturn$subscribe$wrappedObserver$1<T> implements SingleObserver<T>, Disposable {
    final /* synthetic */ SingleObserver<T> $downstream;
    final /* synthetic */ SingleOnErrorReturn<T> this$0;
    private final AtomicBoolean disposed = new AtomicBoolean();
    private final AtomicReference<Disposable> upstreamDisposable = new AtomicReference<>(null);

    SingleOnErrorReturn$subscribe$wrappedObserver$1(SingleObserver<T> singleObserver, SingleOnErrorReturn<T> singleOnErrorReturn) {
        this.$downstream = singleObserver;
        this.this$0 = singleOnErrorReturn;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onError(Throwable e4) {
        Object m243constructorimpl;
        Function1 function1;
        Intrinsics.checkNotNullParameter(e4, "e");
        if (this.disposed.compareAndSet(false, true)) {
            try {
                Result.Companion companion = Result.Companion;
                function1 = ((SingleOnErrorReturn) this.this$0).mapper;
                m243constructorimpl = Result.m243constructorimpl(function1.invoke(e4));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            SingleObserver<T> singleObserver = this.$downstream;
            if (Result.f(m243constructorimpl)) {
                singleObserver.onSuccess(m243constructorimpl);
            }
            SingleObserver<T> singleObserver2 = this.$downstream;
            Throwable d4 = Result.d(m243constructorimpl);
            if (d4 != null) {
                singleObserver2.onError(d4);
            }
        }
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSubscribe(Disposable d4) {
        Intrinsics.checkNotNullParameter(d4, "d");
        this.$downstream.onSubscribe(d4);
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSuccess(T t4) {
        if (this.disposed.compareAndSet(false, true)) {
            this.$downstream.onSuccess(t4);
        }
    }
}
