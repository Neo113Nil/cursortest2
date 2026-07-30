package com.crrepa.band.my.model.user.provider;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class HandWashingReminderProvider {
    private static final int MAX_COUNT = 24;
    private static final int MAX_PERIOD = 4;
    private static final int MIN_COUNT = 1;
    private static final int MIN_PERIOD = 1;
    private static final int PERIOD_UNIT = 1;

    private HandWashingReminderProvider() {
    }

    public static List<Integer> getHandWashingCountList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 <= 24; i8++) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static int getHandWashingCountPosition(int i8) {
        return i8 - 1;
    }

    public static List<Integer> getHandWashingPeriodList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 <= 4; i8++) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static int getHandWashingPeriodPosition(int i8) {
        int indexOf = getHandWashingPeriodList().indexOf(Integer.valueOf(i8 / 60));
        if (indexOf == -1) {
            return 1;
        }
        return indexOf;
    }
}
