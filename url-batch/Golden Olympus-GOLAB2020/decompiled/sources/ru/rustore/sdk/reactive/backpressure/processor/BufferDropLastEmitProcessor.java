package ru.rustore.sdk.reactive.backpressure.processor;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.reactive.backpressure.buffer.Buffer;
import ru.rustore.sdk.reactive.backpressure.buffer.BufferItemType;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.observable.ObservableObserver;

@Metadata
/* loaded from: classes3.dex */
public final class BufferDropLastEmitProcessor<T> extends BufferEmitProcessor<T> {
    public /* synthetic */ BufferDropLastEmitProcessor(ObservableObserver observableObserver, int i4, Dispatcher dispatcher, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(observableObserver, i4, (i5 & 4) != 0 ? null : dispatcher);
    }

    @Override // ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessor
    public void onOverflow(@NotNull Buffer<T> buffer, @NotNull BufferItemType.Item<T> item) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(item, "item");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferDropLastEmitProcessor(@NotNull ObservableObserver<T> downStream, int i4, @Nullable Dispatcher dispatcher) {
        super(downStream, i4, dispatcher);
        Intrinsics.checkNotNullParameter(downStream, "downStream");
    }
}
