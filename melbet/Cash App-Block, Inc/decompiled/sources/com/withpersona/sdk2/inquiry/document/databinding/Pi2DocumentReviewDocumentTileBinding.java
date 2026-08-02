package com.withpersona.sdk2.inquiry.document.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

/* loaded from: classes9.dex */
public final class Pi2DocumentReviewDocumentTileBinding implements ViewBinding {
    public final MaterialCardView cardView;
    public final TextView filenameView;
    public final ImageView imageView;
    public final LinearLayout imageViewContainer;
    public final CircularProgressIndicator loadingAnimation;
    public final ThemeableLottieAnimationView removeButton;
    public final ConstraintLayout rootView;

    public Pi2DocumentReviewDocumentTileBinding(ConstraintLayout constraintLayout, MaterialCardView materialCardView, TextView textView, ImageView imageView, LinearLayout linearLayout, CircularProgressIndicator circularProgressIndicator, ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.rootView = constraintLayout;
        this.cardView = materialCardView;
        this.filenameView = textView;
        this.imageView = imageView;
        this.imageViewContainer = linearLayout;
        this.loadingAnimation = circularProgressIndicator;
        this.removeButton = themeableLottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
