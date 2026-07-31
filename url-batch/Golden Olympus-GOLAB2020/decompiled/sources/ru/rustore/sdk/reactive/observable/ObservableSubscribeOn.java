package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Dispatcher;

@Metadata
/* loaded from: classes3.dex */
final class ObservableSubscribeOn<T> extends Observable<T> {

    @NotNull
    private final Dispatcher dispatcher;

    @NotNull
    private final Observable<T> upstream;

    public ObservableSubscribeOn(@NotNull Observable<T> upstream, @NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.upstream = upstream;
        this.dispatcher = dispatcher;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.dispatcher.execute(new ObservableSubscribeOn$subscribe$1(this, downstream));
    }
}
