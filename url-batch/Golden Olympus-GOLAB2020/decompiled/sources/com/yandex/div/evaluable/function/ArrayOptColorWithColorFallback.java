package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ArrayOptColorWithColorFallback extends ArrayOptFunction {
    public ArrayOptColorWithColorFallback() {
        super(EvaluableType.COLOR);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Object obj;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object evaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), args);
        Color color = evaluateSafe instanceof Color ? (Color) evaluateSafe : null;
        if (color != null) {
            return color;
        }
        String str = evaluateSafe instanceof String ? (String) evaluateSafe : null;
        if (str != null) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.m243constructorimpl(Color.m210boximpl(Color.Companion.m220parseC4zCDoM(str)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            r0 = (Color) (Result.m244isFailureimpl(obj) ? null : obj);
        }
        return r0 == null ? args.get(2) : r0;
    }
}
