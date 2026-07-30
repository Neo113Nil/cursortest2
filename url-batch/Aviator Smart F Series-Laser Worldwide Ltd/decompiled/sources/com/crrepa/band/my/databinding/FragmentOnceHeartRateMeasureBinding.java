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
public final class FragmentOnceHeartRateMeasureBinding implements ViewBinding {

    @NonNull
    public final Last7TimesTrendViewBinding includeLast7TimesTrend;

    @NonNull
    public final OnceHeartRateStatisticsViewBinding includeOnceHeartRateStatistics;

    @NonNull
    private final NestedScrollView rootView;

    private FragmentOnceHeartRateMeasureBinding(@NonNull NestedScrollView nestedScrollView, @NonNull Last7TimesTrendViewBinding last7TimesTrendViewBinding, @NonNull OnceHeartRateStatisticsViewBinding onceHeartRateStatisticsViewBinding) {
        this.rootView = nestedScrollView;
        this.includeLast7TimesTrend = last7TimesTrendViewBinding;
        this.includeOnceHeartRateStatistics = onceHeartRateStatisticsViewBinding;
    }

    @NonNull
    public static FragmentOnceHeartRateMeasureBinding bind(@NonNull View view) {
        int i8 = R.id.include_last_7_times_trend;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_last_7_times_trend);
        if (findChildViewById != null) {
            Last7TimesTrendViewBinding bind = Last7TimesTrendViewBinding.bind(findChildViewById);
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_once_heart_rate_statistics);
            if (findChildViewById2 != null) {
                return new FragmentOnceHeartRateMeasureBinding((NestedScrollView) view, bind, OnceHeartRateStatisticsViewBinding.bind(findChildViewById2));
            }
            i8 = R.id.include_once_heart_rate_statistics;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentOnceHeartRateMeasureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentOnceHeartRateMeasureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_once_heart_rate_measure, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
