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
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;

/* loaded from: classes2.dex */
public final class ViewSleepEarlyChartBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llSleepEarlyChart;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final CrpBarChart sleepEarlySameGroupComparedChart;

    @NonNull
    public final TextView tvSleepEarlyComparedPercent;

    @NonNull
    public final TextView tvSleepEarlySameAgeGender;

    private ViewSleepEarlyChartBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull CrpBarChart crpBarChart, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.llSleepEarlyChart = linearLayout2;
        this.sleepEarlySameGroupComparedChart = crpBarChart;
        this.tvSleepEarlyComparedPercent = textView;
        this.tvSleepEarlySameAgeGender = textView2;
    }

    @NonNull
    public static ViewSleepEarlyChartBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = R.id.sleep_early_same_group_compared_chart;
        CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.sleep_early_same_group_compared_chart);
        if (crpBarChart != null) {
            i8 = R.id.tv_sleep_early_compared_percent;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sleep_early_compared_percent);
            if (textView != null) {
                i8 = R.id.tv_sleep_early_same_age_gender;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sleep_early_same_age_gender);
                if (textView2 != null) {
                    return new ViewSleepEarlyChartBinding(linearLayout, linearLayout, crpBarChart, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewSleepEarlyChartBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewSleepEarlyChartBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_sleep_early_chart, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
