package com.stripe.android.stripe3ds2.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;

/* loaded from: classes8.dex */
public final class StripeChallengeActivityBinding implements ViewBinding {
    public final FragmentContainerView fragmentContainer;
    public final FrameLayout rootView;

    public StripeChallengeActivityBinding(FrameLayout frameLayout, FragmentContainerView fragmentContainerView) {
        this.rootView = frameLayout;
        this.fragmentContainer = fragmentContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
