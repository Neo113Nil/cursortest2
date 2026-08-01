package com.bytedance.sdk.openadsdk.kj;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;

/* compiled from: SensorHub.java */
/* loaded from: classes2.dex */
public class Wyp {
    public static pvs pvs;
    protected static final float[] icD = new float[3];
    protected static final float[] vG = new float[3];
    protected static final float[] Jd = new float[9];
    protected static final float[] NB = new float[3];

    public static void Jd(Context context, SensorEventListener sensorEventListener, int i) {
    }

    public static void icD(Context context, SensorEventListener sensorEventListener, int i) {
    }

    public static void pvs(Context context, SensorEventListener sensorEventListener) {
    }

    public static void pvs(Context context, SensorEventListener sensorEventListener, int i) {
    }

    public static void vG(Context context, SensorEventListener sensorEventListener, int i) {
    }

    public static void pvs(pvs pvsVar) {
        pvs = pvsVar;
    }

    public static void pvs(Context context, long j) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j);
    }
}
