package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityExerciseCapacityMainBinding implements ViewBinding {

    @NonNull
    public final ImageView ivCalendar;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivLactateThresholdHrContinue;

    @NonNull
    public final ImageView ivLactateThresholdPaceContinue;

    @NonNull
    public final ImageView ivVo2maxContinue;

    @NonNull
    public final RelativeLayout rlFitnessAge;

    @NonNull
    public final RelativeLayout rlFitnessLevel;

    @NonNull
    public final RelativeLayout rlLactateThresholdHr;

    @NonNull
    public final RelativeLayout rlLactateThresholdPace;

    @NonNull
    public final RelativeLayout rlVo2Max;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvFitnessAge;

    @NonNull
    public final TextView tvFitnessAgeTitle;

    @NonNull
    public final TextView tvFitnessLevel;

    @NonNull
    public final TextView tvFitnessLevelTitle;

    @NonNull
    public final TextView tvLactateThresholdHr;

    @NonNull
    public final TextView tvLactateThresholdHrUnit;

    @NonNull
    public final TextView tvLactateThresholdPace;

    @NonNull
    public final TextView tvVo2max;

    @NonNull
    public final TextView tvVo2maxUnit;

    private ActivityExerciseCapacityMainBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.rootView = linearLayout;
        this.ivCalendar = imageView;
        this.ivClose = imageView2;
        this.ivLactateThresholdHrContinue = imageView3;
        this.ivLactateThresholdPaceContinue = imageView4;
        this.ivVo2maxContinue = imageView5;
        this.rlFitnessAge = relativeLayout;
        this.rlFitnessLevel = relativeLayout2;
        this.rlLactateThresholdHr = relativeLayout3;
        this.rlLactateThresholdPace = relativeLayout4;
        this.rlVo2Max = relativeLayout5;
        this.tvFitnessAge = textView;
        this.tvFitnessAgeTitle = textView2;
        this.tvFitnessLevel = textView3;
        this.tvFitnessLevelTitle = textView4;
        this.tvLactateThresholdHr = textView5;
        this.tvLactateThresholdHrUnit = textView6;
        this.tvLactateThresholdPace = textView7;
        this.tvVo2max = textView8;
        this.tvVo2maxUnit = textView9;
    }

    @NonNull
    public static ActivityExerciseCapacityMainBinding bind(@NonNull View view) {
        int i8 = R.id.iv_calendar;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_calendar);
        if (imageView != null) {
            i8 = R.id.iv_close;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
            if (imageView2 != null) {
                i8 = R.id.iv_lactate_threshold_hr_continue;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_lactate_threshold_hr_continue);
                if (imageView3 != null) {
                    i8 = R.id.iv_lactate_threshold_pace_continue;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_lactate_threshold_pace_continue);
                    if (imageView4 != null) {
                        i8 = R.id.iv_vo2max_continue;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_vo2max_continue);
                        if (imageView5 != null) {
                            i8 = R.id.rl_fitness_age;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_fitness_age);
                            if (relativeLayout != null) {
                                i8 = R.id.rl_fitness_level;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_fitness_level);
                                if (relativeLayout2 != null) {
                                    i8 = R.id.rl_lactate_threshold_hr;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_lactate_threshold_hr);
                                    if (relativeLayout3 != null) {
                                        i8 = R.id.rl_lactate_threshold_pace;
                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_lactate_threshold_pace);
                                        if (relativeLayout4 != null) {
                                            i8 = R.id.rl_vo2_max;
                                            RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_vo2_max);
                                            if (relativeLayout5 != null) {
                                                i8 = R.id.tv_fitness_age;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fitness_age);
                                                if (textView != null) {
                                                    i8 = R.id.tv_fitness_age_title;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fitness_age_title);
                                                    if (textView2 != null) {
                                                        i8 = R.id.tv_fitness_level;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fitness_level);
                                                        if (textView3 != null) {
                                                            i8 = R.id.tv_fitness_level_title;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fitness_level_title);
                                                            if (textView4 != null) {
                                                                i8 = R.id.tv_lactate_threshold_hr;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_lactate_threshold_hr);
                                                                if (textView5 != null) {
                                                                    i8 = R.id.tv_lactate_threshold_hr_unit;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_lactate_threshold_hr_unit);
                                                                    if (textView6 != null) {
                                                                        i8 = R.id.tv_lactate_threshold_pace;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_lactate_threshold_pace);
                                                                        if (textView7 != null) {
                                                                            i8 = R.id.tv_vo2max;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_vo2max);
                                                                            if (textView8 != null) {
                                                                                i8 = R.id.tv_vo2max_unit;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_vo2max_unit);
                                                                                if (textView9 != null) {
                                                                                    return new ActivityExerciseCapacityMainBinding((LinearLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityExerciseCapacityMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityExerciseCapacityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_exercise_capacity_main, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
