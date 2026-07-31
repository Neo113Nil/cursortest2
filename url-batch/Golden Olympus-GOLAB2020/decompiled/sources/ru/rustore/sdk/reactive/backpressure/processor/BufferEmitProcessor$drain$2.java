package ru.rustore.sdk.reactive.backpressure.processor;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class BufferEmitProcessor$drain$2 extends s implements Function0<Unit> {
    final /* synthetic */ BufferEmitProcessor<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BufferEmitProcessor$drain$2(BufferEmitProcessor<T> bufferEmitProcessor) {
        super(0);
        this.this$0 = bufferEmitProcessor;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m273invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m273invoke() {
        this.this$0.loop();
    }
}
