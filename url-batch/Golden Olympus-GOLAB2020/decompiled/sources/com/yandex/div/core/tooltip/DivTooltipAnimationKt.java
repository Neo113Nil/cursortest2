package com.yandex.div.core.tooltip;

import O1.C1127x2;
import O1.EnumC1163z2;
import O1.Se;
import W1.m;
import android.animation.TimeInterpolator;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.widget.PopupWindow;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivTooltipAnimationKt {

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C1127x2.c.values().length];
            try {
                iArr[C1127x2.c.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1127x2.c.TRANSLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1127x2.c.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C1127x2.c.SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C1127x2.c.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C1127x2.c.NO_ANIMATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void clearAnimation(@NotNull PopupWindow popupWindow) {
        Intrinsics.checkNotNullParameter(popupWindow, "<this>");
        removeTransition(popupWindow);
    }

    private static final TransitionSet defaultTransition(Se se, ExpressionResolver expressionResolver) {
        return new TransitionSet().addTransition(new Fade()).addTransition(new TranslateAnimation((Se.c) se.f4821j.evaluate(expressionResolver), null, 2, null)).setInterpolator((TimeInterpolator) new SpringInterpolator());
    }

    private static final void removeTransition(PopupWindow popupWindow) {
        popupWindow.setEnterTransition(null);
        popupWindow.setExitTransition(null);
    }

    public static final void setupAnimation(@NotNull PopupWindow popupWindow, @NotNull Se divTooltip, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(popupWindow, "<this>");
        Intrinsics.checkNotNullParameter(divTooltip, "divTooltip");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        C1127x2 c1127x2 = divTooltip.f4812a;
        popupWindow.setEnterTransition(c1127x2 != null ? toTransition(c1127x2, (Se.c) divTooltip.f4821j.evaluate(resolver), true, resolver) : defaultTransition(divTooltip, resolver));
        C1127x2 c1127x22 = divTooltip.f4813b;
        popupWindow.setExitTransition(c1127x22 != null ? toTransition(c1127x22, (Se.c) divTooltip.f4821j.evaluate(resolver), false, resolver) : defaultTransition(divTooltip, resolver));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.transition.Fade] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.yandex.div.core.tooltip.TranslateAnimation] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.yandex.div.core.tooltip.Scale] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.transition.TransitionSet] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.transition.Transition] */
    private static final Transition toTransition(C1127x2 c1127x2, Se.c cVar, boolean z4, ExpressionResolver expressionResolver) {
        ?? fade;
        Transition duration;
        switch (WhenMappings.$EnumSwitchMapping$0[((C1127x2.c) c1127x2.f8406e.evaluate(expressionResolver)).ordinal()]) {
            case 1:
                fade = new Fade();
                break;
            case 2:
                Expression expression = z4 ? c1127x2.f8409h : c1127x2.f8403b;
                fade = new TranslateAnimation(cVar, expression != null ? Float.valueOf((float) ((Number) expression.evaluate(expressionResolver)).doubleValue()) : null);
                break;
            case 3:
                Expression expression2 = z4 ? c1127x2.f8409h : c1127x2.f8403b;
                fade = new Scale(expression2 != null ? (float) ((Number) expression2.evaluate(expressionResolver)).doubleValue() : 1.0f);
                break;
            case 4:
                fade = new TransitionSet();
                List list = c1127x2.f8405d;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fade.addTransition(toTransition((C1127x2) it.next(), cVar, z4, expressionResolver));
                    }
                    break;
                }
                break;
            case 5:
            case 6:
                fade = 0;
                break;
            default:
                throw new m();
        }
        if (fade == 0 || (duration = fade.setDuration(((Number) c1127x2.f8402a.evaluate(expressionResolver)).longValue())) == null) {
            return null;
        }
        return duration.setInterpolator(DivUtilKt.getAndroidInterpolator((EnumC1163z2) c1127x2.f8404c.evaluate(expressionResolver)));
    }
}
