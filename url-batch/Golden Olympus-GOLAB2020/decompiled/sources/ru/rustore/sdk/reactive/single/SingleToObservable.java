package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.observable.Observable;
import ru.rustore.sdk.reactive.observable.ObservableObserver;

@Metadata
/* loaded from: classes3.dex */
final class SingleToObservable<T> extends Observable<T> {

    @NotNull
    private final Single<T> upstream;

    public SingleToObservable(@NotNull Single<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.upstream = upstream;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new SingleToObservable$subscribe$wrappedDownstream$1(downstream));
    }
}
