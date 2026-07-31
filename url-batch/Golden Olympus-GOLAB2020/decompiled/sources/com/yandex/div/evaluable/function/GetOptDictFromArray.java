package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class GetOptDictFromArray extends ArrayFunction {

    @NotNull
    public static final GetOptDictFromArray INSTANCE = new GetOptDictFromArray();

    @NotNull
    private static final String name = "getOptDictFromArray";

    @NotNull
    private static final List<FunctionArgument> declaredArgs = CollectionsKt.listOf((Object[]) new FunctionArgument[]{new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null)});

    private GetOptDictFromArray() {
        super(EvaluableType.DICT);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object evaluateArray$default = ArrayFunctionsKt.evaluateArray$default(getName(), args, false, 4, null);
        JSONObject jSONObject = evaluateArray$default instanceof JSONObject ? (JSONObject) evaluateArray$default : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFunction, com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
