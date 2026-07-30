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
import com.crrepa.band.my.health.widgets.DayAxisTimeView;
import com.crrepa.band.my.health.widgets.HandleView;
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;

/* loaded from: classes2.dex */
public final class FragmentStressDayStatisticsBinding implements ViewBinding {

    @NonNull
    public final DayAxisTimeView dayAxisTimeView;

    @NonNull
    public final LinearLayout llStatisticsDate;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final CrpBarChart stressChart;

    @NonNull
    public final HandleView stressHandleView;

    @NonNull
    public final TextView tvAverageStress;

    @NonNull
    public final TextView tvStatisticsDate;

    @NonNull
    public final TextView tvStressType;

    private FragmentStressDayStatisticsBinding(@NonNull RelativeLayout relativeLayout, @NonNull DayAxisTimeView dayAxisTimeView, @NonNull LinearLayout linearLayout, @NonNull CrpBarChart crpBarChart, @NonNull HandleView handleView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.dayAxisTimeView = dayAxisTimeView;
        this.llStatisticsDate = linearLayout;
        this.stressChart = crpBarChart;
        this.stressHandleView = handleView;
        this.tvAverageStress = textView;
        this.tvStatisticsDate = textView2;
        this.tvStressType = textView3;
    }

    @NonNull
    public static FragmentStressDayStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.day_axis_time_view;
        DayAxisTimeView dayAxisTimeView = (DayAxisTimeView) ViewBindings.findChildViewById(view, R.id.day_axis_time_view);
        if (dayAxisTimeView != null) {
            i8 = R.id.ll_statistics_date;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_statistics_date);
            if (linearLayout != null) {
                i8 = R.id.stress_chart;
                CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.stress_chart);
                if (crpBarChart != null) {
                    i8 = R.id.stress_handle_view;
                    HandleView handleView = (HandleView) ViewBindings.findChildViewById(view, R.id.stress_handle_view);
                    if (handleView != null) {
                        i8 = R.id.tv_average_stress;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_average_stress);
                        if (textView != null) {
                            i8 = R.id.tv_statistics_date;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_statistics_date);
                            if (textView2 != null) {
                                i8 = R.id.tv_stress_type;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_stress_type);
                                if (textView3 != null) {
                                    return new FragmentStressDayStatisticsBinding((RelativeLayout) view, dayAxisTimeView, linearLayout, crpBarChart, handleView, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentStressDayStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentStressDayStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stress_day_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
