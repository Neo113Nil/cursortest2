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
public final class IncludeTrainingPathStepsBinding implements ViewBinding {

    @NonNull
    public final CrpLineChart chartSteps;

    @NonNull
    public final LinearLayout llAvgRate;

    @NonNull
    public final LinearLayout llAvgStride;

    @NonNull
    public final LinearLayout llStepChart;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAvgRate;

    @NonNull
    public final TextView tvAvgRateTitle;

    @NonNull
    public final TextView tvAvgStride;

    @NonNull
    public final TextView tvAvgStrideTips;

    @NonNull
    public final TextView tvAvgStrideTitle;

    @NonNull
    public final TextView tvEndTime;

    @NonNull
    public final TextView tvEndTimeTips;

    @NonNull
    public final TextView tvStartTime;

    @NonNull
    public final TextView tvTitle;

    private IncludeTrainingPathStepsBinding(@NonNull LinearLayout linearLayout, @NonNull CrpLineChart crpLineChart, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.rootView = linearLayout;
        this.chartSteps = crpLineChart;
        this.llAvgRate = linearLayout2;
        this.llAvgStride = linearLayout3;
        this.llStepChart = linearLayout4;
        this.tvAvgRate = textView;
        this.tvAvgRateTitle = textView2;
        this.tvAvgStride = textView3;
        this.tvAvgStrideTips = textView4;
        this.tvAvgStrideTitle = textView5;
        this.tvEndTime = textView6;
        this.tvEndTimeTips = textView7;
        this.tvStartTime = textView8;
        this.tvTitle = textView9;
    }

    @NonNull
    public static IncludeTrainingPathStepsBinding bind(@NonNull View view) {
        int i8 = R.id.chart_steps;
        CrpLineChart crpLineChart = (CrpLineChart) ViewBindings.findChildViewById(view, R.id.chart_steps);
        if (crpLineChart != null) {
            i8 = R.id.ll_avg_rate;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_avg_rate);
            if (linearLayout != null) {
                i8 = R.id.ll_avg_stride;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_avg_stride);
                if (linearLayout2 != null) {
                    LinearLayout linearLayout3 = (LinearLayout) view;
                    i8 = R.id.tv_avg_rate;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_rate);
                    if (textView != null) {
                        i8 = R.id.tv_avg_rate_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_rate_title);
                        if (textView2 != null) {
                            i8 = R.id.tv_avg_stride;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_stride);
                            if (textView3 != null) {
                                i8 = R.id.tv_avg_stride_tips;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_stride_tips);
                                if (textView4 != null) {
                                    i8 = R.id.tv_avg_stride_title;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_stride_title);
                                    if (textView5 != null) {
                                        i8 = R.id.tv_end_time;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_end_time);
                                        if (textView6 != null) {
                                            i8 = R.id.tv_end_time_tips;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_end_time_tips);
                                            if (textView7 != null) {
                                                i8 = R.id.tv_start_time;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start_time);
                                                if (textView8 != null) {
                                                    i8 = R.id.tv_title;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                    if (textView9 != null) {
                                                        return new IncludeTrainingPathStepsBinding(linearLayout3, crpLineChart, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static IncludeTrainingPathStepsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static IncludeTrainingPathStepsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.include_training_path_steps, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
