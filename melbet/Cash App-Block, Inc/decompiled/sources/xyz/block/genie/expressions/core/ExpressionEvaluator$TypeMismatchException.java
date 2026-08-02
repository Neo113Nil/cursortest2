package xyz.block.genie.expressions.core;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import xyz.block.genie.expressions.EvaluatedValue;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"xyz/block/genie/expressions/core/ExpressionEvaluator$TypeMismatchException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExpressionEvaluator$TypeMismatchException extends RuntimeException {
    public final EvaluatedValue actual;
    public final String expected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressionEvaluator$TypeMismatchException(String str, EvaluatedValue evaluatedValue) {
        super(CameraSelector$$ExternalSyntheticOutline0.m("Expected ", str, ", got ", Reflection.factory.getOrCreateKotlinClass(evaluatedValue.getClass()).getSimpleName()));
        evaluatedValue.getClass();
        this.expected = str;
        this.actual = evaluatedValue;
    }
}
