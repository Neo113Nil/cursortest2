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
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;

/* loaded from: classes2.dex */
public final class ViewSleepBloodOxygenBinding implements ViewBinding {

    @NonNull
    public final CrpLineChart bloodOxygenChart;

    @NonNull
    public final ViewBloodOxygenExtremesBinding includeBloodOxygenStatistics;

    @NonNull
    public final LinearLayout llSleepBo;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvBoEndTime;

    @NonNull
    public final TextView tvBoStartTime;

    @NonNull
    public final TextView tvSleepAverageBo;

    private ViewSleepBloodOxygenBinding(@NonNull LinearLayout linearLayout, @NonNull CrpLineChart crpLineChart, @NonNull ViewBloodOxygenExtremesBinding viewBloodOxygenExtremesBinding, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.bloodOxygenChart = crpLineChart;
        this.includeBloodOxygenStatistics = viewBloodOxygenExtremesBinding;
        this.llSleepBo = linearLayout2;
        this.tvBoEndTime = textView;
        this.tvBoStartTime = textView2;
        this.tvSleepAverageBo = textView3;
    }

    @NonNull
    public static ViewSleepBloodOxygenBinding bind(@NonNull View view) {
        int i8 = R.id.blood_oxygen_chart;
        CrpLineChart crpLineChart = (CrpLineChart) ViewBindings.findChildViewById(view, R.id.blood_oxygen_chart);
        if (crpLineChart != null) {
            i8 = R.id.include_blood_oxygen_statistics;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_blood_oxygen_statistics);
            if (findChildViewById != null) {
                ViewBloodOxygenExtremesBinding bind = ViewBloodOxygenExtremesBinding.bind(findChildViewById);
                LinearLayout linearLayout = (LinearLayout) view;
                i8 = R.id.tv_bo_end_time;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bo_end_time);
                if (textView != null) {
                    i8 = R.id.tv_bo_start_time;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bo_start_time);
                    if (textView2 != null) {
                        i8 = R.id.tv_sleep_average_bo;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sleep_average_bo);
                        if (textView3 != null) {
                            return new ViewSleepBloodOxygenBinding(linearLayout, crpLineChart, bind, linearLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewSleepBloodOxygenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewSleepBloodOxygenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_sleep_blood_oxygen, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
