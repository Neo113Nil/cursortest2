package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessor;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableEmitter<T> {

    @NotNull
    private final BufferEmitProcessor<T> emitProcessor;

    public ObservableEmitter(@NotNull BufferEmitProcessor<T> emitProcessor) {
        Intrinsics.checkNotNullParameter(emitProcessor, "emitProcessor");
        this.emitProcessor = emitProcessor;
    }

    public final boolean isDisposed() {
        return this.emitProcessor.isDisposed();
    }

    public final void onComplete() {
        this.emitProcessor.complete();
        this.emitProcessor.drain();
    }

    public final void onError(@NotNull Throwable e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.emitProcessor.error(e4);
        this.emitProcessor.drain();
    }

    public final void onNext(T t4) {
        this.emitProcessor.emit(t4);
        this.emitProcessor.drain();
    }
}
