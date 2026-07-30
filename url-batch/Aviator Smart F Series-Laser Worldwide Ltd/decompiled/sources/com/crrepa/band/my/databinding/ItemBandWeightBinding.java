package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;

/* loaded from: classes2.dex */
public final class ItemBandWeightBinding implements ViewBinding {

    @NonNull
    public final NotDataHintViewBinding includeNoData;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final CrpLineChart weightLineChart;

    private ItemBandWeightBinding(@NonNull RelativeLayout relativeLayout, @NonNull NotDataHintViewBinding notDataHintViewBinding, @NonNull CrpLineChart crpLineChart) {
        this.rootView = relativeLayout;
        this.includeNoData = notDataHintViewBinding;
        this.weightLineChart = crpLineChart;
    }

    @NonNull
    public static ItemBandWeightBinding bind(@NonNull View view) {
        int i8 = R.id.include_no_data;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_no_data);
        if (findChildViewById != null) {
            NotDataHintViewBinding bind = NotDataHintViewBinding.bind(findChildViewById);
            CrpLineChart crpLineChart = (CrpLineChart) ViewBindings.findChildViewById(view, R.id.weight_line_chart);
            if (crpLineChart != null) {
                return new ItemBandWeightBinding((RelativeLayout) view, bind, crpLineChart);
            }
            i8 = R.id.weight_line_chart;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemBandWeightBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandWeightBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_weight, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
