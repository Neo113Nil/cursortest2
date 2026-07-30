package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.DayAxisTimeView;
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;

/* loaded from: classes2.dex */
public final class ItemBandTimingStressBinding implements ViewBinding {

    @NonNull
    public final DayAxisTimeView dayAxisTimeView;

    @NonNull
    public final NotDataHintViewBinding includeNoData;

    @NonNull
    public final ImageView ivDataType;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final CrpBarChart stressBarChart;

    private ItemBandTimingStressBinding(@NonNull RelativeLayout relativeLayout, @NonNull DayAxisTimeView dayAxisTimeView, @NonNull NotDataHintViewBinding notDataHintViewBinding, @NonNull ImageView imageView, @NonNull CrpBarChart crpBarChart) {
        this.rootView = relativeLayout;
        this.dayAxisTimeView = dayAxisTimeView;
        this.includeNoData = notDataHintViewBinding;
        this.ivDataType = imageView;
        this.stressBarChart = crpBarChart;
    }

    @NonNull
    public static ItemBandTimingStressBinding bind(@NonNull View view) {
        int i8 = R.id.day_axis_time_view;
        DayAxisTimeView dayAxisTimeView = (DayAxisTimeView) ViewBindings.findChildViewById(view, R.id.day_axis_time_view);
        if (dayAxisTimeView != null) {
            i8 = R.id.include_no_data;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_no_data);
            if (findChildViewById != null) {
                NotDataHintViewBinding bind = NotDataHintViewBinding.bind(findChildViewById);
                i8 = R.id.iv_data_type;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_data_type);
                if (imageView != null) {
                    i8 = R.id.stress_bar_chart;
                    CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.stress_bar_chart);
                    if (crpBarChart != null) {
                        return new ItemBandTimingStressBinding((RelativeLayout) view, dayAxisTimeView, bind, imageView, crpBarChart);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemBandTimingStressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandTimingStressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_timing_stress, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
