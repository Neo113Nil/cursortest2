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
public final class ViewEcgHeartRateVariabilityBinding implements ViewBinding {

    @NonNull
    public final SegmentedBarView heartRateVariabilitySliderBar;

    @NonNull
    public final LinearLayout rlHeartRateVariability;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvHeartRateVariabilityValue;

    private ViewEcgHeartRateVariabilityBinding(@NonNull LinearLayout linearLayout, @NonNull SegmentedBarView segmentedBarView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.heartRateVariabilitySliderBar = segmentedBarView;
        this.rlHeartRateVariability = linearLayout2;
        this.tvHeartRateVariabilityValue = textView;
    }

    @NonNull
    public static ViewEcgHeartRateVariabilityBinding bind(@NonNull View view) {
        int i8 = R.id.heart_rate_variability_slider_bar;
        SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(view, R.id.heart_rate_variability_slider_bar);
        if (segmentedBarView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_heart_rate_variability_value);
            if (textView != null) {
                return new ViewEcgHeartRateVariabilityBinding(linearLayout, segmentedBarView, linearLayout, textView);
            }
            i8 = R.id.tv_heart_rate_variability_value;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewEcgHeartRateVariabilityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewEcgHeartRateVariabilityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_ecg_heart_rate_variability, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
