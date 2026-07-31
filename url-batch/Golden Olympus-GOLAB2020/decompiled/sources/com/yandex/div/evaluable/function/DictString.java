package com.yandex.div.evaluable.function;

import W1.f;
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
public abstract class DictString extends Function {

    @NotNull
    private final List<FunctionArgument> declaredArgs;
    private final boolean isMethod;
    private final boolean isPure;

    @NotNull
    private final EvaluableType resultType;

    public DictString() {
        FunctionArgument functionArgument = new FunctionArgument(EvaluableType.DICT, false, 2, null);
        EvaluableType evaluableType = EvaluableType.STRING;
        this.declaredArgs = CollectionsKt.listOf((Object[]) new FunctionArgument[]{functionArgument, new FunctionArgument(evaluableType, true)});
        this.resultType = evaluableType;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object evaluate = DictFunctionsKt.evaluate(getName(), args, isMethod());
        String str = evaluate instanceof String ? (String) evaluate : null;
        if (str != null) {
            return str;
        }
        DictFunctionsKt.throwWrongTypeException(getName(), args, getResultType(), evaluate, isMethod());
        throw new f();
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

    public boolean isMethod() {
        return this.isMethod;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
