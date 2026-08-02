package com.withpersona.sdk2.inquiry.internal.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes9.dex */
public final class Pi2FragmentWorkflowBinding implements ViewBinding {
    public final FloatingActionButton floatingActionButton;
    public final FragmentContainerView fragmentContainerView;
    public final FrameLayout rootView;

    public Pi2FragmentWorkflowBinding(FrameLayout frameLayout, FloatingActionButton floatingActionButton, FragmentContainerView fragmentContainerView) {
        this.rootView = frameLayout;
        this.floatingActionButton = floatingActionButton;
        this.fragmentContainerView = fragmentContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
