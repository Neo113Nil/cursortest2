package com.moyoung.dafit.module.common.utils;

/* loaded from: classes4.dex */
public class d0 {
    private static final int[] MENSTRUATION_PREGNANCY_PRECENT = {4, 2, 3, 4, 3, 2};
    private static final int[] FOLLICULAR_PREGNANCY_PRECENT = {12, 14, 17, 23, 20};
    private static final int[] OVULATION_PREGNANCY_PRECENT = {35, 48, 66, 74, 88, 90, 87, 72, 51, 43};
    private static final int[] LUTEAL_PREGNANCY_PRECENT = {35, 26, 22, 18, 14, 12, 8, 4, 2};

    private d0() {
    }

    public static int getFollicularPregnancyPrecent(int i8) {
        int[] iArr = FOLLICULAR_PREGNANCY_PRECENT;
        int length = iArr.length;
        return length <= i8 ? iArr[length - 1] : iArr[i8];
    }

    public static int getLutealPregnancyPrecent(int i8) {
        int[] iArr = LUTEAL_PREGNANCY_PRECENT;
        return iArr[i8 % iArr.length];
    }

    public static int getMenstruationPregnancyPrecent(int i8) {
        int[] iArr = MENSTRUATION_PREGNANCY_PRECENT;
        return iArr[i8 % iArr.length];
    }

    public static int getOvulationPregnancyPrecent(int i8) {
        int[] iArr = OVULATION_PREGNANCY_PRECENT;
        return iArr[i8 % iArr.length];
    }
}
