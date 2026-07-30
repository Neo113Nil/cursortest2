package com.baidu.ar.imu;

import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.baidu.ar.k7;

/* loaded from: classes.dex */
public class b extends k7 {

    /* renamed from: w, reason: collision with root package name */
    public float[] f2516w;

    /* renamed from: x, reason: collision with root package name */
    public float[] f2517x;

    public b(SensorManager sensorManager) {
        super(sensorManager);
        this.f3398d.add(sensorManager.getDefaultSensor(9));
        this.f3398d.add(sensorManager.getDefaultSensor(4));
        this.f3398d.add(sensorManager.getDefaultSensor(11));
    }

    @Override // com.baidu.ar.k7, android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent.sensor.getType() == 11 || sensorEvent.sensor.getType() == 4) {
            super.onSensorChanged(sensorEvent);
        } else if (sensorEvent.sensor.getType() == 2) {
            this.f2516w = (float[]) sensorEvent.values.clone();
        } else if (sensorEvent.sensor.getType() == 9) {
            float[] fArr2 = (float[]) sensorEvent.values.clone();
            this.f2517x = fArr2;
            this.f3406l = fArr2;
        }
        float[] fArr3 = this.f2516w;
        if (fArr3 == null || (fArr = this.f2517x) == null) {
            return;
        }
        SensorManager.getRotationMatrix(this.f3399e.matrix, new float[16], fArr, fArr3);
        this.f3400f.setRowMajor(this.f3399e.matrix);
    }
}
