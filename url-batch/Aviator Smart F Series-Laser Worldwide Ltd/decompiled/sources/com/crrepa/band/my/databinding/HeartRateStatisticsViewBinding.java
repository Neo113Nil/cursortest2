package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class HeartRateStatisticsViewBinding implements ViewBinding {

    @NonNull
    public final HeartRateChartViewBinding includeHrChart;

    @NonNull
    public final ViewHeartRateExtremesBinding includeHrExtremes;

    @NonNull
    public final BandLastStatisticsBinding includeLastStatistics;

    @NonNull
    private final LinearLayout rootView;

    private HeartRateStatisticsViewBinding(@NonNull LinearLayout linearLayout, @NonNull HeartRateChartViewBinding heartRateChartViewBinding, @NonNull ViewHeartRateExtremesBinding viewHeartRateExtremesBinding, @NonNull BandLastStatisticsBinding bandLastStatisticsBinding) {
        this.rootView = linearLayout;
        this.includeHrChart = heartRateChartViewBinding;
        this.includeHrExtremes = viewHeartRateExtremesBinding;
        this.includeLastStatistics = bandLastStatisticsBinding;
    }

    @NonNull
    public static HeartRateStatisticsViewBinding bind(@NonNull View view) {
        int i8 = R.id.include_hr_chart;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_hr_chart);
        if (findChildViewById != null) {
            HeartRateChartViewBinding bind = HeartRateChartViewBinding.bind(findChildViewById);
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_hr_extremes);
            if (findChildViewById2 != null) {
                ViewHeartRateExtremesBinding bind2 = ViewHeartRateExtremesBinding.bind(findChildViewById2);
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_last_statistics);
                if (findChildViewById3 != null) {
                    return new HeartRateStatisticsViewBinding((LinearLayout) view, bind, bind2, BandLastStatisticsBinding.bind(findChildViewById3));
                }
                i8 = R.id.include_last_statistics;
            } else {
                i8 = R.id.include_hr_extremes;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static HeartRateStatisticsViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HeartRateStatisticsViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.heart_rate_statistics_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
