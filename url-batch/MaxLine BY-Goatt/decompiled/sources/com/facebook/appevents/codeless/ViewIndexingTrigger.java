package com.facebook.appevents.codeless;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ViewIndexingTrigger implements SensorEventListener {
    public static final Companion Companion = new Companion(null);
    private static final double SHAKE_THRESHOLD_GRAVITY = 2.3d;
    private OnShakeListener onShakeListener;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface OnShakeListener {
        void onShake();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            sensor.getClass();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            sensorEvent.getClass();
            OnShakeListener onShakeListener = this.onShakeListener;
            if (onShakeListener != null) {
                float[] fArr = sensorEvent.values;
                double d = fArr[0] / 9.80665f;
                double d2 = fArr[1] / 9.80665f;
                double d3 = fArr[2] / 9.80665f;
                if (Math.sqrt((d3 * d3) + (d2 * d2) + (d * d)) > SHAKE_THRESHOLD_GRAVITY) {
                    onShakeListener.onShake();
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setOnShakeListener(OnShakeListener onShakeListener) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.onShakeListener = onShakeListener;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
