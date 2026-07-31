package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class VariableControllerImpl$setOnAnyVariableChangeCallback$1 extends s implements Function1<Variable, Unit> {
    final /* synthetic */ Function1<Variable, Unit> $callback;
    final /* synthetic */ VariableControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VariableControllerImpl$setOnAnyVariableChangeCallback$1(VariableControllerImpl variableControllerImpl, Function1<? super Variable, Unit> function1) {
        super(1);
        this.this$0 = variableControllerImpl;
        this.$callback = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Variable) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Variable it) {
        Map map;
        Intrinsics.checkNotNullParameter(it, "it");
        map = this.this$0.variables;
        if (map.get(it.getName()) == null) {
            this.$callback.invoke(it);
        }
    }
}
