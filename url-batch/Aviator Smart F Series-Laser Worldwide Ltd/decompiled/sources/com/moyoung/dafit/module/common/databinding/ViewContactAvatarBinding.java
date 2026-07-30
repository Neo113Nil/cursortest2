package com.moyoung.dafit.module.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.dafit.module.common.R$id;
import com.moyoung.dafit.module.common.R$layout;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes4.dex */
public final class ViewContactAvatarBinding implements ViewBinding {

    @NonNull
    public final RoundedImageView ivAvatar;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvAvatar;

    private ViewContactAvatarBinding(@NonNull RelativeLayout relativeLayout, @NonNull RoundedImageView roundedImageView, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.ivAvatar = roundedImageView;
        this.tvAvatar = textView;
    }

    @NonNull
    public static ViewContactAvatarBinding bind(@NonNull View view) {
        int i8 = R$id.iv_avatar;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i8);
        if (roundedImageView != null) {
            i8 = R$id.tv_avatar;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
            if (textView != null) {
                return new ViewContactAvatarBinding((RelativeLayout) view, roundedImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewContactAvatarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewContactAvatarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.view_contact_avatar, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
