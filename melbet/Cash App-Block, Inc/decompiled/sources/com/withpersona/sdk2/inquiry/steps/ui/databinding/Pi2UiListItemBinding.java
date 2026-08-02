package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes9.dex */
public final class Pi2UiListItemBinding implements ViewBinding {
    public final MaterialCheckBox checkbox;
    public final TextView label;
    public final ConstraintLayout rootView;

    public Pi2UiListItemBinding(ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, TextView textView) {
        this.rootView = constraintLayout;
        this.checkbox = materialCheckBox;
        this.label = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
