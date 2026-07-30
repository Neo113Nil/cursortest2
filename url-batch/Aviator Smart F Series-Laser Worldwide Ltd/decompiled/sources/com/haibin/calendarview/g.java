package com.haibin.calendarview;

import android.content.Context;

/* loaded from: classes4.dex */
public final class g {
    private static String[] BRANCH_STR;
    private static String[] TRUNK_STR;

    public static int getBranchInt(int i8) {
        int i9 = i8 % 12;
        if (i9 == 0) {
            return 11;
        }
        return i9 - 1;
    }

    public static String getBranchString(int i8) {
        return BRANCH_STR[getBranchInt(i8)];
    }

    public static String getTrunkBranchYear(int i8) {
        return String.format("%s%s", getTrunkString(i8), getBranchString(i8));
    }

    public static int getTrunkInt(int i8) {
        int i9 = i8 % 10;
        if (i9 == 0) {
            return 9;
        }
        return i9 - 1;
    }

    public static String getTrunkString(int i8) {
        return TRUNK_STR[getTrunkInt(i8)];
    }

    public static void init(Context context) {
        if (TRUNK_STR != null) {
            return;
        }
        TRUNK_STR = context.getResources().getStringArray(R$array.trunk_string_array);
        BRANCH_STR = context.getResources().getStringArray(R$array.branch_string_array);
    }
}
