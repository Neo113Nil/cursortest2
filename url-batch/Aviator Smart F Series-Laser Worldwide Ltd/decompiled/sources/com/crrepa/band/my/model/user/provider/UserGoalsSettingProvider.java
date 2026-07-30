package com.crrepa.band.my.model.user.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.moyoung.dafit.module.common.network.provider.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class UserGoalsSettingProvider {
    public static final int DEFAULT_GOAL_CALORIES = 300;
    public static final int DEFAULT_GOAL_STEPS = 10000;
    public static final int DEFAULT_GOAL_TRAINING_TIME = 30;
    public static final int GOAL_CALORIES_UNIT = 10;
    public static final int GOAL_STEPS_UNIT = 1000;
    public static final int GOAL_TRAINING_HOUR_UNIT = 1;
    public static final int GOAL_TRAINING_MINUTE_UNIT = 5;
    public static final int MAX_GOAL_CALORIES = 2000;
    public static final int MAX_GOAL_STEPS = 35000;
    public static final int MAX_GOAL_TRAINING_HOUR = 3;
    public static final int MAX_GOAL_TRAINING_MINUTE = 55;
    public static final int MIN_GOAL_CALORIES = 100;
    public static final int MIN_GOAL_STEPS = 2000;
    public static final int MIN_GOAL_TRAINING_HOUR = 0;
    public static final int MIN_GOAL_TRAINING_MINUTE = 0;
    public static final int START_GOAL_TRAINING_MINUTE = 10;

    public static void delete() {
        g.getInstance().remove(BaseParamNames.NEW_GOALS_SETTING);
    }

    public static int getGoalCaloriesPosition(int i8) {
        return (i8 - 100) / 10;
    }

    public static int getGoalSteps() {
        return g.getInstance().getInt(BaseParamNames.GOAL_STEPS, getRecommendSteps());
    }

    public static List<Integer> getGoalStepsList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 2000; i8 <= 35000; i8 += 1000) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static int getGoalStepsPosition(int i8) {
        return (i8 + ErrorCode.ERR_IO_EXCEPTION) / 1000;
    }

    public static int getGoalTrainingHourPosition(int i8) {
        return i8;
    }

    public static int getGoalTrainingMinutePosition(int i8, int i9) {
        int i10 = i8 == 0 ? (i9 - 10) / 5 : i8 == 3 ? 0 : i9 / 5;
        if (i10 < 0) {
            return 0;
        }
        return i10;
    }

    public static int getRecommendCalories() {
        return 300;
    }

    public static int getRecommendSteps() {
        return 10000;
    }

    public static int getRecommendTrainingTime() {
        return 30;
    }

    public static boolean isNewGoalsSetting() {
        return g.getInstance().getBoolean(BaseParamNames.NEW_GOALS_SETTING, false);
    }

    public static boolean isValidGoalCalories(int i8) {
        return 100 <= i8 && i8 <= 2000;
    }

    public static boolean isValidGoalDistance(int i8) {
        return 2000 <= i8 && i8 <= 35000;
    }

    public static boolean isValidGoalSteps(int i8) {
        return 2000 <= i8 && i8 <= 35000;
    }

    public static boolean isValidGoalTrainingTime(int i8) {
        return i8 <= 235;
    }

    public static void saveNewGoalsSetting(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.NEW_GOALS_SETTING, z7);
    }
}
