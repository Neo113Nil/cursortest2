package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata
/* loaded from: classes2.dex */
public abstract class ArrayFromArray extends ArrayFunction {
    public ArrayFromArray() {
        super(EvaluableType.ARRAY);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object evaluateArray = ArrayFunctionsKt.evaluateArray(getName(), args, isMethod());
        JSONArray jSONArray = evaluateArray instanceof JSONArray ? (JSONArray) evaluateArray : null;
        if (jSONArray != null) {
            return jSONArray;
        }
        ArrayFunctionsKt.throwArrayWrongTypeException(getName(), args, getResultType(), evaluateArray, isMethod());
        return Unit.f41027a;
    }
}
