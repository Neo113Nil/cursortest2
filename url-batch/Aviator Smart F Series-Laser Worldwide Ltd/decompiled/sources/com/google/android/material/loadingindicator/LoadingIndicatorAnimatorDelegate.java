package com.google.android.material.loadingindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.loadingindicator.LoadingIndicatorDrawingDelegate;

/* loaded from: classes4.dex */
class LoadingIndicatorAnimatorDelegate {
    private static final int CONSTANT_ROTATION_PER_SHAPE_DEGREES = 50;
    private static final int DURATION_PER_SHAPE_IN_MS = 650;
    private static final int EXTRA_ROTATION_PER_SHAPE_DEGREES = 90;
    private static final float SPRING_DAMPING_RATIO = 0.6f;
    private static final float SPRING_STIFFNESS = 200.0f;
    private float animationFraction;
    private ObjectAnimator animator;

    @Nullable
    LoadingIndicatorDrawable drawable;
    LoadingIndicatorDrawingDelegate.IndicatorState indicatorState = new LoadingIndicatorDrawingDelegate.IndicatorState();
    private float morphFactor;
    private int morphFactorTarget;

    @NonNull
    LoadingIndicatorSpec specs;
    private SpringAnimation springAnimation;
    private static final Property<LoadingIndicatorAnimatorDelegate, Float> ANIMATION_FRACTION = new Property<LoadingIndicatorAnimatorDelegate, Float>(Float.class, "animationFraction") { // from class: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate.2
        @Override // android.util.Property
        public Float get(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
            return Float.valueOf(loadingIndicatorAnimatorDelegate.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate, Float f8) {
            loadingIndicatorAnimatorDelegate.setAnimationFraction(f8.floatValue());
        }
    };
    private static final FloatPropertyCompat<LoadingIndicatorAnimatorDelegate> MORPH_FACTOR = new FloatPropertyCompat<LoadingIndicatorAnimatorDelegate>("morphFactor") { // from class: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate.3
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
            return loadingIndicatorAnimatorDelegate.getMorphFactor();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate, float f8) {
            loadingIndicatorAnimatorDelegate.setMorphFactor(f8);
        }
    };

    public LoadingIndicatorAnimatorDelegate(@NonNull LoadingIndicatorSpec loadingIndicatorSpec) {
        this.specs = loadingIndicatorSpec;
    }

    static /* synthetic */ int access$004(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
        int i8 = loadingIndicatorAnimatorDelegate.morphFactorTarget + 1;
        loadingIndicatorAnimatorDelegate.morphFactorTarget = i8;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAnimationFraction() {
        return this.animationFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getMorphFactor() {
        return this.morphFactor;
    }

    private void maybeInitializeAnimators() {
        if (this.springAnimation == null) {
            this.springAnimation = new SpringAnimation(this, MORPH_FACTOR).setSpring(new SpringForce().setStiffness(200.0f).setDampingRatio(0.6f)).setMinimumVisibleChange(0.01f);
        }
        if (this.animator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, 0.0f, 1.0f);
            this.animator = ofFloat;
            ofFloat.setDuration(650L);
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LoadingIndicatorAnimatorDelegate.this.springAnimation.animateToFinalPosition(LoadingIndicatorAnimatorDelegate.access$004(LoadingIndicatorAnimatorDelegate.this));
                }
            });
        }
    }

    private void updateIndicatorRotation(int i8) {
        float f8 = this.morphFactorTarget - 1;
        float f9 = this.morphFactor - f8;
        float f10 = i8 / 650.0f;
        if (f10 == 1.0f) {
            f10 = 0.0f;
        }
        this.indicatorState.rotationDegree = (((f8 * 140.0f) + (f10 * 50.0f)) + (f9 * 90.0f)) % 360.0f;
    }

    private void updateIndicatorShapeAndColor() {
        LoadingIndicatorDrawingDelegate.IndicatorState indicatorState = this.indicatorState;
        indicatorState.morphFraction = this.morphFactor;
        int i8 = this.morphFactorTarget - 1;
        int[] iArr = this.specs.indicatorColors;
        int length = i8 % iArr.length;
        indicatorState.color = ArgbEvaluatorCompat.getInstance().evaluate(MathUtils.clamp(this.morphFactor - (this.morphFactorTarget - 1), 0.0f, 1.0f), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[(length + 1) % iArr.length])).intValue();
    }

    void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        SpringAnimation springAnimation = this.springAnimation;
        if (springAnimation != null) {
            springAnimation.skipToEnd();
        }
    }

    void invalidateSpecValues() {
        resetPropertiesForNewStart();
    }

    protected void registerDrawable(@NonNull LoadingIndicatorDrawable loadingIndicatorDrawable) {
        this.drawable = loadingIndicatorDrawable;
    }

    void resetPropertiesForNewStart() {
        this.morphFactorTarget = 1;
        setMorphFactor(0.0f);
        this.indicatorState.color = this.specs.indicatorColors[0];
    }

    @VisibleForTesting
    void setAnimationFraction(float f8) {
        this.animationFraction = f8;
        updateIndicatorRotation((int) (f8 * 650.0f));
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.drawable;
        if (loadingIndicatorDrawable != null) {
            loadingIndicatorDrawable.invalidateSelf();
        }
    }

    @VisibleForTesting
    void setMorphFactor(float f8) {
        this.morphFactor = f8;
        updateIndicatorShapeAndColor();
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.drawable;
        if (loadingIndicatorDrawable != null) {
            loadingIndicatorDrawable.invalidateSelf();
        }
    }

    @VisibleForTesting
    void setMorphFactorTarget(int i8) {
        this.morphFactorTarget = i8;
    }

    void startAnimator() {
        maybeInitializeAnimators();
        resetPropertiesForNewStart();
        this.springAnimation.animateToFinalPosition(this.morphFactorTarget);
        this.animator.start();
    }
}
