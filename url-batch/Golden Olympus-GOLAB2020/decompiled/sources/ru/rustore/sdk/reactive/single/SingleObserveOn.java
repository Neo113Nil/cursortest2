package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Dispatcher;

@Metadata
/* loaded from: classes3.dex */
final class SingleObserveOn<T> extends Single<T> {

    @NotNull
    private final Dispatcher dispatcher;

    @NotNull
    private final Single<T> upstream;

    public SingleObserveOn(@NotNull Single<T> upstream, @NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.upstream = upstream;
        this.dispatcher = dispatcher;
    }

    @Override // ru.rustore.sdk.reactive.single.Single
    public void subscribe(@NotNull SingleObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new SingleObserveOn$subscribe$wrappedObserver$1(this, downstream));
    }
}
