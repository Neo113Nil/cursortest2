package com.baidu.vi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import java.util.List;

/* loaded from: classes2.dex */
public class VCompass {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    private static final Handler f10696a = new a();

    /* renamed from: c, reason: collision with root package name */
    private float f10698c;

    /* renamed from: b, reason: collision with root package name */
    private SensorManager f10697b = null;

    /* renamed from: d, reason: collision with root package name */
    private float f10699d = 2.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f10700e = 0;

    /* renamed from: f, reason: collision with root package name */
    private SensorEventListener f10701f = new b();

    static class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            VCompass vCompass = (VCompass) message.obj;
            if (vCompass == null) {
                return;
            }
            int i8 = message.what;
            if (i8 != 1) {
                if (i8 != 2) {
                    return;
                }
                vCompass.f10697b.unregisterListener(vCompass.f10701f);
                return;
            }
            Context context = VIContext.getContext();
            if (vCompass.f10697b == null) {
                vCompass.f10697b = (SensorManager) context.getSystemService("sensor");
            }
            List<Sensor> sensorList = vCompass.f10697b.getSensorList(3);
            if (sensorList.size() > 0) {
                vCompass.f10697b.registerListener(vCompass.f10701f, sensorList.get(0), 1);
            }
        }
    }

    class b implements SensorEventListener {
        b() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i8) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() != 3) {
                return;
            }
            VCompass.this.updateCompass((int) VCompass.this.a(sensorEvent.values[0]));
        }
    }

    private float a(float f8, float f9, float f10) {
        float f11 = f8 - f9;
        return (f11 > 180.0f || f11 < -180.0f) ? f9 : (f11 < (-f10) || f10 < f11) ? (f8 + f9) / 2.0f : f8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void updateCompass(int i8);

    /* JADX INFO: Access modifiers changed from: private */
    public float a(float f8) {
        float a8 = a(this.f10698c, f8, this.f10699d);
        this.f10698c = a8;
        return a8;
    }
}
