package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.kyleduo.switchbutton.SwitchButton;

/* loaded from: classes2.dex */
public final class ActivityBandOtherSettingBinding implements ViewBinding {

    @NonNull
    public final ContinueArrowBinding arrowDeviceLanguage;

    @NonNull
    public final ContinueArrowBinding arrowDisplayTime;

    @NonNull
    public final ContinueArrowBinding arrowDrinkWater;

    @NonNull
    public final ContinueArrowBinding arrowDrinkWaterCount;

    @NonNull
    public final ContinueArrowBinding arrowDrinkWaterPeriod;

    @NonNull
    public final ContinueArrowBinding arrowHandWashingCount;

    @NonNull
    public final ContinueArrowBinding arrowHandWashingPeriod;

    @NonNull
    public final ContinueArrowBinding arrowHandWashingStartTime;

    @NonNull
    public final ContinueArrowBinding arrowLastMenstrualDate;

    @NonNull
    public final ContinueArrowBinding arrowLocation;

    @NonNull
    public final ContinueArrowBinding arrowMaxHeartRate;

    @NonNull
    public final ContinueArrowBinding arrowMenstrualPeriod;

    @NonNull
    public final ContinueArrowBinding arrowPhysiologicalCycle;

    @NonNull
    public final ContinueArrowBinding arrowPhysiologicalCycleCalendar;

    @NonNull
    public final ContinueArrowBinding arrowReminderMode;

    @NonNull
    public final ContinueArrowBinding arrowReminderTime;

    @NonNull
    public final ContinueArrowBinding arrowWeatherTempSystem;

    @NonNull
    public final Button btnReset;

    @NonNull
    public final ContinueArrowBinding doNotDisturbArrow;

    @NonNull
    public final BandDataAppbarBinding includedTitle;

    @NonNull
    public final View lineDeviceSettingControl;

    @NonNull
    public final View lineDeviceSettingSceneMode;

    @NonNull
    public final View lineDrinkWaterRemind;

    @NonNull
    public final View lineHandWashingRemind;

    @NonNull
    public final View lineHeartRateWarning;

    @NonNull
    public final View linePhysiologicalPeriodRemind;

    @NonNull
    public final RelativeLayout llHeartRateWarning;

    @NonNull
    public final LinearLayout llPhysiologicalPeriodContent;

    @NonNull
    public final LinearLayout llQuickViewPeriod;

    @NonNull
    public final ContinueArrowBinding locationArrow;

    @NonNull
    public final NestedScrollView nsvContent;

    @NonNull
    public final ContinueArrowBinding quickResponseArrow;

    @NonNull
    public final RelativeLayout rlBatterySaving;

    @NonNull
    public final RelativeLayout rlConnectMediaAudio;

    @NonNull
    public final RelativeLayout rlDeviceLanguage;

    @NonNull
    public final RelativeLayout rlDisplayTime;

    @NonNull
    public final RelativeLayout rlDoNotDisturb;

    @NonNull
    public final RelativeLayout rlDrinkWaterCount;

    @NonNull
    public final RelativeLayout rlDrinkWaterPeriod;

    @NonNull
    public final RelativeLayout rlDrinkWaterRemind;

    @NonNull
    public final RelativeLayout rlDrinkWaterStartTime;

    @NonNull
    public final RelativeLayout rlHandWashingCount;

    @NonNull
    public final RelativeLayout rlHandWashingPeriod;

    @NonNull
    public final RelativeLayout rlHandWashingRemind;

    @NonNull
    public final RelativeLayout rlHandWashingStartTime;

    @NonNull
    public final RelativeLayout rlLastMenstrualDate;

    @NonNull
    public final RelativeLayout rlMaxHeartRate;

    @NonNull
    public final RelativeLayout rlMenstrualPeriod;

    @NonNull
    public final RelativeLayout rlMusicPlayer;

    @NonNull
    public final RelativeLayout rlPhysiologicalCycle;

    @NonNull
    public final RelativeLayout rlPhysiologicalCycleCalendar;

    @NonNull
    public final RelativeLayout rlPhysiologicalPeriodRemind;

    @NonNull
    public final RelativeLayout rlQuickResponse;

    @NonNull
    public final RelativeLayout rlReminderMode;

    @NonNull
    public final RelativeLayout rlReminderTime;

    @NonNull
    public final RelativeLayout rlSos;

    @NonNull
    public final RelativeLayout rlStressTimingMeasure;

    @NonNull
    public final RelativeLayout rlTapToWake;

    @NonNull
    public final RelativeLayout rlTempTimingMeasure;

    @NonNull
    public final RelativeLayout rlTimeSystem;

    @NonNull
    public final RelativeLayout rlTimingBloodOxygen;

    @NonNull
    public final RelativeLayout rlTimingHeartRate;

    @NonNull
    public final RelativeLayout rlUnitSystem;

    @NonNull
    public final RelativeLayout rlWeather;

    @NonNull
    public final RelativeLayout rlWeatherLocation;

    @NonNull
    public final RelativeLayout rlWeatherTempSystem;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final SwitchButton sbtnBatterySaving;

    @NonNull
    public final SwitchButton sbtnConnectMediaAudio;

    @NonNull
    public final SwitchButton sbtnDailyQuotes;

    @NonNull
    public final SwitchButton sbtnDrinkWater;

    @NonNull
    public final SwitchButton sbtnHandWashing;

    @NonNull
    public final SwitchButton sbtnHeartRateWarning;

    @NonNull
    public final SwitchButton sbtnMusicPlayer;

    @NonNull
    public final SwitchButton sbtnPhysiologicalPeriod;

    @NonNull
    public final SwitchButton sbtnQuickView;

    @NonNull
    public final SwitchButton sbtnReminderToMove;

    @NonNull
    public final SwitchButton sbtnStressTimingMeasure;

    @NonNull
    public final SwitchButton sbtnTapToWake;

    @NonNull
    public final SwitchButton sbtnTempTimingMeasure;

    @NonNull
    public final SwitchButton sbtnWeather;

    @NonNull
    public final ContinueArrowBinding timeSystemArrow;

    @NonNull
    public final ContinueArrowBinding timingBloodOxygenArrow;

    @NonNull
    public final ContinueArrowBinding timingHeartRateArrow;

    @NonNull
    public final TextView tvDeviceLanguage;

    @NonNull
    public final TextView tvDeviceSettingControl;

    @NonNull
    public final TextView tvDeviceSettingSceneMode;

    @NonNull
    public final TextView tvDisplayTime;

    @NonNull
    public final TextView tvDoNotDisturb;

    @NonNull
    public final TextView tvDoNotDisturbName;

    @NonNull
    public final TextView tvDrinkWaterCount;

    @NonNull
    public final TextView tvDrinkWaterPeriod;

    @NonNull
    public final TextView tvDrinkWaterStartTime;

    @NonNull
    public final TextView tvHandWashingCount;

    @NonNull
    public final TextView tvHandWashingPeriod;

    @NonNull
    public final TextView tvHandWashingStartTime;

    @NonNull
    public final TextView tvHeartRateWarningHint;

    @NonNull
    public final TextView tvLastMenstrualPeriodDate;

    @NonNull
    public final TextView tvLocation;

    @NonNull
    public final TextView tvMaxHeartRate;

    @NonNull
    public final TextView tvMenstrualPeriod;

    @NonNull
    public final TextView tvMusicPlayer;

    @NonNull
    public final TextView tvPhysiologicalCycle;

    @NonNull
    public final TextView tvQuickResponse;

    @NonNull
    public final TextView tvQuickResponseState;

    @NonNull
    public final TextView tvQuickViewHint;

    @NonNull
    public final TextView tvQuickViewPeriod;

    @NonNull
    public final TextView tvReminderTime;

    @NonNull
    public final TextView tvReminderToMove;

    @NonNull
    public final TextView tvTimeSystem;

    @NonNull
    public final TextView tvTimeSystemName;

    @NonNull
    public final TextView tvTimingBloodOxygen;

    @NonNull
    public final TextView tvTimingBloodOxygenMode;

    @NonNull
    public final TextView tvTimingHeartRateTime;

    @NonNull
    public final TextView tvUnitSystem;

    @NonNull
    public final TextView tvUnitSystemName;

    @NonNull
    public final TextView tvWeatherTempSystem;

    @NonNull
    public final TextView tvWeatherTitle;

    @NonNull
    public final ContinueArrowBinding unitSystemArrow;

    private ActivityBandOtherSettingBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ContinueArrowBinding continueArrowBinding, @NonNull ContinueArrowBinding continueArrowBinding2, @NonNull ContinueArrowBinding continueArrowBinding3, @NonNull ContinueArrowBinding continueArrowBinding4, @NonNull ContinueArrowBinding continueArrowBinding5, @NonNull ContinueArrowBinding continueArrowBinding6, @NonNull ContinueArrowBinding continueArrowBinding7, @NonNull ContinueArrowBinding continueArrowBinding8, @NonNull ContinueArrowBinding continueArrowBinding9, @NonNull ContinueArrowBinding continueArrowBinding10, @NonNull ContinueArrowBinding continueArrowBinding11, @NonNull ContinueArrowBinding continueArrowBinding12, @NonNull ContinueArrowBinding continueArrowBinding13, @NonNull ContinueArrowBinding continueArrowBinding14, @NonNull ContinueArrowBinding continueArrowBinding15, @NonNull ContinueArrowBinding continueArrowBinding16, @NonNull ContinueArrowBinding continueArrowBinding17, @NonNull Button button, @NonNull ContinueArrowBinding continueArrowBinding18, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull View view6, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ContinueArrowBinding continueArrowBinding19, @NonNull NestedScrollView nestedScrollView, @NonNull ContinueArrowBinding continueArrowBinding20, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull RelativeLayout relativeLayout6, @NonNull RelativeLayout relativeLayout7, @NonNull RelativeLayout relativeLayout8, @NonNull RelativeLayout relativeLayout9, @NonNull RelativeLayout relativeLayout10, @NonNull RelativeLayout relativeLayout11, @NonNull RelativeLayout relativeLayout12, @NonNull RelativeLayout relativeLayout13, @NonNull RelativeLayout relativeLayout14, @NonNull RelativeLayout relativeLayout15, @NonNull RelativeLayout relativeLayout16, @NonNull RelativeLayout relativeLayout17, @NonNull RelativeLayout relativeLayout18, @NonNull RelativeLayout relativeLayout19, @NonNull RelativeLayout relativeLayout20, @NonNull RelativeLayout relativeLayout21, @NonNull RelativeLayout relativeLayout22, @NonNull RelativeLayout relativeLayout23, @NonNull RelativeLayout relativeLayout24, @NonNull RelativeLayout relativeLayout25, @NonNull RelativeLayout relativeLayout26, @NonNull RelativeLayout relativeLayout27, @NonNull RelativeLayout relativeLayout28, @NonNull RelativeLayout relativeLayout29, @NonNull RelativeLayout relativeLayout30, @NonNull RelativeLayout relativeLayout31, @NonNull RelativeLayout relativeLayout32, @NonNull RelativeLayout relativeLayout33, @NonNull RelativeLayout relativeLayout34, @NonNull RelativeLayout relativeLayout35, @NonNull SwitchButton switchButton, @NonNull SwitchButton switchButton2, @NonNull SwitchButton switchButton3, @NonNull SwitchButton switchButton4, @NonNull SwitchButton switchButton5, @NonNull SwitchButton switchButton6, @NonNull SwitchButton switchButton7, @NonNull SwitchButton switchButton8, @NonNull SwitchButton switchButton9, @NonNull SwitchButton switchButton10, @NonNull SwitchButton switchButton11, @NonNull SwitchButton switchButton12, @NonNull SwitchButton switchButton13, @NonNull SwitchButton switchButton14, @NonNull ContinueArrowBinding continueArrowBinding21, @NonNull ContinueArrowBinding continueArrowBinding22, @NonNull ContinueArrowBinding continueArrowBinding23, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView15, @NonNull TextView textView16, @NonNull TextView textView17, @NonNull TextView textView18, @NonNull TextView textView19, @NonNull TextView textView20, @NonNull TextView textView21, @NonNull TextView textView22, @NonNull TextView textView23, @NonNull TextView textView24, @NonNull TextView textView25, @NonNull TextView textView26, @NonNull TextView textView27, @NonNull TextView textView28, @NonNull TextView textView29, @NonNull TextView textView30, @NonNull TextView textView31, @NonNull TextView textView32, @NonNull TextView textView33, @NonNull TextView textView34, @NonNull ContinueArrowBinding continueArrowBinding24) {
        this.rootView = coordinatorLayout;
        this.arrowDeviceLanguage = continueArrowBinding;
        this.arrowDisplayTime = continueArrowBinding2;
        this.arrowDrinkWater = continueArrowBinding3;
        this.arrowDrinkWaterCount = continueArrowBinding4;
        this.arrowDrinkWaterPeriod = continueArrowBinding5;
        this.arrowHandWashingCount = continueArrowBinding6;
        this.arrowHandWashingPeriod = continueArrowBinding7;
        this.arrowHandWashingStartTime = continueArrowBinding8;
        this.arrowLastMenstrualDate = continueArrowBinding9;
        this.arrowLocation = continueArrowBinding10;
        this.arrowMaxHeartRate = continueArrowBinding11;
        this.arrowMenstrualPeriod = continueArrowBinding12;
        this.arrowPhysiologicalCycle = continueArrowBinding13;
        this.arrowPhysiologicalCycleCalendar = continueArrowBinding14;
        this.arrowReminderMode = continueArrowBinding15;
        this.arrowReminderTime = continueArrowBinding16;
        this.arrowWeatherTempSystem = continueArrowBinding17;
        this.btnReset = button;
        this.doNotDisturbArrow = continueArrowBinding18;
        this.includedTitle = bandDataAppbarBinding;
        this.lineDeviceSettingControl = view;
        this.lineDeviceSettingSceneMode = view2;
        this.lineDrinkWaterRemind = view3;
        this.lineHandWashingRemind = view4;
        this.lineHeartRateWarning = view5;
        this.linePhysiologicalPeriodRemind = view6;
        this.llHeartRateWarning = relativeLayout;
        this.llPhysiologicalPeriodContent = linearLayout;
        this.llQuickViewPeriod = linearLayout2;
        this.locationArrow = continueArrowBinding19;
        this.nsvContent = nestedScrollView;
        this.quickResponseArrow = continueArrowBinding20;
        this.rlBatterySaving = relativeLayout2;
        this.rlConnectMediaAudio = relativeLayout3;
        this.rlDeviceLanguage = relativeLayout4;
        this.rlDisplayTime = relativeLayout5;
        this.rlDoNotDisturb = relativeLayout6;
        this.rlDrinkWaterCount = relativeLayout7;
        this.rlDrinkWaterPeriod = relativeLayout8;
        this.rlDrinkWaterRemind = relativeLayout9;
        this.rlDrinkWaterStartTime = relativeLayout10;
        this.rlHandWashingCount = relativeLayout11;
        this.rlHandWashingPeriod = relativeLayout12;
        this.rlHandWashingRemind = relativeLayout13;
        this.rlHandWashingStartTime = relativeLayout14;
        this.rlLastMenstrualDate = relativeLayout15;
        this.rlMaxHeartRate = relativeLayout16;
        this.rlMenstrualPeriod = relativeLayout17;
        this.rlMusicPlayer = relativeLayout18;
        this.rlPhysiologicalCycle = relativeLayout19;
        this.rlPhysiologicalCycleCalendar = relativeLayout20;
        this.rlPhysiologicalPeriodRemind = relativeLayout21;
        this.rlQuickResponse = relativeLayout22;
        this.rlReminderMode = relativeLayout23;
        this.rlReminderTime = relativeLayout24;
        this.rlSos = relativeLayout25;
        this.rlStressTimingMeasure = relativeLayout26;
        this.rlTapToWake = relativeLayout27;
        this.rlTempTimingMeasure = relativeLayout28;
        this.rlTimeSystem = relativeLayout29;
        this.rlTimingBloodOxygen = relativeLayout30;
        this.rlTimingHeartRate = relativeLayout31;
        this.rlUnitSystem = relativeLayout32;
        this.rlWeather = relativeLayout33;
        this.rlWeatherLocation = relativeLayout34;
        this.rlWeatherTempSystem = relativeLayout35;
        this.sbtnBatterySaving = switchButton;
        this.sbtnConnectMediaAudio = switchButton2;
        this.sbtnDailyQuotes = switchButton3;
        this.sbtnDrinkWater = switchButton4;
        this.sbtnHandWashing = switchButton5;
        this.sbtnHeartRateWarning = switchButton6;
        this.sbtnMusicPlayer = switchButton7;
        this.sbtnPhysiologicalPeriod = switchButton8;
        this.sbtnQuickView = switchButton9;
        this.sbtnReminderToMove = switchButton10;
        this.sbtnStressTimingMeasure = switchButton11;
        this.sbtnTapToWake = switchButton12;
        this.sbtnTempTimingMeasure = switchButton13;
        this.sbtnWeather = switchButton14;
        this.timeSystemArrow = continueArrowBinding21;
        this.timingBloodOxygenArrow = continueArrowBinding22;
        this.timingHeartRateArrow = continueArrowBinding23;
        this.tvDeviceLanguage = textView;
        this.tvDeviceSettingControl = textView2;
        this.tvDeviceSettingSceneMode = textView3;
        this.tvDisplayTime = textView4;
        this.tvDoNotDisturb = textView5;
        this.tvDoNotDisturbName = textView6;
        this.tvDrinkWaterCount = textView7;
        this.tvDrinkWaterPeriod = textView8;
        this.tvDrinkWaterStartTime = textView9;
        this.tvHandWashingCount = textView10;
        this.tvHandWashingPeriod = textView11;
        this.tvHandWashingStartTime = textView12;
        this.tvHeartRateWarningHint = textView13;
        this.tvLastMenstrualPeriodDate = textView14;
        this.tvLocation = textView15;
        this.tvMaxHeartRate = textView16;
        this.tvMenstrualPeriod = textView17;
        this.tvMusicPlayer = textView18;
        this.tvPhysiologicalCycle = textView19;
        this.tvQuickResponse = textView20;
        this.tvQuickResponseState = textView21;
        this.tvQuickViewHint = textView22;
        this.tvQuickViewPeriod = textView23;
        this.tvReminderTime = textView24;
        this.tvReminderToMove = textView25;
        this.tvTimeSystem = textView26;
        this.tvTimeSystemName = textView27;
        this.tvTimingBloodOxygen = textView28;
        this.tvTimingBloodOxygenMode = textView29;
        this.tvTimingHeartRateTime = textView30;
        this.tvUnitSystem = textView31;
        this.tvUnitSystemName = textView32;
        this.tvWeatherTempSystem = textView33;
        this.tvWeatherTitle = textView34;
        this.unitSystemArrow = continueArrowBinding24;
    }

    @NonNull
    public static ActivityBandOtherSettingBinding bind(@NonNull View view) {
        int i8 = R.id.arrow_device_language;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.arrow_device_language);
        if (findChildViewById != null) {
            ContinueArrowBinding bind = ContinueArrowBinding.bind(findChildViewById);
            i8 = R.id.arrow_display_time;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.arrow_display_time);
            if (findChildViewById2 != null) {
                ContinueArrowBinding bind2 = ContinueArrowBinding.bind(findChildViewById2);
                i8 = R.id.arrow_drink_water;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.arrow_drink_water);
                if (findChildViewById3 != null) {
                    ContinueArrowBinding bind3 = ContinueArrowBinding.bind(findChildViewById3);
                    i8 = R.id.arrow_drink_water_count;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.arrow_drink_water_count);
                    if (findChildViewById4 != null) {
                        ContinueArrowBinding bind4 = ContinueArrowBinding.bind(findChildViewById4);
                        i8 = R.id.arrow_drink_water_period;
                        View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.arrow_drink_water_period);
                        if (findChildViewById5 != null) {
                            ContinueArrowBinding bind5 = ContinueArrowBinding.bind(findChildViewById5);
                            i8 = R.id.arrow_hand_washing_count;
                            View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.arrow_hand_washing_count);
                            if (findChildViewById6 != null) {
                                ContinueArrowBinding bind6 = ContinueArrowBinding.bind(findChildViewById6);
                                i8 = R.id.arrow_hand_washing_period;
                                View findChildViewById7 = ViewBindings.findChildViewById(view, R.id.arrow_hand_washing_period);
                                if (findChildViewById7 != null) {
                                    ContinueArrowBinding bind7 = ContinueArrowBinding.bind(findChildViewById7);
                                    i8 = R.id.arrow_hand_washing_start_time;
                                    View findChildViewById8 = ViewBindings.findChildViewById(view, R.id.arrow_hand_washing_start_time);
                                    if (findChildViewById8 != null) {
                                        ContinueArrowBinding bind8 = ContinueArrowBinding.bind(findChildViewById8);
                                        i8 = R.id.arrow_last_menstrual_date;
                                        View findChildViewById9 = ViewBindings.findChildViewById(view, R.id.arrow_last_menstrual_date);
                                        if (findChildViewById9 != null) {
                                            ContinueArrowBinding bind9 = ContinueArrowBinding.bind(findChildViewById9);
                                            i8 = R.id.arrow_location;
                                            View findChildViewById10 = ViewBindings.findChildViewById(view, R.id.arrow_location);
                                            if (findChildViewById10 != null) {
                                                ContinueArrowBinding bind10 = ContinueArrowBinding.bind(findChildViewById10);
                                                i8 = R.id.arrow_max_heart_rate;
                                                View findChildViewById11 = ViewBindings.findChildViewById(view, R.id.arrow_max_heart_rate);
                                                if (findChildViewById11 != null) {
                                                    ContinueArrowBinding bind11 = ContinueArrowBinding.bind(findChildViewById11);
                                                    i8 = R.id.arrow_menstrual_period;
                                                    View findChildViewById12 = ViewBindings.findChildViewById(view, R.id.arrow_menstrual_period);
                                                    if (findChildViewById12 != null) {
                                                        ContinueArrowBinding bind12 = ContinueArrowBinding.bind(findChildViewById12);
                                                        i8 = R.id.arrow_physiological_cycle;
                                                        View findChildViewById13 = ViewBindings.findChildViewById(view, R.id.arrow_physiological_cycle);
                                                        if (findChildViewById13 != null) {
                                                            ContinueArrowBinding bind13 = ContinueArrowBinding.bind(findChildViewById13);
                                                            i8 = R.id.arrow_physiological_cycle_calendar;
                                                            View findChildViewById14 = ViewBindings.findChildViewById(view, R.id.arrow_physiological_cycle_calendar);
                                                            if (findChildViewById14 != null) {
                                                                ContinueArrowBinding bind14 = ContinueArrowBinding.bind(findChildViewById14);
                                                                i8 = R.id.arrow_reminder_mode;
                                                                View findChildViewById15 = ViewBindings.findChildViewById(view, R.id.arrow_reminder_mode);
                                                                if (findChildViewById15 != null) {
                                                                    ContinueArrowBinding bind15 = ContinueArrowBinding.bind(findChildViewById15);
                                                                    i8 = R.id.arrow_reminder_time;
                                                                    View findChildViewById16 = ViewBindings.findChildViewById(view, R.id.arrow_reminder_time);
                                                                    if (findChildViewById16 != null) {
                                                                        ContinueArrowBinding bind16 = ContinueArrowBinding.bind(findChildViewById16);
                                                                        i8 = R.id.arrow_weather_temp_system;
                                                                        View findChildViewById17 = ViewBindings.findChildViewById(view, R.id.arrow_weather_temp_system);
                                                                        if (findChildViewById17 != null) {
                                                                            ContinueArrowBinding bind17 = ContinueArrowBinding.bind(findChildViewById17);
                                                                            i8 = R.id.btn_reset;
                                                                            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_reset);
                                                                            if (button != null) {
                                                                                i8 = R.id.do_not_disturb_arrow;
                                                                                View findChildViewById18 = ViewBindings.findChildViewById(view, R.id.do_not_disturb_arrow);
                                                                                if (findChildViewById18 != null) {
                                                                                    ContinueArrowBinding bind18 = ContinueArrowBinding.bind(findChildViewById18);
                                                                                    i8 = R.id.included_title;
                                                                                    View findChildViewById19 = ViewBindings.findChildViewById(view, R.id.included_title);
                                                                                    if (findChildViewById19 != null) {
                                                                                        BandDataAppbarBinding bind19 = BandDataAppbarBinding.bind(findChildViewById19);
                                                                                        i8 = R.id.line_device_setting_control;
                                                                                        View findChildViewById20 = ViewBindings.findChildViewById(view, R.id.line_device_setting_control);
                                                                                        if (findChildViewById20 != null) {
                                                                                            i8 = R.id.line_device_setting_scene_mode;
                                                                                            View findChildViewById21 = ViewBindings.findChildViewById(view, R.id.line_device_setting_scene_mode);
                                                                                            if (findChildViewById21 != null) {
                                                                                                i8 = R.id.line_drink_water_remind;
                                                                                                View findChildViewById22 = ViewBindings.findChildViewById(view, R.id.line_drink_water_remind);
                                                                                                if (findChildViewById22 != null) {
                                                                                                    i8 = R.id.line_hand_washing_remind;
                                                                                                    View findChildViewById23 = ViewBindings.findChildViewById(view, R.id.line_hand_washing_remind);
                                                                                                    if (findChildViewById23 != null) {
                                                                                                        i8 = R.id.line_heart_rate_warning;
                                                                                                        View findChildViewById24 = ViewBindings.findChildViewById(view, R.id.line_heart_rate_warning);
                                                                                                        if (findChildViewById24 != null) {
                                                                                                            i8 = R.id.line_physiological_period_remind;
                                                                                                            View findChildViewById25 = ViewBindings.findChildViewById(view, R.id.line_physiological_period_remind);
                                                                                                            if (findChildViewById25 != null) {
                                                                                                                i8 = R.id.ll_heart_rate_warning;
                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_heart_rate_warning);
                                                                                                                if (relativeLayout != null) {
                                                                                                                    i8 = R.id.ll_physiological_period_content;
                                                                                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_physiological_period_content);
                                                                                                                    if (linearLayout != null) {
                                                                                                                        i8 = R.id.ll_quick_view_period;
                                                                                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_quick_view_period);
                                                                                                                        if (linearLayout2 != null) {
                                                                                                                            i8 = R.id.location_arrow;
                                                                                                                            View findChildViewById26 = ViewBindings.findChildViewById(view, R.id.location_arrow);
                                                                                                                            if (findChildViewById26 != null) {
                                                                                                                                ContinueArrowBinding bind20 = ContinueArrowBinding.bind(findChildViewById26);
                                                                                                                                i8 = R.id.nsv_content;
                                                                                                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.nsv_content);
                                                                                                                                if (nestedScrollView != null) {
                                                                                                                                    i8 = R.id.quick_response_arrow;
                                                                                                                                    View findChildViewById27 = ViewBindings.findChildViewById(view, R.id.quick_response_arrow);
                                                                                                                                    if (findChildViewById27 != null) {
                                                                                                                                        ContinueArrowBinding bind21 = ContinueArrowBinding.bind(findChildViewById27);
                                                                                                                                        i8 = R.id.rl_battery_saving;
                                                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_battery_saving);
                                                                                                                                        if (relativeLayout2 != null) {
                                                                                                                                            i8 = R.id.rl_connect_media_audio;
                                                                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_connect_media_audio);
                                                                                                                                            if (relativeLayout3 != null) {
                                                                                                                                                i8 = R.id.rl_device_language;
                                                                                                                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_device_language);
                                                                                                                                                if (relativeLayout4 != null) {
                                                                                                                                                    i8 = R.id.rl_display_time;
                                                                                                                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_display_time);
                                                                                                                                                    if (relativeLayout5 != null) {
                                                                                                                                                        i8 = R.id.rl_do_not_disturb;
                                                                                                                                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_do_not_disturb);
                                                                                                                                                        if (relativeLayout6 != null) {
                                                                                                                                                            i8 = R.id.rl_drink_water_count;
                                                                                                                                                            RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_drink_water_count);
                                                                                                                                                            if (relativeLayout7 != null) {
                                                                                                                                                                i8 = R.id.rl_drink_water_period;
                                                                                                                                                                RelativeLayout relativeLayout8 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_drink_water_period);
                                                                                                                                                                if (relativeLayout8 != null) {
                                                                                                                                                                    i8 = R.id.rl_drink_water_remind;
                                                                                                                                                                    RelativeLayout relativeLayout9 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_drink_water_remind);
                                                                                                                                                                    if (relativeLayout9 != null) {
                                                                                                                                                                        i8 = R.id.rl_drink_water_start_time;
                                                                                                                                                                        RelativeLayout relativeLayout10 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_drink_water_start_time);
                                                                                                                                                                        if (relativeLayout10 != null) {
                                                                                                                                                                            i8 = R.id.rl_hand_washing_count;
                                                                                                                                                                            RelativeLayout relativeLayout11 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_hand_washing_count);
                                                                                                                                                                            if (relativeLayout11 != null) {
                                                                                                                                                                                i8 = R.id.rl_hand_washing_period;
                                                                                                                                                                                RelativeLayout relativeLayout12 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_hand_washing_period);
                                                                                                                                                                                if (relativeLayout12 != null) {
                                                                                                                                                                                    i8 = R.id.rl_hand_washing_remind;
                                                                                                                                                                                    RelativeLayout relativeLayout13 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_hand_washing_remind);
                                                                                                                                                                                    if (relativeLayout13 != null) {
                                                                                                                                                                                        i8 = R.id.rl_hand_washing_start_time;
                                                                                                                                                                                        RelativeLayout relativeLayout14 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_hand_washing_start_time);
                                                                                                                                                                                        if (relativeLayout14 != null) {
                                                                                                                                                                                            i8 = R.id.rl_last_menstrual_date;
                                                                                                                                                                                            RelativeLayout relativeLayout15 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_last_menstrual_date);
                                                                                                                                                                                            if (relativeLayout15 != null) {
                                                                                                                                                                                                i8 = R.id.rl_max_heart_rate;
                                                                                                                                                                                                RelativeLayout relativeLayout16 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_max_heart_rate);
                                                                                                                                                                                                if (relativeLayout16 != null) {
                                                                                                                                                                                                    i8 = R.id.rl_menstrual_period;
                                                                                                                                                                                                    RelativeLayout relativeLayout17 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_menstrual_period);
                                                                                                                                                                                                    if (relativeLayout17 != null) {
                                                                                                                                                                                                        i8 = R.id.rl_music_player;
                                                                                                                                                                                                        RelativeLayout relativeLayout18 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_music_player);
                                                                                                                                                                                                        if (relativeLayout18 != null) {
                                                                                                                                                                                                            i8 = R.id.rl_physiological_cycle;
                                                                                                                                                                                                            RelativeLayout relativeLayout19 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_physiological_cycle);
                                                                                                                                                                                                            if (relativeLayout19 != null) {
                                                                                                                                                                                                                i8 = R.id.rl_physiological_cycle_calendar;
                                                                                                                                                                                                                RelativeLayout relativeLayout20 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_physiological_cycle_calendar);
                                                                                                                                                                                                                if (relativeLayout20 != null) {
                                                                                                                                                                                                                    i8 = R.id.rl_physiological_period_remind;
                                                                                                                                                                                                                    RelativeLayout relativeLayout21 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_physiological_period_remind);
                                                                                                                                                                                                                    if (relativeLayout21 != null) {
                                                                                                                                                                                                                        i8 = R.id.rl_quick_response;
                                                                                                                                                                                                                        RelativeLayout relativeLayout22 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_quick_response);
                                                                                                                                                                                                                        if (relativeLayout22 != null) {
                                                                                                                                                                                                                            i8 = R.id.rl_reminder_mode;
                                                                                                                                                                                                                            RelativeLayout relativeLayout23 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_reminder_mode);
                                                                                                                                                                                                                            if (relativeLayout23 != null) {
                                                                                                                                                                                                                                i8 = R.id.rl_reminder_time;
                                                                                                                                                                                                                                RelativeLayout relativeLayout24 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_reminder_time);
                                                                                                                                                                                                                                if (relativeLayout24 != null) {
                                                                                                                                                                                                                                    i8 = R.id.rl_sos;
                                                                                                                                                                                                                                    RelativeLayout relativeLayout25 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_sos);
                                                                                                                                                                                                                                    if (relativeLayout25 != null) {
                                                                                                                                                                                                                                        i8 = R.id.rl_stress_timing_measure;
                                                                                                                                                                                                                                        RelativeLayout relativeLayout26 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_stress_timing_measure);
                                                                                                                                                                                                                                        if (relativeLayout26 != null) {
                                                                                                                                                                                                                                            i8 = R.id.rl_tap_to_wake;
                                                                                                                                                                                                                                            RelativeLayout relativeLayout27 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_tap_to_wake);
                                                                                                                                                                                                                                            if (relativeLayout27 != null) {
                                                                                                                                                                                                                                                i8 = R.id.rl_temp_timing_measure;
                                                                                                                                                                                                                                                RelativeLayout relativeLayout28 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_temp_timing_measure);
                                                                                                                                                                                                                                                if (relativeLayout28 != null) {
                                                                                                                                                                                                                                                    i8 = R.id.rl_time_system;
                                                                                                                                                                                                                                                    RelativeLayout relativeLayout29 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_time_system);
                                                                                                                                                                                                                                                    if (relativeLayout29 != null) {
                                                                                                                                                                                                                                                        i8 = R.id.rl_timing_blood_oxygen;
                                                                                                                                                                                                                                                        RelativeLayout relativeLayout30 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_timing_blood_oxygen);
                                                                                                                                                                                                                                                        if (relativeLayout30 != null) {
                                                                                                                                                                                                                                                            i8 = R.id.rl_timing_heart_rate;
                                                                                                                                                                                                                                                            RelativeLayout relativeLayout31 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_timing_heart_rate);
                                                                                                                                                                                                                                                            if (relativeLayout31 != null) {
                                                                                                                                                                                                                                                                i8 = R.id.rl_unit_system;
                                                                                                                                                                                                                                                                RelativeLayout relativeLayout32 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_unit_system);
                                                                                                                                                                                                                                                                if (relativeLayout32 != null) {
                                                                                                                                                                                                                                                                    i8 = R.id.rl_weather;
                                                                                                                                                                                                                                                                    RelativeLayout relativeLayout33 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_weather);
                                                                                                                                                                                                                                                                    if (relativeLayout33 != null) {
                                                                                                                                                                                                                                                                        i8 = R.id.rl_weather_location;
                                                                                                                                                                                                                                                                        RelativeLayout relativeLayout34 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_weather_location);
                                                                                                                                                                                                                                                                        if (relativeLayout34 != null) {
                                                                                                                                                                                                                                                                            i8 = R.id.rl_weather_temp_system;
                                                                                                                                                                                                                                                                            RelativeLayout relativeLayout35 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_weather_temp_system);
                                                                                                                                                                                                                                                                            if (relativeLayout35 != null) {
                                                                                                                                                                                                                                                                                i8 = R.id.sbtn_battery_saving;
                                                                                                                                                                                                                                                                                SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_battery_saving);
                                                                                                                                                                                                                                                                                if (switchButton != null) {
                                                                                                                                                                                                                                                                                    i8 = R.id.sbtn_connect_media_audio;
                                                                                                                                                                                                                                                                                    SwitchButton switchButton2 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_connect_media_audio);
                                                                                                                                                                                                                                                                                    if (switchButton2 != null) {
                                                                                                                                                                                                                                                                                        i8 = R.id.sbtn_daily_quotes;
                                                                                                                                                                                                                                                                                        SwitchButton switchButton3 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_daily_quotes);
                                                                                                                                                                                                                                                                                        if (switchButton3 != null) {
                                                                                                                                                                                                                                                                                            i8 = R.id.sbtn_drink_water;
                                                                                                                                                                                                                                                                                            SwitchButton switchButton4 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_drink_water);
                                                                                                                                                                                                                                                                                            if (switchButton4 != null) {
                                                                                                                                                                                                                                                                                                i8 = R.id.sbtn_hand_washing;
                                                                                                                                                                                                                                                                                                SwitchButton switchButton5 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_hand_washing);
                                                                                                                                                                                                                                                                                                if (switchButton5 != null) {
                                                                                                                                                                                                                                                                                                    i8 = R.id.sbtn_heart_rate_warning;
                                                                                                                                                                                                                                                                                                    SwitchButton switchButton6 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_heart_rate_warning);
                                                                                                                                                                                                                                                                                                    if (switchButton6 != null) {
                                                                                                                                                                                                                                                                                                        i8 = R.id.sbtn_music_player;
                                                                                                                                                                                                                                                                                                        SwitchButton switchButton7 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_music_player);
                                                                                                                                                                                                                                                                                                        if (switchButton7 != null) {
                                                                                                                                                                                                                                                                                                            i8 = R.id.sbtn_physiological_period;
                                                                                                                                                                                                                                                                                                            SwitchButton switchButton8 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_physiological_period);
                                                                                                                                                                                                                                                                                                            if (switchButton8 != null) {
                                                                                                                                                                                                                                                                                                                i8 = R.id.sbtn_quick_view;
                                                                                                                                                                                                                                                                                                                SwitchButton switchButton9 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_quick_view);
                                                                                                                                                                                                                                                                                                                if (switchButton9 != null) {
                                                                                                                                                                                                                                                                                                                    i8 = R.id.sbtn_reminder_to_move;
                                                                                                                                                                                                                                                                                                                    SwitchButton switchButton10 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_reminder_to_move);
                                                                                                                                                                                                                                                                                                                    if (switchButton10 != null) {
                                                                                                                                                                                                                                                                                                                        i8 = R.id.sbtn_stress_timing_measure;
                                                                                                                                                                                                                                                                                                                        SwitchButton switchButton11 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_stress_timing_measure);
                                                                                                                                                                                                                                                                                                                        if (switchButton11 != null) {
                                                                                                                                                                                                                                                                                                                            i8 = R.id.sbtn_tap_to_wake;
                                                                                                                                                                                                                                                                                                                            SwitchButton switchButton12 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_tap_to_wake);
                                                                                                                                                                                                                                                                                                                            if (switchButton12 != null) {
                                                                                                                                                                                                                                                                                                                                i8 = R.id.sbtn_temp_timing_measure;
                                                                                                                                                                                                                                                                                                                                SwitchButton switchButton13 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_temp_timing_measure);
                                                                                                                                                                                                                                                                                                                                if (switchButton13 != null) {
                                                                                                                                                                                                                                                                                                                                    i8 = R.id.sbtn_weather;
                                                                                                                                                                                                                                                                                                                                    SwitchButton switchButton14 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_weather);
                                                                                                                                                                                                                                                                                                                                    if (switchButton14 != null) {
                                                                                                                                                                                                                                                                                                                                        i8 = R.id.time_system_arrow;
                                                                                                                                                                                                                                                                                                                                        View findChildViewById28 = ViewBindings.findChildViewById(view, R.id.time_system_arrow);
                                                                                                                                                                                                                                                                                                                                        if (findChildViewById28 != null) {
                                                                                                                                                                                                                                                                                                                                            ContinueArrowBinding bind22 = ContinueArrowBinding.bind(findChildViewById28);
                                                                                                                                                                                                                                                                                                                                            i8 = R.id.timing_blood_oxygen_arrow;
                                                                                                                                                                                                                                                                                                                                            View findChildViewById29 = ViewBindings.findChildViewById(view, R.id.timing_blood_oxygen_arrow);
                                                                                                                                                                                                                                                                                                                                            if (findChildViewById29 != null) {
                                                                                                                                                                                                                                                                                                                                                ContinueArrowBinding bind23 = ContinueArrowBinding.bind(findChildViewById29);
                                                                                                                                                                                                                                                                                                                                                i8 = R.id.timing_heart_rate_arrow;
                                                                                                                                                                                                                                                                                                                                                View findChildViewById30 = ViewBindings.findChildViewById(view, R.id.timing_heart_rate_arrow);
                                                                                                                                                                                                                                                                                                                                                if (findChildViewById30 != null) {
                                                                                                                                                                                                                                                                                                                                                    ContinueArrowBinding bind24 = ContinueArrowBinding.bind(findChildViewById30);
                                                                                                                                                                                                                                                                                                                                                    i8 = R.id.tv_device_language;
                                                                                                                                                                                                                                                                                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_device_language);
                                                                                                                                                                                                                                                                                                                                                    if (textView != null) {
                                                                                                                                                                                                                                                                                                                                                        i8 = R.id.tv_device_setting_control;
                                                                                                                                                                                                                                                                                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_device_setting_control);
                                                                                                                                                                                                                                                                                                                                                        if (textView2 != null) {
                                                                                                                                                                                                                                                                                                                                                            i8 = R.id.tv_device_setting_scene_mode;
                                                                                                                                                                                                                                                                                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_device_setting_scene_mode);
                                                                                                                                                                                                                                                                                                                                                            if (textView3 != null) {
                                                                                                                                                                                                                                                                                                                                                                i8 = R.id.tv_display_time;
                                                                                                                                                                                                                                                                                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_display_time);
                                                                                                                                                                                                                                                                                                                                                                if (textView4 != null) {
                                                                                                                                                                                                                                                                                                                                                                    i8 = R.id.tv_do_not_disturb;
                                                                                                                                                                                                                                                                                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_do_not_disturb);
                                                                                                                                                                                                                                                                                                                                                                    if (textView5 != null) {
                                                                                                                                                                                                                                                                                                                                                                        i8 = R.id.tv_do_not_disturb_name;
                                                                                                                                                                                                                                                                                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_do_not_disturb_name);
                                                                                                                                                                                                                                                                                                                                                                        if (textView6 != null) {
                                                                                                                                                                                                                                                                                                                                                                            i8 = R.id.tv_drink_water_count;
                                                                                                                                                                                                                                                                                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_drink_water_count);
                                                                                                                                                                                                                                                                                                                                                                            if (textView7 != null) {
                                                                                                                                                                                                                                                                                                                                                                                i8 = R.id.tv_drink_water_period;
                                                                                                                                                                                                                                                                                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_drink_water_period);
                                                                                                                                                                                                                                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                                                                                                                                                                                                                                    i8 = R.id.tv_drink_water_start_time;
                                                                                                                                                                                                                                                                                                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_drink_water_start_time);
                                                                                                                                                                                                                                                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                                                                                                                                                                                                                                                        i8 = R.id.tv_hand_washing_count;
                                                                                                                                                                                                                                                                                                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_hand_washing_count);
                                                                                                                                                                                                                                                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                                                                                                                                                                                                                                                            i8 = R.id.tv_hand_washing_period;
                                                                                                                                                                                                                                                                                                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_hand_washing_period);
                                                                                                                                                                                                                                                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                i8 = R.id.tv_hand_washing_start_time;
                                                                                                                                                                                                                                                                                                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_hand_washing_start_time);
                                                                                                                                                                                                                                                                                                                                                                                                if (textView12 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                    i8 = R.id.tv_heart_rate_warning_hint;
                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_heart_rate_warning_hint);
                                                                                                                                                                                                                                                                                                                                                                                                    if (textView13 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                        i8 = R.id.tv_last_menstrual_period_date;
                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_menstrual_period_date);
                                                                                                                                                                                                                                                                                                                                                                                                        if (textView14 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                            i8 = R.id.tv_location;
                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_location);
                                                                                                                                                                                                                                                                                                                                                                                                            if (textView15 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                i8 = R.id.tv_max_heart_rate;
                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_max_heart_rate);
                                                                                                                                                                                                                                                                                                                                                                                                                if (textView16 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                    i8 = R.id.tv_menstrual_period;
                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_menstrual_period);
                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView17 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                        i8 = R.id.tv_music_player;
                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_music_player);
                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView18 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                            i8 = R.id.tv_physiological_cycle;
                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_physiological_cycle);
                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView19 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                i8 = R.id.tv_quick_response;
                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_quick_response);
                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView20 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                    i8 = R.id.tv_quick_response_state;
                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_quick_response_state);
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView21 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                        i8 = R.id.tv_quick_view_hint;
                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_quick_view_hint);
                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView22 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                            i8 = R.id.tv_quick_view_period;
                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_quick_view_period);
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView23 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                i8 = R.id.tv_reminder_time;
                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView24 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reminder_time);
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView24 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    i8 = R.id.tv_reminder_to_move;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView25 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reminder_to_move);
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView25 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        i8 = R.id.tv_time_system;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView26 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_system);
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView26 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            i8 = R.id.tv_time_system_name;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView27 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_system_name);
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView27 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                i8 = R.id.tv_timing_blood_oxygen;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView28 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_timing_blood_oxygen);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView28 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i8 = R.id.tv_timing_blood_oxygen_mode;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView29 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_timing_blood_oxygen_mode);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView29 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i8 = R.id.tv_timing_heart_rate_time;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView30 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_timing_heart_rate_time);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView30 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i8 = R.id.tv_unit_system;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView31 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_unit_system);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView31 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i8 = R.id.tv_unit_system_name;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView32 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_unit_system_name);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView32 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i8 = R.id.tv_weather_temp_system;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView33 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weather_temp_system);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView33 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i8 = R.id.tv_weather_title;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView34 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weather_title);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView34 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i8 = R.id.unit_system_arrow;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            View findChildViewById31 = ViewBindings.findChildViewById(view, R.id.unit_system_arrow);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (findChildViewById31 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                return new ActivityBandOtherSettingBinding((CoordinatorLayout) view, bind, bind2, bind3, bind4, bind5, bind6, bind7, bind8, bind9, bind10, bind11, bind12, bind13, bind14, bind15, bind16, bind17, button, bind18, bind19, findChildViewById20, findChildViewById21, findChildViewById22, findChildViewById23, findChildViewById24, findChildViewById25, relativeLayout, linearLayout, linearLayout2, bind20, nestedScrollView, bind21, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, relativeLayout7, relativeLayout8, relativeLayout9, relativeLayout10, relativeLayout11, relativeLayout12, relativeLayout13, relativeLayout14, relativeLayout15, relativeLayout16, relativeLayout17, relativeLayout18, relativeLayout19, relativeLayout20, relativeLayout21, relativeLayout22, relativeLayout23, relativeLayout24, relativeLayout25, relativeLayout26, relativeLayout27, relativeLayout28, relativeLayout29, relativeLayout30, relativeLayout31, relativeLayout32, relativeLayout33, relativeLayout34, relativeLayout35, switchButton, switchButton2, switchButton3, switchButton4, switchButton5, switchButton6, switchButton7, switchButton8, switchButton9, switchButton10, switchButton11, switchButton12, switchButton13, switchButton14, bind22, bind23, bind24, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34, ContinueArrowBinding.bind(findChildViewById31));
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityBandOtherSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityBandOtherSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_band_other_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
