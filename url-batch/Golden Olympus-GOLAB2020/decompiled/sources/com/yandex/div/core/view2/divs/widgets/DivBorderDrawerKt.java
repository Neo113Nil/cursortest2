package com.yandex.div.core.view2.divs.widgets;

import O1.EnumC0779dc;
import O1.Qc;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivBorderDrawerKt {

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0779dc.values().length];
            try {
                iArr[EnumC0779dc.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0779dc.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0779dc.PX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float widthPx(@Nullable Qc qc, @NotNull ExpressionResolver expressionResolver, @NotNull DisplayMetrics metrics) {
        Expression expression;
        Expression expression2;
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        EnumC0779dc enumC0779dc = (qc == null || (expression2 = qc.f4478c) == null) ? null : (EnumC0779dc) expression2.evaluate(expressionResolver);
        int i4 = enumC0779dc == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0779dc.ordinal()];
        if (i4 == 1) {
            return BaseDivViewExtensionsKt.dpToPxF((Number) qc.f4479d.evaluate(expressionResolver), metrics);
        }
        if (i4 == 2) {
            return BaseDivViewExtensionsKt.spToPxF((Number) qc.f4479d.evaluate(expressionResolver), metrics);
        }
        if (i4 == 3) {
            return (float) ((Number) qc.f4479d.evaluate(expressionResolver)).doubleValue();
        }
        if (qc == null || (expression = qc.f4479d) == null) {
            return 0.0f;
        }
        return (float) ((Number) expression.evaluate(expressionResolver)).doubleValue();
    }
}
