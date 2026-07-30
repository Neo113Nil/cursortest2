package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentOnceTempStatisticsBinding implements ViewBinding {

    @NonNull
    public final ViewAboutTemperatureBinding includeAboutTemperature;

    @NonNull
    public final Last7TimesTrendViewBinding includeLast7TimesTrend;

    @NonNull
    public final BandLastStatisticsBinding includeLastStatistics;

    @NonNull
    public final ViewTempSegmentBinding includeTempSegment;

    @NonNull
    private final NestedScrollView rootView;

    private FragmentOnceTempStatisticsBinding(@NonNull NestedScrollView nestedScrollView, @NonNull ViewAboutTemperatureBinding viewAboutTemperatureBinding, @NonNull Last7TimesTrendViewBinding last7TimesTrendViewBinding, @NonNull BandLastStatisticsBinding bandLastStatisticsBinding, @NonNull ViewTempSegmentBinding viewTempSegmentBinding) {
        this.rootView = nestedScrollView;
        this.includeAboutTemperature = viewAboutTemperatureBinding;
        this.includeLast7TimesTrend = last7TimesTrendViewBinding;
        this.includeLastStatistics = bandLastStatisticsBinding;
        this.includeTempSegment = viewTempSegmentBinding;
    }

    @NonNull
    public static FragmentOnceTempStatisticsBinding bind(@NonNull View view) {
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
                    i8 = R.id.include_temp_segment;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_temp_segment);
                    if (findChildViewById4 != null) {
                        return new FragmentOnceTempStatisticsBinding((NestedScrollView) view, bind, bind2, bind3, ViewTempSegmentBinding.bind(findChildViewById4));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentOnceTempStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentOnceTempStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_once_temp_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
