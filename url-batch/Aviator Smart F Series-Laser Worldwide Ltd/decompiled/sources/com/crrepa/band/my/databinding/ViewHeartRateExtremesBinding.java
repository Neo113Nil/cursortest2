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
public final class ViewHeartRateExtremesBinding implements ViewBinding {

    @NonNull
    public final ImageView ivHighestHeartRate;

    @NonNull
    public final ImageView ivLowestHeartRate;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvHighestHeartRate;

    @NonNull
    public final TextView tvLowestHeartRate;

    private ViewHeartRateExtremesBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.ivHighestHeartRate = imageView;
        this.ivLowestHeartRate = imageView2;
        this.tvHighestHeartRate = textView;
        this.tvLowestHeartRate = textView2;
    }

    @NonNull
    public static ViewHeartRateExtremesBinding bind(@NonNull View view) {
        int i8 = R.id.iv_highest_heart_rate;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_highest_heart_rate);
        if (imageView != null) {
            i8 = R.id.iv_lowest_heart_rate;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_lowest_heart_rate);
            if (imageView2 != null) {
                i8 = R.id.tv_highest_heart_rate;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_highest_heart_rate);
                if (textView != null) {
                    i8 = R.id.tv_lowest_heart_rate;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_lowest_heart_rate);
                    if (textView2 != null) {
                        return new ViewHeartRateExtremesBinding((LinearLayout) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewHeartRateExtremesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewHeartRateExtremesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_heart_rate_extremes, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
