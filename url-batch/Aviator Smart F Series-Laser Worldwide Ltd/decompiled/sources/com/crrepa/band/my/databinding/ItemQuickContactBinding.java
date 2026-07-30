package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ItemQuickContactBinding implements ViewBinding {

    @NonNull
    public final RoundedImageView ivContactAvatar;

    @NonNull
    public final ImageView ivSort;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvContactName;

    @NonNull
    public final TextView tvContactNumber;

    private ItemQuickContactBinding(@NonNull RelativeLayout relativeLayout, @NonNull RoundedImageView roundedImageView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.ivContactAvatar = roundedImageView;
        this.ivSort = imageView;
        this.tvContactName = textView;
        this.tvContactNumber = textView2;
    }

    @NonNull
    public static ItemQuickContactBinding bind(@NonNull View view) {
        int i8 = R.id.iv_contact_avatar;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_contact_avatar);
        if (roundedImageView != null) {
            i8 = R.id.iv_sort;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sort);
            if (imageView != null) {
                i8 = R.id.tv_contact_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_contact_name);
                if (textView != null) {
                    i8 = R.id.tv_contact_number;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_contact_number);
                    if (textView2 != null) {
                        return new ItemQuickContactBinding((RelativeLayout) view, roundedImageView, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemQuickContactBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemQuickContactBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_quick_contact, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
