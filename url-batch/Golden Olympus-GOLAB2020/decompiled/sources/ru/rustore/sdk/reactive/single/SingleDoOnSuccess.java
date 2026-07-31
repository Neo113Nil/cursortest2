package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
final class SingleDoOnSuccess<T> extends Single<T> {

    @NotNull
    private final Function1<T, Unit> block;

    @NotNull
    private final Single<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleDoOnSuccess(@NotNull Single<T> upstream, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(block, "block");
        this.upstream = upstream;
        this.block = block;
    }

    @Override // ru.rustore.sdk.reactive.single.Single
    public void subscribe(@NotNull final SingleObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new SingleObserver<T>() { // from class: ru.rustore.sdk.reactive.single.SingleDoOnSuccess$subscribe$wrappedObserver$1
            @Override // ru.rustore.sdk.reactive.single.SingleObserver
            public void onError(Throwable e4) {
                Intrinsics.checkNotNullParameter(e4, "e");
                downstream.onError(e4);
            }

            @Override // ru.rustore.sdk.reactive.single.SingleObserver
            public void onSubscribe(Disposable d4) {
                Intrinsics.checkNotNullParameter(d4, "d");
                downstream.onSubscribe(d4);
            }

            @Override // ru.rustore.sdk.reactive.single.SingleObserver
            public void onSuccess(T t4) {
                Object m243constructorimpl;
                Function1 function1;
                SingleDoOnSuccess<T> singleDoOnSuccess = this;
                try {
                    Result.Companion companion = Result.Companion;
                    function1 = ((SingleDoOnSuccess) singleDoOnSuccess).block;
                    function1.invoke(t4);
                    m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
                }
                SingleObserver<T> singleObserver = downstream;
                if (Result.f(m243constructorimpl)) {
                    singleObserver.onSuccess(t4);
                }
                SingleObserver<T> singleObserver2 = downstream;
                Throwable d4 = Result.d(m243constructorimpl);
                if (d4 != null) {
                    singleObserver2.onError(d4);
                }
            }
        });
    }
}
