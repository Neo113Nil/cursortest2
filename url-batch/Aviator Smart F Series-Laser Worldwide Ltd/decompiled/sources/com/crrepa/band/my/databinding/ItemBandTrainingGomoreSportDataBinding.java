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

/* loaded from: classes2.dex */
public final class ItemBandTrainingGomoreSportDataBinding implements ViewBinding {

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final ImageView ivTips;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvData;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvUnit;

    private ItemBandTrainingGomoreSportDataBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.ivIcon = imageView;
        this.ivTips = imageView2;
        this.tvData = textView;
        this.tvTitle = textView2;
        this.tvUnit = textView3;
    }

    @NonNull
    public static ItemBandTrainingGomoreSportDataBinding bind(@NonNull View view) {
        int i8 = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon);
        if (imageView != null) {
            i8 = R.id.iv_tips;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_tips);
            if (imageView2 != null) {
                i8 = R.id.tv_data;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_data);
                if (textView != null) {
                    i8 = R.id.tv_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                    if (textView2 != null) {
                        i8 = R.id.tv_unit;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_unit);
                        if (textView3 != null) {
                            return new ItemBandTrainingGomoreSportDataBinding((RelativeLayout) view, imageView, imageView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemBandTrainingGomoreSportDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandTrainingGomoreSportDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_training_gomore_sport_data, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
