package com.yandex.div.evaluable.function;

import W1.f;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ArrayOptColorWithStringFallback extends ArrayOptFunction {

    @NotNull
    private final List<FunctionArgument> declaredArgs;

    public ArrayOptColorWithStringFallback() {
        super(EvaluableType.COLOR);
        this.declaredArgs = CollectionsKt.listOf((Object[]) new FunctionArgument[]{new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null), new FunctionArgument(EvaluableType.STRING, false, 2, null)});
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object evaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), args);
        Color safeConvertToColor = ArrayFunctionsKt.safeConvertToColor(evaluateSafe instanceof String ? (String) evaluateSafe : null);
        if (safeConvertToColor != null) {
            return safeConvertToColor;
        }
        Object obj = args.get(2);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        Color safeConvertToColor2 = ArrayFunctionsKt.safeConvertToColor((String) obj);
        if (safeConvertToColor2 != null) {
            return safeConvertToColor2;
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), args, "Unable to convert value to Color, expected format #AARRGGBB.", false, 8, null);
        throw new f();
    }

    @Override // com.yandex.div.evaluable.function.ArrayOptFunction, com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }
}
