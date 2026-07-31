package com.yandex.div.core.view2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class Div2View$attachVariableTriggers$1 extends s implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $attachTriggers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Div2View$attachVariableTriggers$1(Function0<Unit> function0) {
        super(0);
        this.$attachTriggers = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m56invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m56invoke() {
        this.$attachTriggers.invoke();
    }
}
