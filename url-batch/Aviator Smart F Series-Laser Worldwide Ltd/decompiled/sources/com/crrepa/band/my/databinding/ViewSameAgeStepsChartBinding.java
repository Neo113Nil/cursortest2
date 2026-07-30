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
public final class ViewSameAgeStepsChartBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final CrpBarChart stepSameGroupComparedChart;

    @NonNull
    public final TextView tvSameAgeGender;

    @NonNull
    public final TextView tvStepComparedPercentage;

    private ViewSameAgeStepsChartBinding(@NonNull LinearLayout linearLayout, @NonNull CrpBarChart crpBarChart, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.stepSameGroupComparedChart = crpBarChart;
        this.tvSameAgeGender = textView;
        this.tvStepComparedPercentage = textView2;
    }

    @NonNull
    public static ViewSameAgeStepsChartBinding bind(@NonNull View view) {
        int i8 = R.id.step_same_group_compared_chart;
        CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.step_same_group_compared_chart);
        if (crpBarChart != null) {
            i8 = R.id.tv_same_age_gender;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_same_age_gender);
            if (textView != null) {
                i8 = R.id.tv_step_compared_percentage;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_step_compared_percentage);
                if (textView2 != null) {
                    return new ViewSameAgeStepsChartBinding((LinearLayout) view, crpBarChart, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewSameAgeStepsChartBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewSameAgeStepsChartBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_same_age_steps_chart, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
