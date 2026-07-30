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
public final class FragmentWeightHomeBinding implements ViewBinding {

    @NonNull
    public final HandleView hrHandleView;

    @NonNull
    public final LinearLayout llWeightNum;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvWeightDate;

    @NonNull
    public final TextView tvWeightNum;

    @NonNull
    public final TextView tvWeightUnit;

    @NonNull
    public final WeightLineChart weightLineChart;

    private FragmentWeightHomeBinding(@NonNull RelativeLayout relativeLayout, @NonNull HandleView handleView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull WeightLineChart weightLineChart) {
        this.rootView = relativeLayout;
        this.hrHandleView = handleView;
        this.llWeightNum = linearLayout;
        this.tvWeightDate = textView;
        this.tvWeightNum = textView2;
        this.tvWeightUnit = textView3;
        this.weightLineChart = weightLineChart;
    }

    @NonNull
    public static FragmentWeightHomeBinding bind(@NonNull View view) {
        int i8 = R.id.hr_handle_view;
        HandleView handleView = (HandleView) ViewBindings.findChildViewById(view, R.id.hr_handle_view);
        if (handleView != null) {
            i8 = R.id.ll_weight_num;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_weight_num);
            if (linearLayout != null) {
                i8 = R.id.tv_weight_date;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weight_date);
                if (textView != null) {
                    i8 = R.id.tv_weight_num;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weight_num);
                    if (textView2 != null) {
                        i8 = R.id.tv_weight_unit;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weight_unit);
                        if (textView3 != null) {
                            i8 = R.id.weight_line_chart;
                            WeightLineChart weightLineChart = (WeightLineChart) ViewBindings.findChildViewById(view, R.id.weight_line_chart);
                            if (weightLineChart != null) {
                                return new FragmentWeightHomeBinding((RelativeLayout) view, handleView, linearLayout, textView, textView2, textView3, weightLineChart);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentWeightHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentWeightHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_weight_home, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
