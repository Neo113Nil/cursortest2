package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
final class DivActionTypedDictSetValueHandler$handleSetValue$1 extends s implements Function1<Variable, Variable> {
    final /* synthetic */ String $key;
    final /* synthetic */ Object $newValue;
    final /* synthetic */ Div2View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivActionTypedDictSetValueHandler$handleSetValue$1(Div2View div2View, Object obj, String str) {
        super(1);
        this.$view = div2View;
        this.$newValue = obj;
        this.$key = str;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Variable invoke(@NotNull Variable variable) {
        JSONObject clone;
        Intrinsics.checkNotNullParameter(variable, "variable");
        if (!(variable instanceof Variable.DictVariable)) {
            DivActionTypedUtilsKt.logError(this.$view, new IllegalArgumentException("dict_set_value action requires dict variable"));
            return variable;
        }
        Object value = variable.getValue();
        JSONObject jSONObject = value instanceof JSONObject ? (JSONObject) value : null;
        if (jSONObject == null) {
            DivActionTypedUtilsKt.logError(this.$view, new IllegalArgumentException("Invalid variable value"));
            return variable;
        }
        clone = DivActionTypedDictSetValueHandlerKt.clone(jSONObject);
        Object obj = this.$newValue;
        if (obj == null) {
            clone.remove(this.$key);
            ((Variable.DictVariable) variable).set(clone);
            return variable;
        }
        JSONObject put = clone.put(this.$key, obj);
        Intrinsics.checkNotNullExpressionValue(put, "newDict.put(key, newValue)");
        ((Variable.DictVariable) variable).set(put);
        return variable;
    }
}
