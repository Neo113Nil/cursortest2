package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.Animator;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;

/* loaded from: classes9.dex */
public final class SelfieOverlayView$setState$lambda$7$$inlined$doOnEnd$1 implements Animator.AnimatorListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SelfieOverlayView this$0;

    public /* synthetic */ SelfieOverlayView$setState$lambda$7$$inlined$doOnEnd$1(SelfieOverlayView selfieOverlayView, int i) {
        this.$r8$classId = i;
        this.this$0 = selfieOverlayView;
    }

    private final void onAnimationCancel$com$withpersona$sdk2$inquiry$selfie$view$SelfieOverlayView$setIntensity$lambda$12$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationCancel$com$withpersona$sdk2$inquiry$selfie$view$SelfieOverlayView$setState$lambda$7$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$withpersona$sdk2$inquiry$selfie$view$SelfieOverlayView$setIntensity$lambda$12$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$withpersona$sdk2$inquiry$selfie$view$SelfieOverlayView$setState$lambda$7$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationStart$com$withpersona$sdk2$inquiry$selfie$view$SelfieOverlayView$setIntensity$lambda$12$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationStart$com$withpersona$sdk2$inquiry$selfie$view$SelfieOverlayView$setState$lambda$7$$inlined$doOnEnd$1(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.$r8$classId;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.$r8$classId;
        SelfieOverlayView selfieOverlayView = this.this$0;
        switch (i) {
            case 0:
                SelfieOverlayView.StateAnimationState stateAnimationState = selfieOverlayView.stateAnimationState;
                if (stateAnimationState != null) {
                    SelfieOverlayView.State state = selfieOverlayView.state;
                    SelfieOverlayView.State state2 = stateAnimationState.endState;
                    selfieOverlayView.state = state2;
                    selfieOverlayView.onDirectionChanged(state, state2);
                }
                selfieOverlayView.stateAnimationState = null;
                break;
            default:
                selfieOverlayView.intensityAnimationState = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.$r8$classId;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.$r8$classId;
    }
}
