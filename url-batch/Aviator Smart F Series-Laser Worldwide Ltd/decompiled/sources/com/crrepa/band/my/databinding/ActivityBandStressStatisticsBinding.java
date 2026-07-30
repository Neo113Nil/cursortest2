package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.NoScrollViewPager;
import com.crrepa.band.my.health.widgets.segmentedbar.SegmentedBarView;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.widgets.chart.CrpPieChart;

/* loaded from: classes2.dex */
public final class ActivityBandStressStatisticsBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout bandMeasureView;

    @NonNull
    public final Button btnBandMeasure;

    @NonNull
    public final CrpPieChart chartStressPercent;

    @NonNull
    public final Last7TimesTrendViewBinding includeLast7TimesTrend;

    @NonNull
    public final IncludeStressMindsootheCardBinding includeMindsoothe;

    @NonNull
    public final AppToolbarBinding includeTitleBar;

    @NonNull
    public final ImageView ivHelp;

    @NonNull
    public final RelativeLayout rlStressRatio;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SegmentedBarView stressSliderBar;

    @NonNull
    public final TabLayout tlStressTab;

    @NonNull
    public final TextView tvLastStress;

    @NonNull
    public final TextView tvMediumPercent;

    @NonNull
    public final TextView tvNormalPercent;

    @NonNull
    public final TextView tvRelaxedPercent;

    @NonNull
    public final TextView tvStressDate;

    @NonNull
    public final TextView tvStressEvaluation;

    @NonNull
    public final TextView tvStressedPercent;

    @NonNull
    public final NoScrollViewPager vpStressContent;

    private ActivityBandStressStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull CrpPieChart crpPieChart, @NonNull Last7TimesTrendViewBinding last7TimesTrendViewBinding, @NonNull IncludeStressMindsootheCardBinding includeStressMindsootheCardBinding, @NonNull AppToolbarBinding appToolbarBinding, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull SegmentedBarView segmentedBarView, @NonNull TabLayout tabLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull NoScrollViewPager noScrollViewPager) {
        this.rootView = linearLayout;
        this.bandMeasureView = relativeLayout;
        this.btnBandMeasure = button;
        this.chartStressPercent = crpPieChart;
        this.includeLast7TimesTrend = last7TimesTrendViewBinding;
        this.includeMindsoothe = includeStressMindsootheCardBinding;
        this.includeTitleBar = appToolbarBinding;
        this.ivHelp = imageView;
        this.rlStressRatio = relativeLayout2;
        this.stressSliderBar = segmentedBarView;
        this.tlStressTab = tabLayout;
        this.tvLastStress = textView;
        this.tvMediumPercent = textView2;
        this.tvNormalPercent = textView3;
        this.tvRelaxedPercent = textView4;
        this.tvStressDate = textView5;
        this.tvStressEvaluation = textView6;
        this.tvStressedPercent = textView7;
        this.vpStressContent = noScrollViewPager;
    }

    @NonNull
    public static ActivityBandStressStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.band_measure_view;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.band_measure_view);
        if (relativeLayout != null) {
            i8 = R.id.btn_band_measure;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_band_measure);
            if (button != null) {
                i8 = R.id.chart_stress_percent;
                CrpPieChart crpPieChart = (CrpPieChart) ViewBindings.findChildViewById(view, R.id.chart_stress_percent);
                if (crpPieChart != null) {
                    i8 = R.id.include_last_7_times_trend;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_last_7_times_trend);
                    if (findChildViewById != null) {
                        Last7TimesTrendViewBinding bind = Last7TimesTrendViewBinding.bind(findChildViewById);
                        i8 = R.id.include_mindsoothe;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_mindsoothe);
                        if (findChildViewById2 != null) {
                            IncludeStressMindsootheCardBinding bind2 = IncludeStressMindsootheCardBinding.bind(findChildViewById2);
                            i8 = R.id.include_title_bar;
                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_title_bar);
                            if (findChildViewById3 != null) {
                                AppToolbarBinding bind3 = AppToolbarBinding.bind(findChildViewById3);
                                i8 = R.id.iv_help;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_help);
                                if (imageView != null) {
                                    i8 = R.id.rl_stress_ratio;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_stress_ratio);
                                    if (relativeLayout2 != null) {
                                        i8 = R.id.stress_slider_bar;
                                        SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(view, R.id.stress_slider_bar);
                                        if (segmentedBarView != null) {
                                            i8 = R.id.tl_stress_tab;
                                            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tl_stress_tab);
                                            if (tabLayout != null) {
                                                i8 = R.id.tv_last_stress;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_stress);
                                                if (textView != null) {
                                                    i8 = R.id.tv_medium_percent;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_medium_percent);
                                                    if (textView2 != null) {
                                                        i8 = R.id.tv_normal_percent;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_normal_percent);
                                                        if (textView3 != null) {
                                                            i8 = R.id.tv_relaxed_percent;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_relaxed_percent);
                                                            if (textView4 != null) {
                                                                i8 = R.id.tv_stress_date;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_stress_date);
                                                                if (textView5 != null) {
                                                                    i8 = R.id.tv_stress_evaluation;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_stress_evaluation);
                                                                    if (textView6 != null) {
                                                                        i8 = R.id.tv_stressed_percent;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_stressed_percent);
                                                                        if (textView7 != null) {
                                                                            i8 = R.id.vp_stress_content;
                                                                            NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.vp_stress_content);
                                                                            if (noScrollViewPager != null) {
                                                                                return new ActivityBandStressStatisticsBinding((LinearLayout) view, relativeLayout, button, crpPieChart, bind, bind2, bind3, imageView, relativeLayout2, segmentedBarView, tabLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, noScrollViewPager);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityBandStressStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityBandStressStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_band_stress_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
