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

/* loaded from: classes.dex */
public final class AFj1nSDK implements AFj1lSDK {
    private static final BitSet areAllFieldsValid;
    final Runnable AFAdRevenueData;
    private final SensorManager component1;
    private final Map<AFj1pSDK, Map<String, Object>> component2;
    private final Map<AFj1pSDK, AFj1pSDK> component3;
    private final ExecutorService component4;
    private boolean equals;
    boolean getCurrencyIso4217Code;
    final Object getMediationNetwork;
    final Runnable getMonetizationNetwork;
    final Handler getRevenue;
    private final Runnable hashCode;

    static {
        BitSet bitSet = new BitSet(6);
        areAllFieldsValid = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFj1nSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.getMediationNetwork = new Object();
        BitSet bitSet = areAllFieldsValid;
        this.component3 = new HashMap(bitSet.size());
        this.component2 = new ConcurrentHashMap(bitSet.size());
        this.AFAdRevenueData = new Runnable() { // from class: com.appsflyer.internal.AFj1nSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1nSDK.this.getMediationNetwork) {
                    AFj1nSDK.this.getMonetizationNetwork();
                    AFj1nSDK aFj1nSDK = AFj1nSDK.this;
                    aFj1nSDK.getRevenue.postDelayed(aFj1nSDK.getMonetizationNetwork, 150L);
                    AFj1nSDK.this.getCurrencyIso4217Code = true;
                }
            }
        };
        this.getMonetizationNetwork = new Runnable() { // from class: com.appsflyer.internal.G
            @Override // java.lang.Runnable
            public final void run() {
                AFj1nSDK.this.component4();
            }
        };
        this.hashCode = new Runnable() { // from class: com.appsflyer.internal.AFj1nSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1nSDK.this.getMediationNetwork) {
                    try {
                        AFj1nSDK aFj1nSDK = AFj1nSDK.this;
                        if (aFj1nSDK.getCurrencyIso4217Code) {
                            aFj1nSDK.getRevenue.removeCallbacks(aFj1nSDK.AFAdRevenueData);
                            AFj1nSDK aFj1nSDK2 = AFj1nSDK.this;
                            aFj1nSDK2.getRevenue.removeCallbacks(aFj1nSDK2.getMonetizationNetwork);
                            AFj1nSDK.this.getMediationNetwork();
                            AFj1nSDK.this.getCurrencyIso4217Code = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.component1 = sensorManager;
        this.getRevenue = handler;
        this.component4 = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void areAllFieldsValid() {
        try {
            if (!this.component3.isEmpty()) {
                for (AFj1pSDK aFj1pSDK : this.component3.values()) {
                    this.component1.unregisterListener(aFj1pSDK);
                    aFj1pSDK.getMonetizationNetwork(this.component2, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.equals = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component1() {
        try {
            for (Sensor sensor : this.component1.getSensorList(-1)) {
                if (getMonetizationNetwork(sensor.getType())) {
                    AFj1pSDK aFj1pSDK = new AFj1pSDK(sensor, this.component4);
                    if (!this.component3.containsKey(aFj1pSDK)) {
                        this.component3.put(aFj1pSDK, aFj1pSDK);
                    }
                    this.component1.registerListener(this.component3.get(aFj1pSDK), sensor, 1, this.getRevenue);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.equals = true;
    }

    private List<Map<String, Object>> component2() {
        synchronized (this.getMediationNetwork) {
            try {
                Iterator<AFj1pSDK> it = this.component3.values().iterator();
                while (it.hasNext()) {
                    it.next().getMonetizationNetwork(this.component2, true);
                }
                if (this.component2.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.component2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private List<Map<String, Object>> component3() {
        synchronized (this.getMediationNetwork) {
            try {
                if (!this.component3.isEmpty() && this.equals) {
                    Iterator<AFj1pSDK> it = this.component3.values().iterator();
                    while (it.hasNext()) {
                        it.next().getMonetizationNetwork(this.component2, false);
                    }
                }
                if (this.component2.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.component2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component4() {
        synchronized (this.getMediationNetwork) {
            this.getRevenue.post(new E(this));
        }
    }

    private static boolean getMonetizationNetwork(int i4) {
        return i4 >= 0 && areAllFieldsValid.get(i4);
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final Map<String, Object> AFAdRevenueData() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> component3 = component3();
        if (!component3.isEmpty()) {
            concurrentHashMap.put("sensors", component3);
            return concurrentHashMap;
        }
        List<Map<String, Object>> component2 = component2();
        if (!component2.isEmpty()) {
            concurrentHashMap.put("sensors", component2);
        }
        return concurrentHashMap;
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final void getCurrencyIso4217Code() {
        this.getRevenue.post(this.hashCode);
        this.getRevenue.post(this.AFAdRevenueData);
    }

    final void getMediationNetwork() {
        this.getRevenue.post(new E(this));
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final synchronized void getRevenue() {
        this.getRevenue.post(this.hashCode);
    }

    final void getMonetizationNetwork() {
        this.getRevenue.post(new Runnable() { // from class: com.appsflyer.internal.F
            @Override // java.lang.Runnable
            public final void run() {
                AFj1nSDK.this.component1();
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1nSDK(Context context, ExecutorService executorService) {
        this(r3, new Handler(r0.getLooper()), executorService);
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
    }
}
