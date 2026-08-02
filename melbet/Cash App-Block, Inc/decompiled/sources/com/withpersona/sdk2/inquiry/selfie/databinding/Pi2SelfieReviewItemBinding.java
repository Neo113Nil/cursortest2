package com.withpersona.sdk2.inquiry.selfie.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes7.dex */
public final class Pi2SelfieReviewItemBinding implements ViewBinding {
    public final ShapeableImageView image;
    public final TextView label;
    public final ConstraintLayout rootView;

    public Pi2SelfieReviewItemBinding(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, TextView textView) {
        this.rootView = constraintLayout;
        this.image = shapeableImageView;
        this.label = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
