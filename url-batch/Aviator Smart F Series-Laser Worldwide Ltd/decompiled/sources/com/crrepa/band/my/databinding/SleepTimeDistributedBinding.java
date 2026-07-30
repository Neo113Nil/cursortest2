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
import com.crrepa.band.my.health.widgets.segmentedview.SegmentedView;

/* loaded from: classes2.dex */
public final class SleepTimeDistributedBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RelativeLayout sleepTimeDistributed;

    @NonNull
    public final SegmentedView sleepTimeDistributedView;

    @NonNull
    public final TextView tvFallAsleepTime;

    @NonNull
    public final TextView tvWakeUpTime;

    private SleepTimeDistributedBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull SegmentedView segmentedView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.sleepTimeDistributed = relativeLayout2;
        this.sleepTimeDistributedView = segmentedView;
        this.tvFallAsleepTime = textView;
        this.tvWakeUpTime = textView2;
    }

    @NonNull
    public static SleepTimeDistributedBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i8 = R.id.sleep_time_distributed_view;
        SegmentedView segmentedView = (SegmentedView) ViewBindings.findChildViewById(view, R.id.sleep_time_distributed_view);
        if (segmentedView != null) {
            i8 = R.id.tv_fall_asleep_time;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fall_asleep_time);
            if (textView != null) {
                i8 = R.id.tv_wake_up_time;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_wake_up_time);
                if (textView2 != null) {
                    return new SleepTimeDistributedBinding(relativeLayout, relativeLayout, segmentedView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static SleepTimeDistributedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SleepTimeDistributedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.sleep_time_distributed, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
