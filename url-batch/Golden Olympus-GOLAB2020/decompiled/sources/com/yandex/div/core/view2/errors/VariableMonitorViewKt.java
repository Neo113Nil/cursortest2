package com.yandex.div.core.view2.errors;

import W1.m;
import com.ironsource.b9;
import com.yandex.div.data.Variable;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public abstract class VariableMonitorViewKt {
    private static final String getType(Variable variable) {
        if (variable instanceof Variable.ArrayVariable) {
            return "array";
        }
        if (variable instanceof Variable.BooleanVariable) {
            return "boolean";
        }
        if (variable instanceof Variable.ColorVariable) {
            return b9.h.f15459S;
        }
        if (variable instanceof Variable.DictVariable) {
            return "dict";
        }
        if (variable instanceof Variable.DoubleVariable) {
            return "number";
        }
        if (variable instanceof Variable.IntegerVariable) {
            return "integer";
        }
        if (variable instanceof Variable.StringVariable) {
            return "string";
        }
        if (variable instanceof Variable.UrlVariable) {
            return "url";
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VariableModel toModel(Variable variable, String str) {
        return new VariableModel(variable.getName(), str, getType(variable), variable.getValue().toString());
    }
}
