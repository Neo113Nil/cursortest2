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
public final class IncludeTrainingPathElevationBinding implements ViewBinding {

    @NonNull
    public final CrpLineChart chartElevation;

    @NonNull
    public final LinearLayout llElevationChart;

    @NonNull
    public final LinearLayout llElevationCumulative;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAverageElevation;

    @NonNull
    public final TextView tvEndTime;

    @NonNull
    public final TextView tvEndTimeTips;

    @NonNull
    public final TextView tvGainCumulative;

    @NonNull
    public final TextView tvHighestElevation;

    @NonNull
    public final TextView tvLossCumulative;

    @NonNull
    public final TextView tvLowestElevation;

    @NonNull
    public final TextView tvStartTime;

    private IncludeTrainingPathElevationBinding(@NonNull LinearLayout linearLayout, @NonNull CrpLineChart crpLineChart, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.rootView = linearLayout;
        this.chartElevation = crpLineChart;
        this.llElevationChart = linearLayout2;
        this.llElevationCumulative = linearLayout3;
        this.tvAverageElevation = textView;
        this.tvEndTime = textView2;
        this.tvEndTimeTips = textView3;
        this.tvGainCumulative = textView4;
        this.tvHighestElevation = textView5;
        this.tvLossCumulative = textView6;
        this.tvLowestElevation = textView7;
        this.tvStartTime = textView8;
    }

    @NonNull
    public static IncludeTrainingPathElevationBinding bind(@NonNull View view) {
        int i8 = R.id.chart_elevation;
        CrpLineChart crpLineChart = (CrpLineChart) ViewBindings.findChildViewById(view, R.id.chart_elevation);
        if (crpLineChart != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = R.id.ll_elevation_cumulative;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_elevation_cumulative);
            if (linearLayout2 != null) {
                i8 = R.id.tv_average_elevation;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_average_elevation);
                if (textView != null) {
                    i8 = R.id.tv_end_time;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_end_time);
                    if (textView2 != null) {
                        i8 = R.id.tv_end_time_tips;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_end_time_tips);
                        if (textView3 != null) {
                            i8 = R.id.tv_gain_cumulative;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_gain_cumulative);
                            if (textView4 != null) {
                                i8 = R.id.tv_highest_elevation;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_highest_elevation);
                                if (textView5 != null) {
                                    i8 = R.id.tv_loss_cumulative;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_loss_cumulative);
                                    if (textView6 != null) {
                                        i8 = R.id.tv_lowest_elevation;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_lowest_elevation);
                                        if (textView7 != null) {
                                            i8 = R.id.tv_start_time;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start_time);
                                            if (textView8 != null) {
                                                return new IncludeTrainingPathElevationBinding(linearLayout, crpLineChart, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
    public static IncludeTrainingPathElevationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static IncludeTrainingPathElevationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.include_training_path_elevation, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
