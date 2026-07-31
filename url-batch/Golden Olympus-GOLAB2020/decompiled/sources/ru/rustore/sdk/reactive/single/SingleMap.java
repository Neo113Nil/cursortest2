package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
final class SingleMap<T, R> extends Single<R> {

    @NotNull
    private final Function1<T, R> mapper;

    @NotNull
    private final Single<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleMap(@NotNull Single<T> upstream, @NotNull Function1<? super T, ? extends R> mapper) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.upstream = upstream;
        this.mapper = mapper;
    }

    @Override // ru.rustore.sdk.reactive.single.Single
    public void subscribe(@NotNull final SingleObserver<R> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new SingleObserver<T>() { // from class: ru.rustore.sdk.reactive.single.SingleMap$subscribe$wrappedObserver$1
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
                SingleMap<T, R> singleMap = this;
                try {
                    Result.Companion companion = Result.Companion;
                    function1 = ((SingleMap) singleMap).mapper;
                    m243constructorimpl = Result.m243constructorimpl(function1.invoke(t4));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
                }
                SingleObserver<R> singleObserver = downstream;
                if (Result.f(m243constructorimpl)) {
                    singleObserver.onSuccess(m243constructorimpl);
                }
                SingleObserver<R> singleObserver2 = downstream;
                Throwable d4 = Result.d(m243constructorimpl);
                if (d4 != null) {
                    singleObserver2.onError(d4);
                }
            }
        });
    }
}
