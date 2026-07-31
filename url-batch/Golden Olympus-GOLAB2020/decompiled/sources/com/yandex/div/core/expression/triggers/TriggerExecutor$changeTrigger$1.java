package com.yandex.div.core.expression.triggers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class TriggerExecutor$changeTrigger$1 extends s implements Function1<Boolean, Unit> {
    final /* synthetic */ TriggerExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerExecutor$changeTrigger$1(TriggerExecutor triggerExecutor) {
        super(1);
        this.this$0 = triggerExecutor;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f41027a;
    }

    public final void invoke(boolean z4) {
        this.this$0.tryTriggerActions();
    }
}
