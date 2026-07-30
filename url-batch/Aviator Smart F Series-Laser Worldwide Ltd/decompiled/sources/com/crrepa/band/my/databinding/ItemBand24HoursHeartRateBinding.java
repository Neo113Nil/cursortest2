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
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;

/* loaded from: classes2.dex */
public final class ItemBand24HoursHeartRateBinding implements ViewBinding {

    @NonNull
    public final DayAxisTimeView dayAxisTimeView;

    @NonNull
    public final CrpLineChart heartRateLineChart;

    @NonNull
    public final NotDataHintViewBinding includeNoData;

    @NonNull
    public final ImageView ivDataType;

    @NonNull
    private final RelativeLayout rootView;

    private ItemBand24HoursHeartRateBinding(@NonNull RelativeLayout relativeLayout, @NonNull DayAxisTimeView dayAxisTimeView, @NonNull CrpLineChart crpLineChart, @NonNull NotDataHintViewBinding notDataHintViewBinding, @NonNull ImageView imageView) {
        this.rootView = relativeLayout;
        this.dayAxisTimeView = dayAxisTimeView;
        this.heartRateLineChart = crpLineChart;
        this.includeNoData = notDataHintViewBinding;
        this.ivDataType = imageView;
    }

    @NonNull
    public static ItemBand24HoursHeartRateBinding bind(@NonNull View view) {
        int i8 = R.id.day_axis_time_view;
        DayAxisTimeView dayAxisTimeView = (DayAxisTimeView) ViewBindings.findChildViewById(view, R.id.day_axis_time_view);
        if (dayAxisTimeView != null) {
            i8 = R.id.heart_rate_line_chart;
            CrpLineChart crpLineChart = (CrpLineChart) ViewBindings.findChildViewById(view, R.id.heart_rate_line_chart);
            if (crpLineChart != null) {
                i8 = R.id.include_no_data;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_no_data);
                if (findChildViewById != null) {
                    NotDataHintViewBinding bind = NotDataHintViewBinding.bind(findChildViewById);
                    i8 = R.id.iv_data_type;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_data_type);
                    if (imageView != null) {
                        return new ItemBand24HoursHeartRateBinding((RelativeLayout) view, dayAxisTimeView, crpLineChart, bind, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemBand24HoursHeartRateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBand24HoursHeartRateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_24_hours_heart_rate, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
