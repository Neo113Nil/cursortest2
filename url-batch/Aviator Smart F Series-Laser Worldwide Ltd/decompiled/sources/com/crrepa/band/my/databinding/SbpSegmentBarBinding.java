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
import com.crrepa.band.my.health.widgets.segmentedbar.SegmentedBarView;

/* loaded from: classes2.dex */
public final class SbpSegmentBarBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SegmentedBarView sbpSliderBar;

    private SbpSegmentBarBinding(@NonNull LinearLayout linearLayout, @NonNull SegmentedBarView segmentedBarView) {
        this.rootView = linearLayout;
        this.sbpSliderBar = segmentedBarView;
    }

    @NonNull
    public static SbpSegmentBarBinding bind(@NonNull View view) {
        SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(view, R.id.sbp_slider_bar);
        if (segmentedBarView != null) {
            return new SbpSegmentBarBinding((LinearLayout) view, segmentedBarView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.sbp_slider_bar)));
    }

    @NonNull
    public static SbpSegmentBarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SbpSegmentBarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.sbp_segment_bar, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
