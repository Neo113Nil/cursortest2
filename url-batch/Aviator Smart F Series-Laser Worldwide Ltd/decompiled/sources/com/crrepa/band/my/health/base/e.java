package com.crrepa.band.my.health.base;

/* loaded from: classes2.dex */
public class e {
    private e() {
    }

    public static boolean startMeasureActiveHeartRate() {
        return com.crrepa.band.my.ble.band.cmd.d.getInstance().startMeasureHeartRate();
    }

    public static boolean startMeasureBo() {
        return com.crrepa.band.my.ble.band.cmd.d.getInstance().startMeasureBloodOxygen();
    }

    public static boolean startMeasureBp() {
        return com.crrepa.band.my.ble.band.cmd.d.getInstance().startMeasureBloodPressure();
    }

    public static boolean startMeasureOnceHeartRate() {
        return com.crrepa.band.my.ble.band.cmd.d.getInstance().startMeasureOnceHeartRate();
    }

    public static boolean stopMeasureActiveHeartRate() {
        return com.crrepa.band.my.ble.band.cmd.d.getInstance().stopMeasureHeartRate();
    }

    public static boolean stopMeasureBo() {
        return com.crrepa.band.my.ble.band.cmd.d.getInstance().stopMeasureBloodOxygen();
    }

    public static boolean stopMeasureBp() {
        return com.crrepa.band.my.ble.band.cmd.d.getInstance().stopMeasureBloodPressure();
    }

    public static boolean stopMeasureOnceHeartRate() {
        return com.crrepa.band.my.ble.band.cmd.d.getInstance().stopMeasureOnceHeartRate();
    }
}
