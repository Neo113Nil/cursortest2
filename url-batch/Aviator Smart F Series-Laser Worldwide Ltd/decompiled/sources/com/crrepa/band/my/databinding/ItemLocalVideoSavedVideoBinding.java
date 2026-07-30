package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ItemLocalVideoSavedVideoBinding implements ViewBinding {

    @NonNull
    public final RoundedImageView ivCover;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvMsg;

    @NonNull
    public final TextView tvTitle;

    private ItemLocalVideoSavedVideoBinding(@NonNull RelativeLayout relativeLayout, @NonNull RoundedImageView roundedImageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.ivCover = roundedImageView;
        this.tvMsg = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static ItemLocalVideoSavedVideoBinding bind(@NonNull View view) {
        int i8 = R.id.iv_cover;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_cover);
        if (roundedImageView != null) {
            i8 = R.id.tv_msg;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_msg);
            if (textView != null) {
                i8 = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView2 != null) {
                    return new ItemLocalVideoSavedVideoBinding((RelativeLayout) view, roundedImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemLocalVideoSavedVideoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemLocalVideoSavedVideoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_local_video_saved_video, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
