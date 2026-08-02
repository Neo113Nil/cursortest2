package com.squareup.scannerview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.squareup.cash.reactions.views.ChooseReactionOverlay;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final class OverlayView$setOverlayType$$inlined$doOnEnd$1 implements Animator.AnimatorListener {
    public final /* synthetic */ Object $callback$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Enum $type$inlined;
    public final /* synthetic */ View this$0;

    public /* synthetic */ OverlayView$setOverlayType$$inlined$doOnEnd$1(View view, Enum r2, Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = view;
        this.$type$inlined = r2;
        this.$callback$inlined = obj;
    }

    private final void onAnimationCancel$com$squareup$cash$reactions$views$ChooseReactionOverlay$setCloseStateAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationCancel$com$squareup$scannerview$OverlayView$setOverlayType$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationEnd$com$squareup$cash$reactions$views$ChooseReactionOverlay$setCloseStateAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$reactions$views$ChooseReactionOverlay$setCloseStateAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$scannerview$OverlayView$setOverlayType$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationStart$com$squareup$scannerview$OverlayView$setOverlayType$$inlined$doOnEnd$1(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.$r8$classId;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$r8$classId) {
            case 0:
                OverlayView overlayView = (OverlayView) this.this$0;
                OverlayType overlayType = (OverlayType) this.$type$inlined;
                int i = OverlayView.$r8$clinit;
                overlayView.setType(overlayType);
                overlayView.requestLayout();
                ((Function0) this.$callback$inlined).invoke();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.$r8$classId;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                ChooseReactionOverlay chooseReactionOverlay = (ChooseReactionOverlay) this.this$0;
                chooseReactionOverlay.state = (ChooseReactionOverlay.State) this.$type$inlined;
                if (chooseReactionOverlay.activeReactionAnimations > 0) {
                    chooseReactionOverlay.pendingAnimation = (ValueAnimator) this.$callback$inlined;
                    break;
                }
                break;
        }
    }
}
