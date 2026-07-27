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

/* loaded from: classes.dex */
public final class AFi1dSDK implements SensorEventListener {
    private final int AFInAppEventParameterName;
    private double AFInAppEventType;
    private final String AFKeystoreWrapper;
    private final Executor AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private long f5957d;
    private final String valueOf;
    private final int values;
    private final float[][] registerClient = new float[2][];

    /* renamed from: e, reason: collision with root package name */
    private final long[] f5958e = new long[2];

    public AFi1dSDK(Sensor sensor, ExecutorService executorService) {
        int type = sensor.getType();
        this.values = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFKeystoreWrapper = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.valueOf = str;
        this.AFInAppEventParameterName = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
        this.AFLogger = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
    public void AFKeystoreWrapper(SensorEvent sensorEvent) {
        long j4 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.registerClient;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.f5958e[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.registerClient[1] = copyOf;
            this.f5958e[1] = currentTimeMillis;
            this.AFInAppEventType = AFKeystoreWrapper(fArr3, copyOf);
            return;
        }
        if (50000000 <= j4 - this.f5957d) {
            this.f5957d = j4;
            if (Arrays.equals(fArr4, fArr)) {
                this.f5958e[1] = currentTimeMillis;
                return;
            }
            double AFKeystoreWrapper = AFKeystoreWrapper(fArr3, fArr);
            if (AFKeystoreWrapper > this.AFInAppEventType) {
                this.registerClient[1] = Arrays.copyOf(fArr, fArr.length);
                this.f5958e[1] = currentTimeMillis;
                this.AFInAppEventType = AFKeystoreWrapper;
            }
        }
    }

    private static double AFKeystoreWrapper(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d4 = 0.0d;
        for (int i2 = 0; i2 < min; i2++) {
            d4 += StrictMath.pow(fArr[i2] - fArr2[i2], 2.0d);
        }
        return Math.sqrt(d4);
    }

    private boolean values(int i2, String str, String str2) {
        return this.values == i2 && this.AFKeystoreWrapper.equals(str) && this.valueOf.equals(str2);
    }

    public final void AFInAppEventType(Map<AFi1dSDK, Map<String, Object>> map, boolean z4) {
        if (!AFInAppEventParameterName()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, AFInAppEventType());
            return;
        }
        map.put(this, AFInAppEventType());
        if (z4) {
            int length = this.registerClient.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.registerClient[i2] = null;
            }
            int length2 = this.f5958e.length;
            for (int i4 = 0; i4 < length2; i4++) {
                this.f5958e[i4] = 0;
            }
            this.AFInAppEventType = 0.0d;
            this.f5957d = 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFi1dSDK)) {
            return false;
        }
        AFi1dSDK aFi1dSDK = (AFi1dSDK) obj;
        return values(aFi1dSDK.values, aFi1dSDK.AFKeystoreWrapper, aFi1dSDK.valueOf);
    }

    public final int hashCode() {
        return this.AFInAppEventParameterName;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.AFLogger.execute(new g(this, 1, sensorEvent));
        } else {
            AFKeystoreWrapper(sensorEvent);
        }
    }

    private static List<Float> AFKeystoreWrapper(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f4 : fArr) {
            arrayList.add(Float.valueOf(f4));
        }
        return arrayList;
    }

    private Map<String, Object> AFInAppEventType() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.values));
        concurrentHashMap.put("sN", this.AFKeystoreWrapper);
        concurrentHashMap.put("sV", this.valueOf);
        float[] fArr = this.registerClient[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFKeystoreWrapper(fArr));
        }
        float[] fArr2 = this.registerClient[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFKeystoreWrapper(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean AFInAppEventParameterName() {
        return this.registerClient[0] != null;
    }
}
