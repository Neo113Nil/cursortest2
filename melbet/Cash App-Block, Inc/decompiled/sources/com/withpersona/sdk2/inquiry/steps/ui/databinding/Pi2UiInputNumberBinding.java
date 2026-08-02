package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.cash.R;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsView;
import com.squareup.cash.portfolio.graphs.views.MooncakeInvestingGraphView;

/* loaded from: classes9.dex */
public final class Pi2UiInputNumberBinding implements ViewBinding {
    public final /* synthetic */ int $r8$classId = 1;
    public final View editText;
    public final ViewGroup inputLayout;
    public final LinearLayout rootView;

    public Pi2UiInputNumberBinding(TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout2) {
        this.rootView = textInputLayout;
        this.editText = textInputEditText;
        this.inputLayout = textInputLayout2;
    }

    public static Pi2UiInputNumberBinding inflate(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.pi2_ui_input_number, (ViewGroup) null, false);
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(inflate, R.id.edit_text);
        if (textInputEditText != null) {
            TextInputLayout textInputLayout = (TextInputLayout) inflate;
            return new Pi2UiInputNumberBinding(textInputLayout, textInputEditText, textInputLayout);
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.edit_text)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.$r8$classId) {
            case 0:
                return (TextInputLayout) this.rootView;
            default:
                return this.rootView;
        }
    }

    public Pi2UiInputNumberBinding(LinearLayout linearLayout, MooncakeInvestingGraphView mooncakeInvestingGraphView, InvestingGraphTabsView investingGraphTabsView) {
        this.rootView = linearLayout;
        this.inputLayout = mooncakeInvestingGraphView;
        this.editText = investingGraphTabsView;
    }
}
