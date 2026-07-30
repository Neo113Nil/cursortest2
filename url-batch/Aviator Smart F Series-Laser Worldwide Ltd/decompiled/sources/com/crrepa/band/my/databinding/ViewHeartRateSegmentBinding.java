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
public final class ViewHeartRateSegmentBinding implements ViewBinding {

    @NonNull
    public final SegmentedBarView heartRateSliderBar;

    @NonNull
    private final RelativeLayout rootView;

    private ViewHeartRateSegmentBinding(@NonNull RelativeLayout relativeLayout, @NonNull SegmentedBarView segmentedBarView) {
        this.rootView = relativeLayout;
        this.heartRateSliderBar = segmentedBarView;
    }

    @NonNull
    public static ViewHeartRateSegmentBinding bind(@NonNull View view) {
        SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(view, R.id.heart_rate_slider_bar);
        if (segmentedBarView != null) {
            return new ViewHeartRateSegmentBinding((RelativeLayout) view, segmentedBarView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.heart_rate_slider_bar)));
    }

    @NonNull
    public static ViewHeartRateSegmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewHeartRateSegmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_heart_rate_segment, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
