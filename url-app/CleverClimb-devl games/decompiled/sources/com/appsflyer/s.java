package com.appsflyer;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class s implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final int f3487a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3488b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3489c;

    /* renamed from: d, reason: collision with root package name */
    private final float[][] f3490d = new float[2][];
    private final long[] e = new long[2];
    private final int f;
    private double g;
    private long h;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    private s(int i, String str, String str2) {
        this.f3487a = i;
        this.f3488b = str == null ? "" : str;
        this.f3489c = str2 == null ? "" : str2;
        this.f = ((((i + 31) * 31) + this.f3488b.hashCode()) * 31) + this.f3489c.hashCode();
    }

    static s a(Sensor sensor) {
        return new s(sensor.getType(), sensor.getName(), sensor.getVendor());
    }

    private static double a(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d2 = 0.0d;
        for (int i = 0; i < min; i++) {
            d2 += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d2);
    }

    private static List<Float> a(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent == null || sensorEvent.values == null) {
            return;
        }
        Sensor sensor = sensorEvent.sensor;
        if ((sensor == null || sensor.getName() == null || sensor.getVendor() == null) ? false : true) {
            int type = sensorEvent.sensor.getType();
            String name = sensorEvent.sensor.getName();
            String vendor = sensorEvent.sensor.getVendor();
            long j = sensorEvent.timestamp;
            float[] fArr = sensorEvent.values;
            if (a(type, name, vendor)) {
                long currentTimeMillis = System.currentTimeMillis();
                float[] fArr2 = this.f3490d[0];
                if (fArr2 == null) {
                    this.f3490d[0] = Arrays.copyOf(fArr, fArr.length);
                    this.e[0] = currentTimeMillis;
                    return;
                }
                float[] fArr3 = this.f3490d[1];
                if (fArr3 == null) {
                    float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                    this.f3490d[1] = copyOf;
                    this.e[1] = currentTimeMillis;
                    this.g = a(fArr2, copyOf);
                    return;
                }
                if (50000000 <= j - this.h) {
                    this.h = j;
                    if (Arrays.equals(fArr3, fArr)) {
                        this.e[1] = currentTimeMillis;
                        return;
                    }
                    double a2 = a(fArr2, fArr);
                    if (a2 > this.g) {
                        this.f3490d[1] = Arrays.copyOf(fArr, fArr.length);
                        this.e[1] = currentTimeMillis;
                        this.g = a2;
                    }
                }
            }
        }
    }

    final void a(Map<s, Map<String, Object>> map) {
        a(map, true);
    }

    public final void b(Map<s, Map<String, Object>> map) {
        a(map, false);
    }

    private boolean a(int i, String str, String str2) {
        return this.f3487a == i && this.f3488b.equals(str) && this.f3489c.equals(str2);
    }

    private Map<String, Object> a() {
        HashMap hashMap = new HashMap(7);
        hashMap.put("sT", Integer.valueOf(this.f3487a));
        hashMap.put("sN", this.f3488b);
        hashMap.put("sV", this.f3489c);
        float[] fArr = this.f3490d[0];
        if (fArr != null) {
            hashMap.put("sVS", a(fArr));
        }
        float[] fArr2 = this.f3490d[1];
        if (fArr2 != null) {
            hashMap.put("sVE", a(fArr2));
        }
        return hashMap;
    }

    private void b() {
        for (int i = 0; i < 2; i++) {
            this.f3490d[i] = null;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.e[i2] = 0;
        }
        this.g = 0.0d;
        this.h = 0L;
    }

    public final int hashCode() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return a(sVar.f3487a, sVar.f3488b, sVar.f3489c);
    }

    private void a(Map<s, Map<String, Object>> map, boolean z) {
        if (this.f3490d[0] != null) {
            map.put(this, a());
            if (z) {
                b();
                return;
            }
            return;
        }
        if (map.containsKey(this)) {
            return;
        }
        map.put(this, a());
    }
}
