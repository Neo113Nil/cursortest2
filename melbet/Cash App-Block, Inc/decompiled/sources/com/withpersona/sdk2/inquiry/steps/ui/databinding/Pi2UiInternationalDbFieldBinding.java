package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes9.dex */
public final class Pi2UiInternationalDbFieldBinding implements ViewBinding {
    public final TextInputLayout idbCountryInput;
    public final TextView idbDescription;
    public final TextInputLayout idbIdTypeInput;
    public final TextInputLayout idbValueInput;
    public final ConstraintLayout rootView;

    public Pi2UiInternationalDbFieldBinding(ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextView textView, TextInputLayout textInputLayout2, TextView textView2, TextInputLayout textInputLayout3) {
        this.rootView = constraintLayout;
        this.idbCountryInput = textInputLayout;
        this.idbDescription = textView;
        this.idbIdTypeInput = textInputLayout2;
        this.idbValueInput = textInputLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
