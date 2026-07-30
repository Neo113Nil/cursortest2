package com.crrepa.band.my.device.customkey.util;

import android.text.TextUtils;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.training.utils.q;
import com.crrepa.ble.conn.bean.CRPCustomKeyInfo;
import com.crrepa.ble.conn.type.CRPCustomKeyType;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c {
    public static final int DEFAULT_GOAL_CALORIES = 500;
    public static final int DEFAULT_GOAL_DISTANCE = 5;
    public static final int DEFAULT_GOAL_TIME = 90;
    public static final int GOAL_CALORIES_UNIT = 100;
    public static final int GOAL_DISTANCE_UNIT = 1;
    public static final int GOAL_TIME_UNIT = 10;
    public static final int MAX_GOAL_CALORIES = 1000;
    public static final int MAX_GOAL_DISTANCE = 10;
    public static final int MAX_GOAL_TIME = 180;
    public static final int MAX_RELAXATION_TIME = 15;
    public static final int MAX_TIME_HOUR = 23;
    public static final int MAX_TIME_MINUTE = 59;
    public static final int MAX_TIME_SECOND = 59;
    public static final int MIN_GOAL_CALORIES = 100;
    public static final int MIN_GOAL_DISTANCE = 1;
    public static final int MIN_GOAL_TIME = 10;
    public static final int MIN_RELAXATION_TIME = 1;
    public static final int MIN_TIME = 0;
    public static final int RELAXATION_TIME_UNIT = 1;
    public static final int TIME_UNIT = 1;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType;

        static {
            int[] iArr = new int[CRPCustomKeyType.values().length];
            $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType = iArr;
            try {
                iArr[CRPCustomKeyType.KEY_TRAINING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_HEARTRATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_BLOODPRESSURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_BLOODOXYGEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_HRV.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_CAMERA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_BREATHE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_STOPWATCH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_TIMER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_GAMER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static String addZeroStr(int i8) {
        if (i8 < 10) {
            return "0" + i8;
        }
        return "" + i8;
    }

    public static int getCustomKeyDrawable(CRPCustomKeyType cRPCustomKeyType) {
        switch (a.$SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[cRPCustomKeyType.ordinal()]) {
            case 1:
                return R$drawable.ic_action_steps;
            case 2:
                return R$drawable.ic_action_hr;
            case 3:
                return R$drawable.ic_action_bp;
            case 4:
                return R$drawable.ic_action_o2;
            case 5:
                return R$drawable.ic_action_stress;
            case 6:
                return R$drawable.ic_action_shutter;
            case 7:
                return R$drawable.ic_action_relaxation;
            case 8:
                return R$drawable.ic_action_timer;
            case 9:
                return R$drawable.ic_action_stopwatch;
            case 10:
                return R$drawable.ic_action_game;
            default:
                return R$drawable.ic_action_none;
        }
    }

    public static String getCustomKeyFeatureDescribe(CRPCustomKeyInfo cRPCustomKeyInfo) {
        byte goalType = cRPCustomKeyInfo.getGoalType();
        int goalValue = cRPCustomKeyInfo.getGoalValue();
        byte state = cRPCustomKeyInfo.getState();
        switch (a.$SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[cRPCustomKeyInfo.getKeyType().ordinal()]) {
            case 1:
                String trainingName = q.getTrainingName(d.get(), cRPCustomKeyInfo.getState());
                String lowerCase = TextUtils.isEmpty(trainingName) ? "" : trainingName.toLowerCase();
                return goalType == 3 ? d.get().getString(R.string.action_button_select_open_exercises_hint, lowerCase) : (u.isZH() || u.isJA()) ? d.get().getString(R.string.action_button_select_exercises_hint, getTrainingGoalStr(goalType, goalValue), lowerCase) : d.get().getString(R.string.action_button_select_exercises_hint, lowerCase, getTrainingGoalStr(goalType, goalValue));
            case 2:
                return d.get().getString(R.string.action_button_start_measure_hint, d.get().getString(R.string.action_button_heart_rate));
            case 3:
                return d.get().getString(R.string.action_button_start_measure_hint, d.get().getString(R.string.action_button_blood_pressure));
            case 4:
                return d.get().getString(R.string.action_button_start_measure_hint, d.get().getString(R.string.action_button_blood_oxygen));
            case 5:
                return d.get().getString(R.string.action_button_start_measure_hint, d.get().getString(R.string.action_button_pressure));
            case 6:
                if (state == 1) {
                    return d.get().getString(R.string.action_button_start_photo_hint);
                }
                return d.get().getString(R.string.action_button_open_page_hint, d.get().getString(R.string.action_button_shutter));
            case 7:
                String goalStr = getGoalStr(cRPCustomKeyInfo);
                return cRPCustomKeyInfo.getState() == 0 ? d.get().getString(R.string.action_button_start_breathing_exercise_hint, goalStr) : d.get().getString(R.string.action_button_start_falling_asleep_hint, goalStr);
            case 8:
                if (state == 0) {
                    return d.get().getString(R.string.action_button_open_page_hint, d.get().getString(R.string.action_button_timer));
                }
                if (goalType == 0 && goalValue == 0) {
                    return "";
                }
                if (goalType > 0 && goalValue == 0) {
                    return d.get().getString(R.string.action_button_start_timer_second_hint, ((int) goalType) + d.get().getString(R.string.h_unit));
                }
                if (goalType != 0 || goalValue <= 0) {
                    return d.get().getString(R.string.action_button_start_timer_hour_hint, ((int) goalType) + d.get().getString(R.string.h_unit), (goalValue / 60) + d.get().getString(R.string.m_unit), (goalValue % 60) + d.get().getString(R.string.second_unit));
                }
                int i8 = goalValue / 60;
                int i9 = goalValue % 60;
                if (i8 > 0 && i9 == 0) {
                    return d.get().getString(R.string.action_button_start_timer_second_hint, i8 + d.get().getString(R.string.m_unit));
                }
                if (i8 == 0 && i9 > 0) {
                    return d.get().getString(R.string.action_button_start_timer_second_hint, i9 + d.get().getString(R.string.second_unit));
                }
                return d.get().getString(R.string.action_button_start_timer_min_hint, i8 + d.get().getString(R.string.m_unit), i9 + d.get().getString(R.string.second_unit));
            case 9:
                if (state == 1) {
                    return d.get().getString(R.string.action_button_start_timing_hint);
                }
                return d.get().getString(R.string.action_button_open_page_hint, d.get().getString(R.string.action_button_stopwatch));
            case 10:
                return d.get().getString(R.string.action_button_start_game_hint, state == 0 ? "2048" : state == 1 ? d.get().getString(R.string.action_button_game_battleship) : state == 2 ? d.get().getString(R.string.action_button_game_hamster) : d.get().getString(R.string.action_button_game_floopy));
            default:
                return d.get().getString(R.string.action_button_none);
        }
    }

    public static String getCustomKeyFeatureTitle(CRPCustomKeyType cRPCustomKeyType) {
        switch (a.$SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[cRPCustomKeyType.ordinal()]) {
            case 1:
                return d.get().getString(R.string.action_button_exercise);
            case 2:
                return d.get().getString(R.string.action_button_heart_rate);
            case 3:
                return d.get().getString(R.string.action_button_blood_pressure);
            case 4:
                return d.get().getString(R.string.action_button_blood_oxygen);
            case 5:
                return d.get().getString(R.string.action_button_pressure);
            case 6:
                return d.get().getString(R.string.action_button_shutter);
            case 7:
                return d.get().getString(R.string.action_button_relaxation);
            case 8:
                return d.get().getString(R.string.action_button_timer);
            case 9:
                return d.get().getString(R.string.action_button_stopwatch);
            case 10:
                return d.get().getString(R.string.action_button_game);
            default:
                return d.get().getString(R.string.action_button_none);
        }
    }

    public static List<String> getGoalCaloriesList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 100; i8 <= 1000; i8 += 100) {
            arrayList.add(addZeroStr(i8));
        }
        return arrayList;
    }

    public static List<String> getGoalCaloriesUnitList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.get().getString(R.string.calorie_unit));
        return arrayList;
    }

    public static List<String> getGoalDistanceList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 <= 10; i8++) {
            arrayList.add(addZeroStr(i8));
        }
        return arrayList;
    }

    public static List<String> getGoalDistanceUnitList() {
        ArrayList arrayList = new ArrayList();
        if (BandUnitSystemProvider.isImperialSystem()) {
            arrayList.add(d.get().getString(R.string.distance_unit_miles));
        } else {
            arrayList.add(d.get().getString(R.string.distance_unit_km));
        }
        return arrayList;
    }

    public static String getGoalStr(CRPCustomKeyInfo cRPCustomKeyInfo) {
        CRPCustomKeyType keyType = cRPCustomKeyInfo.getKeyType();
        byte goalType = cRPCustomKeyInfo.getGoalType();
        int goalValue = cRPCustomKeyInfo.getGoalValue();
        cRPCustomKeyInfo.getState();
        if (keyType == CRPCustomKeyType.KEY_TRAINING) {
            return goalType == 3 ? "" : getTrainingGoalStr(goalType, goalValue);
        }
        if (keyType == CRPCustomKeyType.KEY_BREATHE) {
            if (goalType == 0) {
                return "";
            }
            return ((int) goalType) + d.get().getString(R.string.goal_minute_unit);
        }
        if (keyType != CRPCustomKeyType.KEY_STOPWATCH) {
            return "";
        }
        if (goalType == 0 && goalValue == 0) {
            return "";
        }
        if (goalType > 0 && goalValue == 0) {
            return ((int) goalType) + d.get().getString(R.string.hour_unit);
        }
        if (goalType != 0 || goalValue <= 0) {
            return (((int) goalType) + d.get().getString(R.string.hour_unit)) + ((goalValue / 60) + d.get().getString(R.string.minutes_unit)) + ((goalValue % 60) + d.get().getString(R.string.second_unit));
        }
        int i8 = goalValue / 60;
        int i9 = goalValue % 60;
        if (i8 > 0 && i9 == 0) {
            return i8 + d.get().getString(R.string.minutes_unit);
        }
        if (i8 == 0 && i9 > 0) {
            return i9 + d.get().getString(R.string.second_unit);
        }
        return (i8 + d.get().getString(R.string.minutes_unit)) + (i9 + d.get().getString(R.string.second_unit));
    }

    public static List<String> getGoalTimeList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 10; i8 <= 180; i8 += 10) {
            arrayList.add(addZeroStr(i8));
        }
        return arrayList;
    }

    public static List<String> getGoalTimeUnitList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.get().getString(R.string.Min_unit));
        return arrayList;
    }

    public static List<String> getGoalUnitList(CRPCustomKeyType cRPCustomKeyType, byte b8) {
        if (cRPCustomKeyType == CRPCustomKeyType.KEY_TRAINING) {
            if (b8 == 0) {
                return getGoalTimeUnitList();
            }
            if (b8 == 1) {
                return getGoalCaloriesUnitList();
            }
            if (b8 == 2) {
                return getGoalDistanceUnitList();
            }
        } else if (cRPCustomKeyType == CRPCustomKeyType.KEY_BREATHE) {
            return getGoalTimeUnitList();
        }
        return new ArrayList();
    }

    public static List<String> getGoalValueList(CRPCustomKeyType cRPCustomKeyType, byte b8) {
        if (cRPCustomKeyType == CRPCustomKeyType.KEY_TRAINING) {
            if (b8 == 0) {
                return getGoalTimeList();
            }
            if (b8 == 1) {
                return getGoalCaloriesList();
            }
            if (b8 == 2) {
                return getGoalDistanceList();
            }
        } else if (cRPCustomKeyType == CRPCustomKeyType.KEY_BREATHE) {
            return getRelaxationList();
        }
        return new ArrayList();
    }

    public static List<String> getRelaxationList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 <= 15; i8++) {
            arrayList.add(addZeroStr(i8));
        }
        return arrayList;
    }

    public static List<String> getTimerHourList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 <= 23; i8++) {
            arrayList.add(addZeroStr(i8));
        }
        return arrayList;
    }

    public static List<String> getTimerMinuteList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 <= 59; i8++) {
            arrayList.add(addZeroStr(i8));
        }
        return arrayList;
    }

    public static List<String> getTimerSecondList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 <= 59; i8++) {
            arrayList.add(addZeroStr(i8));
        }
        return arrayList;
    }

    public static String getTrainingGoalStr(byte b8, int i8) {
        if (b8 == 0) {
            return i8 + d.get().getString(R.string.goal_minute_unit);
        }
        if (b8 == 1) {
            return i8 + d.get().getString(R.string.calorie_unit);
        }
        if (b8 != 2) {
            return d.get().getString(R.string.open_title).toLowerCase();
        }
        if (BandUnitSystemProvider.isImperialSystem()) {
            return i8 + d.get().getString(R.string.distance_unit_miles);
        }
        return i8 + d.get().getString(R.string.distance_unit_km);
    }
}
