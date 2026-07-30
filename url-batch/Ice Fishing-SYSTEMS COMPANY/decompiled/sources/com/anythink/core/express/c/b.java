package com.anythink.core.express.c;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes.dex */
public abstract class b implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17708a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17709b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17710c = 2;

    /* renamed from: d, reason: collision with root package name */
    public float f17711d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f17712e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f17713f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public long f17714g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f17715h;
    private int i;

    public b(int i, int i4) {
        this.f17715h = i;
        this.i = i4;
    }

    public abstract void a();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (java.lang.Math.abs(r9 - r2) > r8.f17715h) goto L14;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f6 = -fArr[0];
        float f9 = -fArr[1];
        float f10 = -fArr[2];
        String.format("mtg handleSensorData lastx:%d,lasty:%d,lastz:%d", Integer.valueOf((int) f6), Integer.valueOf((int) f9), Integer.valueOf((int) f10));
        float f11 = this.f17711d;
        if (f11 == 0.0f || Math.abs(f6 - f11) <= this.f17715h) {
            float f12 = this.f17712e;
            if (f12 == 0.0f || Math.abs(f9 - f12) <= this.f17715h) {
                float f13 = this.f17713f;
                if (f13 != 0.0f) {
                }
                this.f17711d = f6;
                this.f17712e = f9;
                this.f17713f = f10;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f17714g > this.i) {
            this.f17714g = currentTimeMillis;
            a();
        }
        this.f17711d = f6;
        this.f17712e = f9;
        this.f17713f = f10;
    }
}
