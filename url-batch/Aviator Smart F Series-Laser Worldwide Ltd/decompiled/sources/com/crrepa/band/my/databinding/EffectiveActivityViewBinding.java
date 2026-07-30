package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;

/* loaded from: classes2.dex */
public final class EffectiveActivityViewBinding implements ViewBinding {

    @NonNull
    public final CrpBarChart effectiveActivityChart;

    @NonNull
    public final LinearLayout llEffectiveActivityTime;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvDescription1;

    @NonNull
    public final TextView tvEffectiveActivityTime;

    @NonNull
    public final TextView tvTitle1;

    @NonNull
    public final TextView tvTitle2;

    @NonNull
    public final TextView tvWeekEffectiveActivityTime;

    private EffectiveActivityViewBinding(@NonNull LinearLayout linearLayout, @NonNull CrpBarChart crpBarChart, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = linearLayout;
        this.effectiveActivityChart = crpBarChart;
        this.llEffectiveActivityTime = linearLayout2;
        this.tvDescription1 = textView;
        this.tvEffectiveActivityTime = textView2;
        this.tvTitle1 = textView3;
        this.tvTitle2 = textView4;
        this.tvWeekEffectiveActivityTime = textView5;
    }

    @NonNull
    public static EffectiveActivityViewBinding bind(@NonNull View view) {
        int i8 = R.id.effective_activity_chart;
        CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.effective_activity_chart);
        if (crpBarChart != null) {
            i8 = R.id.ll_effective_activity_time;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_effective_activity_time);
            if (linearLayout != null) {
                i8 = R.id.tv_description_1;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_1);
                if (textView != null) {
                    i8 = R.id.tv_effective_activity_time;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_effective_activity_time);
                    if (textView2 != null) {
                        i8 = R.id.tv_title_1;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_1);
                        if (textView3 != null) {
                            i8 = R.id.tv_title_2;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_2);
                            if (textView4 != null) {
                                i8 = R.id.tv_week_effective_activity_time;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_week_effective_activity_time);
                                if (textView5 != null) {
                                    return new EffectiveActivityViewBinding((LinearLayout) view, crpBarChart, linearLayout, textView, textView2, textView3, textView4, textView5);
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
    public static EffectiveActivityViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EffectiveActivityViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.effective_activity_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
