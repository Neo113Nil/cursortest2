package com.yandex.div.evaluable.function;

import W1.f;
import com.ironsource.mediationsdk.metadata.a;
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
public final class StringToBoolean extends Function {

    @NotNull
    public static final StringToBoolean INSTANCE = new StringToBoolean();

    @NotNull
    private static final String name = "toBoolean";

    @NotNull
    private static final List<FunctionArgument> declaredArgs = CollectionsKt.listOf(new FunctionArgument(EvaluableType.STRING, false, 2, null));

    @NotNull
    private static final EvaluableType resultType = EvaluableType.BOOLEAN;
    private static final boolean isPure = true;

    private StringToBoolean() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        boolean z4;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object first = CollectionsKt.first(args);
        Intrinsics.checkNotNull(first, "null cannot be cast to non-null type kotlin.String");
        String str = (String) first;
        if (Intrinsics.areEqual(str, a.f17681g)) {
            z4 = true;
        } else {
            if (!Intrinsics.areEqual(str, "false")) {
                EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), args, "Unable to convert value to Boolean.", null, 8, null);
                throw new f();
            }
            z4 = false;
        }
        return Boolean.valueOf(z4);
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
