package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
public final class ItemClassesHistoryBinding implements ViewBinding {

    @NonNull
    public final ImageView ivContinue;

    @NonNull
    public final RoundedImageView ivCover;

    @NonNull
    public final LinearLayout llDate;

    @NonNull
    public final RelativeLayout rlTrainingRecords;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvSpentKcal;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvTrainingDate;

    @NonNull
    public final TextView tvTrainingTime;

    private ItemClassesHistoryBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RoundedImageView roundedImageView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.ivContinue = imageView;
        this.ivCover = roundedImageView;
        this.llDate = linearLayout;
        this.rlTrainingRecords = relativeLayout2;
        this.tvSpentKcal = textView;
        this.tvTitle = textView2;
        this.tvTrainingDate = textView3;
        this.tvTrainingTime = textView4;
    }

    @NonNull
    public static ItemClassesHistoryBinding bind(@NonNull View view) {
        int i8 = R$id.iv_continue;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = R$id.iv_cover;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i8);
            if (roundedImageView != null) {
                i8 = R$id.ll_date;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
                if (linearLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i8 = R$id.tv_spent_kcal;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                    if (textView != null) {
                        i8 = R$id.tv_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                        if (textView2 != null) {
                            i8 = R$id.tv_training_date;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                            if (textView3 != null) {
                                i8 = R$id.tv_training_time;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i8);
                                if (textView4 != null) {
                                    return new ItemClassesHistoryBinding(relativeLayout, imageView, roundedImageView, linearLayout, relativeLayout, textView, textView2, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemClassesHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemClassesHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.item_classes_history, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
