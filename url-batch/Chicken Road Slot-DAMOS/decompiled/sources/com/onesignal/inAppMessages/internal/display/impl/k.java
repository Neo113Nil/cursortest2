package com.onesignal.inAppMessages.internal.display.impl;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {
    public static final k INSTANCE = new k();

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateViewColor$lambda$0(View view, ValueAnimator valueAnimator) {
        view.getClass();
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        view.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    public final Animation animateViewByTranslation(View view, float f3, float f10, int i3, Interpolator interpolator, Animation.AnimationListener animationListener) {
        view.getClass();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f3, f10);
        translateAnimation.setDuration(i3);
        translateAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            translateAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(translateAnimation);
        return translateAnimation;
    }

    public final ValueAnimator animateViewColor(final View view, int i3, int i10, int i11, Animator.AnimatorListener animatorListener) {
        view.getClass();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(i3);
        valueAnimator.setIntValues(i10, i11);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.onesignal.inAppMessages.internal.display.impl.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                k.animateViewColor$lambda$0(view, valueAnimator2);
            }
        });
        if (animatorListener != null) {
            valueAnimator.addListener(animatorListener);
        }
        return valueAnimator;
    }

    public final Animation animateViewSmallToLarge(View view, int i3, Interpolator interpolator, Animation.AnimationListener animationListener) {
        view.getClass();
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i3);
        scaleAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            scaleAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(scaleAnimation);
        return scaleAnimation;
    }
}
