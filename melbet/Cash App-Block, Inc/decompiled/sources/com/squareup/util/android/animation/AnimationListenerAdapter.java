package com.squareup.util.android.animation;

import android.view.animation.Animation;

/* loaded from: classes.dex */
public abstract class AnimationListenerAdapter implements Animation.AnimationListener {
    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        animation.getClass();
    }
}
