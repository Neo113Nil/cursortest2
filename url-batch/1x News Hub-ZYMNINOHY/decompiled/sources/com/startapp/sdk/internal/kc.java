package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes.dex */
public final class kc implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc f4056a;

    public kc(mc mcVar) {
        this.f4056a = mcVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            mc mcVar = this.f4056a;
            nc ncVar = mcVar.f4151d;
            if (ncVar == null || ncVar.a(sensorEvent) || !mcVar.a(8)) {
                return;
            }
            int i3 = mcVar.f;
            if ((i3 & 8) != 0) {
                return;
            }
            mcVar.f = i3 | 8;
            d9 d9Var = new d9(e9.f3725e);
            d9Var.f3680d = "MP";
            d9Var.f3681e = String.valueOf(8);
            d9Var.a();
        } catch (OutOfMemoryError unused) {
            mc mcVar2 = this.f4056a;
            mcVar2.getClass();
            try {
                mcVar2.d();
            } catch (Throwable th) {
                d9.a(th);
            }
        } catch (Throwable th2) {
            mc mcVar3 = this.f4056a;
            if (mcVar3.a(16)) {
                int i4 = mcVar3.f;
                if ((i4 & 16) != 0) {
                    return;
                }
                mcVar3.f = 16 | i4;
                d9.a(th2);
            }
        }
    }
}
