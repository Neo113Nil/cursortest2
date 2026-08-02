package com.withpersona.sdk2.inquiry.sandbox.databinding;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.workflow1.ui.WorkflowViewStub;

/* loaded from: classes9.dex */
public final class Pi2SandboxOverlayBinding implements ViewBinding {
    public final CoordinatorLayout rootView;

    public Pi2SandboxOverlayBinding(CoordinatorLayout coordinatorLayout, WorkflowViewStub workflowViewStub, FloatingActionButton floatingActionButton) {
        this.rootView = coordinatorLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
