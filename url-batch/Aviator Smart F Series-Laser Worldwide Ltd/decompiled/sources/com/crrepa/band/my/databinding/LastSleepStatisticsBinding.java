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

/* loaded from: classes2.dex */
public final class LastSleepStatisticsBinding implements ViewBinding {

    @NonNull
    public final BandLastStatisticsBinding includeLastStatistics;

    @NonNull
    public final NotDataHintViewBinding includeNotDataHint;

    @NonNull
    public final ThreeSectionDescriptionBinding includeSleepStateDescription;

    @NonNull
    public final SleepThreeSectionTimeDescriptionBinding includeSleepTimeDescription;

    @NonNull
    public final SleepTimeSegmentViewBinding includeSleepTimeSegment;

    @NonNull
    private final LinearLayout rootView;

    private LastSleepStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull BandLastStatisticsBinding bandLastStatisticsBinding, @NonNull NotDataHintViewBinding notDataHintViewBinding, @NonNull ThreeSectionDescriptionBinding threeSectionDescriptionBinding, @NonNull SleepThreeSectionTimeDescriptionBinding sleepThreeSectionTimeDescriptionBinding, @NonNull SleepTimeSegmentViewBinding sleepTimeSegmentViewBinding) {
        this.rootView = linearLayout;
        this.includeLastStatistics = bandLastStatisticsBinding;
        this.includeNotDataHint = notDataHintViewBinding;
        this.includeSleepStateDescription = threeSectionDescriptionBinding;
        this.includeSleepTimeDescription = sleepThreeSectionTimeDescriptionBinding;
        this.includeSleepTimeSegment = sleepTimeSegmentViewBinding;
    }

    @NonNull
    public static LastSleepStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.include_last_statistics;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_last_statistics);
        if (findChildViewById != null) {
            BandLastStatisticsBinding bind = BandLastStatisticsBinding.bind(findChildViewById);
            i8 = R.id.include_not_data_hint;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_not_data_hint);
            if (findChildViewById2 != null) {
                NotDataHintViewBinding bind2 = NotDataHintViewBinding.bind(findChildViewById2);
                i8 = R.id.include_sleep_state_description;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_sleep_state_description);
                if (findChildViewById3 != null) {
                    ThreeSectionDescriptionBinding bind3 = ThreeSectionDescriptionBinding.bind(findChildViewById3);
                    i8 = R.id.include_sleep_time_description;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_sleep_time_description);
                    if (findChildViewById4 != null) {
                        SleepThreeSectionTimeDescriptionBinding bind4 = SleepThreeSectionTimeDescriptionBinding.bind(findChildViewById4);
                        i8 = R.id.include_sleep_time_segment;
                        View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.include_sleep_time_segment);
                        if (findChildViewById5 != null) {
                            return new LastSleepStatisticsBinding((LinearLayout) view, bind, bind2, bind3, bind4, SleepTimeSegmentViewBinding.bind(findChildViewById5));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LastSleepStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LastSleepStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.last_sleep_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
