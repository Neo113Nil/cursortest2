package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.segmentedbar.SegmentedBarView;

/* loaded from: classes2.dex */
public final class SleepTimeSegmentViewBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final SegmentedBarView sleepTimeDistributedBar;

    @NonNull
    public final RelativeLayout sleepTimeSegmentView;

    @NonNull
    public final TextView tvStartSleepTime;

    @NonNull
    public final TextView tvStopSleepTime;

    private SleepTimeSegmentViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull SegmentedBarView segmentedBarView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.sleepTimeDistributedBar = segmentedBarView;
        this.sleepTimeSegmentView = relativeLayout2;
        this.tvStartSleepTime = textView;
        this.tvStopSleepTime = textView2;
    }

    @NonNull
    public static SleepTimeSegmentViewBinding bind(@NonNull View view) {
        int i8 = R.id.sleep_time_distributed_bar;
        SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(view, R.id.sleep_time_distributed_bar);
        if (segmentedBarView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i8 = R.id.tv_start_sleep_time;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start_sleep_time);
            if (textView != null) {
                i8 = R.id.tv_stop_sleep_time;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_stop_sleep_time);
                if (textView2 != null) {
                    return new SleepTimeSegmentViewBinding(relativeLayout, segmentedBarView, relativeLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static SleepTimeSegmentViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SleepTimeSegmentViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.sleep_time_segment_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
