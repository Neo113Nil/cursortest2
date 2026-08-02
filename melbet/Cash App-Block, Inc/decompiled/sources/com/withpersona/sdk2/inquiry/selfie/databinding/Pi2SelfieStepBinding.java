package com.withpersona.sdk2.inquiry.selfie.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

/* loaded from: classes9.dex */
public final class Pi2SelfieStepBinding implements ViewBinding {
    public final FrameLayout content;
    public final FrameLayout rootView;

    public Pi2SelfieStepBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.content = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
