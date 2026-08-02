package xyz.block.genie.expressions.core;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class ExpressionEvaluator$evaluateBinary$2 extends FunctionReferenceImpl implements Function2 {
    public static final ExpressionEvaluator$evaluateBinary$2 INSTANCE = new ExpressionEvaluator$evaluateBinary$2(2, Long.TYPE, "plus", "plus(J)J", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Long.valueOf(((Number) obj2).longValue() + ((Number) obj).longValue());
    }
}
