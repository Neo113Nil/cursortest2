package com.yandex.div.evaluable.function;

import W1.f;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ArrayOptUrlWithStringFallback extends ArrayOptFunction {

    @NotNull
    private final List<FunctionArgument> declaredArgs;

    public ArrayOptUrlWithStringFallback() {
        super(EvaluableType.URL);
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
        String safeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(evaluateSafe instanceof String ? (String) evaluateSafe : null);
        if (safeConvertToUrl != null) {
            return Url.m221boximpl(safeConvertToUrl);
        }
        Object obj = args.get(2);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String safeConvertToUrl2 = ArrayFunctionsKt.safeConvertToUrl((String) obj);
        if (safeConvertToUrl2 != null) {
            return Url.m221boximpl(safeConvertToUrl2);
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), args, "Unable to convert value to Url.", false, 8, null);
        throw new f();
    }

    @Override // com.yandex.div.evaluable.function.ArrayOptFunction, com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }
}
