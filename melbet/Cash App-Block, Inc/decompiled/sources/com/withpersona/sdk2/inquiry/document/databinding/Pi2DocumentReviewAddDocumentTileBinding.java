package com.withpersona.sdk2.inquiry.document.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.card.MaterialCardView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

/* loaded from: classes9.dex */
public final class Pi2DocumentReviewAddDocumentTileBinding implements ViewBinding {
    public final ThemeableLottieAnimationView addButton;
    public final MaterialCardView cardView;
    public final ConstraintLayout rootView;

    public Pi2DocumentReviewAddDocumentTileBinding(ConstraintLayout constraintLayout, ThemeableLottieAnimationView themeableLottieAnimationView, MaterialCardView materialCardView) {
        this.rootView = constraintLayout;
        this.addButton = themeableLottieAnimationView;
        this.cardView = materialCardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
