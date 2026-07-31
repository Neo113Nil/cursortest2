package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessorFactoryKt;
import ru.rustore.sdk.reactive.core.Dispatcher;

@Metadata
/* loaded from: classes3.dex */
final class ObservableObserveOn<T> extends Observable<T> {

    @NotNull
    private final BackpressureStrategy backpressureStrategy;

    @NotNull
    private final Dispatcher dispatcher;

    @NotNull
    private final Observable<T> upstream;

    public ObservableObserveOn(@NotNull Observable<T> upstream, @NotNull Dispatcher dispatcher, @NotNull BackpressureStrategy backpressureStrategy) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        this.upstream = upstream;
        this.dispatcher = dispatcher;
        this.backpressureStrategy = backpressureStrategy;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new ObservableObserveOn$subscribe$wrappedDownstream$1(downstream, BufferEmitProcessorFactoryKt.createBufferEmitProcessor(this.backpressureStrategy, downstream, this.dispatcher)));
    }
}
