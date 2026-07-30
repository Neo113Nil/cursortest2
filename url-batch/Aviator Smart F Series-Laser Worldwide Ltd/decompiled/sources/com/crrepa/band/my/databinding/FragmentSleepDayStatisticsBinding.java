package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.health.widgets.segmentedview.SegmentedView;

/* loaded from: classes2.dex */
public final class FragmentSleepDayStatisticsBinding implements ViewBinding {

    @NonNull
    public final SleepStateDescriptionBinding includeSleepStateDescription;

    @NonNull
    public final LinearLayout llStatisticsData;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final HandleView sleepHandleView;

    @NonNull
    public final SegmentedView sleepSegmentedView;

    @NonNull
    public final TextView tvDate;

    @NonNull
    public final TextView tvFallAsleepTime;

    @NonNull
    public final TextView tvSleepTimeHour;

    @NonNull
    public final TextView tvSleepTimeMinute;

    @NonNull
    public final TextView tvWakeUpTime;

    private FragmentSleepDayStatisticsBinding(@NonNull RelativeLayout relativeLayout, @NonNull SleepStateDescriptionBinding sleepStateDescriptionBinding, @NonNull LinearLayout linearLayout, @NonNull HandleView handleView, @NonNull SegmentedView segmentedView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = relativeLayout;
        this.includeSleepStateDescription = sleepStateDescriptionBinding;
        this.llStatisticsData = linearLayout;
        this.sleepHandleView = handleView;
        this.sleepSegmentedView = segmentedView;
        this.tvDate = textView;
        this.tvFallAsleepTime = textView2;
        this.tvSleepTimeHour = textView3;
        this.tvSleepTimeMinute = textView4;
        this.tvWakeUpTime = textView5;
    }

    @NonNull
    public static FragmentSleepDayStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.include_sleep_state_description;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_sleep_state_description);
        if (findChildViewById != null) {
            SleepStateDescriptionBinding bind = SleepStateDescriptionBinding.bind(findChildViewById);
            i8 = R.id.ll_statistics_data;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_statistics_data);
            if (linearLayout != null) {
                i8 = R.id.sleep_handle_view;
                HandleView handleView = (HandleView) ViewBindings.findChildViewById(view, R.id.sleep_handle_view);
                if (handleView != null) {
                    i8 = R.id.sleep_segmented_view;
                    SegmentedView segmentedView = (SegmentedView) ViewBindings.findChildViewById(view, R.id.sleep_segmented_view);
                    if (segmentedView != null) {
                        i8 = R.id.tv_date;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date);
                        if (textView != null) {
                            i8 = R.id.tv_fall_asleep_time;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fall_asleep_time);
                            if (textView2 != null) {
                                i8 = R.id.tv_sleep_time_hour;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sleep_time_hour);
                                if (textView3 != null) {
                                    i8 = R.id.tv_sleep_time_minute;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sleep_time_minute);
                                    if (textView4 != null) {
                                        i8 = R.id.tv_wake_up_time;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_wake_up_time);
                                        if (textView5 != null) {
                                            return new FragmentSleepDayStatisticsBinding((RelativeLayout) view, bind, linearLayout, handleView, segmentedView, textView, textView2, textView3, textView4, textView5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentSleepDayStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentSleepDayStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sleep_day_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
