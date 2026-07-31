package com.yandex.div.core.view2.animations;

import O1.C1127x2;
import O1.EnumC1163z2;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import androidx.core.content.a;
import com.yandex.div.R$drawable;
import com.yandex.div.core.animation.ReverseInterpolatorKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k0.AbstractC3204l;
import k0.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.E;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class UtilsKt {

    @NotNull
    private static final C1127x2 DEFAULT_CLICK_ANIMATION;

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C1127x2.c.values().length];
            try {
                iArr[C1127x2.c.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1127x2.c.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1127x2.c.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C1127x2.c.NO_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DEFAULT_CLICK_ANIMATION = new C1127x2(companion.constant(100L), companion.constant(Double.valueOf(0.6d)), null, null, companion.constant(C1127x2.c.FADE), null, null, companion.constant(Double.valueOf(1.0d)), 108, null);
    }

    private static final Float alphaValue(Double d4) {
        if (d4 != null) {
            return Float.valueOf(g.j((float) d4.doubleValue(), 0.0f, 1.0f));
        }
        return null;
    }

    @Nullable
    public static final Function2<View, MotionEvent, Unit> asTouchListener(@NotNull C1127x2 c1127x2, @NotNull ExpressionResolver expressionResolver, @NotNull View view) {
        Intrinsics.checkNotNullParameter(c1127x2, "<this>");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(view, "view");
        Animation animation$default = toAnimation$default(c1127x2, expressionResolver, false, view, 2, null);
        Animation animation$default2 = toAnimation$default(c1127x2, expressionResolver, true, null, 4, null);
        if (animation$default == null && animation$default2 == null) {
            return null;
        }
        return new UtilsKt$asTouchListener$1(animation$default, animation$default2);
    }

    public static final void capturePosition(@NotNull s transitionValues, @NotNull Function1<? super int[], Unit> savePosition) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        Intrinsics.checkNotNullParameter(savePosition, "savePosition");
        int[] iArr = new int[2];
        transitionValues.f40980b.getLocationOnScreen(iArr);
        savePosition.invoke(iArr);
    }

    private static final ScaleAnimation createScaleAnimation(float f4, float f5) {
        return new ScaleAnimation(f4, f5, f4, f5, 1, 0.5f, 1, 0.5f);
    }

    @NotNull
    public static final C1127x2 getDEFAULT_CLICK_ANIMATION() {
        return DEFAULT_CLICK_ANIMATION;
    }

    @NotNull
    public static final View getViewForAnimate(@NotNull AbstractC3204l abstractC3204l, @NotNull View view, @NotNull ViewGroup sceneRoot, @NotNull s values, @NotNull String positionKey) {
        Intrinsics.checkNotNullParameter(abstractC3204l, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(positionKey, "positionKey");
        if (Intrinsics.areEqual(values.f40980b, view) || !ViewsKt.isActuallyLaidOut(view)) {
            return view;
        }
        Object obj = values.f40979a.get(positionKey);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return ViewCopiesKt.createOrGetVisualCopy(view, sceneRoot, abstractC3204l, (int[]) obj);
    }

    private static final Float scaleValue(Double d4) {
        if (d4 != null) {
            return Float.valueOf(g.c((float) d4.doubleValue(), 0.0f));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Iterable, kotlin.ranges.IntRange] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.animation.AnimationSet] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.animation.ScaleAnimation] */
    /* JADX WARN: Type inference failed for: r6v8 */
    private static final Animation toAnimation(C1127x2 c1127x2, ExpressionResolver expressionResolver, boolean z4, View view) {
        ?? animationSet;
        float floatValue;
        C1127x2.c cVar = (C1127x2.c) c1127x2.f8406e.evaluate(expressionResolver);
        int i4 = WhenMappings.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i4 != 1) {
            animationSet = 0;
            animationSet = 0;
            animationSet = 0;
            animationSet = 0;
            if (i4 == 2) {
                Expression expression = c1127x2.f8409h;
                Float scaleValue = scaleValue(expression != null ? (Double) expression.evaluate(expressionResolver) : null);
                floatValue = scaleValue != null ? scaleValue.floatValue() : 1.0f;
                Expression expression2 = c1127x2.f8403b;
                Float scaleValue2 = scaleValue(expression2 != null ? (Double) expression2.evaluate(expressionResolver) : null);
                animationSet = createScaleAnimation(floatValue, scaleValue2 != null ? scaleValue2.floatValue() : 0.95f);
            } else if (i4 != 3) {
                if (i4 != 4) {
                    Expression expression3 = c1127x2.f8409h;
                    Float alphaValue = alphaValue(expression3 != null ? (Double) expression3.evaluate(expressionResolver) : null);
                    floatValue = alphaValue != null ? alphaValue.floatValue() : 1.0f;
                    Expression expression4 = c1127x2.f8403b;
                    Float alphaValue2 = alphaValue(expression4 != null ? (Double) expression4.evaluate(expressionResolver) : null);
                    animationSet = new AlphaAnimation(floatValue, alphaValue2 != null ? alphaValue2.floatValue() : 0.6f);
                }
            } else if (view != 0) {
                Drawable background = view.getBackground();
                LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
                if (layerDrawable != null) {
                    ?? p4 = g.p(0, layerDrawable.getNumberOfLayers());
                    if (!(p4 instanceof Collection) || !((Collection) p4).isEmpty()) {
                        Iterator it = p4.iterator();
                        while (it.hasNext()) {
                            if (layerDrawable.getId(((E) it).a()) == R$drawable.native_animation_background) {
                                break;
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (layerDrawable != null) {
                    int numberOfLayers = layerDrawable.getNumberOfLayers();
                    for (int i5 = 0; i5 < numberOfLayers; i5++) {
                        Drawable drawable = layerDrawable.getDrawable(i5);
                        Intrinsics.checkNotNullExpressionValue(drawable, "it.getDrawable(i)");
                        arrayList.add(drawable);
                    }
                } else {
                    Drawable background2 = view.getBackground();
                    Intrinsics.checkNotNullExpressionValue(background2, "view.background");
                    arrayList.add(background2);
                }
                Drawable g4 = a.g(view.getContext(), R$drawable.native_animation_background);
                if (g4 != null) {
                    arrayList.add(g4);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
                layerDrawable2.setId(arrayList.size() - 1, R$drawable.native_animation_background);
                view.setBackground(layerDrawable2);
            }
        } else {
            animationSet = new AnimationSet(false);
            List list = c1127x2.f8405d;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Animation animation = toAnimation((C1127x2) it2.next(), expressionResolver, z4, view);
                    if (animation != null) {
                        animationSet.addAnimation(animation);
                    }
                }
            }
        }
        if (cVar != C1127x2.c.SET) {
            if (animationSet != 0) {
                animationSet.setInterpolator(z4 ? ReverseInterpolatorKt.reversed(DivUtilKt.getAndroidInterpolator((EnumC1163z2) c1127x2.f8404c.evaluate(expressionResolver))) : DivUtilKt.getAndroidInterpolator((EnumC1163z2) c1127x2.f8404c.evaluate(expressionResolver)));
            }
            if (animationSet != 0) {
                animationSet.setDuration(((Number) c1127x2.f8402a.evaluate(expressionResolver)).longValue());
            }
        }
        if (animationSet != 0) {
            animationSet.setStartOffset(((Number) c1127x2.f8408g.evaluate(expressionResolver)).longValue());
        }
        if (animationSet == 0) {
            return animationSet;
        }
        animationSet.setFillAfter(true);
        return animationSet;
    }

    static /* synthetic */ Animation toAnimation$default(C1127x2 c1127x2, ExpressionResolver expressionResolver, boolean z4, View view, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            view = null;
        }
        return toAnimation(c1127x2, expressionResolver, z4, view);
    }
}
