package com.yandex.div.core.view2.divs;

import O1.C1127x2;
import com.yandex.div.core.view2.animations.Fade;
import com.yandex.div.core.view2.animations.Scale;
import com.yandex.div.core.view2.animations.VerticalTranslation;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import k0.AbstractC3204l;
import kotlin.Metadata;
import kotlin.ranges.g;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivStateBinderKt {

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C1127x2.c.values().length];
            try {
                iArr[C1127x2.c.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1127x2.c.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1127x2.c.NO_ANIMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Float alphaValue(Double d4) {
        if (d4 != null) {
            return Float.valueOf(g.j((float) d4.doubleValue(), 0.0f, 1.0f));
        }
        return null;
    }

    private static final Float scaleValue(Double d4) {
        if (d4 != null) {
            return Float.valueOf(g.c((float) d4.doubleValue(), 0.0f));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC3204l toTransition(C1127x2 c1127x2, boolean z4, ExpressionResolver expressionResolver) {
        Float translateValue;
        Float translateValue2;
        Float scaleValue;
        Float alphaValue;
        int i4 = WhenMappings.$EnumSwitchMapping$0[((C1127x2.c) c1127x2.f8406e.evaluate(expressionResolver)).ordinal()];
        if (i4 == 1) {
            if (z4) {
                Expression expression = c1127x2.f8409h;
                if (expression != null) {
                    translateValue = translateValue(Double.valueOf(((Number) expression.evaluate(expressionResolver)).doubleValue()));
                }
                translateValue = null;
            } else {
                Expression expression2 = c1127x2.f8403b;
                if (expression2 != null) {
                    translateValue = translateValue(Double.valueOf(((Number) expression2.evaluate(expressionResolver)).doubleValue()));
                }
                translateValue = null;
            }
            if (z4) {
                Expression expression3 = c1127x2.f8403b;
                translateValue2 = translateValue(expression3 != null ? (Double) expression3.evaluate(expressionResolver) : null);
            } else {
                Expression expression4 = c1127x2.f8409h;
                translateValue2 = translateValue(expression4 != null ? (Double) expression4.evaluate(expressionResolver) : null);
            }
            return new VerticalTranslation(translateValue != null ? translateValue.floatValue() : -1.0f, translateValue2 != null ? translateValue2.floatValue() : 0.0f);
        }
        if (i4 == 2) {
            if (z4) {
                Expression expression5 = c1127x2.f8409h;
                scaleValue = scaleValue(expression5 != null ? (Double) expression5.evaluate(expressionResolver) : null);
            } else {
                Expression expression6 = c1127x2.f8403b;
                scaleValue = scaleValue(expression6 != null ? (Double) expression6.evaluate(expressionResolver) : null);
            }
            return new Scale(scaleValue != null ? scaleValue.floatValue() : 1.0f, 0.0f, 0.0f, 6, null);
        }
        if (i4 == 3) {
            return null;
        }
        if (z4) {
            Expression expression7 = c1127x2.f8409h;
            alphaValue = alphaValue(expression7 != null ? (Double) expression7.evaluate(expressionResolver) : null);
        } else {
            Expression expression8 = c1127x2.f8403b;
            alphaValue = alphaValue(expression8 != null ? (Double) expression8.evaluate(expressionResolver) : null);
        }
        Fade fade = new Fade(alphaValue != null ? alphaValue.floatValue() : 1.0f);
        fade.setMode(z4 ? 1 : 2);
        return fade;
    }

    private static final Float translateValue(Double d4) {
        if (d4 != null) {
            return Float.valueOf(g.j((float) d4.doubleValue(), -1.0f, 1.0f));
        }
        return null;
    }
}
