package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;

/* loaded from: classes2.dex */
public final class LastWeekSleepTrendBinding implements ViewBinding {

    @NonNull
    public final CrpBarChart last7daySleepTrendChart;

    @NonNull
    public final RelativeLayout rlLastWeekSleepTrend;

    @NonNull
    private final RelativeLayout rootView;

    private LastWeekSleepTrendBinding(@NonNull RelativeLayout relativeLayout, @NonNull CrpBarChart crpBarChart, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.last7daySleepTrendChart = crpBarChart;
        this.rlLastWeekSleepTrend = relativeLayout2;
    }

    @NonNull
    public static LastWeekSleepTrendBinding bind(@NonNull View view) {
        CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.last_7day_sleep_trend_chart);
        if (crpBarChart == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.last_7day_sleep_trend_chart)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new LastWeekSleepTrendBinding(relativeLayout, crpBarChart, relativeLayout);
    }

    @NonNull
    public static LastWeekSleepTrendBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LastWeekSleepTrendBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.last_week_sleep_trend, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
