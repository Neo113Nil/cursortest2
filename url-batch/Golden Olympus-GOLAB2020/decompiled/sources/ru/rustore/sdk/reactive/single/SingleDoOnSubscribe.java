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
final class SingleDoOnSubscribe<T> extends Single<T> {

    @NotNull
    private final Function1<Disposable, Unit> onSubscribe;

    @NotNull
    private final Single<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleDoOnSubscribe(@NotNull Single<T> upstream, @NotNull Function1<? super Disposable, Unit> onSubscribe) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        this.upstream = upstream;
        this.onSubscribe = onSubscribe;
    }

    @Override // ru.rustore.sdk.reactive.single.Single
    public void subscribe(@NotNull final SingleObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new SingleObserver<T>(this) { // from class: ru.rustore.sdk.reactive.single.SingleDoOnSubscribe$subscribe$wrappedObserver$1
            final /* synthetic */ SingleDoOnSubscribe<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // ru.rustore.sdk.reactive.single.SingleObserver
            public void onError(Throwable e4) {
                Intrinsics.checkNotNullParameter(e4, "e");
                downstream.onError(e4);
            }

            @Override // ru.rustore.sdk.reactive.single.SingleObserver
            public void onSubscribe(Disposable d4) {
                Object m243constructorimpl;
                Function1 function1;
                Intrinsics.checkNotNullParameter(d4, "d");
                SingleDoOnSubscribe<T> singleDoOnSubscribe = this.this$0;
                try {
                    Result.Companion companion = Result.Companion;
                    function1 = ((SingleDoOnSubscribe) singleDoOnSubscribe).onSubscribe;
                    function1.invoke(d4);
                    m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
                }
                SingleObserver<T> singleObserver = downstream;
                Throwable d5 = Result.d(m243constructorimpl);
                if (d5 != null) {
                    d4.dispose();
                    singleObserver.onSubscribe(d4);
                    singleObserver.onError(d5);
                }
                SingleObserver<T> singleObserver2 = downstream;
                if (Result.f(m243constructorimpl)) {
                    singleObserver2.onSubscribe(d4);
                }
            }

            @Override // ru.rustore.sdk.reactive.single.SingleObserver
            public void onSuccess(T t4) {
                downstream.onSuccess(t4);
            }
        });
    }
}
