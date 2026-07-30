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
public final class ViewEcgMentalStressBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llEcgMentalStressView;

    @NonNull
    public final SegmentedBarView mentalStressSliderBar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvMentalStressValue;

    private ViewEcgMentalStressBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull SegmentedBarView segmentedBarView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.llEcgMentalStressView = linearLayout2;
        this.mentalStressSliderBar = segmentedBarView;
        this.tvMentalStressValue = textView;
    }

    @NonNull
    public static ViewEcgMentalStressBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = R.id.mental_stress_slider_bar;
        SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(view, R.id.mental_stress_slider_bar);
        if (segmentedBarView != null) {
            i8 = R.id.tv_mental_stress_value;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mental_stress_value);
            if (textView != null) {
                return new ViewEcgMentalStressBinding(linearLayout, linearLayout, segmentedBarView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewEcgMentalStressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewEcgMentalStressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_ecg_mental_stress, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
