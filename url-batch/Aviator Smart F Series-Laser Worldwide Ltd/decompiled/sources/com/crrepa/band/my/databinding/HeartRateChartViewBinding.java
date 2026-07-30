package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;

/* loaded from: classes2.dex */
public final class HeartRateChartViewBinding implements ViewBinding {

    @NonNull
    public final CrpBarChart heartRateChart;

    @NonNull
    public final RelativeLayout heartRateChartView;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvStartMeasureTime;

    @NonNull
    public final TextView tvStopMeasureTime;

    private HeartRateChartViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull CrpBarChart crpBarChart, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.heartRateChart = crpBarChart;
        this.heartRateChartView = relativeLayout2;
        this.tvStartMeasureTime = textView;
        this.tvStopMeasureTime = textView2;
    }

    @NonNull
    public static HeartRateChartViewBinding bind(@NonNull View view) {
        int i8 = R.id.heart_rate_chart;
        CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.heart_rate_chart);
        if (crpBarChart != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i8 = R.id.tv_start_measure_time;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start_measure_time);
            if (textView != null) {
                i8 = R.id.tv_stop_measure_time;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_stop_measure_time);
                if (textView2 != null) {
                    return new HeartRateChartViewBinding(relativeLayout, crpBarChart, relativeLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static HeartRateChartViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HeartRateChartViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.heart_rate_chart_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
