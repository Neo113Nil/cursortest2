package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.sensors.SensorsData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class of implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rf f367a;

    public of(rf rfVar) {
        this.f367a = rfVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f367a.k.getClass();
        SensorsData P = MetaData.A().P();
        if (P != null) {
            try {
                if (P.h()) {
                    if (rf.a(this.f367a, sensorEvent)) {
                        return;
                    }
                    rf rfVar = this.f367a;
                    if (rfVar.b < rfVar.m) {
                        w1 w1Var = rfVar.e;
                        if (w1Var != null && w1Var.f != rfVar.a()) {
                        }
                        rf.a(this.f367a, sensorEvent, P);
                        return;
                    }
                    rf rfVar2 = this.f367a;
                    rfVar2.a(rfVar2.b >= rfVar2.m);
                    return;
                }
            } catch (Throwable th) {
                if (this.f367a.a(1)) {
                    n8.a(th);
                    return;
                }
                return;
            }
        }
        this.f367a.a(true);
    }
}
