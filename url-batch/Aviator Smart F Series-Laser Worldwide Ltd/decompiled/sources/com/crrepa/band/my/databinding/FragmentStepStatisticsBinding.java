package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.HandleView;
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;

/* loaded from: classes2.dex */
public final class FragmentStepStatisticsBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llStatisticsData;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final HandleView stepHandleView;

    @NonNull
    public final CrpBarChart stepsStatisticsChart;

    @NonNull
    public final TextView tvDate;

    @NonNull
    public final TextView tvSteps;

    private FragmentStepStatisticsBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull HandleView handleView, @NonNull CrpBarChart crpBarChart, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.llStatisticsData = linearLayout;
        this.stepHandleView = handleView;
        this.stepsStatisticsChart = crpBarChart;
        this.tvDate = textView;
        this.tvSteps = textView2;
    }

    @NonNull
    public static FragmentStepStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.ll_statistics_data;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_statistics_data);
        if (linearLayout != null) {
            i8 = R.id.step_handle_view;
            HandleView handleView = (HandleView) ViewBindings.findChildViewById(view, R.id.step_handle_view);
            if (handleView != null) {
                i8 = R.id.steps_statistics_chart;
                CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.steps_statistics_chart);
                if (crpBarChart != null) {
                    i8 = R.id.tv_date;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date);
                    if (textView != null) {
                        i8 = R.id.tv_steps;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_steps);
                        if (textView2 != null) {
                            return new FragmentStepStatisticsBinding((RelativeLayout) view, linearLayout, handleView, crpBarChart, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentStepStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentStepStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_step_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
