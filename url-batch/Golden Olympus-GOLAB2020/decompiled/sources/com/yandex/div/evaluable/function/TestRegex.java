package com.yandex.div.evaluable.function;

import W1.f;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class TestRegex extends Function {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;

    @NotNull
    private static final EvaluableType resultType;

    @NotNull
    public static final TestRegex INSTANCE = new TestRegex();

    @NotNull
    private static final String name = "testRegex";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = CollectionsKt.listOf((Object[]) new FunctionArgument[]{new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null)});
        resultType = EvaluableType.BOOLEAN;
        isPure = true;
    }

    private TestRegex() {
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
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        try {
            return Boolean.valueOf(Pattern.compile((String) obj2).matcher(str).find());
        } catch (PatternSyntaxException unused) {
            List<? extends Object> list = args;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Object obj3 : list) {
                if (obj3 instanceof String) {
                    obj3 = StringsKt.G((String) obj3, "\\", "\\\\", false, 4, null);
                }
                arrayList.add(obj3);
            }
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), arrayList, "Invalid regular expression.", null, 8, null);
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
