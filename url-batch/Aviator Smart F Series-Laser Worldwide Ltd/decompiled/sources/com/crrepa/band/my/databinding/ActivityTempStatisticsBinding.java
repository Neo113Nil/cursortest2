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
public final class ActivityTempStatisticsBinding implements ViewBinding {

    @NonNull
    public final ViewAboutTemperatureBinding includeAboutTemperature;

    @NonNull
    public final Last7TimesTrendViewBinding includeLast7TimesTrend;

    @NonNull
    public final AppToolbarBinding includeTitleBar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tlHrStatisticsTab;

    @NonNull
    public final NoScrollViewPager vpHrStatisticsContent;

    private ActivityTempStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull ViewAboutTemperatureBinding viewAboutTemperatureBinding, @NonNull Last7TimesTrendViewBinding last7TimesTrendViewBinding, @NonNull AppToolbarBinding appToolbarBinding, @NonNull TabLayout tabLayout, @NonNull NoScrollViewPager noScrollViewPager) {
        this.rootView = linearLayout;
        this.includeAboutTemperature = viewAboutTemperatureBinding;
        this.includeLast7TimesTrend = last7TimesTrendViewBinding;
        this.includeTitleBar = appToolbarBinding;
        this.tlHrStatisticsTab = tabLayout;
        this.vpHrStatisticsContent = noScrollViewPager;
    }

    @NonNull
    public static ActivityTempStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.include_about_temperature;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_about_temperature);
        if (findChildViewById != null) {
            ViewAboutTemperatureBinding bind = ViewAboutTemperatureBinding.bind(findChildViewById);
            i8 = R.id.include_last_7_times_trend;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_last_7_times_trend);
            if (findChildViewById2 != null) {
                Last7TimesTrendViewBinding bind2 = Last7TimesTrendViewBinding.bind(findChildViewById2);
                i8 = R.id.include_title_bar;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_title_bar);
                if (findChildViewById3 != null) {
                    AppToolbarBinding bind3 = AppToolbarBinding.bind(findChildViewById3);
                    i8 = R.id.tl_hr_statistics_tab;
                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tl_hr_statistics_tab);
                    if (tabLayout != null) {
                        i8 = R.id.vp_hr_statistics_content;
                        NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.vp_hr_statistics_content);
                        if (noScrollViewPager != null) {
                            return new ActivityTempStatisticsBinding((LinearLayout) view, bind, bind2, bind3, tabLayout, noScrollViewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityTempStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityTempStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_temp_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
