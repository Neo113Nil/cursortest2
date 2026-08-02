package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.sensors.SensorsData;

/* loaded from: classes.dex */
public final class fg implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ig f6917a;

    public fg(ig igVar) {
        this.f6917a = igVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i4) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f6917a.f7110k.getClass();
        SensorsData U4 = MetaData.E().U();
        if (U4 != null) {
            try {
                if (U4.h()) {
                    if (ig.a(this.f6917a, sensorEvent)) {
                        return;
                    }
                    ig igVar = this.f6917a;
                    if (igVar.f7101b < igVar.f7112m) {
                        c2 c2Var = igVar.f7104e;
                        if (c2Var != null && c2Var.f6740f != igVar.a()) {
                        }
                        ig.a(this.f6917a, sensorEvent, U4);
                        return;
                    }
                    ig igVar2 = this.f6917a;
                    igVar2.a(igVar2.f7101b >= igVar2.f7112m);
                    return;
                }
            } catch (Throwable th) {
                if (this.f6917a.a(1)) {
                    d9.a(th);
                    return;
                }
                return;
            }
        }
        this.f6917a.a(true);
    }
}
