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
public final class IncludeTrainingPathHeartRateZoneBinding implements ViewBinding {

    @NonNull
    public final HeartRateRangeAnalysisView heartRateRangeAnalysis;

    @NonNull
    public final LinearLayout llHeartRateZone;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvHeartRateZoneTitle;

    @NonNull
    public final TextView tvTotalZoneTime;

    private IncludeTrainingPathHeartRateZoneBinding(@NonNull LinearLayout linearLayout, @NonNull HeartRateRangeAnalysisView heartRateRangeAnalysisView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.heartRateRangeAnalysis = heartRateRangeAnalysisView;
        this.llHeartRateZone = linearLayout2;
        this.tvHeartRateZoneTitle = textView;
        this.tvTotalZoneTime = textView2;
    }

    @NonNull
    public static IncludeTrainingPathHeartRateZoneBinding bind(@NonNull View view) {
        int i8 = R.id.heart_rate_range_analysis;
        HeartRateRangeAnalysisView heartRateRangeAnalysisView = (HeartRateRangeAnalysisView) ViewBindings.findChildViewById(view, R.id.heart_rate_range_analysis);
        if (heartRateRangeAnalysisView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = R.id.tv_heart_rate_zone_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_heart_rate_zone_title);
            if (textView != null) {
                i8 = R.id.tv_total_zone_time;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_total_zone_time);
                if (textView2 != null) {
                    return new IncludeTrainingPathHeartRateZoneBinding(linearLayout, heartRateRangeAnalysisView, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static IncludeTrainingPathHeartRateZoneBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static IncludeTrainingPathHeartRateZoneBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.include_training_path_heart_rate_zone, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
