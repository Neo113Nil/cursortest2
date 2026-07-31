package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ArrayUrl extends ArrayFunction {
    public ArrayUrl() {
        super(EvaluableType.URL);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        String safeConvertToUrl;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object evaluateArray = ArrayFunctionsKt.evaluateArray(getName(), args, isMethod());
        String str = evaluateArray instanceof String ? (String) evaluateArray : null;
        if (str != null && (safeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(str)) != null) {
            return Url.m221boximpl(safeConvertToUrl);
        }
        ArrayFunctionsKt.throwArrayWrongTypeException(getName(), args, getResultType(), evaluateArray, isMethod());
        return Unit.f41027a;
    }
}
