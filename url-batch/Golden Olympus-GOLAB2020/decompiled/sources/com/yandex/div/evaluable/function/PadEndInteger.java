package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
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
public final class PadEndInteger extends Function {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;

    @NotNull
    private static final EvaluableType resultType;

    @NotNull
    public static final PadEndInteger INSTANCE = new PadEndInteger();

    @NotNull
    private static final String name = "padEnd";

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        FunctionArgument functionArgument = new FunctionArgument(evaluableType, false, 2, null);
        FunctionArgument functionArgument2 = new FunctionArgument(evaluableType, false, 2, null);
        EvaluableType evaluableType2 = EvaluableType.STRING;
        declaredArgs = CollectionsKt.listOf((Object[]) new FunctionArgument[]{functionArgument, functionArgument2, new FunctionArgument(evaluableType2, false, 2, null)});
        resultType = evaluableType2;
        isPure = true;
    }

    private PadEndInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
        String valueOf = String.valueOf(((Long) obj).longValue());
        Object obj2 = args.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj2).longValue();
        Object obj3 = args.get(2);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        return valueOf + StringFunctionsKt.m180buildRepeatableStringzbMA7A(evaluationContext, expressionContext, (int) (longValue - valueOf.length()), (String) obj3);
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
