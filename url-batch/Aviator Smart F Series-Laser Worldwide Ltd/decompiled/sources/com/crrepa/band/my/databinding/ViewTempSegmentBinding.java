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
public final class ViewTempSegmentBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final SegmentedBarView tempSegmentedbar;

    private ViewTempSegmentBinding(@NonNull RelativeLayout relativeLayout, @NonNull SegmentedBarView segmentedBarView) {
        this.rootView = relativeLayout;
        this.tempSegmentedbar = segmentedBarView;
    }

    @NonNull
    public static ViewTempSegmentBinding bind(@NonNull View view) {
        SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(view, R.id.temp_segmentedbar);
        if (segmentedBarView != null) {
            return new ViewTempSegmentBinding((RelativeLayout) view, segmentedBarView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.temp_segmentedbar)));
    }

    @NonNull
    public static ViewTempSegmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewTempSegmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_temp_segment, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
