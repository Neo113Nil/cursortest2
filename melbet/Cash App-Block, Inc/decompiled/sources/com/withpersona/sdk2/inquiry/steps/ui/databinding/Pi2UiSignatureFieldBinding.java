package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes9.dex */
public final class Pi2UiSignatureFieldBinding implements ViewBinding {
    public final TextView addSignatureLabel;
    public final ImageView editSignatureIcon;
    public final TextView errorLabel;
    public final TextView label;
    public final ConstraintLayout rootView;
    public final MaterialCardView signatureContainer;
    public final ImageView signaturePreview;

    public Pi2UiSignatureFieldBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3, MaterialCardView materialCardView, ImageView imageView2) {
        this.rootView = constraintLayout;
        this.addSignatureLabel = textView;
        this.editSignatureIcon = imageView;
        this.errorLabel = textView2;
        this.label = textView3;
        this.signatureContainer = materialCardView;
        this.signaturePreview = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
