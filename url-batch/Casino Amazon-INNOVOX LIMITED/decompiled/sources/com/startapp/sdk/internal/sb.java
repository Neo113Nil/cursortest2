package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class sb implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ub f421a;

    public sb(ub ubVar) {
        this.f421a = ubVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            ub ubVar = this.f421a;
            vb vbVar = ubVar.d;
            if (vbVar == null || vbVar.a(sensorEvent) || !ubVar.a(8)) {
                return;
            }
            int i = ubVar.f;
            if ((i & 8) != 0) {
                return;
            }
            ubVar.f = i | 8;
            n8 n8Var = new n8(o8.e);
            n8Var.d = "MP";
            n8Var.e = String.valueOf(8);
            n8Var.a();
        } catch (OutOfMemoryError unused) {
            try {
                this.f421a.d();
            } catch (Throwable th) {
                n8.a(th);
            }
        } catch (Throwable th2) {
            ub ubVar2 = this.f421a;
            if (ubVar2.a(16)) {
                int i2 = ubVar2.f;
                if ((i2 & 16) != 0) {
                    return;
                }
                ubVar2.f = 16 | i2;
                n8.a(th2);
            }
        }
    }
}
