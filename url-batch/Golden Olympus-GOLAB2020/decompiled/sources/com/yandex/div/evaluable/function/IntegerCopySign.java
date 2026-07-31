package com.yandex.div.evaluable.function;

import W1.f;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import j2.AbstractC3185a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class IntegerCopySign extends Function {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;

    @NotNull
    private static final EvaluableType resultType;

    @NotNull
    public static final IntegerCopySign INSTANCE = new IntegerCopySign();

    @NotNull
    private static final String name = "copySign";

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        declaredArgs = CollectionsKt.listOf((Object[]) new FunctionArgument[]{new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null)});
        resultType = evaluableType;
        isPure = true;
    }

    private IntegerCopySign() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object first = CollectionsKt.first(args);
        Intrinsics.checkNotNull(first, "null cannot be cast to non-null type kotlin.Long");
        Long l4 = (Long) first;
        long longValue = l4.longValue();
        Object last = CollectionsKt.last(args);
        Intrinsics.checkNotNull(last, "null cannot be cast to non-null type kotlin.Long");
        int a4 = AbstractC3185a.a(((Long) last).longValue());
        if (a4 == 0) {
            return l4;
        }
        if (longValue != Long.MIN_VALUE) {
            return Long.valueOf(Math.abs(longValue) * a4);
        }
        if (a4 == -1) {
            return l4;
        }
        EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), args, "Integer overflow.", null, 8, null);
        throw new f();
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
