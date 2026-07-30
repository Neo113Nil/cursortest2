package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class HeartRateRangeAnalysisViewBinding implements ViewBinding {

    @NonNull
    public final ProgressBar aerobicProgressbar;

    @NonNull
    public final ProgressBar anaerobicProgressbar;

    @NonNull
    public final ProgressBar lightProgressbar;

    @NonNull
    public final ProgressBar maxProgressbar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAerobicTime;

    @NonNull
    public final TextView tvAnaerobicTime;

    @NonNull
    public final TextView tvLightTime;

    @NonNull
    public final TextView tvMaxTime;

    @NonNull
    public final TextView tvWightTime;

    @NonNull
    public final ProgressBar wightProgressbar;

    private HeartRateRangeAnalysisViewBinding(@NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull ProgressBar progressBar3, @NonNull ProgressBar progressBar4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ProgressBar progressBar5) {
        this.rootView = linearLayout;
        this.aerobicProgressbar = progressBar;
        this.anaerobicProgressbar = progressBar2;
        this.lightProgressbar = progressBar3;
        this.maxProgressbar = progressBar4;
        this.tvAerobicTime = textView;
        this.tvAnaerobicTime = textView2;
        this.tvLightTime = textView3;
        this.tvMaxTime = textView4;
        this.tvWightTime = textView5;
        this.wightProgressbar = progressBar5;
    }

    @NonNull
    public static HeartRateRangeAnalysisViewBinding bind(@NonNull View view) {
        int i8 = R.id.aerobic_progressbar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.aerobic_progressbar);
        if (progressBar != null) {
            i8 = R.id.anaerobic_progressbar;
            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.anaerobic_progressbar);
            if (progressBar2 != null) {
                i8 = R.id.light_progressbar;
                ProgressBar progressBar3 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.light_progressbar);
                if (progressBar3 != null) {
                    i8 = R.id.max_progressbar;
                    ProgressBar progressBar4 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.max_progressbar);
                    if (progressBar4 != null) {
                        i8 = R.id.tv_aerobic_time;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_aerobic_time);
                        if (textView != null) {
                            i8 = R.id.tv_anaerobic_time;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_anaerobic_time);
                            if (textView2 != null) {
                                i8 = R.id.tv_light_time;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_light_time);
                                if (textView3 != null) {
                                    i8 = R.id.tv_max_time;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_max_time);
                                    if (textView4 != null) {
                                        i8 = R.id.tv_wight_time;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_wight_time);
                                        if (textView5 != null) {
                                            i8 = R.id.wight_progressbar;
                                            ProgressBar progressBar5 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.wight_progressbar);
                                            if (progressBar5 != null) {
                                                return new HeartRateRangeAnalysisViewBinding((LinearLayout) view, progressBar, progressBar2, progressBar3, progressBar4, textView, textView2, textView3, textView4, textView5, progressBar5);
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
    public static HeartRateRangeAnalysisViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HeartRateRangeAnalysisViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.heart_rate_range_analysis_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
