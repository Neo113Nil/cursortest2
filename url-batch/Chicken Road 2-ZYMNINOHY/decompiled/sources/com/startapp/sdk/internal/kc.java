package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes.dex */
public final class kc implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc f7184a;

    public kc(mc mcVar) {
        this.f7184a = mcVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i4) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            mc mcVar = this.f7184a;
            nc ncVar = mcVar.f7279d;
            if (ncVar == null || ncVar.a(sensorEvent) || !mcVar.a(8)) {
                return;
            }
            int i4 = mcVar.f7281f;
            if ((i4 & 8) != 0) {
                return;
            }
            mcVar.f7281f = i4 | 8;
            d9 d9Var = new d9(e9.f6839e);
            d9Var.f6792d = "MP";
            d9Var.f6793e = String.valueOf(8);
            d9Var.a();
        } catch (OutOfMemoryError unused) {
            mc mcVar2 = this.f7184a;
            mcVar2.getClass();
            try {
                mcVar2.d();
            } catch (Throwable th) {
                d9.a(th);
            }
        } catch (Throwable th2) {
            mc mcVar3 = this.f7184a;
            if (mcVar3.a(16)) {
                int i5 = mcVar3.f7281f;
                if ((i5 & 16) != 0) {
                    return;
                }
                mcVar3.f7281f = 16 | i5;
                d9.a(th2);
            }
        }
    }
}
