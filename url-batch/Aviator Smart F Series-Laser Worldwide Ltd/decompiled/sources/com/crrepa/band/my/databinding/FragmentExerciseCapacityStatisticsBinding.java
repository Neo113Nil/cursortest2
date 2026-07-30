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
import com.crrepa.band.my.health.widgets.HandleView;
import com.moyoung.dafit.module.common.widgets.chart.WeightLineChart;

/* loaded from: classes2.dex */
public final class FragmentExerciseCapacityStatisticsBinding implements ViewBinding {

    @NonNull
    public final WeightLineChart chart;

    @NonNull
    public final HandleView handleView;

    @NonNull
    public final LinearLayout llHighlightValue;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvHighlightDate;

    @NonNull
    public final TextView tvHighlightValue;

    private FragmentExerciseCapacityStatisticsBinding(@NonNull RelativeLayout relativeLayout, @NonNull WeightLineChart weightLineChart, @NonNull HandleView handleView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.chart = weightLineChart;
        this.handleView = handleView;
        this.llHighlightValue = linearLayout;
        this.tvHighlightDate = textView;
        this.tvHighlightValue = textView2;
    }

    @NonNull
    public static FragmentExerciseCapacityStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.chart;
        WeightLineChart weightLineChart = (WeightLineChart) ViewBindings.findChildViewById(view, R.id.chart);
        if (weightLineChart != null) {
            i8 = R.id.handle_view;
            HandleView handleView = (HandleView) ViewBindings.findChildViewById(view, R.id.handle_view);
            if (handleView != null) {
                i8 = R.id.ll_highlight_value;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_highlight_value);
                if (linearLayout != null) {
                    i8 = R.id.tv_highlight_date;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_highlight_date);
                    if (textView != null) {
                        i8 = R.id.tv_highlight_value;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_highlight_value);
                        if (textView2 != null) {
                            return new FragmentExerciseCapacityStatisticsBinding((RelativeLayout) view, weightLineChart, handleView, linearLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentExerciseCapacityStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentExerciseCapacityStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_exercise_capacity_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
