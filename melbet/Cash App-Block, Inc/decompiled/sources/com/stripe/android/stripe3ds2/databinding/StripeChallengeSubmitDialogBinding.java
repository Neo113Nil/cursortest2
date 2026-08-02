package com.stripe.android.stripe3ds2.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* loaded from: classes8.dex */
public final class StripeChallengeSubmitDialogBinding implements ViewBinding {
    public final CircularProgressIndicator progressBar;
    public final FrameLayout rootView;

    public StripeChallengeSubmitDialogBinding(FrameLayout frameLayout, CircularProgressIndicator circularProgressIndicator) {
        this.rootView = frameLayout;
        this.progressBar = circularProgressIndicator;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
