package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class VariableControllerImpl$notifyVariableChangedCallback$1 extends s implements Function1<Variable, Unit> {
    final /* synthetic */ VariableControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VariableControllerImpl$notifyVariableChangedCallback$1(VariableControllerImpl variableControllerImpl) {
        super(1);
        this.this$0 = variableControllerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Variable) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Variable v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        this.this$0.notifyVariableChanged(v4);
    }
}
