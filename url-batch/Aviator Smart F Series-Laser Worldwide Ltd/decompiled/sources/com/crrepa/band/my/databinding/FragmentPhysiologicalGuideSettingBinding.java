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
public final class FragmentPhysiologicalGuideSettingBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llPhysiologicalCycle;

    @NonNull
    public final LinearLayout llPhysiologicalLast;

    @NonNull
    public final LinearLayout llPhysiologicalMenstrual;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvPhysiologicalCycleDays;

    @NonNull
    public final TextView tvPhysiologicalLastDays;

    @NonNull
    public final TextView tvPhysiologicalMenstrualDays;

    private FragmentPhysiologicalGuideSettingBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.llPhysiologicalCycle = linearLayout2;
        this.llPhysiologicalLast = linearLayout3;
        this.llPhysiologicalMenstrual = linearLayout4;
        this.tvPhysiologicalCycleDays = textView;
        this.tvPhysiologicalLastDays = textView2;
        this.tvPhysiologicalMenstrualDays = textView3;
    }

    @NonNull
    public static FragmentPhysiologicalGuideSettingBinding bind(@NonNull View view) {
        int i8 = R.id.ll_physiological_cycle;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_physiological_cycle);
        if (linearLayout != null) {
            i8 = R.id.ll_physiological_last;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_physiological_last);
            if (linearLayout2 != null) {
                i8 = R.id.ll_physiological_menstrual;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_physiological_menstrual);
                if (linearLayout3 != null) {
                    i8 = R.id.tv_physiological_cycle_days;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_physiological_cycle_days);
                    if (textView != null) {
                        i8 = R.id.tv_physiological_last_days;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_physiological_last_days);
                        if (textView2 != null) {
                            i8 = R.id.tv_physiological_menstrual_days;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_physiological_menstrual_days);
                            if (textView3 != null) {
                                return new FragmentPhysiologicalGuideSettingBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentPhysiologicalGuideSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentPhysiologicalGuideSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_physiological_guide_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
