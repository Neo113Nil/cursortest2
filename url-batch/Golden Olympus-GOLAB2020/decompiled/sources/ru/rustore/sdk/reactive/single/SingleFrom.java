package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.SimpleDisposable;

@Metadata
/* loaded from: classes3.dex */
public final class SingleFrom<T> extends Single<T> {

    @NotNull
    private final Function0<T> source;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleFrom(@NotNull Function0<? extends T> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rustore.sdk.reactive.single.Single
    public void subscribe(@NotNull SingleObserver<T> downstream) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        SimpleDisposable simpleDisposable = new SimpleDisposable();
        downstream.onSubscribe(simpleDisposable);
        if (simpleDisposable.isDisposed()) {
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(this.source.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.f(m243constructorimpl) && !simpleDisposable.isDisposed()) {
            downstream.onSuccess(m243constructorimpl);
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 == null || simpleDisposable.isDisposed()) {
            return;
        }
        downstream.onError(d4);
    }
}
