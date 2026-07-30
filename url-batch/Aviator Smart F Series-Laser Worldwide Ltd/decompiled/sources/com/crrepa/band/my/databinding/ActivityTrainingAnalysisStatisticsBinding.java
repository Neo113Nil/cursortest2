package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.NoScrollViewPager;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class ActivityTrainingAnalysisStatisticsBinding implements ViewBinding {

    @NonNull
    public final ImageView ivCalendar;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tlTab;

    @NonNull
    public final TextView tvAbout;

    @NonNull
    public final TextView tvAvgValue;

    @NonNull
    public final TextView tvDesc;

    @NonNull
    public final TextView tvDescTitle;

    @NonNull
    public final TextView tvMaxValue;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final NoScrollViewPager vpContent;

    private ActivityTrainingAnalysisStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TabLayout tabLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull NoScrollViewPager noScrollViewPager) {
        this.rootView = linearLayout;
        this.ivCalendar = imageView;
        this.ivClose = imageView2;
        this.tlTab = tabLayout;
        this.tvAbout = textView;
        this.tvAvgValue = textView2;
        this.tvDesc = textView3;
        this.tvDescTitle = textView4;
        this.tvMaxValue = textView5;
        this.tvTitle = textView6;
        this.vpContent = noScrollViewPager;
    }

    @NonNull
    public static ActivityTrainingAnalysisStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.iv_calendar;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_calendar);
        if (imageView != null) {
            i8 = R.id.iv_close;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
            if (imageView2 != null) {
                i8 = R.id.tl_tab;
                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tl_tab);
                if (tabLayout != null) {
                    i8 = R.id.tv_about;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_about);
                    if (textView != null) {
                        i8 = R.id.tv_avg_value;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_value);
                        if (textView2 != null) {
                            i8 = R.id.tv_desc;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc);
                            if (textView3 != null) {
                                i8 = R.id.tv_desc_title;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_title);
                                if (textView4 != null) {
                                    i8 = R.id.tv_max_value;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_max_value);
                                    if (textView5 != null) {
                                        i8 = R.id.tv_title;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                        if (textView6 != null) {
                                            i8 = R.id.vp_content;
                                            NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.vp_content);
                                            if (noScrollViewPager != null) {
                                                return new ActivityTrainingAnalysisStatisticsBinding((LinearLayout) view, imageView, imageView2, tabLayout, textView, textView2, textView3, textView4, textView5, textView6, noScrollViewPager);
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
    public static ActivityTrainingAnalysisStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityTrainingAnalysisStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_training_analysis_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
