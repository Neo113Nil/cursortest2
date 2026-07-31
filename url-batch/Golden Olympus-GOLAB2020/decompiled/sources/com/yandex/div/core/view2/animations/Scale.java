package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import k0.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class Scale extends OutlineAwareVisibility {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final float pivotX;
    private final float pivotY;
    private final float scaleFactor;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    private final class ScaleAnimatorListener extends AnimatorListenerAdapter {
        private boolean isPivotSet;
        private final float nonTransitionScaleX;
        private final float nonTransitionScaleY;
        final /* synthetic */ Scale this$0;

        @NotNull
        private final View view;

        public ScaleAnimatorListener(@NotNull Scale scale, View view, float f4, float f5) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = scale;
            this.view = view;
            this.nonTransitionScaleX = f4;
            this.nonTransitionScaleY = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.view.setScaleX(this.nonTransitionScaleX);
            this.view.setScaleY(this.nonTransitionScaleY);
            if (this.isPivotSet) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.view.resetPivot();
                } else {
                    this.view.setPivotX(r0.getWidth() * 0.5f);
                    this.view.setPivotY(r0.getHeight() * 0.5f);
                }
            }
            animation.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.view.setVisibility(0);
            if (this.this$0.pivotX == 0.5f && this.this$0.pivotY == 0.5f) {
                return;
            }
            this.isPivotSet = true;
            this.view.setPivotX(r3.getWidth() * this.this$0.pivotX);
            this.view.setPivotY(r3.getHeight() * this.this$0.pivotY);
        }
    }

    public /* synthetic */ Scale(float f4, float f5, float f6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f4, (i4 & 2) != 0 ? 0.5f : f5, (i4 & 4) != 0 ? 0.5f : f6);
    }

    private final void captureEndScaleValues(s sVar) {
        int mode = getMode();
        if (mode == 1) {
            Map map = sVar.f40979a;
            Intrinsics.checkNotNullExpressionValue(map, "transitionValues.values");
            map.put("yandex:scale:scaleX", Float.valueOf(1.0f));
            Map map2 = sVar.f40979a;
            Intrinsics.checkNotNullExpressionValue(map2, "transitionValues.values");
            map2.put("yandex:scale:scaleY", Float.valueOf(1.0f));
            return;
        }
        if (mode != 2) {
            return;
        }
        Map map3 = sVar.f40979a;
        Intrinsics.checkNotNullExpressionValue(map3, "transitionValues.values");
        map3.put("yandex:scale:scaleX", Float.valueOf(this.scaleFactor));
        Map map4 = sVar.f40979a;
        Intrinsics.checkNotNullExpressionValue(map4, "transitionValues.values");
        map4.put("yandex:scale:scaleY", Float.valueOf(this.scaleFactor));
    }

    private final void captureStartScaleValues(s sVar) {
        View view = sVar.f40980b;
        int mode = getMode();
        if (mode == 1) {
            Map map = sVar.f40979a;
            Intrinsics.checkNotNullExpressionValue(map, "transitionValues.values");
            map.put("yandex:scale:scaleX", Float.valueOf(this.scaleFactor));
            Map map2 = sVar.f40979a;
            Intrinsics.checkNotNullExpressionValue(map2, "transitionValues.values");
            map2.put("yandex:scale:scaleY", Float.valueOf(this.scaleFactor));
            return;
        }
        if (mode != 2) {
            return;
        }
        Map map3 = sVar.f40979a;
        Intrinsics.checkNotNullExpressionValue(map3, "transitionValues.values");
        map3.put("yandex:scale:scaleX", Float.valueOf(view.getScaleX()));
        Map map4 = sVar.f40979a;
        Intrinsics.checkNotNullExpressionValue(map4, "transitionValues.values");
        map4.put("yandex:scale:scaleY", Float.valueOf(view.getScaleY()));
    }

    private final Animator createScaleAnimator(View view, float f4, float f5, float f6, float f7) {
        if (f4 == f6 && f5 == f7) {
            return null;
        }
        view.setVisibility(4);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f4, f6), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f5, f7));
        ofPropertyValuesHolder.addListener(new ScaleAnimatorListener(this, view, view.getScaleX(), view.getScaleY()));
        return ofPropertyValuesHolder;
    }

    private final float getCapturedScaleX(s sVar, float f4) {
        Map map;
        Object obj = (sVar == null || (map = sVar.f40979a) == null) ? null : map.get("yandex:scale:scaleX");
        Float f5 = obj instanceof Float ? (Float) obj : null;
        return f5 != null ? f5.floatValue() : f4;
    }

    private final float getCapturedScaleY(s sVar, float f4) {
        Map map;
        Object obj = (sVar == null || (map = sVar.f40979a) == null) ? null : map.get("yandex:scale:scaleY");
        Float f5 = obj instanceof Float ? (Float) obj : null;
        return f5 != null ? f5.floatValue() : f4;
    }

    @Override // k0.N, k0.AbstractC3204l
    public void captureEndValues(@NotNull s transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        float scaleX = transitionValues.f40980b.getScaleX();
        float scaleY = transitionValues.f40980b.getScaleY();
        transitionValues.f40980b.setScaleX(1.0f);
        transitionValues.f40980b.setScaleY(1.0f);
        super.captureEndValues(transitionValues);
        transitionValues.f40980b.setScaleX(scaleX);
        transitionValues.f40980b.setScaleY(scaleY);
        captureEndScaleValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new Scale$captureEndValues$2(transitionValues));
    }

    @Override // k0.N, k0.AbstractC3204l
    public void captureStartValues(@NotNull s transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        float scaleX = transitionValues.f40980b.getScaleX();
        float scaleY = transitionValues.f40980b.getScaleY();
        transitionValues.f40980b.setScaleX(1.0f);
        transitionValues.f40980b.setScaleY(1.0f);
        super.captureStartValues(transitionValues);
        transitionValues.f40980b.setScaleX(scaleX);
        transitionValues.f40980b.setScaleY(scaleY);
        captureStartScaleValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new Scale$captureStartValues$2(transitionValues));
    }

    @Override // k0.N
    @Nullable
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable s sVar, @Nullable s sVar2) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        if (sVar2 == null) {
            return null;
        }
        float capturedScaleX = getCapturedScaleX(sVar, this.scaleFactor);
        float capturedScaleY = getCapturedScaleY(sVar, this.scaleFactor);
        float capturedScaleX2 = getCapturedScaleX(sVar2, 1.0f);
        float capturedScaleY2 = getCapturedScaleY(sVar2, 1.0f);
        Object obj = sVar2.f40979a.get("yandex:scale:screenPosition");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return createScaleAnimator(ViewCopiesKt.createOrGetVisualCopy(view, sceneRoot, this, (int[]) obj), capturedScaleX, capturedScaleY, capturedScaleX2, capturedScaleY2);
    }

    @Override // k0.N
    @Nullable
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable s sVar, @Nullable s sVar2) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        if (sVar == null) {
            return null;
        }
        return createScaleAnimator(UtilsKt.getViewForAnimate(this, view, sceneRoot, sVar, "yandex:scale:screenPosition"), getCapturedScaleX(sVar, 1.0f), getCapturedScaleY(sVar, 1.0f), getCapturedScaleX(sVar2, this.scaleFactor), getCapturedScaleY(sVar2, this.scaleFactor));
    }

    public Scale(float f4, float f5, float f6) {
        this.scaleFactor = f4;
        this.pivotX = f5;
        this.pivotY = f6;
    }
}
