package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemGpsTrainingInfoBinding implements ViewBinding {

    @NonNull
    public final ImageView ivTips;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvGpsTrainingContent;

    @NonNull
    public final TextView tvGpsTrainingTitle;

    private ItemGpsTrainingInfoBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.ivTips = imageView;
        this.tvGpsTrainingContent = textView;
        this.tvGpsTrainingTitle = textView2;
    }

    @NonNull
    public static ItemGpsTrainingInfoBinding bind(@NonNull View view) {
        int i8 = R.id.iv_tips;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_tips);
        if (imageView != null) {
            i8 = R.id.tv_gps_training_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_gps_training_content);
            if (textView != null) {
                i8 = R.id.tv_gps_training_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_gps_training_title);
                if (textView2 != null) {
                    return new ItemGpsTrainingInfoBinding((LinearLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemGpsTrainingInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemGpsTrainingInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_gps_training_info, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
