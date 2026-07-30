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
public final class ActivityStepStatisticsBinding implements ViewBinding {

    @NonNull
    public final EffectiveActivityViewBinding includeEffectiveActivity;

    @NonNull
    public final LastStepStatisticsBinding includeLastStatistics;

    @NonNull
    public final LastWeekActivityStandardBinding includeLastWeekActivityStandard;

    @NonNull
    public final ViewSameAgeStepsChartBinding includeSameAgeGroupChart;

    @NonNull
    public final AppToolbarBinding includeTitleBar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tlStepsStatisticsTab;

    @NonNull
    public final NoScrollViewPager vpStepsStatisticsContent;

    private ActivityStepStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull EffectiveActivityViewBinding effectiveActivityViewBinding, @NonNull LastStepStatisticsBinding lastStepStatisticsBinding, @NonNull LastWeekActivityStandardBinding lastWeekActivityStandardBinding, @NonNull ViewSameAgeStepsChartBinding viewSameAgeStepsChartBinding, @NonNull AppToolbarBinding appToolbarBinding, @NonNull TabLayout tabLayout, @NonNull NoScrollViewPager noScrollViewPager) {
        this.rootView = linearLayout;
        this.includeEffectiveActivity = effectiveActivityViewBinding;
        this.includeLastStatistics = lastStepStatisticsBinding;
        this.includeLastWeekActivityStandard = lastWeekActivityStandardBinding;
        this.includeSameAgeGroupChart = viewSameAgeStepsChartBinding;
        this.includeTitleBar = appToolbarBinding;
        this.tlStepsStatisticsTab = tabLayout;
        this.vpStepsStatisticsContent = noScrollViewPager;
    }

    @NonNull
    public static ActivityStepStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.include_effective_activity;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_effective_activity);
        if (findChildViewById != null) {
            EffectiveActivityViewBinding bind = EffectiveActivityViewBinding.bind(findChildViewById);
            i8 = R.id.include_last_statistics;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_last_statistics);
            if (findChildViewById2 != null) {
                LastStepStatisticsBinding bind2 = LastStepStatisticsBinding.bind(findChildViewById2);
                i8 = R.id.include_last_week_activity_standard;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_last_week_activity_standard);
                if (findChildViewById3 != null) {
                    LastWeekActivityStandardBinding bind3 = LastWeekActivityStandardBinding.bind(findChildViewById3);
                    i8 = R.id.include_same_age_group_chart;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_same_age_group_chart);
                    if (findChildViewById4 != null) {
                        ViewSameAgeStepsChartBinding bind4 = ViewSameAgeStepsChartBinding.bind(findChildViewById4);
                        i8 = R.id.include_title_bar;
                        View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.include_title_bar);
                        if (findChildViewById5 != null) {
                            AppToolbarBinding bind5 = AppToolbarBinding.bind(findChildViewById5);
                            i8 = R.id.tl_steps_statistics_tab;
                            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tl_steps_statistics_tab);
                            if (tabLayout != null) {
                                i8 = R.id.vp_steps_statistics_content;
                                NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.vp_steps_statistics_content);
                                if (noScrollViewPager != null) {
                                    return new ActivityStepStatisticsBinding((LinearLayout) view, bind, bind2, bind3, bind4, bind5, tabLayout, noScrollViewPager);
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
    public static ActivityStepStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityStepStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_step_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
