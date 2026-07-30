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
import com.moyoung.dafit.module.common.widgets.chart.CrpPieChart;

/* loaded from: classes2.dex */
public final class SleepRatioBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llSleepRem;

    @NonNull
    public final CrpPieChart pcSleepRatio;

    @NonNull
    public final RelativeLayout rlSleepRatio;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvLightHour;

    @NonNull
    public final TextView tvLightMinute;

    @NonNull
    public final TextView tvRemHour;

    @NonNull
    public final TextView tvRemMinute;

    @NonNull
    public final TextView tvRestfulHour;

    @NonNull
    public final TextView tvRestfulMinute;

    private SleepRatioBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull CrpPieChart crpPieChart, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.rootView = relativeLayout;
        this.llSleepRem = linearLayout;
        this.pcSleepRatio = crpPieChart;
        this.rlSleepRatio = relativeLayout2;
        this.tvLightHour = textView;
        this.tvLightMinute = textView2;
        this.tvRemHour = textView3;
        this.tvRemMinute = textView4;
        this.tvRestfulHour = textView5;
        this.tvRestfulMinute = textView6;
    }

    @NonNull
    public static SleepRatioBinding bind(@NonNull View view) {
        int i8 = R.id.ll_sleep_rem;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_sleep_rem);
        if (linearLayout != null) {
            i8 = R.id.pc_sleep_ratio;
            CrpPieChart crpPieChart = (CrpPieChart) ViewBindings.findChildViewById(view, R.id.pc_sleep_ratio);
            if (crpPieChart != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i8 = R.id.tv_light_hour;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_light_hour);
                if (textView != null) {
                    i8 = R.id.tv_light_minute;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_light_minute);
                    if (textView2 != null) {
                        i8 = R.id.tv_rem_hour;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_rem_hour);
                        if (textView3 != null) {
                            i8 = R.id.tv_rem_minute;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_rem_minute);
                            if (textView4 != null) {
                                i8 = R.id.tv_restful_hour;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_restful_hour);
                                if (textView5 != null) {
                                    i8 = R.id.tv_restful_minute;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_restful_minute);
                                    if (textView6 != null) {
                                        return new SleepRatioBinding(relativeLayout, linearLayout, crpPieChart, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6);
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
    public static SleepRatioBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SleepRatioBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.sleep_ratio, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
