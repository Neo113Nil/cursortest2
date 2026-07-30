package com.crrepa.band.my.device.watchfacenew.photo.utils;

/* loaded from: classes2.dex */
public class a {
    private static final int NO_DOUBLE_CLICK_TIME = 500;
    private static long mFirstClickTime = 0;
    public static int mId = -1;

    public static boolean checkDoubleClick(int i8) {
        long currentTimeMillis = System.currentTimeMillis();
        int i9 = mId;
        if (i9 == -1 || i9 != i8) {
            mId = i8;
            mFirstClickTime = currentTimeMillis;
            return true;
        }
        if (currentTimeMillis - mFirstClickTime <= 500) {
            return false;
        }
        mFirstClickTime = currentTimeMillis;
        return true;
    }

    public static boolean checkDoubleClick(int i8, int i9) {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = mId;
        if (i10 == -1 || i10 != i8) {
            mId = i8;
            mFirstClickTime = currentTimeMillis;
            return true;
        }
        if (currentTimeMillis - mFirstClickTime <= i9) {
            return false;
        }
        mFirstClickTime = currentTimeMillis;
        return true;
    }
}
