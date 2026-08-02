package com.withpersona.sdk2.inquiry.internal.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;

/* loaded from: classes9.dex */
public final class Pi2CancelModalBinding implements ViewBinding {
    public final ConstraintLayout bottomSheetContent;
    public final PersonaMaterialButton closeButton;
    public final TextView hintMessage;
    public final TextView hintTitle;
    public final PersonaMaterialButton retryButton;
    public final ConstraintLayout rootView;

    public Pi2CancelModalBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, PersonaMaterialButton personaMaterialButton, TextView textView, TextView textView2, PersonaMaterialButton personaMaterialButton2) {
        this.rootView = constraintLayout;
        this.bottomSheetContent = constraintLayout2;
        this.closeButton = personaMaterialButton;
        this.hintMessage = textView;
        this.hintTitle = textView2;
        this.retryButton = personaMaterialButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
