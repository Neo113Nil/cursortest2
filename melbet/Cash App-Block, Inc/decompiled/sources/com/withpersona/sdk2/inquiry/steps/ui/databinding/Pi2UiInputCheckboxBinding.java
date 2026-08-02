package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.squareup.cash.R;

/* loaded from: classes9.dex */
public final class Pi2UiInputCheckboxBinding implements ViewBinding {
    public final MaterialCheckBox checkbox;
    public final TextView checkboxDescription;
    public final TextView checkboxError;
    public final TextView checkboxLabel;
    public final ConstraintLayout rootView;

    public Pi2UiInputCheckboxBinding(ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.checkbox = materialCheckBox;
        this.checkboxDescription = textView;
        this.checkboxError = textView2;
        this.checkboxLabel = textView3;
    }

    public static Pi2UiInputCheckboxBinding inflate(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        View inflate = layoutInflater.inflate(R.layout.pi2_ui_input_checkbox, (ViewGroup) linearLayout, false);
        int i = R.id.checkbox;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) ViewBindings.findChildViewById(inflate, R.id.checkbox);
        if (materialCheckBox != null) {
            i = R.id.checkbox_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.checkbox_description);
            if (textView != null) {
                i = R.id.checkbox_error;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.checkbox_error);
                if (textView2 != null) {
                    i = R.id.checkbox_label;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.checkbox_label);
                    if (textView3 != null) {
                        return new Pi2UiInputCheckboxBinding((ConstraintLayout) inflate, materialCheckBox, textView, textView2, textView3);
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
