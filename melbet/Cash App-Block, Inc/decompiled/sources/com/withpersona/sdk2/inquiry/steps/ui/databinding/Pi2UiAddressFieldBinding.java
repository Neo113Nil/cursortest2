package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes9.dex */
public final class Pi2UiAddressFieldBinding implements ViewBinding {
    public final TextInputLayout addressCity;
    public final TextView addressExpandComponentsButton;
    public final TextInputLayout addressFieldCollapsed;
    public final MaterialAutoCompleteTextView addressFieldCollapsedTextView;
    public final TextInputLayout addressFieldExpanded;
    public final MaterialAutoCompleteTextView addressFieldExpandedTextView;
    public final ConstraintLayout addressFieldsCollapsed;
    public final ConstraintLayout addressFieldsExpanded;
    public final TextView addressLabel;
    public final TextInputLayout addressPostalCode;
    public final TextInputLayout addressSubdivision;
    public final TextInputLayout addressSuite;
    public final CircularProgressIndicator progressIndicator;
    public final ConstraintLayout rootView;

    public Pi2UiAddressFieldBinding(ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextView textView, TextInputLayout textInputLayout2, MaterialAutoCompleteTextView materialAutoCompleteTextView, TextInputLayout textInputLayout3, MaterialAutoCompleteTextView materialAutoCompleteTextView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView2, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, CircularProgressIndicator circularProgressIndicator) {
        this.rootView = constraintLayout;
        this.addressCity = textInputLayout;
        this.addressExpandComponentsButton = textView;
        this.addressFieldCollapsed = textInputLayout2;
        this.addressFieldCollapsedTextView = materialAutoCompleteTextView;
        this.addressFieldExpanded = textInputLayout3;
        this.addressFieldExpandedTextView = materialAutoCompleteTextView2;
        this.addressFieldsCollapsed = constraintLayout2;
        this.addressFieldsExpanded = constraintLayout3;
        this.addressLabel = textView2;
        this.addressPostalCode = textInputLayout4;
        this.addressSubdivision = textInputLayout5;
        this.addressSuite = textInputLayout6;
        this.progressIndicator = circularProgressIndicator;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
