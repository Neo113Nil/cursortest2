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
public final class OnceHeartRateStatisticsViewBinding implements ViewBinding {

    @NonNull
    public final HeartRateAnalysisDescriptionViewBinding includeHrAnalysisDescription;

    @NonNull
    public final ViewHeartRateSegmentBinding includeHrSegment;

    @NonNull
    public final BandLastStatisticsBinding includeLastStatistics;

    @NonNull
    private final LinearLayout rootView;

    private OnceHeartRateStatisticsViewBinding(@NonNull LinearLayout linearLayout, @NonNull HeartRateAnalysisDescriptionViewBinding heartRateAnalysisDescriptionViewBinding, @NonNull ViewHeartRateSegmentBinding viewHeartRateSegmentBinding, @NonNull BandLastStatisticsBinding bandLastStatisticsBinding) {
        this.rootView = linearLayout;
        this.includeHrAnalysisDescription = heartRateAnalysisDescriptionViewBinding;
        this.includeHrSegment = viewHeartRateSegmentBinding;
        this.includeLastStatistics = bandLastStatisticsBinding;
    }

    @NonNull
    public static OnceHeartRateStatisticsViewBinding bind(@NonNull View view) {
        int i8 = R.id.include_hr_analysis_description;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_hr_analysis_description);
        if (findChildViewById != null) {
            HeartRateAnalysisDescriptionViewBinding bind = HeartRateAnalysisDescriptionViewBinding.bind(findChildViewById);
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_hr_segment);
            if (findChildViewById2 != null) {
                ViewHeartRateSegmentBinding bind2 = ViewHeartRateSegmentBinding.bind(findChildViewById2);
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_last_statistics);
                if (findChildViewById3 != null) {
                    return new OnceHeartRateStatisticsViewBinding((LinearLayout) view, bind, bind2, BandLastStatisticsBinding.bind(findChildViewById3));
                }
                i8 = R.id.include_last_statistics;
            } else {
                i8 = R.id.include_hr_segment;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static OnceHeartRateStatisticsViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static OnceHeartRateStatisticsViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.once_heart_rate_statistics_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
