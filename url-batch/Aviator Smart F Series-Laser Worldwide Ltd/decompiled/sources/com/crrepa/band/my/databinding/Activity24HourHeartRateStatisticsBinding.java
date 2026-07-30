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
import com.crrepa.band.my.health.widgets.NoScrollViewPager;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class Activity24HourHeartRateStatisticsBinding implements ViewBinding {

    @NonNull
    public final HeartRateAnalysisViewBinding includeHeartRateAnalysis;

    @NonNull
    public final AppToolbarBinding includeTitleBar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tlHrStatisticsTab;

    @NonNull
    public final NoScrollViewPager vpHrStatisticsContent;

    private Activity24HourHeartRateStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull HeartRateAnalysisViewBinding heartRateAnalysisViewBinding, @NonNull AppToolbarBinding appToolbarBinding, @NonNull TabLayout tabLayout, @NonNull NoScrollViewPager noScrollViewPager) {
        this.rootView = linearLayout;
        this.includeHeartRateAnalysis = heartRateAnalysisViewBinding;
        this.includeTitleBar = appToolbarBinding;
        this.tlHrStatisticsTab = tabLayout;
        this.vpHrStatisticsContent = noScrollViewPager;
    }

    @NonNull
    public static Activity24HourHeartRateStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.include_heart_rate_analysis;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_heart_rate_analysis);
        if (findChildViewById != null) {
            HeartRateAnalysisViewBinding bind = HeartRateAnalysisViewBinding.bind(findChildViewById);
            i8 = R.id.include_title_bar;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_title_bar);
            if (findChildViewById2 != null) {
                AppToolbarBinding bind2 = AppToolbarBinding.bind(findChildViewById2);
                i8 = R.id.tl_hr_statistics_tab;
                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tl_hr_statistics_tab);
                if (tabLayout != null) {
                    i8 = R.id.vp_hr_statistics_content;
                    NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.vp_hr_statistics_content);
                    if (noScrollViewPager != null) {
                        return new Activity24HourHeartRateStatisticsBinding((LinearLayout) view, bind, bind2, tabLayout, noScrollViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static Activity24HourHeartRateStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static Activity24HourHeartRateStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_24_hour_heart_rate_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
