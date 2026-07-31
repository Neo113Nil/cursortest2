package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
final class ObservableFilter<T> extends Observable<T> {

    @NotNull
    private final Function1<T, Boolean> predicate;

    @NotNull
    private final Observable<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public ObservableFilter(@NotNull Observable<T> upstream, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.upstream = upstream;
        this.predicate = predicate;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new ObservableFilter$subscribe$wrappedObserver$1(downstream, this));
    }
}
