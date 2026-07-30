package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes4.dex */
public final class ItemCoachActionInTypeBinding implements ViewBinding {

    @NonNull
    public final RoundedImageView ivCover;

    @NonNull
    public final LinearLayout llRest;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvDuration;

    @NonNull
    public final TextView tvRestDuration;

    @NonNull
    public final TextView tvTitle;

    private ItemCoachActionInTypeBinding(@NonNull LinearLayout linearLayout, @NonNull RoundedImageView roundedImageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.ivCover = roundedImageView;
        this.llRest = linearLayout2;
        this.tvDuration = textView;
        this.tvRestDuration = textView2;
        this.tvTitle = textView3;
    }

    @NonNull
    public static ItemCoachActionInTypeBinding bind(@NonNull View view) {
        int i8 = R$id.iv_cover;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i8);
        if (roundedImageView != null) {
            i8 = R$id.ll_rest;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
            if (linearLayout != null) {
                i8 = R$id.tv_duration;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView != null) {
                    i8 = R$id.tv_rest_duration;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                    if (textView2 != null) {
                        i8 = R$id.tv_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                        if (textView3 != null) {
                            return new ItemCoachActionInTypeBinding((LinearLayout) view, roundedImageView, linearLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemCoachActionInTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemCoachActionInTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.item_coach_action_in_type, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
