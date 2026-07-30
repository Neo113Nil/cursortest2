package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.segmentedbar.SegmentedBarView;

/* loaded from: classes2.dex */
public final class ViewEcgHeartStrengthBinding implements ViewBinding {

    @NonNull
    public final SegmentedBarView heartStrengthSliderBar;

    @NonNull
    public final LinearLayout llEcgHeartStrengthView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvHeartStrengthValue;

    private ViewEcgHeartStrengthBinding(@NonNull LinearLayout linearLayout, @NonNull SegmentedBarView segmentedBarView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.heartStrengthSliderBar = segmentedBarView;
        this.llEcgHeartStrengthView = linearLayout2;
        this.tvHeartStrengthValue = textView;
    }

    @NonNull
    public static ViewEcgHeartStrengthBinding bind(@NonNull View view) {
        int i8 = R.id.heart_strength_slider_bar;
        SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(view, R.id.heart_strength_slider_bar);
        if (segmentedBarView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_heart_strength_value);
            if (textView != null) {
                return new ViewEcgHeartStrengthBinding(linearLayout, segmentedBarView, linearLayout, textView);
            }
            i8 = R.id.tv_heart_strength_value;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewEcgHeartStrengthBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewEcgHeartStrengthBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_ecg_heart_strength, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
