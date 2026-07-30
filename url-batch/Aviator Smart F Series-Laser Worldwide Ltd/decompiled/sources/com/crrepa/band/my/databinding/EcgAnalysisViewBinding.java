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
public final class EcgAnalysisViewBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llFindEcg;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAverageHeartRate;

    @NonNull
    public final TextView tvEcgAnalysisDescription1;

    @NonNull
    public final TextView tvEcgAnalysisDescription2;

    @NonNull
    public final TextView tvEcgAnalysisDescription3;

    @NonNull
    public final TextView tvEcgAnalysisValue;

    @NonNull
    public final TextView tvEcgMeasureDate;

    @NonNull
    public final TextView tvFindEcg;

    @NonNull
    public final TextView tvMeasureTime;

    private EcgAnalysisViewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.rootView = linearLayout;
        this.llFindEcg = linearLayout2;
        this.tvAverageHeartRate = textView;
        this.tvEcgAnalysisDescription1 = textView2;
        this.tvEcgAnalysisDescription2 = textView3;
        this.tvEcgAnalysisDescription3 = textView4;
        this.tvEcgAnalysisValue = textView5;
        this.tvEcgMeasureDate = textView6;
        this.tvFindEcg = textView7;
        this.tvMeasureTime = textView8;
    }

    @NonNull
    public static EcgAnalysisViewBinding bind(@NonNull View view) {
        int i8 = R.id.ll_find_ecg;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_find_ecg);
        if (linearLayout != null) {
            i8 = R.id.tv_average_heart_rate;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_average_heart_rate);
            if (textView != null) {
                i8 = R.id.tv_ecg_analysis_description1;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ecg_analysis_description1);
                if (textView2 != null) {
                    i8 = R.id.tv_ecg_analysis_description2;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ecg_analysis_description2);
                    if (textView3 != null) {
                        i8 = R.id.tv_ecg_analysis_description3;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ecg_analysis_description3);
                        if (textView4 != null) {
                            i8 = R.id.tv_ecg_analysis_value;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ecg_analysis_value);
                            if (textView5 != null) {
                                i8 = R.id.tv_ecg_measure_date;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ecg_measure_date);
                                if (textView6 != null) {
                                    i8 = R.id.tv_find_ecg;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_find_ecg);
                                    if (textView7 != null) {
                                        i8 = R.id.tv_measure_time;
                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_measure_time);
                                        if (textView8 != null) {
                                            return new EcgAnalysisViewBinding((LinearLayout) view, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
    public static EcgAnalysisViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EcgAnalysisViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.ecg_analysis_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
