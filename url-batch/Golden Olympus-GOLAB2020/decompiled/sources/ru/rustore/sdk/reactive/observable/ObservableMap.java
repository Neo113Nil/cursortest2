package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
final class ObservableMap<T, R> extends Observable<R> {

    @NotNull
    private final Function1<T, R> block;

    @NotNull
    private final Observable<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public ObservableMap(@NotNull Observable<T> upstream, @NotNull Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(block, "block");
        this.upstream = upstream;
        this.block = block;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<R> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new ObservableMap$subscribe$wrappedObserver$1(downstream, this));
    }
}
