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
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;

/* loaded from: classes2.dex */
public final class IncludeTrainingPathRealTimePaceBinding implements ViewBinding {

    @NonNull
    public final CrpLineChart chartRealTimePace;

    @NonNull
    public final LinearLayout llRealTimePaceChart;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAveragePace;

    @NonNull
    public final TextView tvEndTime;

    @NonNull
    public final TextView tvEndTimeTips;

    @NonNull
    public final TextView tvFastestPace;

    @NonNull
    public final TextView tvStartTime;

    @NonNull
    public final TextView tvTitle;

    private IncludeTrainingPathRealTimePaceBinding(@NonNull LinearLayout linearLayout, @NonNull CrpLineChart crpLineChart, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.rootView = linearLayout;
        this.chartRealTimePace = crpLineChart;
        this.llRealTimePaceChart = linearLayout2;
        this.tvAveragePace = textView;
        this.tvEndTime = textView2;
        this.tvEndTimeTips = textView3;
        this.tvFastestPace = textView4;
        this.tvStartTime = textView5;
        this.tvTitle = textView6;
    }

    @NonNull
    public static IncludeTrainingPathRealTimePaceBinding bind(@NonNull View view) {
        int i8 = R.id.chart_real_time_pace;
        CrpLineChart crpLineChart = (CrpLineChart) ViewBindings.findChildViewById(view, R.id.chart_real_time_pace);
        if (crpLineChart != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = R.id.tv_average_pace;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_average_pace);
            if (textView != null) {
                i8 = R.id.tv_end_time;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_end_time);
                if (textView2 != null) {
                    i8 = R.id.tv_end_time_tips;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_end_time_tips);
                    if (textView3 != null) {
                        i8 = R.id.tv_fastest_pace;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fastest_pace);
                        if (textView4 != null) {
                            i8 = R.id.tv_start_time;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start_time);
                            if (textView5 != null) {
                                i8 = R.id.tv_title;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                if (textView6 != null) {
                                    return new IncludeTrainingPathRealTimePaceBinding(linearLayout, crpLineChart, linearLayout, textView, textView2, textView3, textView4, textView5, textView6);
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
    public static IncludeTrainingPathRealTimePaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static IncludeTrainingPathRealTimePaceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.include_training_path_real_time_pace, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
