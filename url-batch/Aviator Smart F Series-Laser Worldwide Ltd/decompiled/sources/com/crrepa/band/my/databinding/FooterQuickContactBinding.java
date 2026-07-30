package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FooterQuickContactBinding implements ViewBinding {

    @NonNull
    public final ImageView ivAddContact;

    @NonNull
    private final RelativeLayout rootView;

    private FooterQuickContactBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView) {
        this.rootView = relativeLayout;
        this.ivAddContact = imageView;
    }

    @NonNull
    public static FooterQuickContactBinding bind(@NonNull View view) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_add_contact);
        if (imageView != null) {
            return new FooterQuickContactBinding((RelativeLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.iv_add_contact)));
    }

    @NonNull
    public static FooterQuickContactBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FooterQuickContactBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.footer_quick_contact, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
