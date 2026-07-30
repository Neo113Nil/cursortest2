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
import com.crrepa.band.my.health.widgets.segmentedbar.SegmentedBarView;

/* loaded from: classes2.dex */
public final class SleepQualitySegmentViewBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final SegmentedBarView sleepQualitySliderBar;

    private SleepQualitySegmentViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull SegmentedBarView segmentedBarView) {
        this.rootView = relativeLayout;
        this.sleepQualitySliderBar = segmentedBarView;
    }

    @NonNull
    public static SleepQualitySegmentViewBinding bind(@NonNull View view) {
        SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(view, R.id.sleep_quality_slider_bar);
        if (segmentedBarView != null) {
            return new SleepQualitySegmentViewBinding((RelativeLayout) view, segmentedBarView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.sleep_quality_slider_bar)));
    }

    @NonNull
    public static SleepQualitySegmentViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SleepQualitySegmentViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.sleep_quality_segment_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
