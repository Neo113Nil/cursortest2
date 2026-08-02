package com.withpersona.sdk2.inquiry.permissions.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* loaded from: classes9.dex */
public final class Pi2FragmentPermissionRequestBinding implements ViewBinding {
    public final FrameLayout content;
    public final ConstraintLayout rootView;

    public Pi2FragmentPermissionRequestBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.content = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
