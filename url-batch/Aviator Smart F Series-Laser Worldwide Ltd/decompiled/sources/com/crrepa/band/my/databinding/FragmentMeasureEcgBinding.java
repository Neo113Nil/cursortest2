package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.ecg.ecgbreatheanim.EcgBreatheAnimView;
import com.crrepa.band.my.health.ecg.view.EcgMeasureView;

/* loaded from: classes2.dex */
public final class FragmentMeasureEcgBinding implements ViewBinding {

    @NonNull
    public final EcgBreatheAnimView ecgBreatheView;

    @NonNull
    public final ProgressBar ecgMeasureProgressbar;

    @NonNull
    public final EcgMeasureView ecgMeasureView;

    @NonNull
    public final ImageView ivEcgMeasure;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvEcgMeasureTip;

    @NonNull
    public final TextView tvEcgMeasureTitle;

    @NonNull
    public final TextView tvHeartRate;

    private FragmentMeasureEcgBinding(@NonNull RelativeLayout relativeLayout, @NonNull EcgBreatheAnimView ecgBreatheAnimView, @NonNull ProgressBar progressBar, @NonNull EcgMeasureView ecgMeasureView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.ecgBreatheView = ecgBreatheAnimView;
        this.ecgMeasureProgressbar = progressBar;
        this.ecgMeasureView = ecgMeasureView;
        this.ivEcgMeasure = imageView;
        this.tvEcgMeasureTip = textView;
        this.tvEcgMeasureTitle = textView2;
        this.tvHeartRate = textView3;
    }

    @NonNull
    public static FragmentMeasureEcgBinding bind(@NonNull View view) {
        int i8 = R.id.ecg_breathe_view;
        EcgBreatheAnimView ecgBreatheAnimView = (EcgBreatheAnimView) ViewBindings.findChildViewById(view, R.id.ecg_breathe_view);
        if (ecgBreatheAnimView != null) {
            i8 = R.id.ecg_measure_progressbar;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.ecg_measure_progressbar);
            if (progressBar != null) {
                i8 = R.id.ecg_measure_view;
                EcgMeasureView ecgMeasureView = (EcgMeasureView) ViewBindings.findChildViewById(view, R.id.ecg_measure_view);
                if (ecgMeasureView != null) {
                    i8 = R.id.iv_ecg_measure;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_ecg_measure);
                    if (imageView != null) {
                        i8 = R.id.tv_ecg_measure_tip;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ecg_measure_tip);
                        if (textView != null) {
                            i8 = R.id.tv_ecg_measure_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ecg_measure_title);
                            if (textView2 != null) {
                                i8 = R.id.tv_heart_rate;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_heart_rate);
                                if (textView3 != null) {
                                    return new FragmentMeasureEcgBinding((RelativeLayout) view, ecgBreatheAnimView, progressBar, ecgMeasureView, imageView, textView, textView2, textView3);
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
    public static FragmentMeasureEcgBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentMeasureEcgBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_measure_ecg, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
