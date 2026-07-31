package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
final class ObservableDistinctUntilChangeBy<T> extends Observable<T> {

    @NotNull
    private final Function2<T, T, Boolean> comparator;

    @NotNull
    private final Observable<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public ObservableDistinctUntilChangeBy(@NotNull Observable<T> upstream, @NotNull Function2<? super T, ? super T, Boolean> comparator) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.upstream = upstream;
        this.comparator = comparator;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new DistinctUntilChangeByObserver(downstream, this.comparator));
    }
}
