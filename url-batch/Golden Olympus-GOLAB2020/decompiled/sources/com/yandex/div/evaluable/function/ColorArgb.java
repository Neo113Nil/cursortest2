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
public final class ColorArgb extends Function {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;

    @NotNull
    private static final EvaluableType resultType;

    @NotNull
    public static final ColorArgb INSTANCE = new ColorArgb();

    @NotNull
    private static final String name = "argb";

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        declaredArgs = CollectionsKt.listOf((Object[]) new FunctionArgument[]{new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null)});
        resultType = EvaluableType.COLOR;
        isPure = true;
    }

    private ColorArgb() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            Object obj = args.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Double");
            int colorIntComponentValue = ColorFunctionsKt.toColorIntComponentValue(((Double) obj).doubleValue());
            Object obj2 = args.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Double");
            int colorIntComponentValue2 = ColorFunctionsKt.toColorIntComponentValue(((Double) obj2).doubleValue());
            Object obj3 = args.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Double");
            int colorIntComponentValue3 = ColorFunctionsKt.toColorIntComponentValue(((Double) obj3).doubleValue());
            Object obj4 = args.get(3);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Double");
            return Color.m210boximpl(Color.Companion.m219argbH0kstlE(colorIntComponentValue, colorIntComponentValue2, colorIntComponentValue3, ColorFunctionsKt.toColorIntComponentValue(((Double) obj4).doubleValue())));
        } catch (IllegalArgumentException unused) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), args, "Value out of range 0..1.", null, 8, null);
            throw new f();
        }
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public EvaluableType getResultType() {
        return resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return isPure;
    }
}
