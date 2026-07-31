package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONArray;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class lf implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nf f321a;

    public lf(nf nfVar) {
        this.f321a = nfVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        JSONArray jSONArray;
        int a2 = this.f321a.b.a(sensorEvent);
        nf nfVar = this.f321a;
        if (a2 == nfVar.e) {
            nfVar.b();
            nf nfVar2 = this.f321a;
            id idVar = nfVar2.d;
            if (idVar != null) {
                try {
                    jSONArray = nfVar2.b.a();
                } catch (Exception unused) {
                    jSONArray = null;
                }
                idVar.a(jSONArray);
            }
        }
    }
}
