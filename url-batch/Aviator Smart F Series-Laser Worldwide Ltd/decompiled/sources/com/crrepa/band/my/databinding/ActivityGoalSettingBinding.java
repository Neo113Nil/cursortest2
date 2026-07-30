package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.kyleduo.switchbutton.SwitchButton;

/* loaded from: classes2.dex */
public final class ActivityGoalSettingBinding implements ViewBinding {

    @NonNull
    public final CheckBox cbFriday;

    @NonNull
    public final CheckBox cbMonday;

    @NonNull
    public final CheckBox cbSaturday;

    @NonNull
    public final CheckBox cbSunday;

    @NonNull
    public final CheckBox cbThursday;

    @NonNull
    public final CheckBox cbTuesday;

    @NonNull
    public final CheckBox cbWednesday;

    @NonNull
    public final LinearLayout llTrainingDays;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final SwitchButton sbtnTrainingDay;

    @NonNull
    public final BandDataAppbarBinding titleBar;

    @NonNull
    public final TextView tvDay;

    @NonNull
    public final TextView tvExerciseGoal;

    @NonNull
    public final ViewDailyGoalsSettingBinding viewDailyGoalsSetting;

    @NonNull
    public final ViewTrainingGoalsSettingBinding viewTrainingGoalsSetting;

    private ActivityGoalSettingBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull CheckBox checkBox3, @NonNull CheckBox checkBox4, @NonNull CheckBox checkBox5, @NonNull CheckBox checkBox6, @NonNull CheckBox checkBox7, @NonNull LinearLayout linearLayout, @NonNull SwitchButton switchButton, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ViewDailyGoalsSettingBinding viewDailyGoalsSettingBinding, @NonNull ViewTrainingGoalsSettingBinding viewTrainingGoalsSettingBinding) {
        this.rootView = coordinatorLayout;
        this.cbFriday = checkBox;
        this.cbMonday = checkBox2;
        this.cbSaturday = checkBox3;
        this.cbSunday = checkBox4;
        this.cbThursday = checkBox5;
        this.cbTuesday = checkBox6;
        this.cbWednesday = checkBox7;
        this.llTrainingDays = linearLayout;
        this.sbtnTrainingDay = switchButton;
        this.titleBar = bandDataAppbarBinding;
        this.tvDay = textView;
        this.tvExerciseGoal = textView2;
        this.viewDailyGoalsSetting = viewDailyGoalsSettingBinding;
        this.viewTrainingGoalsSetting = viewTrainingGoalsSettingBinding;
    }

    @NonNull
    public static ActivityGoalSettingBinding bind(@NonNull View view) {
        int i8 = R.id.cb_friday;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_friday);
        if (checkBox != null) {
            i8 = R.id.cb_monday;
            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_monday);
            if (checkBox2 != null) {
                i8 = R.id.cb_saturday;
                CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_saturday);
                if (checkBox3 != null) {
                    i8 = R.id.cb_sunday;
                    CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_sunday);
                    if (checkBox4 != null) {
                        i8 = R.id.cb_thursday;
                        CheckBox checkBox5 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_thursday);
                        if (checkBox5 != null) {
                            i8 = R.id.cb_tuesday;
                            CheckBox checkBox6 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_tuesday);
                            if (checkBox6 != null) {
                                i8 = R.id.cb_wednesday;
                                CheckBox checkBox7 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_wednesday);
                                if (checkBox7 != null) {
                                    i8 = R.id.ll_training_days;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_training_days);
                                    if (linearLayout != null) {
                                        i8 = R.id.sbtn_training_day;
                                        SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_training_day);
                                        if (switchButton != null) {
                                            i8 = R.id.title_bar;
                                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar);
                                            if (findChildViewById != null) {
                                                BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                                                i8 = R.id.tv_day;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_day);
                                                if (textView != null) {
                                                    i8 = R.id.tv_exercise_goal;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_exercise_goal);
                                                    if (textView2 != null) {
                                                        i8 = R.id.view_daily_goals_setting;
                                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.view_daily_goals_setting);
                                                        if (findChildViewById2 != null) {
                                                            ViewDailyGoalsSettingBinding bind2 = ViewDailyGoalsSettingBinding.bind(findChildViewById2);
                                                            i8 = R.id.view_training_goals_setting;
                                                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.view_training_goals_setting);
                                                            if (findChildViewById3 != null) {
                                                                return new ActivityGoalSettingBinding((CoordinatorLayout) view, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, linearLayout, switchButton, bind, textView, textView2, bind2, ViewTrainingGoalsSettingBinding.bind(findChildViewById3));
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
    public static ActivityGoalSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityGoalSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_goal_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
