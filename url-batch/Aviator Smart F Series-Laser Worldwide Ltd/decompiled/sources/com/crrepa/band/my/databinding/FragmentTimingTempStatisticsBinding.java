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
public final class FragmentTimingTempStatisticsBinding implements ViewBinding {

    @NonNull
    public final ViewAboutTemperatureBinding includeAboutTemperature;

    @NonNull
    public final Last7TimesTrendViewBinding includeLast7TimesTrend;

    @NonNull
    public final BandLastStatisticsBinding includeLastStatistics;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final CrpBarChart tempChart;

    @NonNull
    public final TextView tvHighestTemperature;

    @NonNull
    public final TextView tvHighestTemperatureUnit;

    @NonNull
    public final TextView tvLowestTemperature;

    @NonNull
    public final TextView tvLowestTemperatureUnit;

    @NonNull
    public final TextView tvStartMeasureTime;

    @NonNull
    public final TextView tvStopMeasureTime;

    private FragmentTimingTempStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull ViewAboutTemperatureBinding viewAboutTemperatureBinding, @NonNull Last7TimesTrendViewBinding last7TimesTrendViewBinding, @NonNull BandLastStatisticsBinding bandLastStatisticsBinding, @NonNull CrpBarChart crpBarChart, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.rootView = linearLayout;
        this.includeAboutTemperature = viewAboutTemperatureBinding;
        this.includeLast7TimesTrend = last7TimesTrendViewBinding;
        this.includeLastStatistics = bandLastStatisticsBinding;
        this.tempChart = crpBarChart;
        this.tvHighestTemperature = textView;
        this.tvHighestTemperatureUnit = textView2;
        this.tvLowestTemperature = textView3;
        this.tvLowestTemperatureUnit = textView4;
        this.tvStartMeasureTime = textView5;
        this.tvStopMeasureTime = textView6;
    }

    @NonNull
    public static FragmentTimingTempStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.include_about_temperature;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_about_temperature);
        if (findChildViewById != null) {
            ViewAboutTemperatureBinding bind = ViewAboutTemperatureBinding.bind(findChildViewById);
            i8 = R.id.include_last_7_times_trend;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_last_7_times_trend);
            if (findChildViewById2 != null) {
                Last7TimesTrendViewBinding bind2 = Last7TimesTrendViewBinding.bind(findChildViewById2);
                i8 = R.id.include_last_statistics;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_last_statistics);
                if (findChildViewById3 != null) {
                    BandLastStatisticsBinding bind3 = BandLastStatisticsBinding.bind(findChildViewById3);
                    i8 = R.id.temp_chart;
                    CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.temp_chart);
                    if (crpBarChart != null) {
                        i8 = R.id.tv_highest_temperature;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_highest_temperature);
                        if (textView != null) {
                            i8 = R.id.tv_highest_temperature_unit;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_highest_temperature_unit);
                            if (textView2 != null) {
                                i8 = R.id.tv_lowest_temperature;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_lowest_temperature);
                                if (textView3 != null) {
                                    i8 = R.id.tv_lowest_temperature_unit;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_lowest_temperature_unit);
                                    if (textView4 != null) {
                                        i8 = R.id.tv_start_measure_time;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start_measure_time);
                                        if (textView5 != null) {
                                            i8 = R.id.tv_stop_measure_time;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_stop_measure_time);
                                            if (textView6 != null) {
                                                return new FragmentTimingTempStatisticsBinding((LinearLayout) view, bind, bind2, bind3, crpBarChart, textView, textView2, textView3, textView4, textView5, textView6);
                                            }
                                        }
                                    }
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
    public static FragmentTimingTempStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentTimingTempStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_timing_temp_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
