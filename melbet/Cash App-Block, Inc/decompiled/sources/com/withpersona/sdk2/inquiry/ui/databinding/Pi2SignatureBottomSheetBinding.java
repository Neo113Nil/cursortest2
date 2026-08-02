package com.withpersona.sdk2.inquiry.ui.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.steps.ui.view.SignatureView;

/* loaded from: classes9.dex */
public final class Pi2SignatureBottomSheetBinding implements ViewBinding {
    public final FrameLayout bottomSheet;
    public final Button clearButton;
    public final ImageView closeSignatureSheetButton;
    public final FrameLayout rootView;
    public final Button saveButton;
    public final View shadow;
    public final SignatureView signatureCanvas;
    public final TextView signatureDescription;
    public final TextView signatureLabel;
    public final ConstraintLayout signatureSheet;

    public Pi2SignatureBottomSheetBinding(FrameLayout frameLayout, FrameLayout frameLayout2, Button button, ImageView imageView, Button button2, View view, SignatureView signatureView, TextView textView, TextView textView2, ConstraintLayout constraintLayout) {
        this.rootView = frameLayout;
        this.bottomSheet = frameLayout2;
        this.clearButton = button;
        this.closeSignatureSheetButton = imageView;
        this.saveButton = button2;
        this.shadow = view;
        this.signatureCanvas = signatureView;
        this.signatureDescription = textView;
        this.signatureLabel = textView2;
        this.signatureSheet = constraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
