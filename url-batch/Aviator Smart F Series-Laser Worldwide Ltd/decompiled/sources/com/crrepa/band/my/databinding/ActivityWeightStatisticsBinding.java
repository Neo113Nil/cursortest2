package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.CustomAxisView;
import com.crrepa.band.my.health.widgets.NoScrollViewPager;
import com.crrepa.band.my.health.widgets.segmentedbar.SegmentedBarView;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class ActivityWeightStatisticsBinding implements ViewBinding {

    @NonNull
    public final Button btnWeightRecord;

    @NonNull
    public final CustomAxisView cavWeightStatistics;

    @NonNull
    public final AppToolbarBinding includeAppToolbar;

    @NonNull
    public final Last7TimesTrendViewBinding includeLast7TimesTrend;

    @NonNull
    public final LinearLayout llWeightNum;

    @NonNull
    public final RelativeLayout rlWeightRecord;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SegmentedBarView sbvWeightSliderBar;

    @NonNull
    public final TabLayout tlWeightTab;

    @NonNull
    public final TextView tvWeightBmi;

    @NonNull
    public final TextView tvWeightDate;

    @NonNull
    public final TextView tvWeightNum;

    @NonNull
    public final TextView tvWeightUnit;

    @NonNull
    public final NoScrollViewPager vpWeightContent;

    private ActivityWeightStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull CustomAxisView customAxisView, @NonNull AppToolbarBinding appToolbarBinding, @NonNull Last7TimesTrendViewBinding last7TimesTrendViewBinding, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout, @NonNull SegmentedBarView segmentedBarView, @NonNull TabLayout tabLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull NoScrollViewPager noScrollViewPager) {
        this.rootView = linearLayout;
        this.btnWeightRecord = button;
        this.cavWeightStatistics = customAxisView;
        this.includeAppToolbar = appToolbarBinding;
        this.includeLast7TimesTrend = last7TimesTrendViewBinding;
        this.llWeightNum = linearLayout2;
        this.rlWeightRecord = relativeLayout;
        this.sbvWeightSliderBar = segmentedBarView;
        this.tlWeightTab = tabLayout;
        this.tvWeightBmi = textView;
        this.tvWeightDate = textView2;
        this.tvWeightNum = textView3;
        this.tvWeightUnit = textView4;
        this.vpWeightContent = noScrollViewPager;
    }

    @NonNull
    public static ActivityWeightStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.btn_weight_record;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_weight_record);
        if (button != null) {
            i8 = R.id.cav_weight_statistics;
            CustomAxisView customAxisView = (CustomAxisView) ViewBindings.findChildViewById(view, R.id.cav_weight_statistics);
            if (customAxisView != null) {
                i8 = R.id.include_app_toolbar;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_app_toolbar);
                if (findChildViewById != null) {
                    AppToolbarBinding bind = AppToolbarBinding.bind(findChildViewById);
                    i8 = R.id.include_last_7_times_trend;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_last_7_times_trend);
                    if (findChildViewById2 != null) {
                        Last7TimesTrendViewBinding bind2 = Last7TimesTrendViewBinding.bind(findChildViewById2);
                        i8 = R.id.ll_weight_num;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_weight_num);
                        if (linearLayout != null) {
                            i8 = R.id.rl_weight_record;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_weight_record);
                            if (relativeLayout != null) {
                                i8 = R.id.sbv_weight_slider_bar;
                                SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(view, R.id.sbv_weight_slider_bar);
                                if (segmentedBarView != null) {
                                    i8 = R.id.tl_weight_tab;
                                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tl_weight_tab);
                                    if (tabLayout != null) {
                                        i8 = R.id.tv_weight_bmi;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weight_bmi);
                                        if (textView != null) {
                                            i8 = R.id.tv_weight_date;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weight_date);
                                            if (textView2 != null) {
                                                i8 = R.id.tv_weight_num;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weight_num);
                                                if (textView3 != null) {
                                                    i8 = R.id.tv_weight_unit;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weight_unit);
                                                    if (textView4 != null) {
                                                        i8 = R.id.vp_weight_content;
                                                        NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.vp_weight_content);
                                                        if (noScrollViewPager != null) {
                                                            return new ActivityWeightStatisticsBinding((LinearLayout) view, button, customAxisView, bind, bind2, linearLayout, relativeLayout, segmentedBarView, tabLayout, textView, textView2, textView3, textView4, noScrollViewPager);
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
    public static ActivityWeightStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityWeightStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_weight_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
