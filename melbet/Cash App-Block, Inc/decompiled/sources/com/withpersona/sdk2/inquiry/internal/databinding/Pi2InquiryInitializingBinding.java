package com.withpersona.sdk2.inquiry.internal.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes9.dex */
public final class Pi2InquiryInitializingBinding implements ViewBinding {
    public final LottieAnimationView animationviewInquiryInitializingspinner;
    public final ConstraintLayout rootView;

    public Pi2InquiryInitializingBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView) {
        this.rootView = constraintLayout;
        this.animationviewInquiryInitializingspinner = lottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
