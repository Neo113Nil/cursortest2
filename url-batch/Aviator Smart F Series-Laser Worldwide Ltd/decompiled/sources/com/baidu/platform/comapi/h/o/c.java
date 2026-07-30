package com.baidu.platform.comapi.h.o;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;
import com.github.mikephil.charting.utils.i;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class c extends a implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private Context f9214a;

    /* renamed from: e, reason: collision with root package name */
    private SensorManager f9218e;

    /* renamed from: f, reason: collision with root package name */
    private Sensor f9219f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9220g;

    /* renamed from: i, reason: collision with root package name */
    private Handler f9222i;

    /* renamed from: q, reason: collision with root package name */
    private com.baidu.platform.comapi.wnplatform.model.datastruct.a f9230q;

    /* renamed from: r, reason: collision with root package name */
    private double f9231r;

    /* renamed from: s, reason: collision with root package name */
    private double f9232s;

    /* renamed from: t, reason: collision with root package name */
    private double f9233t;

    /* renamed from: b, reason: collision with root package name */
    private int f9215b = -1;

    /* renamed from: c, reason: collision with root package name */
    private float[] f9216c = new float[3];

    /* renamed from: d, reason: collision with root package name */
    private float[] f9217d = new float[9];

    /* renamed from: h, reason: collision with root package name */
    private Object f9221h = new Object();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<b> f9223j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private float[] f9224k = new float[3];

    /* renamed from: l, reason: collision with root package name */
    private float[] f9225l = new float[3];

    /* renamed from: m, reason: collision with root package name */
    private com.baidu.platform.comapi.wnplatform.model.datastruct.a f9226m = new com.baidu.platform.comapi.wnplatform.model.datastruct.a();

    /* renamed from: n, reason: collision with root package name */
    private com.baidu.platform.comapi.wnplatform.model.datastruct.a f9227n = new com.baidu.platform.comapi.wnplatform.model.datastruct.a();

    /* renamed from: o, reason: collision with root package name */
    private float[] f9228o = new float[9];

    /* renamed from: p, reason: collision with root package name */
    private float[] f9229p = new float[3];

    public c() {
        this.f9218e = null;
        this.f9219f = null;
        Context a8 = com.baidu.platform.comapi.h.t.q.a.a();
        this.f9214a = a8;
        try {
            SensorManager sensorManager = (SensorManager) a8.getSystemService("sensor");
            this.f9218e = sensorManager;
            this.f9219f = sensorManager.getDefaultSensor(11);
        } catch (Exception unused) {
            this.f9218e = null;
            this.f9219f = null;
        }
        this.f9220g = false;
    }

    private double a(double d8) {
        return (((d8 + 90.0d) / 90.0d) * (-30.0d)) + d8;
    }

    private boolean c() {
        synchronized (this.f9221h) {
            try {
                if (this.f9220g) {
                    return true;
                }
                if (((SensorManager) this.f9214a.getSystemService("sensor")) == null) {
                    return false;
                }
                boolean b8 = b();
                this.f9220g = b8;
                return b8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void e() {
        synchronized (this.f9221h) {
            try {
                if (this.f9220g) {
                    SensorManager sensorManager = (SensorManager) this.f9214a.getSystemService("sensor");
                    if (sensorManager == null) {
                        return;
                    }
                    this.f9220g = false;
                    try {
                        sensorManager.unregisterListener(this);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(b bVar) {
        this.f9223j.remove(bVar);
    }

    public void d() {
        e();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i8) {
        Handler handler;
        if ((i8 == 1 || i8 == 0 || i8 == -1) && (handler = this.f9222i) != null) {
            handler.sendEmptyMessage(3);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        com.baidu.platform.comapi.h.g.a.b("onSensorChanged acc:" + sensorEvent.accuracy);
        if (this.f9218e == null) {
            return;
        }
        com.baidu.platform.comapi.wnplatform.model.datastruct.a b8 = sensorEvent.sensor.getType() == 11 ? b(sensorEvent) : (sensorEvent.sensor.getType() == 1 || sensorEvent.sensor.getType() == 2) ? a(sensorEvent) : null;
        Iterator<b> it = this.f9223j.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (b8 != null) {
                next.a(b8);
            }
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return false;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        d();
    }

    private boolean b() {
        SensorManager sensorManager;
        boolean registerListener;
        try {
            sensorManager = (SensorManager) this.f9214a.getSystemService("sensor");
        } catch (Exception unused) {
            sensorManager = null;
        }
        if (sensorManager == null) {
            return false;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(1);
        Sensor defaultSensor3 = sensorManager.getDefaultSensor(2);
        if (defaultSensor != null) {
            try {
                registerListener = sensorManager.registerListener(this, defaultSensor, 2);
            } catch (Exception unused2) {
            }
            if (!registerListener && defaultSensor2 != null && defaultSensor3 != null) {
                try {
                    return sensorManager.registerListener(this, defaultSensor2, 2) && sensorManager.registerListener(this, defaultSensor3, 2);
                } catch (Exception unused3) {
                }
            }
            return registerListener;
        }
        registerListener = false;
        if (!registerListener) {
            if (sensorManager.registerListener(this, defaultSensor2, 2)) {
                return false;
            }
        }
        return registerListener;
    }

    public void a(Context context, Handler handler) {
        c();
        this.f9222i = handler;
    }

    public void a(b bVar) {
        this.f9223j.add(bVar);
    }

    private com.baidu.platform.comapi.wnplatform.model.datastruct.a a(SensorEvent sensorEvent) {
        com.baidu.platform.comapi.wnplatform.model.datastruct.a clone;
        com.baidu.platform.comapi.h.g.a.a("onSensorChanged type:" + sensorEvent.sensor.getType());
        sensorEvent.values.clone();
        int type = sensorEvent.sensor.getType();
        if (1 == type) {
            this.f9224k = a((float[]) sensorEvent.values.clone(), this.f9224k);
        }
        if (2 == type) {
            this.f9225l = a((float[]) sensorEvent.values.clone(), this.f9225l);
        }
        SensorManager.getRotationMatrix(this.f9228o, null, this.f9224k, this.f9225l);
        SensorManager.getOrientation(this.f9228o, this.f9229p);
        synchronized (this.f9227n) {
            com.baidu.platform.comapi.wnplatform.model.datastruct.a aVar = this.f9227n;
            float[] fArr = this.f9224k;
            aVar.f10495a = fArr[0];
            aVar.f10496b = fArr[1];
            aVar.f10497c = fArr[2];
            float degrees = (float) Math.toDegrees(this.f9229p[0]);
            if (degrees < 0.0f && degrees > -180.0f) {
                degrees += 360.0f;
            }
            this.f9227n.f10498d = degrees;
            this.f9227n.f10499e = (float) Math.toDegrees(this.f9229p[1]);
            float degrees2 = (float) Math.toDegrees(this.f9229p[2]);
            com.baidu.platform.comapi.wnplatform.model.datastruct.a aVar2 = this.f9227n;
            aVar2.f10500f = degrees2;
            clone = aVar2.clone();
            this.f9226m = clone;
        }
        return clone;
    }

    private com.baidu.platform.comapi.wnplatform.model.datastruct.a b(SensorEvent sensorEvent) {
        WindowManager windowManager;
        Display defaultDisplay;
        double degrees;
        int type = sensorEvent.sensor.getType();
        if (this.f9219f != null && 11 == type) {
            try {
                SensorManager.getRotationMatrixFromVector(this.f9217d, sensorEvent.values);
                SensorManager.getOrientation(this.f9217d, this.f9216c);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            try {
                windowManager = (WindowManager) this.f9214a.getSystemService("window");
            } catch (Exception unused) {
                windowManager = null;
            }
            if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
                return null;
            }
            try {
                int rotation = defaultDisplay.getRotation() * 90;
                int i8 = 0;
                if (type == 11) {
                    if (rotation == 0) {
                        float[] fArr = this.f9216c;
                        degrees = Math.toDegrees(fArr[0] - fArr[2]);
                    } else {
                        float[] fArr2 = this.f9216c;
                        degrees = Math.toDegrees(fArr2[0] - fArr2[1]);
                    }
                    i8 = ((((int) degrees) + rotation) + 360) % 360;
                }
                this.f9215b = i8;
                double d8 = i8;
                a(d8, Math.toDegrees(this.f9216c[1]), Math.toDegrees(this.f9216c[2]));
                com.baidu.platform.comapi.wnplatform.model.datastruct.a aVar = new com.baidu.platform.comapi.wnplatform.model.datastruct.a();
                this.f9230q = aVar;
                aVar.f10498d = d8;
                aVar.f10499e = a(this.f9232s - 90.0d);
                com.baidu.platform.comapi.wnplatform.model.datastruct.a aVar2 = this.f9230q;
                aVar2.f10500f = i.DOUBLE_EPSILON;
                aVar2.f10501g = sensorEvent.accuracy;
                if (this.f9222i != null) {
                    Message message = new Message();
                    message.what = 2;
                    message.obj = this.f9230q;
                    this.f9222i.sendMessage(message);
                }
            } catch (ArrayIndexOutOfBoundsException unused2) {
                return null;
            }
        }
        return this.f9230q;
    }

    private void a(double d8, double d9, double d10) {
        double atan2;
        double d11;
        double d12;
        double radians = Math.toRadians(d8);
        double radians2 = i.DOUBLE_EPSILON - Math.toRadians(d9);
        double radians3 = Math.toRadians(d10);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double cos2 = Math.cos(radians2);
        double sin2 = Math.sin(radians2);
        double cos3 = Math.cos(radians3);
        double sin3 = Math.sin(radians3);
        double d13 = cos * sin2;
        double d14 = (sin * sin3) - (d13 * cos3);
        double d15 = (d13 * sin3) + (sin * cos3);
        double d16 = cos2 * cos3;
        double d17 = (sin * sin2 * cos3) + (cos * sin3);
        double d18 = ((-sin) * sin2 * sin3) + (cos * cos3);
        double[] dArr = {d14, (-cos) * cos2, d15, d16, -sin2, (-cos2) * sin3, d17, cos2 * sin, d18};
        if (d16 > 0.9999d) {
            atan2 = Math.atan2(d15, d18);
            d11 = 1.5707963267948966d;
        } else if (d16 < -0.9999d) {
            atan2 = Math.atan2(d15, d18);
            d11 = -1.5707963267948966d;
        } else {
            atan2 = Math.atan2(-d17, d14);
            double atan22 = Math.atan2(-dArr[5], dArr[4]);
            double asin = Math.asin(dArr[3]);
            if (Double.isNaN(asin)) {
                d12 = atan22;
                d11 = i.DOUBLE_EPSILON;
            } else {
                d11 = asin;
                d12 = atan22;
            }
            this.f9231r = (atan2 * 180.0d) / 3.141592653589793d;
            this.f9232s = (d11 * 180.0d) / 3.141592653589793d;
            this.f9233t = (d12 * 180.0d) / 3.141592653589793d;
        }
        d12 = i.DOUBLE_EPSILON;
        this.f9231r = (atan2 * 180.0d) / 3.141592653589793d;
        this.f9232s = (d11 * 180.0d) / 3.141592653589793d;
        this.f9233t = (d12 * 180.0d) / 3.141592653589793d;
    }

    private float[] a(float[] fArr, float[] fArr2) {
        if (fArr2 == null || fArr == null) {
            return fArr;
        }
        int length = fArr2.length <= fArr.length ? fArr2.length : fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            float f8 = fArr2[i8];
            fArr2[i8] = f8 + ((fArr[i8] - f8) * 0.1f);
        }
        return fArr2;
    }
}
