package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.muslim.view.SwitchButton;
import com.crrepa.band.my.device.pillreminder.picker.MyNumberPicker;

/* loaded from: classes2.dex */
public final class ActivityWaterSettingBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout llStartTime;

    @NonNull
    public final LinearLayout llWaterIntakeReminder;

    @NonNull
    public final MyNumberPicker mpIntervalTimeMins;

    @NonNull
    public final MyNumberPicker mpReminderTimes;

    @NonNull
    public final MyNumberPicker mpStartTimeHour;

    @NonNull
    public final MyNumberPicker mpStartTimeMinute;

    @NonNull
    public final MyNumberPicker mpStartTimeUnit;

    @NonNull
    public final RelativeLayout rlHandIntakeGoal;

    @NonNull
    public final RelativeLayout rlIntakeGoal;

    @NonNull
    public final RelativeLayout rlPromptTip;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SwitchButton sbtnWaterCalculation;

    @NonNull
    public final SwitchButton sbtnWaterIntakeReminder;

    @NonNull
    public final TextView tvAutoIntakeGoal;

    @NonNull
    public final TextView tvHandIntakeGoal;

    @NonNull
    public final TextView tvIntervalTimeUnit;

    @NonNull
    public final TextView tvPromptTip;

    @NonNull
    public final TextView tvReminderTimesUnit;

    @NonNull
    public final View viewAutoCalculationLine;

    @NonNull
    public final AppToolbarBinding waterSettingBar;

    private ActivityWaterSettingBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout2, @NonNull MyNumberPicker myNumberPicker, @NonNull MyNumberPicker myNumberPicker2, @NonNull MyNumberPicker myNumberPicker3, @NonNull MyNumberPicker myNumberPicker4, @NonNull MyNumberPicker myNumberPicker5, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull SwitchButton switchButton, @NonNull SwitchButton switchButton2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull View view, @NonNull AppToolbarBinding appToolbarBinding) {
        this.rootView = linearLayout;
        this.llStartTime = relativeLayout;
        this.llWaterIntakeReminder = linearLayout2;
        this.mpIntervalTimeMins = myNumberPicker;
        this.mpReminderTimes = myNumberPicker2;
        this.mpStartTimeHour = myNumberPicker3;
        this.mpStartTimeMinute = myNumberPicker4;
        this.mpStartTimeUnit = myNumberPicker5;
        this.rlHandIntakeGoal = relativeLayout2;
        this.rlIntakeGoal = relativeLayout3;
        this.rlPromptTip = relativeLayout4;
        this.sbtnWaterCalculation = switchButton;
        this.sbtnWaterIntakeReminder = switchButton2;
        this.tvAutoIntakeGoal = textView;
        this.tvHandIntakeGoal = textView2;
        this.tvIntervalTimeUnit = textView3;
        this.tvPromptTip = textView4;
        this.tvReminderTimesUnit = textView5;
        this.viewAutoCalculationLine = view;
        this.waterSettingBar = appToolbarBinding;
    }

    @NonNull
    public static ActivityWaterSettingBinding bind(@NonNull View view) {
        int i8 = R.id.ll_start_time;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_start_time);
        if (relativeLayout != null) {
            i8 = R.id.ll_water_intake_reminder;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_water_intake_reminder);
            if (linearLayout != null) {
                i8 = R.id.mp_interval_time_mins;
                MyNumberPicker myNumberPicker = (MyNumberPicker) ViewBindings.findChildViewById(view, R.id.mp_interval_time_mins);
                if (myNumberPicker != null) {
                    i8 = R.id.mp_reminder_times;
                    MyNumberPicker myNumberPicker2 = (MyNumberPicker) ViewBindings.findChildViewById(view, R.id.mp_reminder_times);
                    if (myNumberPicker2 != null) {
                        i8 = R.id.mp_start_time_hour;
                        MyNumberPicker myNumberPicker3 = (MyNumberPicker) ViewBindings.findChildViewById(view, R.id.mp_start_time_hour);
                        if (myNumberPicker3 != null) {
                            i8 = R.id.mp_start_time_minute;
                            MyNumberPicker myNumberPicker4 = (MyNumberPicker) ViewBindings.findChildViewById(view, R.id.mp_start_time_minute);
                            if (myNumberPicker4 != null) {
                                i8 = R.id.mp_start_time_unit;
                                MyNumberPicker myNumberPicker5 = (MyNumberPicker) ViewBindings.findChildViewById(view, R.id.mp_start_time_unit);
                                if (myNumberPicker5 != null) {
                                    i8 = R.id.rl_hand_intake_goal;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_hand_intake_goal);
                                    if (relativeLayout2 != null) {
                                        i8 = R.id.rl_intake_goal;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_intake_goal);
                                        if (relativeLayout3 != null) {
                                            i8 = R.id.rl_prompt_tip;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_prompt_tip);
                                            if (relativeLayout4 != null) {
                                                i8 = R.id.sbtn_water_calculation;
                                                SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_water_calculation);
                                                if (switchButton != null) {
                                                    i8 = R.id.sbtn_water_intake_reminder;
                                                    SwitchButton switchButton2 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_water_intake_reminder);
                                                    if (switchButton2 != null) {
                                                        i8 = R.id.tv_auto_intake_goal;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_auto_intake_goal);
                                                        if (textView != null) {
                                                            i8 = R.id.tv_hand_intake_goal;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_hand_intake_goal);
                                                            if (textView2 != null) {
                                                                i8 = R.id.tv_interval_time_unit;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_interval_time_unit);
                                                                if (textView3 != null) {
                                                                    i8 = R.id.tv_prompt_tip;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_prompt_tip);
                                                                    if (textView4 != null) {
                                                                        i8 = R.id.tv_reminder_times_unit;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reminder_times_unit);
                                                                        if (textView5 != null) {
                                                                            i8 = R.id.view_auto_calculation_line;
                                                                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.view_auto_calculation_line);
                                                                            if (findChildViewById != null) {
                                                                                i8 = R.id.water_setting_bar;
                                                                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.water_setting_bar);
                                                                                if (findChildViewById2 != null) {
                                                                                    return new ActivityWaterSettingBinding((LinearLayout) view, relativeLayout, linearLayout, myNumberPicker, myNumberPicker2, myNumberPicker3, myNumberPicker4, myNumberPicker5, relativeLayout2, relativeLayout3, relativeLayout4, switchButton, switchButton2, textView, textView2, textView3, textView4, textView5, findChildViewById, AppToolbarBinding.bind(findChildViewById2));
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
    public static ActivityWaterSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityWaterSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_water_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
