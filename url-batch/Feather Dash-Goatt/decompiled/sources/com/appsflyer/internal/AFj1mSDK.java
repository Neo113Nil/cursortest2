package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFj1mSDK implements AFj1oSDK {
    private static final BitSet component4;
    final Handler AFAdRevenueData;
    private final SensorManager areAllFieldsValid;
    private final Map<AFj1tSDK, Map<String, Object>> component1;
    private final Map<AFj1tSDK, AFj1tSDK> component2;
    private final ExecutorService component3;
    private boolean copydefault;
    final Runnable getCurrencyIso4217Code;
    boolean getMediationNetwork;
    final Runnable getMonetizationNetwork;
    final Object getRevenue;
    private final Runnable hashCode;

    static {
        BitSet bitSet = new BitSet(6);
        component4 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFj1mSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.getRevenue = new Object();
        BitSet bitSet = component4;
        this.component2 = new HashMap(bitSet.size());
        this.component1 = new ConcurrentHashMap(bitSet.size());
        this.getCurrencyIso4217Code = new Runnable() { // from class: com.appsflyer.internal.AFj1mSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1mSDK.this.getRevenue) {
                    AFj1mSDK.this.getRevenue();
                    AFj1mSDK aFj1mSDK = AFj1mSDK.this;
                    aFj1mSDK.AFAdRevenueData.postDelayed(aFj1mSDK.getMonetizationNetwork, 150L);
                    AFj1mSDK.this.getMediationNetwork = true;
                }
            }
        };
        this.getMonetizationNetwork = new o(this, 0);
        this.hashCode = new Runnable() { // from class: com.appsflyer.internal.AFj1mSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1mSDK.this.getRevenue) {
                    try {
                        AFj1mSDK aFj1mSDK = AFj1mSDK.this;
                        if (aFj1mSDK.getMediationNetwork) {
                            aFj1mSDK.AFAdRevenueData.removeCallbacks(aFj1mSDK.getCurrencyIso4217Code);
                            AFj1mSDK aFj1mSDK2 = AFj1mSDK.this;
                            aFj1mSDK2.AFAdRevenueData.removeCallbacks(aFj1mSDK2.getMonetizationNetwork);
                            AFj1mSDK.this.getCurrencyIso4217Code();
                            AFj1mSDK.this.getMediationNetwork = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.areAllFieldsValid = sensorManager;
        this.AFAdRevenueData = handler;
        this.component3 = executorService;
    }

    private List<Map<String, Object>> areAllFieldsValid() {
        synchronized (this.getRevenue) {
            try {
                if (!this.component2.isEmpty() && this.copydefault) {
                    Iterator<AFj1tSDK> it = this.component2.values().iterator();
                    while (it.hasNext()) {
                        it.next().getMediationNetwork(this.component1, false);
                    }
                }
                if (this.component1.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.component1.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component1() {
        synchronized (this.getRevenue) {
            this.AFAdRevenueData.post(new o(this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component2() {
        try {
            if (!this.component2.isEmpty()) {
                for (AFj1tSDK aFj1tSDK : this.component2.values()) {
                    this.areAllFieldsValid.unregisterListener(aFj1tSDK);
                    aFj1tSDK.getMediationNetwork(this.component1, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.copydefault = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component3() {
        try {
            for (Sensor sensor : this.areAllFieldsValid.getSensorList(-1)) {
                if (getMediationNetwork(sensor.getType())) {
                    AFj1tSDK aFj1tSDK = new AFj1tSDK(sensor, this.component3);
                    if (!this.component2.containsKey(aFj1tSDK)) {
                        this.component2.put(aFj1tSDK, aFj1tSDK);
                    }
                    this.areAllFieldsValid.registerListener(this.component2.get(aFj1tSDK), sensor, 1, this.AFAdRevenueData);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.copydefault = true;
    }

    private List<Map<String, Object>> component4() {
        synchronized (this.getRevenue) {
            try {
                Iterator<AFj1tSDK> it = this.component2.values().iterator();
                while (it.hasNext()) {
                    it.next().getMediationNetwork(this.component1, true);
                }
                if (this.component1.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.component1.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean getMediationNetwork(int i) {
        return i >= 0 && component4.get(i);
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    public final Map<String, Object> AFAdRevenueData() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> areAllFieldsValid = areAllFieldsValid();
        if (!areAllFieldsValid.isEmpty()) {
            concurrentHashMap.put("sensors", areAllFieldsValid);
            return concurrentHashMap;
        }
        List<Map<String, Object>> component42 = component4();
        if (!component42.isEmpty()) {
            concurrentHashMap.put("sensors", component42);
        }
        return concurrentHashMap;
    }

    public final void getCurrencyIso4217Code() {
        this.AFAdRevenueData.post(new o(this, 1));
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    public final void getMonetizationNetwork() {
        this.AFAdRevenueData.post(this.hashCode);
        this.AFAdRevenueData.post(this.getCurrencyIso4217Code);
    }

    public final void getRevenue() {
        this.AFAdRevenueData.post(new o(this, 2));
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    public final synchronized void getMediationNetwork() {
        this.AFAdRevenueData.post(this.hashCode);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1mSDK(Context context, ExecutorService executorService) {
        this(r3, new Handler(r0.getLooper()), executorService);
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
    }
}
