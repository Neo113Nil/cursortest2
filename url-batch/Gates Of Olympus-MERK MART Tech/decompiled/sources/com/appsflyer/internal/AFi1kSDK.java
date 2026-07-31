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
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class AFi1kSDK implements SensorEventListener {
    private final int AFInAppEventParameterName;
    private final String AFInAppEventType;
    private double AFKeystoreWrapper;
    private long d;
    private final Executor registerClient;
    private final String valueOf;
    private final int values;
    private final float[][] unregisterClient = new float[2][];
    private final long[] e = new long[2];

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    AFi1kSDK(Sensor sensor, ExecutorService executorService) {
        int type = sensor.getType();
        this.values = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFInAppEventType = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.valueOf = str;
        this.AFInAppEventParameterName = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.registerClient = executorService;
    }

    private static double valueOf(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    private static List<Float> values(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.AFi1kSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1kSDK.this.AFKeystoreWrapper(sensorEvent);
                }
            });
        } else {
            AFKeystoreWrapper(sensorEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
    public void AFKeystoreWrapper(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.unregisterClient;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.e[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.unregisterClient[1] = copyOf;
            this.e[1] = currentTimeMillis;
            this.AFKeystoreWrapper = valueOf(fArr3, copyOf);
            return;
        }
        if (50000000 <= j - this.d) {
            this.d = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.e[1] = currentTimeMillis;
                return;
            }
            double valueOf = valueOf(fArr3, fArr);
            if (valueOf > this.AFKeystoreWrapper) {
                this.unregisterClient[1] = Arrays.copyOf(fArr, fArr.length);
                this.e[1] = currentTimeMillis;
                this.AFKeystoreWrapper = valueOf;
            }
        }
    }

    final void values(Map<AFi1kSDK, Map<String, Object>> map, boolean z) {
        if (valueOf()) {
            map.put(this, AFInAppEventType());
            if (z) {
                int length = this.unregisterClient.length;
                for (int i = 0; i < length; i++) {
                    this.unregisterClient[i] = null;
                }
                int length2 = this.e.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.e[i2] = 0;
                }
                this.AFKeystoreWrapper = 0.0d;
                this.d = 0L;
                return;
            }
            return;
        }
        if (map.containsKey(this)) {
            return;
        }
        map.put(this, AFInAppEventType());
    }

    private boolean values(int i, String str, String str2) {
        return this.values == i && this.AFInAppEventType.equals(str) && this.valueOf.equals(str2);
    }

    private Map<String, Object> AFInAppEventType() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.values));
        concurrentHashMap.put("sN", this.AFInAppEventType);
        concurrentHashMap.put("sV", this.valueOf);
        float[] fArr = this.unregisterClient[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", values(fArr));
        }
        float[] fArr2 = this.unregisterClient[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", values(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean valueOf() {
        return this.unregisterClient[0] != null;
    }

    public final int hashCode() {
        return this.AFInAppEventParameterName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFi1kSDK)) {
            return false;
        }
        AFi1kSDK aFi1kSDK = (AFi1kSDK) obj;
        return values(aFi1kSDK.values, aFi1kSDK.AFInAppEventType, aFi1kSDK.valueOf);
    }
}
