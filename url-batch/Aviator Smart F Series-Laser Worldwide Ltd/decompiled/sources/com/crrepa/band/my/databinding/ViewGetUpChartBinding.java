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
public final class ViewGetUpChartBinding implements ViewBinding {

    @NonNull
    public final CrpBarChart getUpSameGroupComparedChart;

    @NonNull
    public final LinearLayout llGetUpChart;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvGetUpComparedPercent;

    @NonNull
    public final TextView tvGetUpSameAgeGender;

    private ViewGetUpChartBinding(@NonNull LinearLayout linearLayout, @NonNull CrpBarChart crpBarChart, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.getUpSameGroupComparedChart = crpBarChart;
        this.llGetUpChart = linearLayout2;
        this.tvGetUpComparedPercent = textView;
        this.tvGetUpSameAgeGender = textView2;
    }

    @NonNull
    public static ViewGetUpChartBinding bind(@NonNull View view) {
        int i8 = R.id.get_up_same_group_compared_chart;
        CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.get_up_same_group_compared_chart);
        if (crpBarChart != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = R.id.tv_get_up_compared_percent;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_get_up_compared_percent);
            if (textView != null) {
                i8 = R.id.tv_get_up_same_age_gender;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_get_up_same_age_gender);
                if (textView2 != null) {
                    return new ViewGetUpChartBinding(linearLayout, crpBarChart, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewGetUpChartBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewGetUpChartBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_get_up_chart, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
