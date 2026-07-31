package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;

@Metadata
/* loaded from: classes3.dex */
final class ObservableSwitchMap<T, R> extends Observable<R> {

    @NotNull
    private final BackpressureStrategy backpressureStrategy;

    @NotNull
    private final Function1<T, Observable<R>> mapper;

    @NotNull
    private final Observable<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public ObservableSwitchMap(@NotNull Observable<T> upstream, @NotNull Function1<? super T, ? extends Observable<R>> mapper, @NotNull BackpressureStrategy backpressureStrategy) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        this.upstream = upstream;
        this.mapper = mapper;
        this.backpressureStrategy = backpressureStrategy;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<R> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new SwitchMapObserver(downstream, this.mapper, this.backpressureStrategy));
    }
}
