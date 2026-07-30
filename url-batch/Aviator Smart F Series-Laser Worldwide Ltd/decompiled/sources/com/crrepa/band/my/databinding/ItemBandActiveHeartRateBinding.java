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
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;

/* loaded from: classes2.dex */
public final class ItemBandActiveHeartRateBinding implements ViewBinding {

    @NonNull
    public final CrpLineChart heartRateChart;

    @NonNull
    public final ImageView ivTrainingType;

    @NonNull
    private final RelativeLayout rootView;

    private ItemBandActiveHeartRateBinding(@NonNull RelativeLayout relativeLayout, @NonNull CrpLineChart crpLineChart, @NonNull ImageView imageView) {
        this.rootView = relativeLayout;
        this.heartRateChart = crpLineChart;
        this.ivTrainingType = imageView;
    }

    @NonNull
    public static ItemBandActiveHeartRateBinding bind(@NonNull View view) {
        int i8 = R.id.heart_rate_chart;
        CrpLineChart crpLineChart = (CrpLineChart) ViewBindings.findChildViewById(view, R.id.heart_rate_chart);
        if (crpLineChart != null) {
            i8 = R.id.iv_training_type;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_training_type);
            if (imageView != null) {
                return new ItemBandActiveHeartRateBinding((RelativeLayout) view, crpLineChart, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemBandActiveHeartRateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandActiveHeartRateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_active_heart_rate, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
