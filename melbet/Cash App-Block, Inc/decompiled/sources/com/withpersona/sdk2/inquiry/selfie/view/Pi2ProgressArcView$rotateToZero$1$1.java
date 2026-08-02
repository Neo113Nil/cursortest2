package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class Pi2ProgressArcView$rotateToZero$1$1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ValueAnimator $this_apply;
    public float lastProgress;
    public final /* synthetic */ Pi2ProgressArcView this$0;

    public /* synthetic */ Pi2ProgressArcView$rotateToZero$1$1(ValueAnimator valueAnimator, Pi2ProgressArcView pi2ProgressArcView, int i) {
        this.$r8$classId = i;
        this.$this_apply = valueAnimator;
        this.this$0 = pi2ProgressArcView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        Pi2ProgressArcView pi2ProgressArcView = this.this$0;
        ValueAnimator valueAnimator2 = this.$this_apply;
        valueAnimator.getClass();
        switch (i) {
            case 0:
                Object animatedValue = valueAnimator2.getAnimatedValue();
                animatedValue.getClass();
                float floatValue = ((Float) animatedValue).floatValue();
                float abs = Math.abs(floatValue - this.lastProgress);
                float f = pi2ProgressArcView._rotation;
                float f2 = (abs + f) % 360.0f;
                pi2ProgressArcView._rotation = f2;
                if (f > f2) {
                    pi2ProgressArcView._rotation = RecyclerView.DECELERATION_RATE;
                    valueAnimator.cancel();
                }
                this.lastProgress = floatValue;
                pi2ProgressArcView.invalidate();
                break;
            default:
                Object animatedValue2 = valueAnimator2.getAnimatedValue();
                animatedValue2.getClass();
                float floatValue2 = ((Float) animatedValue2).floatValue();
                pi2ProgressArcView._rotation = (pi2ProgressArcView._rotation + Math.abs(floatValue2 - this.lastProgress)) % 360.0f;
                this.lastProgress = floatValue2;
                pi2ProgressArcView.invalidate();
                break;
        }
    }
}
