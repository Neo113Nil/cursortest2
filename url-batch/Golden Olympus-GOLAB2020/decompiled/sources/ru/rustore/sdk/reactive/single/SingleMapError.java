package ru.rustore.sdk.reactive.single;

import W1.AbstractC1233c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.CompositeException;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
final class SingleMapError<T> extends Single<T> {

    @NotNull
    private final Function1<Throwable, Throwable> mapper;

    @NotNull
    private final Single<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleMapError(@NotNull Single<T> upstream, @NotNull Function1<? super Throwable, ? extends Throwable> mapper) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.upstream = upstream;
        this.mapper = mapper;
    }

    @Override // ru.rustore.sdk.reactive.single.Single
    public void subscribe(@NotNull final SingleObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new SingleObserver<T>() { // from class: ru.rustore.sdk.reactive.single.SingleMapError$subscribe$wrappedObserver$1
            @Override // ru.rustore.sdk.reactive.single.SingleObserver
            public void onError(Throwable e4) {
                Throwable compositeException;
                Function1 function1;
                Intrinsics.checkNotNullParameter(e4, "e");
                try {
                    function1 = ((SingleMapError) this).mapper;
                    compositeException = (Throwable) function1.invoke(e4);
                } catch (Throwable th) {
                    compositeException = new CompositeException(AbstractC1233c.b(th), e4);
                }
                downstream.onError(compositeException);
            }

            @Override // ru.rustore.sdk.reactive.single.SingleObserver
            public void onSubscribe(Disposable d4) {
                Intrinsics.checkNotNullParameter(d4, "d");
                downstream.onSubscribe(d4);
            }

            @Override // ru.rustore.sdk.reactive.single.SingleObserver
            public void onSuccess(T t4) {
                downstream.onSuccess(t4);
            }
        });
    }
}
