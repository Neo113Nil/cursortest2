package com.yandex.div.evaluable.function;

import W1.f;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class StringSubstring extends Function {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;

    @NotNull
    private static final EvaluableType resultType;

    @NotNull
    public static final StringSubstring INSTANCE = new StringSubstring();

    @NotNull
    private static final String name = "substring";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        FunctionArgument functionArgument = new FunctionArgument(evaluableType, false, 2, null);
        EvaluableType evaluableType2 = EvaluableType.INTEGER;
        declaredArgs = CollectionsKt.listOf((Object[]) new FunctionArgument[]{functionArgument, new FunctionArgument(evaluableType2, false, 2, null), new FunctionArgument(evaluableType2, false, 2, null)});
        resultType = evaluableType;
        isPure = true;
    }

    private StringSubstring() {
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
        String str = (String) obj;
        Object obj2 = args.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj2).longValue();
        Object obj3 = args.get(2);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
        long longValue2 = ((Long) obj3).longValue();
        if (longValue < 0 || longValue2 > str.length()) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), args, "Indexes are out of bounds.", null, 8, null);
            throw new f();
        }
        if (longValue > longValue2) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), args, "Indexes should be in ascending order.", null, 8, null);
            throw new f();
        }
        String substring = str.substring((int) longValue, (int) longValue2);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
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
