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
public final class Last7TimesTrendViewBinding implements ViewBinding {

    @NonNull
    public final CrpBarChart last7TimesTrendChart;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvLast7TimesName;

    private Last7TimesTrendViewBinding(@NonNull LinearLayout linearLayout, @NonNull CrpBarChart crpBarChart, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.last7TimesTrendChart = crpBarChart;
        this.tvLast7TimesName = textView;
    }

    @NonNull
    public static Last7TimesTrendViewBinding bind(@NonNull View view) {
        int i8 = R.id.last_7_times_trend_chart;
        CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.last_7_times_trend_chart);
        if (crpBarChart != null) {
            i8 = R.id.tv_last_7_times_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_7_times_name);
            if (textView != null) {
                return new Last7TimesTrendViewBinding((LinearLayout) view, crpBarChart, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static Last7TimesTrendViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static Last7TimesTrendViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.last_7_times_trend_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
