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
public final class ActivitySleepStatisticsBinding implements ViewBinding {

    @NonNull
    public final ViewSleepBloodOxygenBinding includeBloodOxygen;

    @NonNull
    public final ViewGetUpChartBinding includeGetUpChart;

    @NonNull
    public final ViewSleepHeartRateBinding includeHeartRate;

    @NonNull
    public final LastWeekSleepTrendBinding includeLastWeekSleepTrend;

    @NonNull
    public final ViewLessSleepChartBinding includeLessSleepChart;

    @NonNull
    public final IncludeSleepMindsootheCardBinding includeMindsoothe;

    @NonNull
    public final SleepNapDayBinding includeNap;

    @NonNull
    public final ViewSleepEarlyChartBinding includeSleepEarlyChart;

    @NonNull
    public final SleepQualityViewBinding includeSleepQuality;

    @NonNull
    public final SleepRatioBinding includeSleepRatio;

    @NonNull
    public final AppToolbarBinding includeTitleBar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tlSleepStatisticsTab;

    @NonNull
    public final NoScrollViewPager vpSleepStatisticsContent;

    private ActivitySleepStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull ViewSleepBloodOxygenBinding viewSleepBloodOxygenBinding, @NonNull ViewGetUpChartBinding viewGetUpChartBinding, @NonNull ViewSleepHeartRateBinding viewSleepHeartRateBinding, @NonNull LastWeekSleepTrendBinding lastWeekSleepTrendBinding, @NonNull ViewLessSleepChartBinding viewLessSleepChartBinding, @NonNull IncludeSleepMindsootheCardBinding includeSleepMindsootheCardBinding, @NonNull SleepNapDayBinding sleepNapDayBinding, @NonNull ViewSleepEarlyChartBinding viewSleepEarlyChartBinding, @NonNull SleepQualityViewBinding sleepQualityViewBinding, @NonNull SleepRatioBinding sleepRatioBinding, @NonNull AppToolbarBinding appToolbarBinding, @NonNull TabLayout tabLayout, @NonNull NoScrollViewPager noScrollViewPager) {
        this.rootView = linearLayout;
        this.includeBloodOxygen = viewSleepBloodOxygenBinding;
        this.includeGetUpChart = viewGetUpChartBinding;
        this.includeHeartRate = viewSleepHeartRateBinding;
        this.includeLastWeekSleepTrend = lastWeekSleepTrendBinding;
        this.includeLessSleepChart = viewLessSleepChartBinding;
        this.includeMindsoothe = includeSleepMindsootheCardBinding;
        this.includeNap = sleepNapDayBinding;
        this.includeSleepEarlyChart = viewSleepEarlyChartBinding;
        this.includeSleepQuality = sleepQualityViewBinding;
        this.includeSleepRatio = sleepRatioBinding;
        this.includeTitleBar = appToolbarBinding;
        this.tlSleepStatisticsTab = tabLayout;
        this.vpSleepStatisticsContent = noScrollViewPager;
    }

    @NonNull
    public static ActivitySleepStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.include_blood_oxygen;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_blood_oxygen);
        if (findChildViewById != null) {
            ViewSleepBloodOxygenBinding bind = ViewSleepBloodOxygenBinding.bind(findChildViewById);
            i8 = R.id.include_get_up_chart;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_get_up_chart);
            if (findChildViewById2 != null) {
                ViewGetUpChartBinding bind2 = ViewGetUpChartBinding.bind(findChildViewById2);
                i8 = R.id.include_heart_rate;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_heart_rate);
                if (findChildViewById3 != null) {
                    ViewSleepHeartRateBinding bind3 = ViewSleepHeartRateBinding.bind(findChildViewById3);
                    i8 = R.id.include_last_week_sleep_trend;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_last_week_sleep_trend);
                    if (findChildViewById4 != null) {
                        LastWeekSleepTrendBinding bind4 = LastWeekSleepTrendBinding.bind(findChildViewById4);
                        i8 = R.id.include_less_sleep_chart;
                        View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.include_less_sleep_chart);
                        if (findChildViewById5 != null) {
                            ViewLessSleepChartBinding bind5 = ViewLessSleepChartBinding.bind(findChildViewById5);
                            i8 = R.id.include_mindsoothe;
                            View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.include_mindsoothe);
                            if (findChildViewById6 != null) {
                                IncludeSleepMindsootheCardBinding bind6 = IncludeSleepMindsootheCardBinding.bind(findChildViewById6);
                                i8 = R.id.include_nap;
                                View findChildViewById7 = ViewBindings.findChildViewById(view, R.id.include_nap);
                                if (findChildViewById7 != null) {
                                    SleepNapDayBinding bind7 = SleepNapDayBinding.bind(findChildViewById7);
                                    i8 = R.id.include_sleep_early_chart;
                                    View findChildViewById8 = ViewBindings.findChildViewById(view, R.id.include_sleep_early_chart);
                                    if (findChildViewById8 != null) {
                                        ViewSleepEarlyChartBinding bind8 = ViewSleepEarlyChartBinding.bind(findChildViewById8);
                                        i8 = R.id.include_sleep_quality;
                                        View findChildViewById9 = ViewBindings.findChildViewById(view, R.id.include_sleep_quality);
                                        if (findChildViewById9 != null) {
                                            SleepQualityViewBinding bind9 = SleepQualityViewBinding.bind(findChildViewById9);
                                            i8 = R.id.include_sleep_ratio;
                                            View findChildViewById10 = ViewBindings.findChildViewById(view, R.id.include_sleep_ratio);
                                            if (findChildViewById10 != null) {
                                                SleepRatioBinding bind10 = SleepRatioBinding.bind(findChildViewById10);
                                                i8 = R.id.include_title_bar;
                                                View findChildViewById11 = ViewBindings.findChildViewById(view, R.id.include_title_bar);
                                                if (findChildViewById11 != null) {
                                                    AppToolbarBinding bind11 = AppToolbarBinding.bind(findChildViewById11);
                                                    i8 = R.id.tl_sleep_statistics_tab;
                                                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tl_sleep_statistics_tab);
                                                    if (tabLayout != null) {
                                                        i8 = R.id.vp_sleep_statistics_content;
                                                        NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.vp_sleep_statistics_content);
                                                        if (noScrollViewPager != null) {
                                                            return new ActivitySleepStatisticsBinding((LinearLayout) view, bind, bind2, bind3, bind4, bind5, bind6, bind7, bind8, bind9, bind10, bind11, tabLayout, noScrollViewPager);
                                                        }
                                                    }
                                                }
                                            }
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
    public static ActivitySleepStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivitySleepStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_sleep_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
