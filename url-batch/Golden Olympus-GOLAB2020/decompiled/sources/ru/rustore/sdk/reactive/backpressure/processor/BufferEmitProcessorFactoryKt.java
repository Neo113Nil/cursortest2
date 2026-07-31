package ru.rustore.sdk.reactive.backpressure.processor;

import W1.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.observable.ObservableObserver;

@Metadata
/* loaded from: classes3.dex */
public final class BufferEmitProcessorFactoryKt {
    @NotNull
    public static final <T> BufferEmitProcessor<T> createBufferEmitProcessor(@NotNull BackpressureStrategy backpressureStrategy, @NotNull ObservableObserver<T> downstream, @Nullable Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(backpressureStrategy, "<this>");
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        if (backpressureStrategy instanceof BackpressureStrategy.BufferDropLast) {
            return new BufferDropLastEmitProcessor(downstream, ((BackpressureStrategy.BufferDropLast) backpressureStrategy).getBufferSize(), dispatcher);
        }
        if (backpressureStrategy instanceof BackpressureStrategy.BufferDropOldest) {
            return new BufferDropOldestEmitProcessor(downstream, ((BackpressureStrategy.BufferDropOldest) backpressureStrategy).getBufferSize(), dispatcher);
        }
        throw new m();
    }

    public static /* synthetic */ BufferEmitProcessor createBufferEmitProcessor$default(BackpressureStrategy backpressureStrategy, ObservableObserver observableObserver, Dispatcher dispatcher, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            dispatcher = null;
        }
        return createBufferEmitProcessor(backpressureStrategy, observableObserver, dispatcher);
    }
}
