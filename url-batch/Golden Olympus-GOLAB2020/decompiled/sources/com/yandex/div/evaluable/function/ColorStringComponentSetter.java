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
public abstract class ColorStringComponentSetter extends Function {

    @NotNull
    private final ColorComponentSetter componentSetter;

    @NotNull
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;

    @NotNull
    private final EvaluableType resultType;

    public ColorStringComponentSetter(@NotNull ColorComponentSetter componentSetter) {
        Intrinsics.checkNotNullParameter(componentSetter, "componentSetter");
        this.componentSetter = componentSetter;
        this.declaredArgs = CollectionsKt.listOf((Object[]) new FunctionArgument[]{new FunctionArgument(EvaluableType.STRING, false, 2, null), new FunctionArgument(EvaluableType.NUMBER, false, 2, null)});
        this.resultType = EvaluableType.COLOR;
        this.isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        try {
            return this.componentSetter.m171invokeex6DHhM(evaluationContext, expressionContext, CollectionsKt.listOf(Color.m210boximpl(Color.Companion.m220parseC4zCDoM((String) obj)), args.get(1)));
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
