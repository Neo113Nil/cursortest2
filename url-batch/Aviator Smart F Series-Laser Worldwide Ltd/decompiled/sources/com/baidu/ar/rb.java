package com.baidu.ar;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class rb implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public SensorManager f3047a;

    /* renamed from: b, reason: collision with root package name */
    public Sensor f3048b;

    /* renamed from: c, reason: collision with root package name */
    public a f3049c;

    /* renamed from: d, reason: collision with root package name */
    public Context f3050d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3051e = true;

    /* renamed from: f, reason: collision with root package name */
    public LinkedList<Double> f3052f = new LinkedList<>();

    /* renamed from: g, reason: collision with root package name */
    public LinkedList<Float> f3053g = new LinkedList<>();

    /* renamed from: h, reason: collision with root package name */
    public LinkedList<Float> f3054h = new LinkedList<>();

    /* renamed from: i, reason: collision with root package name */
    public LinkedList<Float> f3055i = new LinkedList<>();

    /* renamed from: j, reason: collision with root package name */
    public int f3056j = 10;

    /* renamed from: k, reason: collision with root package name */
    public double f3057k = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3058l = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3059m = false;

    public interface a {
        void a(float f8, float f9, float f10, float f11);

        void destroy();
    }

    public rb(Context context) {
        this.f3050d = context;
    }

    public void a() {
        SensorManager sensorManager;
        SensorManager sensorManager2 = (SensorManager) this.f3050d.getSystemService("sensor");
        this.f3047a = sensorManager2;
        if (sensorManager2 != null) {
            Sensor defaultSensor = sensorManager2.getDefaultSensor(10);
            this.f3048b = defaultSensor;
            if (defaultSensor == null) {
                this.f3048b = this.f3047a.getDefaultSensor(1);
                this.f3059m = true;
            }
        }
        Sensor sensor = this.f3048b;
        if (sensor == null || (sensorManager = this.f3047a) == null) {
            return;
        }
        sensorManager.registerListener(this, sensor, 1);
    }

    public void b() {
        a aVar = this.f3049c;
        if (aVar != null) {
            aVar.destroy();
            this.f3049c = null;
        }
        SensorManager sensorManager = this.f3047a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f3047a = null;
        }
        this.f3059m = false;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i8) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f3051e) {
            float[] fArr = sensorEvent.values;
            float f8 = fArr[0];
            float f9 = fArr[1];
            float f10 = fArr[2];
            a(f8, f9, f10);
            h.a("acc  x : " + f8 + " , y : " + f9 + ", z : " + f10);
        }
    }

    public void a(float f8, float f9, float f10) {
        a aVar;
        double sqrt = Math.sqrt((f8 * f8) + (f9 * f9) + (f10 * f10));
        if (sqrt > this.f3057k) {
            this.f3057k = sqrt;
        }
        h.a("max acc is : " + this.f3057k);
        a(this.f3052f, sqrt);
        a((LinkedList) this.f3053g, Math.abs(f8));
        a((LinkedList) this.f3054h, Math.abs(f9));
        a((LinkedList) this.f3055i, Math.abs(f10));
        if (this.f3052f.size() == this.f3056j) {
            float f11 = 0.0f;
            double d8 = 0.0d;
            float f12 = 0.0f;
            float f13 = 0.0f;
            for (int i8 = 0; i8 < this.f3052f.size(); i8++) {
                d8 += this.f3052f.get(i8).doubleValue();
                f13 += this.f3053g.get(i8).floatValue();
                f12 += this.f3054h.get(i8).floatValue();
                f11 += this.f3055i.get(i8).floatValue();
            }
            int i9 = this.f3056j;
            double d9 = d8 / i9;
            float f14 = i9;
            float f15 = f13 / f14;
            float f16 = f12 / f14;
            float f17 = f11 / f14;
            if (this.f3059m) {
                if (!this.f3058l) {
                    if (d9 < 10.0d) {
                        this.f3058l = true;
                        aVar = this.f3049c;
                        if (aVar == null) {
                            return;
                        }
                        aVar.a(f15, f16, f17, (float) this.f3057k);
                        this.f3057k = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
                    }
                    return;
                }
                if (d9 <= 10.0d) {
                    return;
                }
                this.f3058l = false;
            }
            if (this.f3058l) {
                if (d9 <= 5.0d) {
                    return;
                }
                this.f3058l = false;
            } else if (d9 < 5.0d) {
                this.f3058l = true;
                aVar = this.f3049c;
                if (aVar == null) {
                    return;
                }
                aVar.a(f15, f16, f17, (float) this.f3057k);
                this.f3057k = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
            }
        }
    }

    public void a(a aVar) {
        this.f3049c = aVar;
    }

    public void a(LinkedList linkedList, double d8) {
        if (linkedList.size() >= this.f3056j) {
            linkedList.poll();
        }
        linkedList.offer(Double.valueOf(d8));
    }

    public void a(LinkedList linkedList, float f8) {
        if (linkedList.size() >= this.f3056j) {
            linkedList.poll();
        }
        linkedList.offer(Float.valueOf(f8));
    }

    public void a(boolean z7) {
        this.f3051e = z7;
    }
}
