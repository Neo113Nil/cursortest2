package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1281a0;
import java.util.Map;
import k0.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class Fade extends OutlineAwareVisibility {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final float alpha;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    private static final class FadeAnimatorListener extends AnimatorListenerAdapter {
        private boolean isLayerTypeChanged;
        private final float nonTransitionAlpha;

        @NotNull
        private final View view;

        public FadeAnimatorListener(@NotNull View view, float f4) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.nonTransitionAlpha = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.view.setAlpha(this.nonTransitionAlpha);
            if (this.isLayerTypeChanged) {
                this.view.setLayerType(0, null);
            }
            animation.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.view.setVisibility(0);
            if (AbstractC1281a0.P(this.view) && this.view.getLayerType() == 0) {
                this.isLayerTypeChanged = true;
                this.view.setLayerType(2, null);
            }
        }
    }

    public Fade(float f4) {
        this.alpha = f4;
    }

    private final Animator createFadeAnimator(View view, float f4, float f5) {
        if (f4 == f5) {
            return null;
        }
        view.setAlpha(f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f4, f5);
        ofFloat.addListener(new FadeAnimatorListener(view, view.getAlpha()));
        return ofFloat;
    }

    private final float getCapturedAlpha(s sVar, float f4) {
        Map map;
        Object obj = (sVar == null || (map = sVar.f40979a) == null) ? null : map.get("yandex:fade:alpha");
        Float f5 = obj instanceof Float ? (Float) obj : null;
        return f5 != null ? f5.floatValue() : f4;
    }

    @Override // k0.N, k0.AbstractC3204l
    public void captureEndValues(@NotNull s transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        super.captureEndValues(transitionValues);
        int mode = getMode();
        if (mode == 1) {
            Map map = transitionValues.f40979a;
            Intrinsics.checkNotNullExpressionValue(map, "transitionValues.values");
            map.put("yandex:fade:alpha", Float.valueOf(transitionValues.f40980b.getAlpha()));
        } else if (mode == 2) {
            Map map2 = transitionValues.f40979a;
            Intrinsics.checkNotNullExpressionValue(map2, "transitionValues.values");
            map2.put("yandex:fade:alpha", Float.valueOf(this.alpha));
        }
        UtilsKt.capturePosition(transitionValues, new Fade$captureEndValues$1(transitionValues));
    }

    @Override // k0.N, k0.AbstractC3204l
    public void captureStartValues(@NotNull s transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        super.captureStartValues(transitionValues);
        int mode = getMode();
        if (mode == 1) {
            Map map = transitionValues.f40979a;
            Intrinsics.checkNotNullExpressionValue(map, "transitionValues.values");
            map.put("yandex:fade:alpha", Float.valueOf(this.alpha));
        } else if (mode == 2) {
            Map map2 = transitionValues.f40979a;
            Intrinsics.checkNotNullExpressionValue(map2, "transitionValues.values");
            map2.put("yandex:fade:alpha", Float.valueOf(transitionValues.f40980b.getAlpha()));
        }
        UtilsKt.capturePosition(transitionValues, new Fade$captureStartValues$1(transitionValues));
    }

    @Override // k0.N
    @Nullable
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable s sVar, @Nullable s sVar2) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        if (sVar2 == null) {
            return null;
        }
        float capturedAlpha = getCapturedAlpha(sVar, this.alpha);
        float capturedAlpha2 = getCapturedAlpha(sVar2, 1.0f);
        Object obj = sVar2.f40979a.get("yandex:fade:screenPosition");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return createFadeAnimator(ViewCopiesKt.createOrGetVisualCopy(view, sceneRoot, this, (int[]) obj), capturedAlpha, capturedAlpha2);
    }

    @Override // k0.N
    @Nullable
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable s sVar, @Nullable s sVar2) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        if (sVar == null) {
            return null;
        }
        return createFadeAnimator(UtilsKt.getViewForAnimate(this, view, sceneRoot, sVar, "yandex:fade:screenPosition"), getCapturedAlpha(sVar, 1.0f), getCapturedAlpha(sVar2, this.alpha));
    }
}
