package com.yandex.div.core.expression.local;

import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.core.expression.variables.VariableAndConstantController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.VariableProvider;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class LocalFunction extends Function {

    @NotNull
    private final List<String> argNames;

    @NotNull
    private final List<FunctionArgument> declaredArgs;

    @NotNull
    private final Evaluable evaluable;
    private final boolean isPure;

    @NotNull
    private final String name;

    @NotNull
    private final EvaluableType resultType;

    public LocalFunction(@NotNull String name, @NotNull List<FunctionArgument> declaredArgs, @NotNull EvaluableType resultType, @NotNull List<String> argNames, @NotNull String body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(declaredArgs, "declaredArgs");
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        Intrinsics.checkNotNullParameter(argNames, "argNames");
        Intrinsics.checkNotNullParameter(body, "body");
        this.name = name;
        this.declaredArgs = declaredArgs;
        this.resultType = resultType;
        this.argNames = argNames;
        this.evaluable = Evaluable.Companion.lazy(body);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM, reason: not valid java name */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i4 = 0;
        for (Object obj : this.argNames) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            linkedHashMap.put((String) obj, args.get(i4));
            i4 = i5;
        }
        VariableProvider variableProvider = evaluationContext.getVariableProvider();
        Intrinsics.checkNotNull(variableProvider, "null cannot be cast to non-null type com.yandex.div.core.expression.variables.VariableController");
        return new Evaluator(new EvaluationContext(new VariableAndConstantController((VariableController) variableProvider, new ConstantsProvider(linkedHashMap)), evaluationContext.getStoredValueProvider(), evaluationContext.getFunctionProvider(), evaluationContext.getWarningSender())).eval(this.evaluable);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return this.name;
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
