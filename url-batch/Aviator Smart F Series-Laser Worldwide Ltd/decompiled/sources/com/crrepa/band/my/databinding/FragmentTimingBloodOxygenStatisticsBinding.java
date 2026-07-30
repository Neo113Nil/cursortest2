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
public final class FragmentTimingBloodOxygenStatisticsBinding implements ViewBinding {

    @NonNull
    public final CrpBarChart bloodOxygenChart;

    @NonNull
    public final ViewAboutBloodOxygenBinding includeAboutBloodOxygen;

    @NonNull
    public final ViewBloodOxygenExtremesBinding includeBloodOxygenExtremes;

    @NonNull
    public final Last7TimesTrendViewBinding includeLast7TimesTrend;

    @NonNull
    public final BandLastStatisticsBinding includeLastStatistics;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvStartMeasureTime;

    @NonNull
    public final TextView tvStopMeasureTime;

    private FragmentTimingBloodOxygenStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull CrpBarChart crpBarChart, @NonNull ViewAboutBloodOxygenBinding viewAboutBloodOxygenBinding, @NonNull ViewBloodOxygenExtremesBinding viewBloodOxygenExtremesBinding, @NonNull Last7TimesTrendViewBinding last7TimesTrendViewBinding, @NonNull BandLastStatisticsBinding bandLastStatisticsBinding, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.bloodOxygenChart = crpBarChart;
        this.includeAboutBloodOxygen = viewAboutBloodOxygenBinding;
        this.includeBloodOxygenExtremes = viewBloodOxygenExtremesBinding;
        this.includeLast7TimesTrend = last7TimesTrendViewBinding;
        this.includeLastStatistics = bandLastStatisticsBinding;
        this.tvStartMeasureTime = textView;
        this.tvStopMeasureTime = textView2;
    }

    @NonNull
    public static FragmentTimingBloodOxygenStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.blood_oxygen_chart;
        CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.blood_oxygen_chart);
        if (crpBarChart != null) {
            i8 = R.id.include_about_blood_oxygen;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_about_blood_oxygen);
            if (findChildViewById != null) {
                ViewAboutBloodOxygenBinding bind = ViewAboutBloodOxygenBinding.bind(findChildViewById);
                i8 = R.id.include_blood_oxygen_extremes;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_blood_oxygen_extremes);
                if (findChildViewById2 != null) {
                    ViewBloodOxygenExtremesBinding bind2 = ViewBloodOxygenExtremesBinding.bind(findChildViewById2);
                    i8 = R.id.include_last_7_times_trend;
                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_last_7_times_trend);
                    if (findChildViewById3 != null) {
                        Last7TimesTrendViewBinding bind3 = Last7TimesTrendViewBinding.bind(findChildViewById3);
                        i8 = R.id.include_last_statistics;
                        View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_last_statistics);
                        if (findChildViewById4 != null) {
                            BandLastStatisticsBinding bind4 = BandLastStatisticsBinding.bind(findChildViewById4);
                            i8 = R.id.tv_start_measure_time;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start_measure_time);
                            if (textView != null) {
                                i8 = R.id.tv_stop_measure_time;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_stop_measure_time);
                                if (textView2 != null) {
                                    return new FragmentTimingBloodOxygenStatisticsBinding((LinearLayout) view, crpBarChart, bind, bind2, bind3, bind4, textView, textView2);
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
    public static FragmentTimingBloodOxygenStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentTimingBloodOxygenStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_timing_blood_oxygen_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
