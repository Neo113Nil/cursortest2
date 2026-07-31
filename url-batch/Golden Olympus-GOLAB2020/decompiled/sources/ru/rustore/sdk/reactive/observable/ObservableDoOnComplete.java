package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
final class ObservableDoOnComplete<T> extends Observable<T> {

    @NotNull
    private final Function0<Unit> block;

    @NotNull
    private final Observable<T> upstream;

    public ObservableDoOnComplete(@NotNull Observable<T> upstream, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(block, "block");
        this.upstream = upstream;
        this.block = block;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new ObservableDoOnComplete$subscribe$wrappedObserver$1(downstream, this));
    }
}
