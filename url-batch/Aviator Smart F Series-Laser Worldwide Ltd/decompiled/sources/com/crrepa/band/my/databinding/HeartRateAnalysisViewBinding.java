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
import com.crrepa.band.my.health.widgets.HeartRateRangeAnalysisView;

/* loaded from: classes2.dex */
public final class HeartRateAnalysisViewBinding implements ViewBinding {

    @NonNull
    public final HeartRateRangeAnalysisView heartRateRangeAnalysis;

    @NonNull
    public final HeartRateAnalysisDescriptionViewBinding includeHrAnalysisDescription;

    @NonNull
    public final LinearLayout llHeartRateAnalysis;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTotalMeasureTime;

    private HeartRateAnalysisViewBinding(@NonNull LinearLayout linearLayout, @NonNull HeartRateRangeAnalysisView heartRateRangeAnalysisView, @NonNull HeartRateAnalysisDescriptionViewBinding heartRateAnalysisDescriptionViewBinding, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.heartRateRangeAnalysis = heartRateRangeAnalysisView;
        this.includeHrAnalysisDescription = heartRateAnalysisDescriptionViewBinding;
        this.llHeartRateAnalysis = linearLayout2;
        this.tvTotalMeasureTime = textView;
    }

    @NonNull
    public static HeartRateAnalysisViewBinding bind(@NonNull View view) {
        int i8 = R.id.heart_rate_range_analysis;
        HeartRateRangeAnalysisView heartRateRangeAnalysisView = (HeartRateRangeAnalysisView) ViewBindings.findChildViewById(view, R.id.heart_rate_range_analysis);
        if (heartRateRangeAnalysisView != null) {
            i8 = R.id.include_hr_analysis_description;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_hr_analysis_description);
            if (findChildViewById != null) {
                HeartRateAnalysisDescriptionViewBinding bind = HeartRateAnalysisDescriptionViewBinding.bind(findChildViewById);
                LinearLayout linearLayout = (LinearLayout) view;
                i8 = R.id.tv_total_measure_time;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_total_measure_time);
                if (textView != null) {
                    return new HeartRateAnalysisViewBinding(linearLayout, heartRateRangeAnalysisView, bind, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static HeartRateAnalysisViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HeartRateAnalysisViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.heart_rate_analysis_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
