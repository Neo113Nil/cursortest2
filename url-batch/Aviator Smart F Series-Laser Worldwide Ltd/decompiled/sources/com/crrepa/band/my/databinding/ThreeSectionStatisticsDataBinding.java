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

/* loaded from: classes2.dex */
public final class ThreeSectionStatisticsDataBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llFirstSectionData;

    @NonNull
    public final LinearLayout llThirdSectionData;

    @NonNull
    public final LinearLayout llThreeSectionStatisticsData;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvFirstSectionData;

    @NonNull
    public final TextView tvFirstSectionDataUnit;

    @NonNull
    public final TextView tvSecondSectionData;

    @NonNull
    public final TextView tvSecondSectionDataUnit;

    @NonNull
    public final TextView tvThirdSectionData;

    @NonNull
    public final TextView tvThirdSectionDataUnit;

    private ThreeSectionStatisticsDataBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.rootView = linearLayout;
        this.llFirstSectionData = linearLayout2;
        this.llThirdSectionData = linearLayout3;
        this.llThreeSectionStatisticsData = linearLayout4;
        this.tvFirstSectionData = textView;
        this.tvFirstSectionDataUnit = textView2;
        this.tvSecondSectionData = textView3;
        this.tvSecondSectionDataUnit = textView4;
        this.tvThirdSectionData = textView5;
        this.tvThirdSectionDataUnit = textView6;
    }

    @NonNull
    public static ThreeSectionStatisticsDataBinding bind(@NonNull View view) {
        int i8 = R.id.ll_first_section_data;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_first_section_data);
        if (linearLayout != null) {
            i8 = R.id.ll_third_section_data;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_third_section_data);
            if (linearLayout2 != null) {
                LinearLayout linearLayout3 = (LinearLayout) view;
                i8 = R.id.tv_first_section_data;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_first_section_data);
                if (textView != null) {
                    i8 = R.id.tv_first_section_data_unit;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_first_section_data_unit);
                    if (textView2 != null) {
                        i8 = R.id.tv_second_section_data;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_second_section_data);
                        if (textView3 != null) {
                            i8 = R.id.tv_second_section_data_unit;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_second_section_data_unit);
                            if (textView4 != null) {
                                i8 = R.id.tv_third_section_data;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_third_section_data);
                                if (textView5 != null) {
                                    i8 = R.id.tv_third_section_data_unit;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_third_section_data_unit);
                                    if (textView6 != null) {
                                        return new ThreeSectionStatisticsDataBinding(linearLayout3, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, textView4, textView5, textView6);
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
    public static ThreeSectionStatisticsDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ThreeSectionStatisticsDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.three_section_statistics_data, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
