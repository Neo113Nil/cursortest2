package com.yandex.div.core.view2.errors;

import com.yandex.div.core.view2.errors.VariableAdapter;
import h2.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class VariableAdapter$VariableViewHolder$bind$1$1 extends s implements Function1<String, Unit> {
    final /* synthetic */ VariableModel $variable;
    final /* synthetic */ VariableAdapter.VariableViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VariableAdapter$VariableViewHolder$bind$1$1(VariableAdapter.VariableViewHolder variableViewHolder, VariableModel variableModel) {
        super(1);
        this.this$0 = variableViewHolder;
        this.$variable = variableModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull String newValue) {
        n nVar;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        nVar = this.this$0.variableMutator;
        nVar.invoke(this.$variable.getName(), this.$variable.getPath(), newValue);
    }
}
