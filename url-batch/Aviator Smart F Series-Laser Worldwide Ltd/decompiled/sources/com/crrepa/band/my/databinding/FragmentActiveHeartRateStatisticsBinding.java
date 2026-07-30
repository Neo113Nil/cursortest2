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
public final class FragmentActiveHeartRateStatisticsBinding implements ViewBinding {

    @NonNull
    public final FragmentHeartRateDayStatisticsBinding includeHeartRateDayStatistics;

    @NonNull
    public final HeartRateAnalysisViewBinding includeHrAnalysis;

    @NonNull
    private final LinearLayout rootView;

    private FragmentActiveHeartRateStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull FragmentHeartRateDayStatisticsBinding fragmentHeartRateDayStatisticsBinding, @NonNull HeartRateAnalysisViewBinding heartRateAnalysisViewBinding) {
        this.rootView = linearLayout;
        this.includeHeartRateDayStatistics = fragmentHeartRateDayStatisticsBinding;
        this.includeHrAnalysis = heartRateAnalysisViewBinding;
    }

    @NonNull
    public static FragmentActiveHeartRateStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.include_heart_rate_day_statistics;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_heart_rate_day_statistics);
        if (findChildViewById != null) {
            FragmentHeartRateDayStatisticsBinding bind = FragmentHeartRateDayStatisticsBinding.bind(findChildViewById);
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_hr_analysis);
            if (findChildViewById2 != null) {
                return new FragmentActiveHeartRateStatisticsBinding((LinearLayout) view, bind, HeartRateAnalysisViewBinding.bind(findChildViewById2));
            }
            i8 = R.id.include_hr_analysis;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentActiveHeartRateStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentActiveHeartRateStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_active_heart_rate_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
