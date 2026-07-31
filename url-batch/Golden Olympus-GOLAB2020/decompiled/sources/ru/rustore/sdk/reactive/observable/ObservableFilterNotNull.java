package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
final class ObservableFilterNotNull<T> extends Observable<T> {

    @NotNull
    private final Observable<T> upstream;

    public ObservableFilterNotNull(@NotNull Observable<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.upstream = upstream;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new ObservableFilterNotNull$subscribe$wrappedObserver$1(downstream));
    }
}
