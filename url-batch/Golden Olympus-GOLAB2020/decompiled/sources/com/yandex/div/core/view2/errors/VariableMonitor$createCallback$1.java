package com.yandex.div.core.view2.errors;

import com.yandex.div.data.Variable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class VariableMonitor$createCallback$1 extends s implements Function1<Variable, Unit> {
    final /* synthetic */ String $path;
    final /* synthetic */ VariableMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VariableMonitor$createCallback$1(VariableMonitor variableMonitor, String str) {
        super(1);
        this.this$0 = variableMonitor;
        this.$path = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Variable) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Variable variable) {
        Intrinsics.checkNotNullParameter(variable, "variable");
        this.this$0.saveVariable(variable, this.$path);
        this.this$0.notifyOnChange();
    }
}
