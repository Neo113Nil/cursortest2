package com.squareup.cash.support.chat.views.util;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;

/* loaded from: classes4.dex */
public final class UnreadMessageTransition extends Visibility {
    public static AnimatorSet createAnimator(View view, boolean z) {
        float f;
        float alpha;
        float f2 = (-view.getHeight()) * 0.100000024f;
        float f3 = RecyclerView.DECELERATION_RATE;
        if (z) {
            f = 0.0f;
        } else {
            f = f2;
            f2 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f2, f);
        if (z) {
            if (view.getAlpha() == 1.0f) {
                view.setAlpha(RecyclerView.DECELERATION_RATE);
            }
            alpha = view.getAlpha();
            f3 = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, alpha, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    @Override // androidx.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        viewGroup.getClass();
        view.getClass();
        return createAnimator(view, true);
    }

    @Override // androidx.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        viewGroup.getClass();
        return createAnimator(view, false);
    }
}
