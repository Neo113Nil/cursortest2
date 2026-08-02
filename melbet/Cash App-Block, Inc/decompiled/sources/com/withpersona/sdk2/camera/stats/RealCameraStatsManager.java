package com.withpersona.sdk2.camera.stats;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.miteksystems.misnap.controller.a.d;

/* loaded from: classes4.dex */
public final class RealCameraStatsManager {
    public double averageRotationPerMeasurement;
    public boolean isEventListenerRegistered;
    public long measurementsTaken;
    public final Sensor sensor;
    public final d.e sensorEventListener;
    public final SensorManager sensorManager;

    public RealCameraStatsManager(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        this.sensor = sensorManager.getDefaultSensor(4);
        this.sensorEventListener = new d.e(this, 1);
    }

    public final void startRecordingState() {
        if (this.isEventListenerRegistered) {
            return;
        }
        this.isEventListenerRegistered = true;
        this.measurementsTaken = 0L;
        this.averageRotationPerMeasurement = 0.0d;
        Sensor sensor = this.sensor;
        if (sensor != null) {
            this.sensorManager.registerListener(this.sensorEventListener, sensor, 100000);
        }
    }
}
