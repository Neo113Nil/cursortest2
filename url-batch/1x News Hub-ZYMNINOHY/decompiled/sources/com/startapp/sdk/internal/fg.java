package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.sensors.SensorsData;

/* loaded from: classes.dex */
public final class fg implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ig f3799a;

    public fg(ig igVar) {
        this.f3799a = igVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f3799a.f3983k.getClass();
        SensorsData U2 = MetaData.E().U();
        if (U2 != null) {
            try {
                if (U2.h()) {
                    if (ig.a(this.f3799a, sensorEvent)) {
                        return;
                    }
                    ig igVar = this.f3799a;
                    if (igVar.f3975b < igVar.f3985m) {
                        c2 c2Var = igVar.f3978e;
                        if (c2Var != null && c2Var.f != igVar.a()) {
                        }
                        ig.a(this.f3799a, sensorEvent, U2);
                        return;
                    }
                    ig igVar2 = this.f3799a;
                    igVar2.a(igVar2.f3975b >= igVar2.f3985m);
                    return;
                }
            } catch (Throwable th) {
                if (this.f3799a.a(1)) {
                    d9.a(th);
                    return;
                }
                return;
            }
        }
        this.f3799a.a(true);
    }
}
