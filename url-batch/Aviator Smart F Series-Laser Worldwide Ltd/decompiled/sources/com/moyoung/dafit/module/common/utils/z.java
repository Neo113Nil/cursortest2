package com.moyoung.dafit.module.common.utils;

/* loaded from: classes4.dex */
public class z {
    private static final int BADMINTON_MODE = 5;
    private static final int BASKETBALL_MODE = 6;
    private static final int BIKING_MODE = 3;
    private static final int FOOTBALL_MODE = 7;
    private static final int ROPE_SKIPPING_MODE = 4;
    private static final int RUN_MODE = 1;
    private static final int SWIM_MODE = 8;
    private static final int WALK_MODE = 2;

    private z() {
    }

    public static boolean hasBadmintonHeartRate(int i8) {
        return hasMovementMode(i8, 5);
    }

    public static boolean hasBasketballHeartRate(int i8) {
        return hasMovementMode(i8, 6);
    }

    public static boolean hasBikingHeartRate(int i8) {
        return hasMovementMode(i8, 3);
    }

    public static boolean hasFootballHeartRate(int i8) {
        return hasMovementMode(i8, 7);
    }

    public static boolean hasMovementHeartRate(int i8) {
        return i8 > 0;
    }

    private static boolean hasMovementMode(int i8, int i9) {
        String stringBuffer = new StringBuffer(Integer.toBinaryString(i8)).reverse().toString();
        return stringBuffer.length() > i9 && Integer.parseInt(String.valueOf(stringBuffer.charAt(i9))) > 0;
    }

    public static boolean hasRopeSkippingHeartRate(int i8) {
        return hasMovementMode(i8, 4);
    }

    public static boolean hasRunHeartRate(int i8) {
        return hasMovementMode(i8, 1);
    }

    public static boolean hasSwimHeartRate(int i8) {
        return hasMovementMode(i8, 8);
    }

    public static boolean hasWalkHeartRate(int i8) {
        return hasMovementMode(i8, 2);
    }
}
