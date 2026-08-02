package xyz.block.genie.expressions.core;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class ExpressionEvaluator$evaluateBinary$5 extends FunctionReferenceImpl implements Function2 {
    public static final ExpressionEvaluator$evaluateBinary$5 INSTANCE = new ExpressionEvaluator$evaluateBinary$5(2, Double.TYPE, "times", "times(D)D", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Double.valueOf(((Number) obj2).doubleValue() * ((Number) obj).doubleValue());
    }
}
