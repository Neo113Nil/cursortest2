package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
final class SingleDoOnDispose<T> extends Single<T> {

    @NotNull
    private final Function0<Unit> onDispose;

    @NotNull
    private final Single<T> upstream;

    public SingleDoOnDispose(@NotNull Single<T> upstream, @NotNull Function0<Unit> onDispose) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(onDispose, "onDispose");
        this.upstream = upstream;
        this.onDispose = onDispose;
    }

    @Override // ru.rustore.sdk.reactive.single.Single
    public void subscribe(@NotNull SingleObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new SingleDoOnDispose$subscribe$wrappedObserver$1(downstream, this));
    }
}
