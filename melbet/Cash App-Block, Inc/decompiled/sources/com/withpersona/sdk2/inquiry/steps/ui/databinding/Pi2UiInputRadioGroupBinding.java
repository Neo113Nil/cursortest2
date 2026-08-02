package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

/* loaded from: classes9.dex */
public final class Pi2UiInputRadioGroupBinding implements ViewBinding {
    public final LinearLayout radioButtonContainer;
    public final TextView radioGroupError;
    public final TextView radioGroupLabel;
    public final LinearLayout rootView;

    public Pi2UiInputRadioGroupBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.radioButtonContainer = linearLayout2;
        this.radioGroupError = textView;
        this.radioGroupLabel = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
