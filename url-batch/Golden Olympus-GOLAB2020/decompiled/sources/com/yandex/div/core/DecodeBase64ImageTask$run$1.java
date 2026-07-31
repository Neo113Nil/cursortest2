package com.yandex.div.core;

import com.yandex.div.core.util.ImageRepresentation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DecodeBase64ImageTask$run$1 extends s implements Function0<Unit> {
    final /* synthetic */ ImageRepresentation $decoded;
    final /* synthetic */ DecodeBase64ImageTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DecodeBase64ImageTask$run$1(DecodeBase64ImageTask decodeBase64ImageTask, ImageRepresentation imageRepresentation) {
        super(0);
        this.this$0 = decodeBase64ImageTask;
        this.$decoded = imageRepresentation;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m32invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m32invoke() {
        Function1 function1;
        function1 = this.this$0.onDecoded;
        function1.invoke(this.$decoded);
    }
}
