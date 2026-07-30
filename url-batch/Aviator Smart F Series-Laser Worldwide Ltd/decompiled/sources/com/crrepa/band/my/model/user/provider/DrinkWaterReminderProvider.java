package com.crrepa.band.my.model.user.provider;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DrinkWaterReminderProvider {
    private static final int MAX_COUNT = 64;
    private static final int MAX_PERIOD = 240;
    private static final int MIN_COUNT = 1;
    public static final int PERIOD_UNIT = 15;

    private DrinkWaterReminderProvider() {
    }

    public static List<Integer> getDrinkWaterCountList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 <= 64; i8++) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static int getDrinkWaterCountPosition(int i8) {
        return i8 - 1;
    }

    public static List<Integer> getDrinkWaterPeriodList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 15; i8 <= 240; i8 += 15) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static int getDrinkWaterPeriodPosition(int i8) {
        if (i8 < 15) {
            i8 = 15;
        }
        if (240 < i8) {
            i8 = 240;
        }
        return (i8 / 15) - 1;
    }

    public static int getTodayGoalWaterIntake() {
        return (int) (UserWeightProvider.getUserWeightKg() * 32.6d);
    }
}
