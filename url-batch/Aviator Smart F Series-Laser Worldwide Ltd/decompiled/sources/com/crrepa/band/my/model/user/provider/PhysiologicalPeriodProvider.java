package com.crrepa.band.my.model.user.provider;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PhysiologicalPeriodProvider {
    public static final int DEFAULT_MENSTRUAL_PERIOD = 5;
    public static final int DEFAULT_PHYSIOLOGICAL_PERIOD = 28;
    private static final int MAX_MENSTRUAL_PERIOD = 15;
    private static final int MAX_PHYSIOLOGICAL_CYCLE = 180;
    private static final int MIN_MENSTRUAL_PERIOD = 1;
    private static final int MIN_PHYSIOLOGICAL_CYCLE = 15;

    private PhysiologicalPeriodProvider() {
    }

    @NonNull
    private static List<Integer> buildList(int i8, int i9) {
        ArrayList arrayList = new ArrayList();
        while (i8 <= i9) {
            arrayList.add(Integer.valueOf(i8));
            i8++;
        }
        return arrayList;
    }

    public static List<Integer> getMenstrualPeriodList() {
        return buildList(1, 15);
    }

    public static int getMenstrualPeriodSelectedPosition(int i8) {
        return getSelectedPosition(i8, 1, 15);
    }

    public static List<Integer> getPhysiologicalCycleList() {
        return buildList(15, 180);
    }

    public static int getPhysiologicalCycleSelectedPosition(int i8) {
        return getSelectedPosition(i8, 15, 180);
    }

    private static int getSelectedPosition(int i8, int i9, int i10) {
        int i11 = i8 - i9;
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = i10 - i9;
        return i12 < i11 ? i12 : i11;
    }
}
