package com.yandex.div.evaluable.function;

import W1.f;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import j2.AbstractC3185a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DictInteger extends Function {
    private final boolean isMethod;
    private final boolean isPure;

    @NotNull
    private final List<FunctionArgument> declaredArgs = CollectionsKt.listOf((Object[]) new FunctionArgument[]{new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true)});

    @NotNull
    private final EvaluableType resultType = EvaluableType.INTEGER;

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        long longValue;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object evaluate = DictFunctionsKt.evaluate(getName(), args, isMethod());
        if (evaluate instanceof Integer) {
            longValue = ((Number) evaluate).intValue();
        } else {
            if (!(evaluate instanceof Long)) {
                if (evaluate instanceof BigInteger) {
                    DictFunctionsKt.throwException(getName(), args, "Integer overflow.", isMethod());
                    throw new f();
                }
                if (evaluate instanceof BigDecimal) {
                    DictFunctionsKt.throwException(getName(), args, "Cannot convert value to integer.", isMethod());
                    throw new f();
                }
                if (!(evaluate instanceof Double)) {
                    DictFunctionsKt.throwWrongTypeException(getName(), args, getResultType(), evaluate, isMethod());
                    throw new f();
                }
                Number number = (Number) evaluate;
                if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
                    DictFunctionsKt.throwException(getName(), args, "Integer overflow.", isMethod());
                    throw new f();
                }
                long d4 = AbstractC3185a.d(number.doubleValue());
                if (number.doubleValue() - d4 == 0.0d) {
                    return Long.valueOf(d4);
                }
                DictFunctionsKt.throwException(getName(), args, "Cannot convert value to integer.", isMethod());
                throw new f();
            }
            longValue = ((Number) evaluate).longValue();
        }
        return Long.valueOf(longValue);
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
