package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* loaded from: classes9.dex */
public final class Pi2GovernmentidStaticCaptureTipsBinding implements ViewBinding {
    public final ImageView icon;
    public final ConstraintLayout iconContainer;
    public final LinearLayout rootView;
    public final TextView subtext;
    public final TextView title;

    public Pi2GovernmentidStaticCaptureTipsBinding(LinearLayout linearLayout, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.icon = imageView;
        this.iconContainer = constraintLayout;
        this.subtext = textView;
        this.title = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
