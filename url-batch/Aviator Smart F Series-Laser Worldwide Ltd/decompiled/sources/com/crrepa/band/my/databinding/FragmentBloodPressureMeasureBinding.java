package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;

/* loaded from: classes2.dex */
public final class FragmentBloodPressureMeasureBinding implements ViewBinding {

    @NonNull
    public final ViewAboutBoBinding includeAboutBo;

    @NonNull
    public final BloodPressureDataViewBinding includeDataView;

    @NonNull
    public final CrpBarChart last7TimesBloodPressureTrendChart;

    @NonNull
    private final NestedScrollView rootView;

    @NonNull
    public final TextView tvDbpFifthDay;

    @NonNull
    public final TextView tvDbpFirstDay;

    @NonNull
    public final TextView tvDbpFourthDay;

    @NonNull
    public final TextView tvDbpSecondDay;

    @NonNull
    public final TextView tvDbpSeventhDay;

    @NonNull
    public final TextView tvDbpSixthDay;

    @NonNull
    public final TextView tvDbpThirdDay;

    @NonNull
    public final TextView tvSbpFifthDay;

    @NonNull
    public final TextView tvSbpFirstDay;

    @NonNull
    public final TextView tvSbpFourthDay;

    @NonNull
    public final TextView tvSbpSecondDay;

    @NonNull
    public final TextView tvSbpSeventhDay;

    @NonNull
    public final TextView tvSbpSixthDay;

    @NonNull
    public final TextView tvSbpThirdDay;

    private FragmentBloodPressureMeasureBinding(@NonNull NestedScrollView nestedScrollView, @NonNull ViewAboutBoBinding viewAboutBoBinding, @NonNull BloodPressureDataViewBinding bloodPressureDataViewBinding, @NonNull CrpBarChart crpBarChart, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14) {
        this.rootView = nestedScrollView;
        this.includeAboutBo = viewAboutBoBinding;
        this.includeDataView = bloodPressureDataViewBinding;
        this.last7TimesBloodPressureTrendChart = crpBarChart;
        this.tvDbpFifthDay = textView;
        this.tvDbpFirstDay = textView2;
        this.tvDbpFourthDay = textView3;
        this.tvDbpSecondDay = textView4;
        this.tvDbpSeventhDay = textView5;
        this.tvDbpSixthDay = textView6;
        this.tvDbpThirdDay = textView7;
        this.tvSbpFifthDay = textView8;
        this.tvSbpFirstDay = textView9;
        this.tvSbpFourthDay = textView10;
        this.tvSbpSecondDay = textView11;
        this.tvSbpSeventhDay = textView12;
        this.tvSbpSixthDay = textView13;
        this.tvSbpThirdDay = textView14;
    }

    @NonNull
    public static FragmentBloodPressureMeasureBinding bind(@NonNull View view) {
        int i8 = R.id.include_about_bo;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_about_bo);
        if (findChildViewById != null) {
            ViewAboutBoBinding bind = ViewAboutBoBinding.bind(findChildViewById);
            i8 = R.id.include_data_view;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_data_view);
            if (findChildViewById2 != null) {
                BloodPressureDataViewBinding bind2 = BloodPressureDataViewBinding.bind(findChildViewById2);
                i8 = R.id.last_7_times_blood_pressure_trend_chart;
                CrpBarChart crpBarChart = (CrpBarChart) ViewBindings.findChildViewById(view, R.id.last_7_times_blood_pressure_trend_chart);
                if (crpBarChart != null) {
                    i8 = R.id.tv_dbp_fifth_day;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dbp_fifth_day);
                    if (textView != null) {
                        i8 = R.id.tv_dbp_first_day;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dbp_first_day);
                        if (textView2 != null) {
                            i8 = R.id.tv_dbp_fourth_day;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dbp_fourth_day);
                            if (textView3 != null) {
                                i8 = R.id.tv_dbp_second_day;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dbp_second_day);
                                if (textView4 != null) {
                                    i8 = R.id.tv_dbp_seventh_day;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dbp_seventh_day);
                                    if (textView5 != null) {
                                        i8 = R.id.tv_dbp_sixth_day;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dbp_sixth_day);
                                        if (textView6 != null) {
                                            i8 = R.id.tv_dbp_third_day;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dbp_third_day);
                                            if (textView7 != null) {
                                                i8 = R.id.tv_sbp_fifth_day;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sbp_fifth_day);
                                                if (textView8 != null) {
                                                    i8 = R.id.tv_sbp_first_day;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sbp_first_day);
                                                    if (textView9 != null) {
                                                        i8 = R.id.tv_sbp_fourth_day;
                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sbp_fourth_day);
                                                        if (textView10 != null) {
                                                            i8 = R.id.tv_sbp_second_day;
                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sbp_second_day);
                                                            if (textView11 != null) {
                                                                i8 = R.id.tv_sbp_seventh_day;
                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sbp_seventh_day);
                                                                if (textView12 != null) {
                                                                    i8 = R.id.tv_sbp_sixth_day;
                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sbp_sixth_day);
                                                                    if (textView13 != null) {
                                                                        i8 = R.id.tv_sbp_third_day;
                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sbp_third_day);
                                                                        if (textView14 != null) {
                                                                            return new FragmentBloodPressureMeasureBinding((NestedScrollView) view, bind, bind2, crpBarChart, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentBloodPressureMeasureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentBloodPressureMeasureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_blood_pressure_measure, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
