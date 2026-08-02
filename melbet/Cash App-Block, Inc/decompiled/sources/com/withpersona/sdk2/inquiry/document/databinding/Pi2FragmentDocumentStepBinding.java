package com.withpersona.sdk2.inquiry.document.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

/* loaded from: classes9.dex */
public final class Pi2FragmentDocumentStepBinding implements ViewBinding {
    public final FrameLayout bottomSheet;
    public final FrameLayout content;
    public final FrameLayout rootView;

    public Pi2FragmentDocumentStepBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.rootView = frameLayout;
        this.bottomSheet = frameLayout2;
        this.content = frameLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
