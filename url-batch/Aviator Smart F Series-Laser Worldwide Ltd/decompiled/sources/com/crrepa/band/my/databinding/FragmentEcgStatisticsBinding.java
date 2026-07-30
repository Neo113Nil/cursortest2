package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.ecg.view.EcgView;

/* loaded from: classes2.dex */
public final class FragmentEcgStatisticsBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout bandMeasureView;

    @NonNull
    public final Button btnEcgMeasure;

    @NonNull
    public final EcgView ecgview;

    @NonNull
    public final EcgAnalysisViewBinding includeEcgAnalysis;

    @NonNull
    public final ViewEcgAuxiliaryBinding includeEcgAuxiliary;

    @NonNull
    public final ViewEcgFatigueBinding includeEcgFatigue;

    @NonNull
    public final ViewEcgHeartLoadBinding includeEcgHeartLoad;

    @NonNull
    public final ViewEcgHeartStrengthBinding includeEcgHeartStrength;

    @NonNull
    public final ViewEcgMentalStressBinding includeEcgMentalStress;

    @NonNull
    public final ViewEcgHeartRateVariabilityBinding includeHrVariability;

    @NonNull
    public final ImageView ivEcgFull;

    @NonNull
    private final LinearLayout rootView;

    private FragmentEcgStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull EcgView ecgView, @NonNull EcgAnalysisViewBinding ecgAnalysisViewBinding, @NonNull ViewEcgAuxiliaryBinding viewEcgAuxiliaryBinding, @NonNull ViewEcgFatigueBinding viewEcgFatigueBinding, @NonNull ViewEcgHeartLoadBinding viewEcgHeartLoadBinding, @NonNull ViewEcgHeartStrengthBinding viewEcgHeartStrengthBinding, @NonNull ViewEcgMentalStressBinding viewEcgMentalStressBinding, @NonNull ViewEcgHeartRateVariabilityBinding viewEcgHeartRateVariabilityBinding, @NonNull ImageView imageView) {
        this.rootView = linearLayout;
        this.bandMeasureView = relativeLayout;
        this.btnEcgMeasure = button;
        this.ecgview = ecgView;
        this.includeEcgAnalysis = ecgAnalysisViewBinding;
        this.includeEcgAuxiliary = viewEcgAuxiliaryBinding;
        this.includeEcgFatigue = viewEcgFatigueBinding;
        this.includeEcgHeartLoad = viewEcgHeartLoadBinding;
        this.includeEcgHeartStrength = viewEcgHeartStrengthBinding;
        this.includeEcgMentalStress = viewEcgMentalStressBinding;
        this.includeHrVariability = viewEcgHeartRateVariabilityBinding;
        this.ivEcgFull = imageView;
    }

    @NonNull
    public static FragmentEcgStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.band_measure_view;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.band_measure_view);
        if (relativeLayout != null) {
            i8 = R.id.btn_ecg_measure;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_ecg_measure);
            if (button != null) {
                i8 = R.id.ecgview;
                EcgView ecgView = (EcgView) ViewBindings.findChildViewById(view, R.id.ecgview);
                if (ecgView != null) {
                    i8 = R.id.include_ecg_analysis;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_ecg_analysis);
                    if (findChildViewById != null) {
                        EcgAnalysisViewBinding bind = EcgAnalysisViewBinding.bind(findChildViewById);
                        i8 = R.id.include_ecg_auxiliary;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_ecg_auxiliary);
                        if (findChildViewById2 != null) {
                            ViewEcgAuxiliaryBinding bind2 = ViewEcgAuxiliaryBinding.bind(findChildViewById2);
                            i8 = R.id.include_ecg_fatigue;
                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_ecg_fatigue);
                            if (findChildViewById3 != null) {
                                ViewEcgFatigueBinding bind3 = ViewEcgFatigueBinding.bind(findChildViewById3);
                                i8 = R.id.include_ecg_heart_load;
                                View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_ecg_heart_load);
                                if (findChildViewById4 != null) {
                                    ViewEcgHeartLoadBinding bind4 = ViewEcgHeartLoadBinding.bind(findChildViewById4);
                                    i8 = R.id.include_ecg_heart_strength;
                                    View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.include_ecg_heart_strength);
                                    if (findChildViewById5 != null) {
                                        ViewEcgHeartStrengthBinding bind5 = ViewEcgHeartStrengthBinding.bind(findChildViewById5);
                                        i8 = R.id.include_ecg_mental_stress;
                                        View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.include_ecg_mental_stress);
                                        if (findChildViewById6 != null) {
                                            ViewEcgMentalStressBinding bind6 = ViewEcgMentalStressBinding.bind(findChildViewById6);
                                            i8 = R.id.include_hr_variability;
                                            View findChildViewById7 = ViewBindings.findChildViewById(view, R.id.include_hr_variability);
                                            if (findChildViewById7 != null) {
                                                ViewEcgHeartRateVariabilityBinding bind7 = ViewEcgHeartRateVariabilityBinding.bind(findChildViewById7);
                                                i8 = R.id.iv_ecg_full;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_ecg_full);
                                                if (imageView != null) {
                                                    return new FragmentEcgStatisticsBinding((LinearLayout) view, relativeLayout, button, ecgView, bind, bind2, bind3, bind4, bind5, bind6, bind7, imageView);
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
    public static FragmentEcgStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentEcgStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_ecg_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
