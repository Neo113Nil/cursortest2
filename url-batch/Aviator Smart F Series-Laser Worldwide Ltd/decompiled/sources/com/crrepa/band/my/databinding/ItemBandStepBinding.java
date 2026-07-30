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
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;

/* loaded from: classes2.dex */
public final class ItemBandStepBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final CrpBarChart todayStepsDetailChart;

    private ItemBandStepBinding(@NonNull RelativeLayout relativeLayout, @NonNull CrpBarChart crpBarChart) {
        this.rootView = relativeLayout;
        this.todayStepsDetailChart = crpBarChart;
    }

    @NonNull
    public static ItemBandStepBinding bind(@NonNull View view) {
        CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.today_steps_detail_chart);
        if (crpBarChart != null) {
            return new ItemBandStepBinding((RelativeLayout) view, crpBarChart);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.today_steps_detail_chart)));
    }

    @NonNull
    public static ItemBandStepBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandStepBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_step, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
