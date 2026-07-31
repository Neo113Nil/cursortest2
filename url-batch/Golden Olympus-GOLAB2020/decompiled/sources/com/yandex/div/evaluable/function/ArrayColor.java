package com.yandex.div.evaluable.function;

import W1.f;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ArrayColor extends ArrayFunction {
    public ArrayColor() {
        super(EvaluableType.COLOR);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object evaluateArray = ArrayFunctionsKt.evaluateArray(getName(), args, isMethod());
        if (evaluateArray instanceof Color) {
            return evaluateArray;
        }
        if (!(evaluateArray instanceof String)) {
            ArrayFunctionsKt.throwArrayWrongTypeException(getName(), args, getResultType(), evaluateArray, isMethod());
            return Unit.f41027a;
        }
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(Color.m210boximpl(Color.Companion.m220parseC4zCDoM((String) evaluateArray)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) == null) {
            return m243constructorimpl;
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), args, "Unable to convert value to Color, expected format #AARRGGBB.", false, 8, null);
        throw new f();
    }
}
