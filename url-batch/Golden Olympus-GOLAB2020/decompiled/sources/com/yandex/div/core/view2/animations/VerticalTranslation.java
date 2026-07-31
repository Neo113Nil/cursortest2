package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1281a0;
import k0.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class VerticalTranslation extends OutlineAwareVisibility {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final float stableValue;
    private final float translatedValue;

    @Metadata
    private static final class AnimationEndListener extends AnimatorListenerAdapter {

        @NotNull
        private final View view;

        public AnimationEndListener(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.view.setTranslationY(0.0f);
            AbstractC1281a0.v0(this.view, null);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class TranslationYClipBounds extends Property<View, Float> {

        @NotNull
        private final Rect clipBounds;
        private float clipFactor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TranslationYClipBounds(@NotNull View view) {
            super(Float.TYPE, "ClipBoundsTop");
            Intrinsics.checkNotNullParameter(view, "view");
            this.clipBounds = new Rect(0, 0, view.getWidth(), view.getHeight());
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f4) {
            set(view, f4.floatValue());
        }

        @Override // android.util.Property
        @NotNull
        public Float get(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return Float.valueOf(this.clipFactor);
        }

        public void set(@NotNull View view, float f4) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.clipFactor = f4;
            if (f4 < 0.0f) {
                this.clipBounds.set(0, (int) ((-f4) * (view.getHeight() - 1)), view.getWidth(), view.getHeight());
            } else if (f4 > 0.0f) {
                float f5 = 1;
                this.clipBounds.set(0, 0, view.getWidth(), (int) (((f5 - this.clipFactor) * view.getHeight()) + f5));
            } else {
                this.clipBounds.set(0, 0, view.getWidth(), view.getHeight());
            }
            AbstractC1281a0.v0(view, this.clipBounds);
        }
    }

    public VerticalTranslation(float f4, float f5) {
        this.translatedValue = f4;
        this.stableValue = f5;
    }

    @Override // k0.N, k0.AbstractC3204l
    public void captureEndValues(@NotNull s transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        super.captureEndValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new VerticalTranslation$captureEndValues$1(transitionValues));
    }

    @Override // k0.N, k0.AbstractC3204l
    public void captureStartValues(@NotNull s transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        super.captureStartValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new VerticalTranslation$captureStartValues$1(transitionValues));
    }

    @Override // k0.N
    @Nullable
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable s sVar, @Nullable s sVar2) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        if (sVar2 == null) {
            return null;
        }
        float height = view.getHeight();
        float f4 = this.translatedValue * height;
        float f5 = this.stableValue * height;
        Object obj = sVar2.f40979a.get("yandex:verticalTranslation:screenPosition");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        View createOrGetVisualCopy = ViewCopiesKt.createOrGetVisualCopy(view, sceneRoot, this, (int[]) obj);
        createOrGetVisualCopy.setTranslationY(f4);
        TranslationYClipBounds translationYClipBounds = new TranslationYClipBounds(createOrGetVisualCopy);
        translationYClipBounds.set(createOrGetVisualCopy, this.translatedValue);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(createOrGetVisualCopy, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f4, f5), PropertyValuesHolder.ofFloat(translationYClipBounds, this.translatedValue, this.stableValue));
        ofPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return ofPropertyValuesHolder;
    }

    @Override // k0.N
    @Nullable
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable s sVar, @Nullable s sVar2) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        if (sVar == null) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(UtilsKt.getViewForAnimate(this, view, sceneRoot, sVar, "yandex:verticalTranslation:screenPosition"), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, this.stableValue, this.translatedValue * view.getHeight()), PropertyValuesHolder.ofFloat(new TranslationYClipBounds(view), this.stableValue, this.translatedValue));
        ofPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return ofPropertyValuesHolder;
    }
}
