package com.yandex.div.core.util;

import O1.Bc;
import O1.C0735b4;
import O1.C0860i3;
import O1.EnumC1145y2;
import O1.EnumC1163z2;
import O1.InterfaceC0752c3;
import O1.O6;
import O1.Z;
import W1.m;
import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.ironsource.b9;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.animation.EaseInInterpolator;
import com.yandex.div.core.animation.EaseInOutInterpolator;
import com.yandex.div.core.animation.EaseInterpolator;
import com.yandex.div.core.animation.EaseOutInterpolator;
import com.yandex.div.core.animation.ReverseInterpolatorKt;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivUtilKt {

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EnumC1163z2.values().length];
            try {
                iArr[EnumC1163z2.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1163z2.EASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1163z2.EASE_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1163z2.EASE_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1163z2.EASE_IN_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC1163z2.SPRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC1145y2.values().length];
            try {
                iArr2[EnumC1145y2.REVERSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC1145y2.ALTERNATE_REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC1145y2.ALTERNATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final Interpolator androidInterpolator(@NotNull EnumC1163z2 enumC1163z2, boolean z4) {
        Intrinsics.checkNotNullParameter(enumC1163z2, "<this>");
        return z4 ? ReverseInterpolatorKt.reversed(getAndroidInterpolator(enumC1163z2)) : getAndroidInterpolator(enumC1163z2);
    }

    public static final boolean canBeReused(@NotNull Z z4, @NotNull Z other, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(z4, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!Intrinsics.areEqual(getType(z4), getType(other))) {
            return false;
        }
        InterfaceC0752c3 b4 = z4.b();
        InterfaceC0752c3 b5 = other.b();
        return ((b4 instanceof O6) && (b5 instanceof O6)) ? Intrinsics.areEqual(((O6) b4).f4212B.evaluate(resolver), ((O6) b5).f4212B.evaluate(resolver)) : b4.getBackground() == b5.getBackground();
    }

    public static final boolean containsStateInnerTransitions(@NotNull Z z4, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(z4, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        InterfaceC0752c3 b4 = z4.b();
        if (b4.t() != null || b4.z() != null || b4.y() != null) {
            return true;
        }
        if (z4 instanceof Z.c) {
            List<DivItemBuilderResult> buildItems = DivCollectionExtensionsKt.buildItems(((Z.c) z4).c(), (DivViewFacade) null, resolver);
            if ((buildItems instanceof Collection) && buildItems.isEmpty()) {
                return false;
            }
            for (DivItemBuilderResult divItemBuilderResult : buildItems) {
                if (containsStateInnerTransitions(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver())) {
                    return true;
                }
            }
            return false;
        }
        if (z4 instanceof Z.g) {
            List<Z> nonNullItems = DivCollectionExtensionsKt.getNonNullItems(((Z.g) z4).c());
            if ((nonNullItems instanceof Collection) && nonNullItems.isEmpty()) {
                return false;
            }
            Iterator<T> it = nonNullItems.iterator();
            while (it.hasNext()) {
                if (containsStateInnerTransitions((Z) it.next(), resolver)) {
                    return true;
                }
            }
            return false;
        }
        if ((z4 instanceof Z.r) || (z4 instanceof Z.h) || (z4 instanceof Z.f) || (z4 instanceof Z.m) || (z4 instanceof Z.i) || (z4 instanceof Z.o) || (z4 instanceof Z.e) || (z4 instanceof Z.k) || (z4 instanceof Z.q) || (z4 instanceof Z.d) || (z4 instanceof Z.l) || (z4 instanceof Z.n) || (z4 instanceof Z.s) || (z4 instanceof Z.j) || (z4 instanceof Z.p)) {
            return false;
        }
        throw new m();
    }

    @NotNull
    public static final Interpolator getAndroidInterpolator(@NotNull EnumC1163z2 enumC1163z2) {
        Intrinsics.checkNotNullParameter(enumC1163z2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[enumC1163z2.ordinal()]) {
            case 1:
                return new LinearInterpolator();
            case 2:
                return new EaseInterpolator();
            case 3:
                return new EaseInInterpolator();
            case 4:
                return new EaseOutInterpolator();
            case 5:
                return new EaseInOutInterpolator();
            case 6:
                return new SpringInterpolator();
            default:
                throw new m();
        }
    }

    @NotNull
    public static final float[] getCornerRadii(@NotNull C0860i3 c0860i3, float f4, float f5, @NotNull DisplayMetrics metrics, @NotNull ExpressionResolver resolver) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Intrinsics.checkNotNullParameter(c0860i3, "<this>");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        C0735b4 c0735b4 = c0860i3.f6460b;
        if (c0735b4 == null || (expression = c0735b4.f5779c) == null) {
            expression = c0860i3.f6459a;
        }
        float dpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? (Long) expression.evaluate(resolver) : null, metrics);
        C0735b4 c0735b42 = c0860i3.f6460b;
        if (c0735b42 == null || (expression2 = c0735b42.f5780d) == null) {
            expression2 = c0860i3.f6459a;
        }
        float dpToPx2 = BaseDivViewExtensionsKt.dpToPx(expression2 != null ? (Long) expression2.evaluate(resolver) : null, metrics);
        C0735b4 c0735b43 = c0860i3.f6460b;
        if (c0735b43 == null || (expression3 = c0735b43.f5777a) == null) {
            expression3 = c0860i3.f6459a;
        }
        float dpToPx3 = BaseDivViewExtensionsKt.dpToPx(expression3 != null ? (Long) expression3.evaluate(resolver) : null, metrics);
        C0735b4 c0735b44 = c0860i3.f6460b;
        if (c0735b44 == null || (expression4 = c0735b44.f5778b) == null) {
            expression4 = c0860i3.f6459a;
        }
        float dpToPx4 = BaseDivViewExtensionsKt.dpToPx(expression4 != null ? (Long) expression4.evaluate(resolver) : null, metrics);
        Float f6 = (Float) Collections.min(CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(f4 / (dpToPx + dpToPx2)), Float.valueOf(f4 / (dpToPx3 + dpToPx4)), Float.valueOf(f5 / (dpToPx + dpToPx3)), Float.valueOf(f5 / (dpToPx2 + dpToPx4))}));
        Intrinsics.checkNotNullExpressionValue(f6, "f");
        if (f6.floatValue() > 0.0f && f6.floatValue() < 1.0f) {
            dpToPx *= f6.floatValue();
            dpToPx2 *= f6.floatValue();
            dpToPx3 *= f6.floatValue();
            dpToPx4 *= f6.floatValue();
        }
        return new float[]{dpToPx, dpToPx, dpToPx2, dpToPx2, dpToPx4, dpToPx4, dpToPx3, dpToPx3};
    }

    @Nullable
    public static final Bc.c getDefaultState(@NotNull Bc bc, @NotNull ExpressionResolver resolver) {
        Object obj;
        Intrinsics.checkNotNullParameter(bc, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Expression expression = bc.f1514j;
        if (expression != null) {
            Iterator it = bc.f1529y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((Bc.c) obj).f1537d, expression.evaluate(resolver))) {
                    break;
                }
            }
            Bc.c cVar = (Bc.c) obj;
            if (cVar != null) {
                return cVar;
            }
        }
        return (Bc.c) CollectionsKt.firstOrNull(bc.f1529y);
    }

    @NotNull
    public static final String getType(@NotNull Z z4) {
        Intrinsics.checkNotNullParameter(z4, "<this>");
        if (z4 instanceof Z.r) {
            return b9.h.f15450K0;
        }
        if (z4 instanceof Z.h) {
            return "image";
        }
        if (z4 instanceof Z.f) {
            return "gif";
        }
        if (z4 instanceof Z.m) {
            return "separator";
        }
        if (z4 instanceof Z.i) {
            return "indicator";
        }
        if (z4 instanceof Z.n) {
            return "slider";
        }
        if (z4 instanceof Z.j) {
            return "input";
        }
        if (z4 instanceof Z.s) {
            return "video";
        }
        if (z4 instanceof Z.c) {
            return "container";
        }
        if (z4 instanceof Z.g) {
            return "grid";
        }
        if (z4 instanceof Z.o) {
            return b9.h.f15456P;
        }
        if (z4 instanceof Z.e) {
            return "gallery";
        }
        if (z4 instanceof Z.k) {
            return "pager";
        }
        if (z4 instanceof Z.q) {
            return "tabs";
        }
        if (z4 instanceof Z.d) {
            return "custom";
        }
        if (z4 instanceof Z.l) {
            return "select";
        }
        if (z4 instanceof Z.p) {
            return "switch";
        }
        throw new m();
    }

    public static final boolean isAlternated(@NotNull EnumC1145y2 enumC1145y2) {
        Intrinsics.checkNotNullParameter(enumC1145y2, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$1[enumC1145y2.ordinal()];
        return i4 == 2 || i4 == 3;
    }

    public static final boolean isBranch(@NotNull Z z4) {
        Intrinsics.checkNotNullParameter(z4, "<this>");
        if ((z4 instanceof Z.r) || (z4 instanceof Z.h) || (z4 instanceof Z.f) || (z4 instanceof Z.m) || (z4 instanceof Z.i) || (z4 instanceof Z.n) || (z4 instanceof Z.j) || (z4 instanceof Z.d) || (z4 instanceof Z.l) || (z4 instanceof Z.s) || (z4 instanceof Z.p)) {
            return false;
        }
        if ((z4 instanceof Z.c) || (z4 instanceof Z.g) || (z4 instanceof Z.e) || (z4 instanceof Z.k) || (z4 instanceof Z.q) || (z4 instanceof Z.o)) {
            return true;
        }
        throw new m();
    }

    public static final boolean isLeaf(@NotNull Z z4) {
        Intrinsics.checkNotNullParameter(z4, "<this>");
        return !isBranch(z4);
    }

    public static final boolean isReversed(@NotNull EnumC1145y2 enumC1145y2) {
        Intrinsics.checkNotNullParameter(enumC1145y2, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$1[enumC1145y2.ordinal()];
        return i4 == 1 || i4 == 2;
    }
}
