package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.R$id;
import j2.AbstractC3185a;
import k0.AbstractC3204l;
import k0.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class Slide extends OutlineAwareVisibility {
    private final int distance;

    @NotNull
    private final SlideCalculator slideCalculator;
    private final int slideEdge;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Slide$Companion$calculatorLeft$1 calculatorLeft = new HorizontalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorLeft$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(@NotNull ViewGroup sceneRoot, @NotNull View view, int i4) {
            int exactValueBy;
            Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
            Intrinsics.checkNotNullParameter(view, "view");
            float translationX = view.getTranslationX();
            exactValueBy = Slide.Companion.exactValueBy(i4, view.getRight());
            return translationX - exactValueBy;
        }
    };

    @NotNull
    private static final Slide$Companion$calculatorTop$1 calculatorTop = new VerticalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorTop$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(@NotNull ViewGroup sceneRoot, @NotNull View view, int i4) {
            int exactValueBy;
            Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
            Intrinsics.checkNotNullParameter(view, "view");
            float translationY = view.getTranslationY();
            exactValueBy = Slide.Companion.exactValueBy(i4, view.getBottom());
            return translationY - exactValueBy;
        }
    };

    @NotNull
    private static final Slide$Companion$calculatorRight$1 calculatorRight = new HorizontalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorRight$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(@NotNull ViewGroup sceneRoot, @NotNull View view, int i4) {
            int exactValueBy;
            Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
            Intrinsics.checkNotNullParameter(view, "view");
            float translationX = view.getTranslationX();
            exactValueBy = Slide.Companion.exactValueBy(i4, sceneRoot.getWidth() - view.getLeft());
            return translationX + exactValueBy;
        }
    };

    @NotNull
    private static final Slide$Companion$calculatorBottom$1 calculatorBottom = new VerticalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorBottom$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(@NotNull ViewGroup sceneRoot, @NotNull View view, int i4) {
            int exactValueBy;
            Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
            Intrinsics.checkNotNullParameter(view, "view");
            float translationY = view.getTranslationY();
            exactValueBy = Slide.Companion.exactValueBy(i4, sceneRoot.getHeight() - view.getTop());
            return translationY + exactValueBy;
        }
    };

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int exactValueBy(int i4, int i5) {
            return i4 == -1 ? i5 : i4;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    static abstract class HorizontalSlideCalculator implements SlideCalculator {
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(@NotNull ViewGroup sceneRoot, @NotNull View view, int i4) {
            Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
            Intrinsics.checkNotNullParameter(view, "view");
            return view.getTranslationY();
        }
    }

    @Metadata
    private interface SlideCalculator {
        float getGoneX(@NotNull ViewGroup viewGroup, @NotNull View view, int i4);

        float getGoneY(@NotNull ViewGroup viewGroup, @NotNull View view, int i4);
    }

    @Metadata
    private static final class TransitionPositionListener extends AnimatorListenerAdapter implements AbstractC3204l.f {

        @NotNull
        private final View movingView;

        @NotNull
        private final View originalView;
        private float pausedX;
        private float pausedY;
        private final int startX;
        private final int startY;
        private final float terminalX;
        private final float terminalY;

        @Nullable
        private int[] transitionPosition;

        public TransitionPositionListener(@NotNull View originalView, @NotNull View movingView, int i4, int i5, float f4, float f5) {
            Intrinsics.checkNotNullParameter(originalView, "originalView");
            Intrinsics.checkNotNullParameter(movingView, "movingView");
            this.originalView = originalView;
            this.movingView = movingView;
            this.terminalX = f4;
            this.terminalY = f5;
            this.startX = i4 - AbstractC3185a.c(movingView.getTranslationX());
            this.startY = i5 - AbstractC3185a.c(movingView.getTranslationY());
            Object tag = originalView.getTag(R$id.div_transition_position);
            int[] iArr = tag instanceof int[] ? (int[]) tag : null;
            this.transitionPosition = iArr;
            if (iArr != null) {
                originalView.setTag(R$id.div_transition_position, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (this.transitionPosition == null) {
                this.transitionPosition = new int[]{this.startX + AbstractC3185a.c(this.movingView.getTranslationX()), this.startY + AbstractC3185a.c(this.movingView.getTranslationY())};
            }
            this.originalView.setTag(R$id.div_transition_position, this.transitionPosition);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.pausedX = this.movingView.getTranslationX();
            this.pausedY = this.movingView.getTranslationY();
            this.movingView.setTranslationX(this.terminalX);
            this.movingView.setTranslationY(this.terminalY);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.movingView.setTranslationX(this.pausedX);
            this.movingView.setTranslationY(this.pausedY);
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionCancel(@NotNull AbstractC3204l transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionEnd(@NotNull AbstractC3204l transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.movingView.setTranslationX(this.terminalX);
            this.movingView.setTranslationY(this.terminalY);
            transition.removeListener(this);
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionPause(@NotNull AbstractC3204l transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionResume(@NotNull AbstractC3204l transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionStart(@NotNull AbstractC3204l transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    static abstract class VerticalSlideCalculator implements SlideCalculator {
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(@NotNull ViewGroup sceneRoot, @NotNull View view, int i4) {
            Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
            Intrinsics.checkNotNullParameter(view, "view");
            return view.getTranslationX();
        }
    }

    public Slide(int i4, int i5) {
        this.distance = i4;
        this.slideEdge = i5;
        this.slideCalculator = i5 != 3 ? i5 != 5 ? i5 != 48 ? calculatorBottom : calculatorTop : calculatorRight : calculatorLeft;
    }

    private final Animator createTranslateAnimator(View view, AbstractC3204l abstractC3204l, s sVar, int i4, int i5, float f4, float f5, float f6, float f7, TimeInterpolator timeInterpolator) {
        float f8;
        float f9;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Object tag = sVar.f40980b.getTag(R$id.div_transition_position);
        if ((tag instanceof int[] ? (int[]) tag : null) != null) {
            f8 = (r6[0] - i4) + translationX;
            f9 = (r6[1] - i5) + translationY;
        } else {
            f8 = f4;
            f9 = f5;
        }
        int c4 = i4 + AbstractC3185a.c(f8 - translationX);
        int c5 = i5 + AbstractC3185a.c(f9 - translationY);
        view.setTranslationX(f8);
        view.setTranslationY(f9);
        if (f8 == f6 && f9 == f7) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f8, f6), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f9, f7));
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…, startY, endY)\n        )");
        View view2 = sVar.f40980b;
        Intrinsics.checkNotNullExpressionValue(view2, "values.view");
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(view2, view, c4, c5, translationX, translationY);
        abstractC3204l.addListener(transitionPositionListener);
        ofPropertyValuesHolder.addListener(transitionPositionListener);
        ofPropertyValuesHolder.addPauseListener(transitionPositionListener);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    @Override // k0.N, k0.AbstractC3204l
    public void captureEndValues(@NotNull s transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        super.captureEndValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new Slide$captureEndValues$1(transitionValues));
    }

    @Override // k0.N, k0.AbstractC3204l
    public void captureStartValues(@NotNull s transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        super.captureStartValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new Slide$captureStartValues$1(transitionValues));
    }

    @Override // k0.N
    @Nullable
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable s sVar, @Nullable s sVar2) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        if (sVar2 == null) {
            return null;
        }
        Object obj = sVar2.f40979a.get("yandex:slide:screenPosition");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        return createTranslateAnimator(ViewCopiesKt.createOrGetVisualCopy(view, sceneRoot, this, iArr), this, sVar2, iArr[0], iArr[1], this.slideCalculator.getGoneX(sceneRoot, view, this.distance), this.slideCalculator.getGoneY(sceneRoot, view, this.distance), view.getTranslationX(), view.getTranslationY(), getInterpolator());
    }

    @Override // k0.N
    @Nullable
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable s sVar, @Nullable s sVar2) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        if (sVar == null) {
            return null;
        }
        Object obj = sVar.f40979a.get("yandex:slide:screenPosition");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        return createTranslateAnimator(UtilsKt.getViewForAnimate(this, view, sceneRoot, sVar, "yandex:slide:screenPosition"), this, sVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.slideCalculator.getGoneX(sceneRoot, view, this.distance), this.slideCalculator.getGoneY(sceneRoot, view, this.distance), getInterpolator());
    }
}
