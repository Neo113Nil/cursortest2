package com.yandex.div.core.util.text;

import O1.C0942me;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivTextRangesBackgroundRendererKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] getCornerRadii(C0942me c0942me, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression expression = c0942me.f7096a;
        float dpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? (Long) expression.evaluate(expressionResolver) : null, displayMetrics);
        return new float[]{dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx};
    }
}
