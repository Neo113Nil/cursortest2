package com.yandex.div.internal.widget.slider;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class SliderView$animatorSecondaryListener$1 implements Animator.AnimatorListener {
    private boolean hasCanceled;

    @Nullable
    private Float prevThumbSecondaryValue;
    final /* synthetic */ SliderView this$0;

    SliderView$animatorSecondaryListener$1(SliderView sliderView) {
        this.this$0 = sliderView;
    }

    @Nullable
    public final Float getPrevThumbSecondaryValue() {
        return this.prevThumbSecondaryValue;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.hasCanceled = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.this$0.sliderSecondaryAnimator = null;
        if (this.hasCanceled) {
            return;
        }
        SliderView sliderView = this.this$0;
        sliderView.notifyThumbSecondaryChangedListeners(this.prevThumbSecondaryValue, sliderView.getThumbSecondaryValue());
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

    public final void setPrevThumbSecondaryValue(@Nullable Float f4) {
        this.prevThumbSecondaryValue = f4;
    }
}
