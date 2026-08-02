package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class cg implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eg f6772a;

    public cg(eg egVar) {
        this.f6772a = egVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i4) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        JSONArray jSONArray;
        int a3 = this.f6772a.f6866b.a(sensorEvent);
        eg egVar = this.f6772a;
        if (a3 == egVar.f6869e) {
            egVar.b();
            eg egVar2 = this.f6772a;
            w1 w1Var = egVar2.f6868d;
            if (w1Var != null) {
                try {
                    jSONArray = egVar2.f6866b.a();
                } catch (Exception unused) {
                    jSONArray = null;
                }
                w1Var.a(jSONArray);
            }
        }
    }
}
