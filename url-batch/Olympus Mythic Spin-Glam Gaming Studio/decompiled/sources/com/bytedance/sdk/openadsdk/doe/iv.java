package com.bytedance.sdk.openadsdk.doe;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public class iv {
    public static WeakReference<zmn> zmn;
    protected static final float[] fs = new float[3];
    protected static final float[] zn = new float[3];
    protected static final float[] fb = new float[9];
    protected static final float[] btk = new float[3];

    public static void zmn(Context context, SensorEventListener sensorEventListener) {
    }

    public static void zmn(zmn zmnVar) {
        zmn = new WeakReference<>(zmnVar);
    }

    public static void zmn(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<zmn> weakReference = zmn;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            nps.zmn("SensorHub", "startListenAccelerometer error", th);
        }
    }

    public static void fs(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<zmn> weakReference = zmn;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            nps.zmn("SensorHub", "startListenGyroscope error", th);
        }
    }

    public static void zn(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<zmn> weakReference = zmn;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            nps.zmn("SensorHub", "startListenLinearAcceleration error", th);
        }
    }

    public static void fb(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<zmn> weakReference = zmn;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            nps.zmn("SensorHub", "startListenRotationVector err", th);
        }
    }

    public static void zmn(Context context, long j) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j);
    }
}
