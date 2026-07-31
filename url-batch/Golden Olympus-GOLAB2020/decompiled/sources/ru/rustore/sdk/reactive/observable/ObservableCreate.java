package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessor;
import ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessorFactoryKt;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableCreate<T> extends Observable<T> {

    @NotNull
    private final BackpressureStrategy backpressureStrategy;

    @NotNull
    private final Function1<ObservableEmitter<T>, Unit> source;

    /* JADX WARN: Multi-variable type inference failed */
    public ObservableCreate(@NotNull BackpressureStrategy backpressureStrategy, @NotNull Function1<? super ObservableEmitter<T>, Unit> source) {
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        Intrinsics.checkNotNullParameter(source, "source");
        this.backpressureStrategy = backpressureStrategy;
        this.source = source;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        BufferEmitProcessor createBufferEmitProcessor$default = BufferEmitProcessorFactoryKt.createBufferEmitProcessor$default(this.backpressureStrategy, downstream, null, 2, null);
        downstream.onSubscribe(createBufferEmitProcessor$default);
        this.source.invoke(new ObservableEmitter(createBufferEmitProcessor$default));
    }
}
