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
public final class AFj1nSDK implements SensorEventListener {
    private final String AFAdRevenueData;
    private long component1;
    private final Executor component3;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final String getMonetizationNetwork;
    private double getRevenue;
    private final float[][] areAllFieldsValid = new float[2][];
    private final long[] component4 = new long[2];

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    AFj1nSDK(Sensor sensor, ExecutorService executorService) {
        int type = sensor.getType();
        this.getMediationNetwork = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFAdRevenueData = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getMonetizationNetwork = str;
        this.getCurrencyIso4217Code = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.component3 = executorService;
    }

    private static double getRevenue(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    private static List<Float> getRevenue(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component3.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1nSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1nSDK.this.G_(sensorEvent);
                }
            });
        } else {
            G_(sensorEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F_, reason: merged with bridge method [inline-methods] */
    public void G_(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.areAllFieldsValid;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.component4[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.areAllFieldsValid[1] = copyOf;
            this.component4[1] = currentTimeMillis;
            this.getRevenue = getRevenue(fArr3, copyOf);
            return;
        }
        if (50000000 <= j - this.component1) {
            this.component1 = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.component4[1] = currentTimeMillis;
                return;
            }
            double revenue = getRevenue(fArr3, fArr);
            if (revenue > this.getRevenue) {
                this.areAllFieldsValid[1] = Arrays.copyOf(fArr, fArr.length);
                this.component4[1] = currentTimeMillis;
                this.getRevenue = revenue;
            }
        }
    }

    final void AFAdRevenueData(Map<AFj1nSDK, Map<String, Object>> map, boolean z) {
        if (getMonetizationNetwork()) {
            map.put(this, getMediationNetwork());
            if (z) {
                int length = this.areAllFieldsValid.length;
                for (int i = 0; i < length; i++) {
                    this.areAllFieldsValid[i] = null;
                }
                int length2 = this.component4.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.component4[i2] = 0;
                }
                this.getRevenue = 0.0d;
                this.component1 = 0L;
                return;
            }
            return;
        }
        if (map.containsKey(this)) {
            return;
        }
        map.put(this, getMediationNetwork());
    }

    private boolean getCurrencyIso4217Code(int i, String str, String str2) {
        return this.getMediationNetwork == i && this.AFAdRevenueData.equals(str) && this.getMonetizationNetwork.equals(str2);
    }

    private Map<String, Object> getMediationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.getMediationNetwork));
        concurrentHashMap.put("sN", this.AFAdRevenueData);
        concurrentHashMap.put("sV", this.getMonetizationNetwork);
        float[] fArr = this.areAllFieldsValid[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getRevenue(fArr));
        }
        float[] fArr2 = this.areAllFieldsValid[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getRevenue(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean getMonetizationNetwork() {
        return this.areAllFieldsValid[0] != null;
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1nSDK)) {
            return false;
        }
        AFj1nSDK aFj1nSDK = (AFj1nSDK) obj;
        return getCurrencyIso4217Code(aFj1nSDK.getMediationNetwork, aFj1nSDK.AFAdRevenueData, aFj1nSDK.getMonetizationNetwork);
    }
}
