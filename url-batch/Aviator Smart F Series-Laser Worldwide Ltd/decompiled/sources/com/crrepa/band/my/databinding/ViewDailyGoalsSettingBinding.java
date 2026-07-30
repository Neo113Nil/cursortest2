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
import com.crrepa.band.my.device.pillreminder.picker.MyNumberPicker;

/* loaded from: classes2.dex */
public final class ViewDailyGoalsSettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvCaloriesUnit;

    @NonNull
    public final TextView tvDailyCalories;

    @NonNull
    public final TextView tvDailyExercise;

    @NonNull
    public final TextView tvDailyStep;

    @NonNull
    public final TextView tvExerciseHourUnit;

    @NonNull
    public final TextView tvExerciseMinUnit;

    @NonNull
    public final TextView tvStepUnit;

    @NonNull
    public final MyNumberPicker wpDailyCalories;

    @NonNull
    public final MyNumberPicker wpDailySteps;

    @NonNull
    public final MyNumberPicker wpDailyTrainingHour;

    @NonNull
    public final MyNumberPicker wpDailyTrainingMin;

    private ViewDailyGoalsSettingBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull MyNumberPicker myNumberPicker, @NonNull MyNumberPicker myNumberPicker2, @NonNull MyNumberPicker myNumberPicker3, @NonNull MyNumberPicker myNumberPicker4) {
        this.rootView = linearLayout;
        this.tvCaloriesUnit = textView;
        this.tvDailyCalories = textView2;
        this.tvDailyExercise = textView3;
        this.tvDailyStep = textView4;
        this.tvExerciseHourUnit = textView5;
        this.tvExerciseMinUnit = textView6;
        this.tvStepUnit = textView7;
        this.wpDailyCalories = myNumberPicker;
        this.wpDailySteps = myNumberPicker2;
        this.wpDailyTrainingHour = myNumberPicker3;
        this.wpDailyTrainingMin = myNumberPicker4;
    }

    @NonNull
    public static ViewDailyGoalsSettingBinding bind(@NonNull View view) {
        int i8 = R.id.tv_calories_unit;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_calories_unit);
        if (textView != null) {
            i8 = R.id.tv_daily_calories;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_daily_calories);
            if (textView2 != null) {
                i8 = R.id.tv_daily_exercise;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_daily_exercise);
                if (textView3 != null) {
                    i8 = R.id.tv_daily_step;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_daily_step);
                    if (textView4 != null) {
                        i8 = R.id.tv_exercise_hour_unit;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_exercise_hour_unit);
                        if (textView5 != null) {
                            i8 = R.id.tv_exercise_min_unit;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_exercise_min_unit);
                            if (textView6 != null) {
                                i8 = R.id.tv_step_unit;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_step_unit);
                                if (textView7 != null) {
                                    i8 = R.id.wp_daily_calories;
                                    MyNumberPicker myNumberPicker = (MyNumberPicker) ViewBindings.findChildViewById(view, R.id.wp_daily_calories);
                                    if (myNumberPicker != null) {
                                        i8 = R.id.wp_daily_steps;
                                        MyNumberPicker myNumberPicker2 = (MyNumberPicker) ViewBindings.findChildViewById(view, R.id.wp_daily_steps);
                                        if (myNumberPicker2 != null) {
                                            i8 = R.id.wp_daily_training_hour;
                                            MyNumberPicker myNumberPicker3 = (MyNumberPicker) ViewBindings.findChildViewById(view, R.id.wp_daily_training_hour);
                                            if (myNumberPicker3 != null) {
                                                i8 = R.id.wp_daily_training_min;
                                                MyNumberPicker myNumberPicker4 = (MyNumberPicker) ViewBindings.findChildViewById(view, R.id.wp_daily_training_min);
                                                if (myNumberPicker4 != null) {
                                                    return new ViewDailyGoalsSettingBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, myNumberPicker, myNumberPicker2, myNumberPicker3, myNumberPicker4);
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
    public static ViewDailyGoalsSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewDailyGoalsSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_daily_goals_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
