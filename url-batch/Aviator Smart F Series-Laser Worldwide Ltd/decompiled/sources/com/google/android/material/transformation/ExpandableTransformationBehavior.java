package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes4.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    @Nullable
    private AnimatorSet currentAnimation;

    public ExpandableTransformationBehavior() {
    }

    @NonNull
    protected abstract AnimatorSet onCreateExpandedStateChangeAnimation(View view, View view2, boolean z7, boolean z8);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    protected boolean onExpandedStateChange(View view, View view2, boolean z7, boolean z8) {
        AnimatorSet animatorSet = this.currentAnimation;
        boolean z9 = animatorSet != null;
        if (z9) {
            animatorSet.cancel();
        }
        AnimatorSet onCreateExpandedStateChangeAnimation = onCreateExpandedStateChangeAnimation(view, view2, z7, z9);
        this.currentAnimation = onCreateExpandedStateChangeAnimation;
        onCreateExpandedStateChangeAnimation.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.ExpandableTransformationBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.currentAnimation = null;
            }
        });
        this.currentAnimation.start();
        if (!z8) {
            this.currentAnimation.end();
        }
        return true;
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
