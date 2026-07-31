package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
final class ObservableDoOnDispose<T> extends Observable<T> {

    @NotNull
    private final Function0<Unit> onDispose;

    @NotNull
    private final Observable<T> upstream;

    public ObservableDoOnDispose(@NotNull Observable<T> upstream, @NotNull Function0<Unit> onDispose) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(onDispose, "onDispose");
        this.upstream = upstream;
        this.onDispose = onDispose;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new ObservableDoOnDispose$subscribe$wrappedObserver$1(downstream, this));
    }
}
