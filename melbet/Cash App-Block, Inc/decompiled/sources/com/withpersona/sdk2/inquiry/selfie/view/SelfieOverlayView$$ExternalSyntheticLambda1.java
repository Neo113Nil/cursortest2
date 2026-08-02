package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.ValueAnimator;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieOverlayView$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SelfieOverlayView f$0;

    public /* synthetic */ SelfieOverlayView$$ExternalSyntheticLambda1(SelfieOverlayView selfieOverlayView, int i) {
        this.$r8$classId = i;
        this.f$0 = selfieOverlayView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        SelfieOverlayView selfieOverlayView = this.f$0;
        switch (i) {
            case 0:
                int i2 = SelfieOverlayView.$r8$clinit;
                valueAnimator.getClass();
                SelfieOverlayView.IntensityAnimationState intensityAnimationState = selfieOverlayView.intensityAnimationState;
                if (intensityAnimationState != null) {
                    intensityAnimationState.progress = valueAnimator.getAnimatedFraction();
                }
                selfieOverlayView.applyCurrentState();
                break;
            default:
                int i3 = SelfieOverlayView.$r8$clinit;
                valueAnimator.getClass();
                SelfieOverlayView.StateAnimationState stateAnimationState = selfieOverlayView.stateAnimationState;
                if (stateAnimationState != null) {
                    stateAnimationState.progress = valueAnimator.getAnimatedFraction();
                }
                selfieOverlayView.applyCurrentState();
                break;
        }
    }
}
