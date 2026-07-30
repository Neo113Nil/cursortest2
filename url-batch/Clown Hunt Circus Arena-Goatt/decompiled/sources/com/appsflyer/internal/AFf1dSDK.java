package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class AFf1dSDK implements SensorEventListener {
    private final String AFInAppEventType;
    private long afDebugLog;
    private final int afErrorLog;
    private Executor afInfoLog;
    private double afRDLog;
    private final int valueOf;
    private final String values;
    private final float[][] AFKeystoreWrapper = new float[2][];
    private final long[] AFInAppEventParameterName = new long[2];

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    AFf1dSDK(Sensor sensor) {
        int type = sensor.getType();
        this.valueOf = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.values = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.AFInAppEventType = str;
        this.afErrorLog = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
    }

    private synchronized Executor AFKeystoreWrapper() {
        if (this.afInfoLog == null) {
            this.afInfoLog = Executors.newSingleThreadExecutor();
        }
        return this.afInfoLog;
    }

    private static double values(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    private static List<Float> AFInAppEventType(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AFKeystoreWrapper().execute(new Runnable() { // from class: com.appsflyer.internal.AFf1dSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFf1dSDK.this.AFKeystoreWrapper(sensorEvent);
                }
            });
        } else {
            AFKeystoreWrapper(sensorEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
    public void AFKeystoreWrapper(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.AFKeystoreWrapper;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.AFInAppEventParameterName[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.AFKeystoreWrapper[1] = copyOf;
            this.AFInAppEventParameterName[1] = currentTimeMillis;
            this.afRDLog = values(fArr3, copyOf);
            return;
        }
        if (50000000 <= j - this.afDebugLog) {
            this.afDebugLog = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.AFInAppEventParameterName[1] = currentTimeMillis;
                return;
            }
            double values = values(fArr3, fArr);
            if (values > this.afRDLog) {
                this.AFKeystoreWrapper[1] = Arrays.copyOf(fArr, fArr.length);
                this.AFInAppEventParameterName[1] = currentTimeMillis;
                this.afRDLog = values;
            }
        }
    }

    final void AFKeystoreWrapper(Map<AFf1dSDK, Map<String, Object>> map, boolean z) {
        if (values()) {
            map.put(this, valueOf());
            if (z) {
                int length = this.AFKeystoreWrapper.length;
                for (int i = 0; i < length; i++) {
                    this.AFKeystoreWrapper[i] = null;
                }
                int length2 = this.AFInAppEventParameterName.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.AFInAppEventParameterName[i2] = 0;
                }
                this.afRDLog = 0.0d;
                this.afDebugLog = 0L;
                return;
            }
            return;
        }
        if (map.containsKey(this)) {
            return;
        }
        map.put(this, valueOf());
    }

    private boolean values(int i, String str, String str2) {
        return this.valueOf == i && this.values.equals(str) && this.AFInAppEventType.equals(str2);
    }

    private Map<String, Object> valueOf() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.valueOf));
        concurrentHashMap.put("sN", this.values);
        concurrentHashMap.put("sV", this.AFInAppEventType);
        float[] fArr = this.AFKeystoreWrapper[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFInAppEventType(fArr));
        }
        float[] fArr2 = this.AFKeystoreWrapper[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFInAppEventType(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean values() {
        return this.AFKeystoreWrapper[0] != null;
    }

    public final int hashCode() {
        return this.afErrorLog;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFf1dSDK)) {
            return false;
        }
        AFf1dSDK aFf1dSDK = (AFf1dSDK) obj;
        return values(aFf1dSDK.valueOf, aFf1dSDK.values, aFf1dSDK.AFInAppEventType);
    }
}
