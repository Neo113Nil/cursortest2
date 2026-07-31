package com.yandex.div.evaluable.function;

import W1.f;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ColorStringComponentGetter extends Function {

    @NotNull
    private final ColorComponentGetter componentGetter;

    @NotNull
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;

    @NotNull
    private final EvaluableType resultType;

    public ColorStringComponentGetter(@NotNull ColorComponentGetter componentGetter) {
        Intrinsics.checkNotNullParameter(componentGetter, "componentGetter");
        this.componentGetter = componentGetter;
        this.declaredArgs = CollectionsKt.listOf(new FunctionArgument(EvaluableType.STRING, false, 2, null));
        this.resultType = EvaluableType.NUMBER;
        this.isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object first = CollectionsKt.first(args);
        Intrinsics.checkNotNull(first, "null cannot be cast to non-null type kotlin.String");
        try {
            return this.componentGetter.m171invokeex6DHhM(evaluationContext, expressionContext, CollectionsKt.listOf(Color.m210boximpl(Color.Companion.m220parseC4zCDoM((String) first))));
        } catch (IllegalArgumentException e4) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed(getName(), args, "Unable to convert value to Color, expected format #AARRGGBB.", e4);
            throw new f();
        }
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public EvaluableType getResultType() {
        return this.resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
