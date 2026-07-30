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
import com.crrepa.band.my.health.widgets.segmentedbar.SegmentedBarView;

/* loaded from: classes2.dex */
public final class SegmentBarViewBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SegmentedBarView sliderBar;

    @NonNull
    public final TextView tvDataName;

    private SegmentBarViewBinding(@NonNull LinearLayout linearLayout, @NonNull SegmentedBarView segmentedBarView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.sliderBar = segmentedBarView;
        this.tvDataName = textView;
    }

    @NonNull
    public static SegmentBarViewBinding bind(@NonNull View view) {
        int i8 = R.id.slider_bar;
        SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(view, R.id.slider_bar);
        if (segmentedBarView != null) {
            i8 = R.id.tv_data_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_data_name);
            if (textView != null) {
                return new SegmentBarViewBinding((LinearLayout) view, segmentedBarView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static SegmentBarViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SegmentBarViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.segment_bar_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
