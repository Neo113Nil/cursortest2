package com.crrepa.band.my.model.user.provider;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class HeartRateWarningProvider {
    private static final int MAX_HR = 220;

    private HeartRateWarningProvider() {
    }

    public static List<Integer> getHeartRateWarningList() {
        int maxHr = getMaxHr();
        ArrayList arrayList = new ArrayList();
        for (int minHr = getMinHr(); minHr <= maxHr; minHr++) {
            arrayList.add(Integer.valueOf(minHr));
        }
        return arrayList;
    }

    public static int getHeartRateWarningPosition(int i8) {
        int minHr = getMinHr();
        int maxHr = getMaxHr();
        if (i8 < minHr) {
            return 0;
        }
        return maxHr < i8 ? maxHr - minHr : i8 - minHr;
    }

    public static int getMaxHr() {
        return MAX_HR;
    }

    public static int getMinHr() {
        return (int) (getWarningMaxHeartRate() * 0.85f);
    }

    public static int getWarningMaxHeartRate() {
        return getMaxHr() - UserAgeProvider.getUserAge();
    }
}
