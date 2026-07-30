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
public final class ItemWaterRecordBinding implements ViewBinding {

    @NonNull
    public final ImageView ivWaterIcon;

    @NonNull
    public final ImageView ivWaterRecordType;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvWaterIntake;

    @NonNull
    public final TextView tvWaterTime;

    private ItemWaterRecordBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.ivWaterIcon = imageView;
        this.ivWaterRecordType = imageView2;
        this.tvWaterIntake = textView;
        this.tvWaterTime = textView2;
    }

    @NonNull
    public static ItemWaterRecordBinding bind(@NonNull View view) {
        int i8 = R.id.iv_water_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_water_icon);
        if (imageView != null) {
            i8 = R.id.iv_water_record_type;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_water_record_type);
            if (imageView2 != null) {
                i8 = R.id.tv_water_intake;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_intake);
                if (textView != null) {
                    i8 = R.id.tv_water_time;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_time);
                    if (textView2 != null) {
                        return new ItemWaterRecordBinding((RelativeLayout) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemWaterRecordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemWaterRecordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_water_record, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
