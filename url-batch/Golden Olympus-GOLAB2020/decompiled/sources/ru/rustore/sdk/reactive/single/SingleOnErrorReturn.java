package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
final class SingleOnErrorReturn<T> extends Single<T> {

    @NotNull
    private final Function1<Throwable, T> mapper;

    @NotNull
    private final Single<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleOnErrorReturn(@NotNull Single<T> upstream, @NotNull Function1<? super Throwable, ? extends T> mapper) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.upstream = upstream;
        this.mapper = mapper;
    }

    @Override // ru.rustore.sdk.reactive.single.Single
    public void subscribe(@NotNull SingleObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new SingleOnErrorReturn$subscribe$wrappedObserver$1(downstream, this));
    }
}
