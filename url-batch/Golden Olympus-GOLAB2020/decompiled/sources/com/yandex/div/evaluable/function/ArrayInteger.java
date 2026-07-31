package com.yandex.div.evaluable.function;

import W1.f;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import j2.AbstractC3185a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ArrayInteger extends ArrayFunction {
    public ArrayInteger() {
        super(EvaluableType.INTEGER);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object evaluateArray = ArrayFunctionsKt.evaluateArray(getName(), args, isMethod());
        if (evaluateArray instanceof Integer) {
            return Long.valueOf(((Number) evaluateArray).intValue());
        }
        if (evaluateArray instanceof Long) {
            return evaluateArray;
        }
        if (evaluateArray instanceof BigInteger) {
            ArrayFunctionsKt.throwArrayException$default(getName(), args, "Integer overflow.", false, 8, null);
            throw new f();
        }
        if (evaluateArray instanceof BigDecimal) {
            ArrayFunctionsKt.throwArrayException$default(getName(), args, "Cannot convert value to integer.", false, 8, null);
            throw new f();
        }
        if (!(evaluateArray instanceof Double)) {
            ArrayFunctionsKt.throwArrayWrongTypeException(getName(), args, getResultType(), evaluateArray, isMethod());
            return Unit.f41027a;
        }
        Number number = (Number) evaluateArray;
        if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
            ArrayFunctionsKt.throwArrayException$default(getName(), args, "Integer overflow.", false, 8, null);
            throw new f();
        }
        long d4 = AbstractC3185a.d(number.doubleValue());
        if (number.doubleValue() - d4 == 0.0d) {
            return Long.valueOf(d4);
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), args, "Cannot convert value to integer.", false, 8, null);
        throw new f();
    }
}
