package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes9.dex */
public final class Pi2UiInputPhoneNumberBinding implements ViewBinding {
    public final TextInputLayout inputLayout;
    public final TextInputLayout rootView;

    public Pi2UiInputPhoneNumberBinding(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        this.rootView = textInputLayout;
        this.inputLayout = textInputLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
