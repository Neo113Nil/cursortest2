package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata
/* loaded from: classes2.dex */
final class DivActionTypedArrayMutationHandlerKt$updateVariable$1 extends s implements Function1<Variable, Variable> {
    final /* synthetic */ Div2View $this_updateVariable;
    final /* synthetic */ Function1<JSONArray, JSONArray> $valueMutation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DivActionTypedArrayMutationHandlerKt$updateVariable$1(Div2View div2View, Function1<? super JSONArray, ? extends JSONArray> function1) {
        super(1);
        this.$this_updateVariable = div2View;
        this.$valueMutation = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Variable invoke(@NotNull Variable variable) {
        Intrinsics.checkNotNullParameter(variable, "variable");
        if (!(variable instanceof Variable.ArrayVariable)) {
            DivActionTypedUtilsKt.logError(this.$this_updateVariable.getView(), new IllegalArgumentException("Action requires array variable"));
            return variable;
        }
        Object value = variable.getValue();
        JSONArray jSONArray = value instanceof JSONArray ? (JSONArray) value : null;
        if (jSONArray == null) {
            DivActionTypedUtilsKt.logError(this.$this_updateVariable.getView(), new IllegalArgumentException("Invalid variable value"));
            return variable;
        }
        ((Variable.ArrayVariable) variable).set((JSONArray) this.$valueMutation.invoke(jSONArray));
        return variable;
    }
}
