package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes9.dex */
public final class Pi2UiDateFieldBinding implements ViewBinding {
    public final TextView dateLabel;
    public final TextInputLayout day;
    public final TextView errorLabel;
    public final TextInputLayout month;
    public final ConstraintLayout rootView;
    public final TextInputLayout year;

    public Pi2UiDateFieldBinding(ConstraintLayout constraintLayout, TextView textView, TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextView textView2, TextInputLayout textInputLayout2, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout3, TextInputEditText textInputEditText2) {
        this.rootView = constraintLayout;
        this.dateLabel = textView;
        this.day = textInputLayout;
        this.errorLabel = textView2;
        this.month = textInputLayout2;
        this.year = textInputLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
