package com.yandex.div.internal.widget.slider;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class SliderView$animatorListener$1 implements Animator.AnimatorListener {
    private boolean hasCanceled;
    private float prevThumbValue;
    final /* synthetic */ SliderView this$0;

    SliderView$animatorListener$1(SliderView sliderView) {
        this.this$0 = sliderView;
    }

    public final float getPrevThumbValue() {
        return this.prevThumbValue;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.hasCanceled = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.this$0.sliderAnimator = null;
        if (this.hasCanceled) {
            return;
        }
        this.this$0.notifyThumbChangedListeners(Float.valueOf(this.prevThumbValue), this.this$0.getThumbValue());
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.hasCanceled = false;
    }

    public final void setPrevThumbValue(float f4) {
        this.prevThumbValue = f4;
    }
}
