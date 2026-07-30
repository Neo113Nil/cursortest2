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
public final class ViewEcgFatigueBinding implements ViewBinding {

    @NonNull
    public final SegmentedBarView fatigueSliderBar;

    @NonNull
    public final LinearLayout llEcgFatigue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvFatigueValue;

    private ViewEcgFatigueBinding(@NonNull LinearLayout linearLayout, @NonNull SegmentedBarView segmentedBarView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.fatigueSliderBar = segmentedBarView;
        this.llEcgFatigue = linearLayout2;
        this.tvFatigueValue = textView;
    }

    @NonNull
    public static ViewEcgFatigueBinding bind(@NonNull View view) {
        int i8 = R.id.fatigue_slider_bar;
        SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(view, R.id.fatigue_slider_bar);
        if (segmentedBarView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fatigue_value);
            if (textView != null) {
                return new ViewEcgFatigueBinding(linearLayout, segmentedBarView, linearLayout, textView);
            }
            i8 = R.id.tv_fatigue_value;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewEcgFatigueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewEcgFatigueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_ecg_fatigue, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
