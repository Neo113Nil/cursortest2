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

/* loaded from: classes2.dex */
public final class PhysiologicalViewBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout heartRateChartView;

    @NonNull
    public final LinearLayout llPhysiological;

    @NonNull
    public final View physiological1;

    @NonNull
    public final View physiological2;

    @NonNull
    public final View physiological3;

    @NonNull
    public final View physiological4;

    @NonNull
    public final View physiological5;

    @NonNull
    public final View physiological6;

    @NonNull
    public final View physiological7;

    @NonNull
    public final View physiological8;

    @NonNull
    public final View physiological9;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvEndDate;

    @NonNull
    public final TextView tvStartDate;

    private PhysiologicalViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull View view6, @NonNull View view7, @NonNull View view8, @NonNull View view9, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.heartRateChartView = relativeLayout2;
        this.llPhysiological = linearLayout;
        this.physiological1 = view;
        this.physiological2 = view2;
        this.physiological3 = view3;
        this.physiological4 = view4;
        this.physiological5 = view5;
        this.physiological6 = view6;
        this.physiological7 = view7;
        this.physiological8 = view8;
        this.physiological9 = view9;
        this.tvEndDate = textView;
        this.tvStartDate = textView2;
    }

    @NonNull
    public static PhysiologicalViewBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i8 = R.id.ll_physiological;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_physiological);
        if (linearLayout != null) {
            i8 = R.id.physiological_1;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.physiological_1);
            if (findChildViewById != null) {
                i8 = R.id.physiological_2;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.physiological_2);
                if (findChildViewById2 != null) {
                    i8 = R.id.physiological_3;
                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.physiological_3);
                    if (findChildViewById3 != null) {
                        i8 = R.id.physiological_4;
                        View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.physiological_4);
                        if (findChildViewById4 != null) {
                            i8 = R.id.physiological_5;
                            View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.physiological_5);
                            if (findChildViewById5 != null) {
                                i8 = R.id.physiological_6;
                                View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.physiological_6);
                                if (findChildViewById6 != null) {
                                    i8 = R.id.physiological_7;
                                    View findChildViewById7 = ViewBindings.findChildViewById(view, R.id.physiological_7);
                                    if (findChildViewById7 != null) {
                                        i8 = R.id.physiological_8;
                                        View findChildViewById8 = ViewBindings.findChildViewById(view, R.id.physiological_8);
                                        if (findChildViewById8 != null) {
                                            i8 = R.id.physiological_9;
                                            View findChildViewById9 = ViewBindings.findChildViewById(view, R.id.physiological_9);
                                            if (findChildViewById9 != null) {
                                                i8 = R.id.tv_end_date;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_end_date);
                                                if (textView != null) {
                                                    i8 = R.id.tv_start_date;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start_date);
                                                    if (textView2 != null) {
                                                        return new PhysiologicalViewBinding(relativeLayout, relativeLayout, linearLayout, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6, findChildViewById7, findChildViewById8, findChildViewById9, textView, textView2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static PhysiologicalViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static PhysiologicalViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.physiological_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
