package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.training.widgets.TrainingEffectProgressView;

/* loaded from: classes2.dex */
public final class LayoutGomoreSportTrainingEffectBinding implements ViewBinding {

    @NonNull
    public final Space centerSpace;

    @NonNull
    public final TrainingEffectProgressView chartAerobic;

    @NonNull
    public final TrainingEffectProgressView chartAnaerobic;

    @NonNull
    public final LinearLayout llGomoreSportTrainingEffect;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAerobic;

    @NonNull
    public final TextView tvAerobicLevel;

    @NonNull
    public final TextView tvAnaerobic;

    @NonNull
    public final TextView tvAnaerobicLevel;

    @NonNull
    public final TextView tvTrainingEffectTitle;

    private LayoutGomoreSportTrainingEffectBinding(@NonNull LinearLayout linearLayout, @NonNull Space space, @NonNull TrainingEffectProgressView trainingEffectProgressView, @NonNull TrainingEffectProgressView trainingEffectProgressView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = linearLayout;
        this.centerSpace = space;
        this.chartAerobic = trainingEffectProgressView;
        this.chartAnaerobic = trainingEffectProgressView2;
        this.llGomoreSportTrainingEffect = linearLayout2;
        this.tvAerobic = textView;
        this.tvAerobicLevel = textView2;
        this.tvAnaerobic = textView3;
        this.tvAnaerobicLevel = textView4;
        this.tvTrainingEffectTitle = textView5;
    }

    @NonNull
    public static LayoutGomoreSportTrainingEffectBinding bind(@NonNull View view) {
        int i8 = R.id.center_space;
        Space space = (Space) ViewBindings.findChildViewById(view, R.id.center_space);
        if (space != null) {
            i8 = R.id.chart_aerobic;
            TrainingEffectProgressView trainingEffectProgressView = (TrainingEffectProgressView) ViewBindings.findChildViewById(view, R.id.chart_aerobic);
            if (trainingEffectProgressView != null) {
                i8 = R.id.chart_anaerobic;
                TrainingEffectProgressView trainingEffectProgressView2 = (TrainingEffectProgressView) ViewBindings.findChildViewById(view, R.id.chart_anaerobic);
                if (trainingEffectProgressView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i8 = R.id.tv_aerobic;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_aerobic);
                    if (textView != null) {
                        i8 = R.id.tv_aerobic_level;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_aerobic_level);
                        if (textView2 != null) {
                            i8 = R.id.tv_anaerobic;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_anaerobic);
                            if (textView3 != null) {
                                i8 = R.id.tv_anaerobic_level;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_anaerobic_level);
                                if (textView4 != null) {
                                    i8 = R.id.tv_training_effect_title;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_effect_title);
                                    if (textView5 != null) {
                                        return new LayoutGomoreSportTrainingEffectBinding(linearLayout, space, trainingEffectProgressView, trainingEffectProgressView2, linearLayout, textView, textView2, textView3, textView4, textView5);
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
    public static LayoutGomoreSportTrainingEffectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutGomoreSportTrainingEffectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_gomore_sport_training_effect, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
