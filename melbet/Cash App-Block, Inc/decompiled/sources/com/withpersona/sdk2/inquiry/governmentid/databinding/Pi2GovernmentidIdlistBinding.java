package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.shared.ui.ClickableConstraintLayout;

/* loaded from: classes9.dex */
public final class Pi2GovernmentidIdlistBinding implements ViewBinding {
    public final ImageView chevron;
    public final ImageView icon;
    public final ConstraintLayout iconContainer;
    public final TextView label;
    public final ClickableConstraintLayout rootLayout;
    public final ClickableConstraintLayout rootView;

    public Pi2GovernmentidIdlistBinding(ClickableConstraintLayout clickableConstraintLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView, ClickableConstraintLayout clickableConstraintLayout2) {
        this.rootView = clickableConstraintLayout;
        this.chevron = imageView;
        this.icon = imageView2;
        this.iconContainer = constraintLayout;
        this.label = textView;
        this.rootLayout = clickableConstraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
