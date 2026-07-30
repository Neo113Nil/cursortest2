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
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;

/* loaded from: classes2.dex */
public final class FragmentTempDayStatisticsBinding implements ViewBinding {

    @NonNull
    public final DayAxisTimeView dayAxisTimeView;

    @NonNull
    public final HandleView hrHandleView;

    @NonNull
    public final LinearLayout llStatisticsDate;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final CrpLineChart tempLineChart;

    @NonNull
    public final TextView tvAverageTemp;

    @NonNull
    public final TextView tvStatisticsDate;

    @NonNull
    public final TextView tvTempType;

    @NonNull
    public final TextView tvTemperatureUnit;

    private FragmentTempDayStatisticsBinding(@NonNull RelativeLayout relativeLayout, @NonNull DayAxisTimeView dayAxisTimeView, @NonNull HandleView handleView, @NonNull LinearLayout linearLayout, @NonNull CrpLineChart crpLineChart, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.dayAxisTimeView = dayAxisTimeView;
        this.hrHandleView = handleView;
        this.llStatisticsDate = linearLayout;
        this.tempLineChart = crpLineChart;
        this.tvAverageTemp = textView;
        this.tvStatisticsDate = textView2;
        this.tvTempType = textView3;
        this.tvTemperatureUnit = textView4;
    }

    @NonNull
    public static FragmentTempDayStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.day_axis_time_view;
        DayAxisTimeView dayAxisTimeView = (DayAxisTimeView) ViewBindings.findChildViewById(view, R.id.day_axis_time_view);
        if (dayAxisTimeView != null) {
            i8 = R.id.hr_handle_view;
            HandleView handleView = (HandleView) ViewBindings.findChildViewById(view, R.id.hr_handle_view);
            if (handleView != null) {
                i8 = R.id.ll_statistics_date;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_statistics_date);
                if (linearLayout != null) {
                    i8 = R.id.temp_line_chart;
                    CrpLineChart crpLineChart = (CrpLineChart) ViewBindings.findChildViewById(view, R.id.temp_line_chart);
                    if (crpLineChart != null) {
                        i8 = R.id.tv_average_temp;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_average_temp);
                        if (textView != null) {
                            i8 = R.id.tv_statistics_date;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_statistics_date);
                            if (textView2 != null) {
                                i8 = R.id.tv_temp_type;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_temp_type);
                                if (textView3 != null) {
                                    i8 = R.id.tv_temperature_unit;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_temperature_unit);
                                    if (textView4 != null) {
                                        return new FragmentTempDayStatisticsBinding((RelativeLayout) view, dayAxisTimeView, handleView, linearLayout, crpLineChart, textView, textView2, textView3, textView4);
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
    public static FragmentTempDayStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentTempDayStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_temp_day_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
