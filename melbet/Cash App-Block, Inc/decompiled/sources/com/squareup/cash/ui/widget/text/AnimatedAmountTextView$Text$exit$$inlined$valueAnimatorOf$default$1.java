package com.squareup.cash.ui.widget.text;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class AnimatedAmountTextView$Text$exit$$inlined$valueAnimatorOf$default$1 implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Function1 $onComplete$inlined;
    public final /* synthetic */ AnimatedAmountTextView.Text this$0;

    /* renamed from: this$0, reason: collision with other field name */
    public final /* synthetic */ AnimatedAmountTextView f741this$0;

    public AnimatedAmountTextView$Text$exit$$inlined$valueAnimatorOf$default$1(AnimatedAmountTextView animatedAmountTextView, Function1 function1, AnimatedAmountTextView.Text text) {
        this.f741this$0 = animatedAmountTextView;
        this.$onComplete$inlined = function1;
        this.this$0 = text;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.$onComplete$inlined.invoke(this.this$0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f741this$0.invalidate();
    }
}
