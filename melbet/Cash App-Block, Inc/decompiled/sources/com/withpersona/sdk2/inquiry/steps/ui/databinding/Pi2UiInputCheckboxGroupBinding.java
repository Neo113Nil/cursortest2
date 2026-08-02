package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

/* loaded from: classes9.dex */
public final class Pi2UiInputCheckboxGroupBinding implements ViewBinding {
    public final TextView checkboxGroupError;
    public final TextView checkboxGroupLabel;
    public final LinearLayout rootView;

    public Pi2UiInputCheckboxGroupBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.checkboxGroupError = textView;
        this.checkboxGroupLabel = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
