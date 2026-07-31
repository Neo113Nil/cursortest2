package com.yandex.div.core.expression.triggers;

import com.yandex.div.data.Variable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class TriggerExecutor$startObserving$1 extends s implements Function1<Variable, Unit> {
    final /* synthetic */ TriggerExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerExecutor$startObserving$1(TriggerExecutor triggerExecutor) {
        super(1);
        this.this$0 = triggerExecutor;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Variable) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Variable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.stopObserving();
    }
}
