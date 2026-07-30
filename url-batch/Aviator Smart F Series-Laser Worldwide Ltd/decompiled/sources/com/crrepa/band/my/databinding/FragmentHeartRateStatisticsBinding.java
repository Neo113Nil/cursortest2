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
public final class FragmentHeartRateStatisticsBinding implements ViewBinding {

    @NonNull
    public final CrpBarChart heartRateBarChart;

    @NonNull
    public final HandleView hrHandleView;

    @NonNull
    public final LinearLayout llStatisticsDate;

    @NonNull
    public final RelativeLayout rlHeartRateStatistics;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvAverageHr;

    @NonNull
    public final TextView tvHrType;

    @NonNull
    public final TextView tvStatisticsDate;

    @NonNull
    public final TextView tvUnit;

    private FragmentHeartRateStatisticsBinding(@NonNull RelativeLayout relativeLayout, @NonNull CrpBarChart crpBarChart, @NonNull HandleView handleView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.heartRateBarChart = crpBarChart;
        this.hrHandleView = handleView;
        this.llStatisticsDate = linearLayout;
        this.rlHeartRateStatistics = relativeLayout2;
        this.tvAverageHr = textView;
        this.tvHrType = textView2;
        this.tvStatisticsDate = textView3;
        this.tvUnit = textView4;
    }

    @NonNull
    public static FragmentHeartRateStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.heart_rate_bar_chart;
        CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.heart_rate_bar_chart);
        if (crpBarChart != null) {
            i8 = R.id.hr_handle_view;
            HandleView handleView = (HandleView) ViewBindings.findChildViewById(view, R.id.hr_handle_view);
            if (handleView != null) {
                i8 = R.id.ll_statistics_date;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_statistics_date);
                if (linearLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i8 = R.id.tv_average_hr;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_average_hr);
                    if (textView != null) {
                        i8 = R.id.tv_hr_type;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_hr_type);
                        if (textView2 != null) {
                            i8 = R.id.tv_statistics_date;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_statistics_date);
                            if (textView3 != null) {
                                i8 = R.id.tv_unit;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_unit);
                                if (textView4 != null) {
                                    return new FragmentHeartRateStatisticsBinding(relativeLayout, crpBarChart, handleView, linearLayout, relativeLayout, textView, textView2, textView3, textView4);
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
    public static FragmentHeartRateStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentHeartRateStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_heart_rate_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
