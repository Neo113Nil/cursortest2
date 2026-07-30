package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes4.dex */
public final class ItemRecentClassBinding implements ViewBinding {

    @NonNull
    public final RoundedImageView ivCover;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvDuration;

    @NonNull
    public final TextView tvTitle;

    private ItemRecentClassBinding(@NonNull RelativeLayout relativeLayout, @NonNull RoundedImageView roundedImageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.ivCover = roundedImageView;
        this.tvDuration = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static ItemRecentClassBinding bind(@NonNull View view) {
        int i8 = R$id.iv_cover;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i8);
        if (roundedImageView != null) {
            i8 = R$id.tv_duration;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
            if (textView != null) {
                i8 = R$id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView2 != null) {
                    return new ItemRecentClassBinding((RelativeLayout) view, roundedImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemRecentClassBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemRecentClassBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.item_recent_class, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
