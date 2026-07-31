package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
final class ObservableTakeFirst<T> extends Observable<T> {
    private final int limit;

    @NotNull
    private final Observable<T> upstream;

    public ObservableTakeFirst(@NotNull Observable<T> upstream, int i4) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.upstream = upstream;
        this.limit = i4;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new ObservableTakeFirst$subscribe$wrappedObserver$1(this, downstream));
    }
}
