package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1mSDK;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class AFi1nSDK implements AFi1lSDK {
    private static final BitSet values;
    final Handler AFInAppEventParameterName;
    private final SensorManager AFInAppEventType;
    private final Object AFKeystoreWrapper;
    private boolean AFLogger;
    private final Runnable afInfoLog;
    private boolean d;
    private int e;
    private final Runnable force;
    private final Runnable i;
    private final Map<AFi1kSDK, Map<String, Object>> registerClient;
    private final Map<AFi1kSDK, AFi1kSDK> unregisterClient;
    private final Runnable v;
    private final ExecutorService valueOf;
    private long w;

    static /* synthetic */ boolean afInfoLog(AFi1nSDK aFi1nSDK) {
        aFi1nSDK.AFLogger = false;
        return false;
    }

    static {
        BitSet bitSet = new BitSet(6);
        values = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void unregisterClient() {
        synchronized (this.AFKeystoreWrapper) {
            this.AFInAppEventParameterName.post(new AnonymousClass4());
        }
    }

    private AFi1nSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.AFKeystoreWrapper = new Object();
        BitSet bitSet = values;
        this.unregisterClient = new HashMap(bitSet.size());
        this.registerClient = new ConcurrentHashMap(bitSet.size());
        this.e = 1;
        this.w = 0L;
        this.force = new Runnable() { // from class: com.appsflyer.internal.AFi1nSDK.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFi1nSDK.this.AFKeystoreWrapper) {
                    AFi1nSDK.this.values();
                    AFi1nSDK.this.AFInAppEventParameterName.postDelayed(AFi1nSDK.this.afInfoLog, 100L);
                    AFi1nSDK.this.d = true;
                }
            }
        };
        this.v = new Runnable() { // from class: com.appsflyer.internal.AFi1nSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFi1nSDK.this.unregisterClient();
            }
        };
        this.i = new Runnable() { // from class: com.appsflyer.internal.AFi1nSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFi1nSDK.this.AFKeystoreWrapper) {
                    if (AFi1nSDK.this.d) {
                        AFi1nSDK.this.AFInAppEventParameterName.removeCallbacks(AFi1nSDK.this.force);
                        AFi1nSDK.this.AFInAppEventParameterName.removeCallbacks(AFi1nSDK.this.v);
                        AFi1nSDK aFi1nSDK = AFi1nSDK.this;
                        aFi1nSDK.AFInAppEventParameterName.post(aFi1nSDK.new AnonymousClass4());
                        AFi1nSDK.this.d = false;
                    }
                }
            }
        };
        this.afInfoLog = new Runnable() { // from class: com.appsflyer.internal.AFi1nSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFi1nSDK.this.AFKeystoreWrapper) {
                    if (AFi1nSDK.this.e == 0) {
                        AFi1nSDK.this.e = 1;
                    }
                    AFi1nSDK.this.AFInAppEventParameterName.postDelayed(AFi1nSDK.this.v, AFi1nSDK.this.e * 500);
                }
            }
        };
        this.AFInAppEventType = sensorManager;
        this.AFInAppEventParameterName = handler;
        this.valueOf = executorService;
    }

    private static boolean valueOf(int i) {
        return i >= 0 && values.get(i);
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final void valueOf() {
        this.AFInAppEventParameterName.post(this.i);
        this.AFInAppEventParameterName.post(this.force);
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final synchronized void AFInAppEventParameterName() {
        this.AFInAppEventParameterName.post(this.i);
    }

    final void values() {
        this.AFInAppEventParameterName.post(new Runnable() { // from class: com.appsflyer.internal.AFi1nSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFi1nSDK.this.registerClient();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void registerClient() {
        try {
            for (Sensor sensor : this.AFInAppEventType.getSensorList(-1)) {
                if (valueOf(sensor.getType())) {
                    AFi1kSDK aFi1kSDK = new AFi1kSDK(sensor, this.valueOf);
                    if (!this.unregisterClient.containsKey(aFi1kSDK)) {
                        this.unregisterClient.put(aFi1kSDK, aFi1kSDK);
                    }
                    this.AFInAppEventType.registerListener(this.unregisterClient.get(aFi1kSDK), sensor, 0, this.AFInAppEventParameterName);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.AFLogger = true;
    }

    /* renamed from: com.appsflyer.internal.AFi1nSDK$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!AFi1nSDK.this.unregisterClient.isEmpty()) {
                    for (AFi1kSDK aFi1kSDK : AFi1nSDK.this.unregisterClient.values()) {
                        AFi1nSDK.this.AFInAppEventType.unregisterListener(aFi1kSDK);
                        aFi1kSDK.values(AFi1nSDK.this.registerClient, true);
                    }
                }
            } catch (Throwable th) {
                AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
            }
            AFi1nSDK.this.e = 0;
            AFi1nSDK.afInfoLog(AFi1nSDK.this);
        }
    }

    private List<Map<String, Object>> d() {
        synchronized (this.AFKeystoreWrapper) {
            Iterator<AFi1kSDK> it = this.unregisterClient.values().iterator();
            while (it.hasNext()) {
                it.next().values(this.registerClient, true);
            }
            Map<AFi1kSDK, Map<String, Object>> map = this.registerClient;
            if (map != null && !map.isEmpty()) {
                return new CopyOnWriteArrayList(this.registerClient.values());
            }
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
    }

    private List<Map<String, Object>> e() {
        synchronized (this.AFKeystoreWrapper) {
            if (!this.unregisterClient.isEmpty() && this.AFLogger) {
                Iterator<AFi1kSDK> it = this.unregisterClient.values().iterator();
                while (it.hasNext()) {
                    it.next().values(this.registerClient, false);
                }
            }
            if (this.registerClient.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.registerClient.values());
        }
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final Map<String, Object> AFKeystoreWrapper() throws ParseException {
        AFi1mSDK.AFa1zSDK aFa1zSDK;
        ConcurrentHashMap concurrentHashMap;
        Iterator<Map<String, Object>> it;
        AFi1mSDK.AFa1zSDK aFa1zSDK2;
        ArrayList arrayList;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        List<Map<String, Object>> d = d();
        if (!d.isEmpty()) {
            new AFi1mSDK();
            HashMap hashMap = new HashMap();
            Iterator<Map<String, Object>> it2 = d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map<String, Object> next = it2.next();
                HashMap hashMap2 = new HashMap();
                boolean z = next.get("sVS") != null;
                boolean z2 = next.get("sVE") != null;
                if (z && z2) {
                    aFa1zSDK = AFi1mSDK.AFa1zSDK.ALL;
                } else if (z) {
                    aFa1zSDK = AFi1mSDK.AFa1zSDK.FIRST;
                } else {
                    aFa1zSDK = AFi1mSDK.AFa1zSDK.NONE;
                }
                if (aFa1zSDK != AFi1mSDK.AFa1zSDK.NONE) {
                    Integer num = (Integer) next.get("sT");
                    String str = (String) next.get("sN");
                    if (str == null) {
                        hashMap2.put("n", "uk");
                    } else {
                        hashMap2.put("n", str);
                    }
                    AFi1mSDK.AFa1uSDK aFa1uSDK = AFi1mSDK.AFa1uSDK.values()[num.intValue()];
                    ArrayList arrayList2 = new ArrayList(AFi1mSDK.AFKeystoreWrapper(next.get("sVS")));
                    if (aFa1zSDK == AFi1mSDK.AFa1zSDK.ALL) {
                        arrayList2.addAll(AFi1mSDK.AFKeystoreWrapper(next.get("sVE")));
                    }
                    if (aFa1uSDK == AFi1mSDK.AFa1uSDK.MAGNETOMETER) {
                        ArrayList arrayList3 = new ArrayList();
                        BigDecimal bigDecimal = (BigDecimal) arrayList2.get(0);
                        aFa1zSDK2 = aFa1zSDK;
                        BigDecimal valueOf = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(1)).doubleValue(), bigDecimal.doubleValue()) * 57.29577951308232d);
                        DecimalFormat decimalFormat = new DecimalFormat("##.#");
                        decimalFormat.setRoundingMode(RoundingMode.DOWN);
                        arrayList3.add(Double.valueOf(AFc1tSDK.values(decimalFormat.format(valueOf))));
                        BigDecimal bigDecimal2 = (BigDecimal) arrayList2.get(2);
                        DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                        decimalFormat2.setRoundingMode(RoundingMode.DOWN);
                        arrayList3.add(Double.valueOf(AFc1tSDK.values(decimalFormat2.format(bigDecimal2))));
                        ArrayList arrayList4 = new ArrayList();
                        if (arrayList2.size() > 5) {
                            BigDecimal bigDecimal3 = (BigDecimal) arrayList2.get(3);
                            concurrentHashMap = concurrentHashMap2;
                            it = it2;
                            BigDecimal subtract = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(4)).doubleValue(), bigDecimal3.doubleValue()) * 57.29577951308232d).subtract(valueOf);
                            DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                            decimalFormat3.setRoundingMode(RoundingMode.DOWN);
                            arrayList4.add(Double.valueOf(AFc1tSDK.values(decimalFormat3.format(subtract))));
                            BigDecimal subtract2 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                            DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                            decimalFormat4.setRoundingMode(RoundingMode.DOWN);
                            arrayList4.add(Double.valueOf(AFc1tSDK.values(decimalFormat4.format(subtract2))));
                        } else {
                            concurrentHashMap = concurrentHashMap2;
                            it = it2;
                        }
                        arrayList = new ArrayList();
                        arrayList.add(arrayList3);
                        arrayList.add(arrayList4);
                    } else {
                        concurrentHashMap = concurrentHashMap2;
                        it = it2;
                        aFa1zSDK2 = aFa1zSDK;
                        ArrayList arrayList5 = new ArrayList();
                        if (arrayList2.size() > 5) {
                            BigDecimal subtract3 = ((BigDecimal) arrayList2.get(3)).subtract((BigDecimal) arrayList2.get(0));
                            DecimalFormat decimalFormat5 = new DecimalFormat("##.#");
                            decimalFormat5.setRoundingMode(RoundingMode.DOWN);
                            arrayList5.add(Double.valueOf(AFc1tSDK.values(decimalFormat5.format(subtract3))));
                            BigDecimal subtract4 = ((BigDecimal) arrayList2.get(4)).subtract((BigDecimal) arrayList2.get(1));
                            DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                            decimalFormat6.setRoundingMode(RoundingMode.DOWN);
                            arrayList5.add(Double.valueOf(AFc1tSDK.values(decimalFormat6.format(subtract4))));
                            BigDecimal subtract5 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                            DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                            decimalFormat7.setRoundingMode(RoundingMode.DOWN);
                            arrayList5.add(Double.valueOf(AFc1tSDK.values(decimalFormat7.format(subtract5))));
                        }
                        ArrayList arrayList6 = new ArrayList();
                        BigDecimal bigDecimal4 = (BigDecimal) arrayList2.get(0);
                        DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                        decimalFormat8.setRoundingMode(RoundingMode.DOWN);
                        arrayList6.add(Double.valueOf(AFc1tSDK.values(decimalFormat8.format(bigDecimal4))));
                        BigDecimal bigDecimal5 = (BigDecimal) arrayList2.get(1);
                        DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                        decimalFormat9.setRoundingMode(RoundingMode.DOWN);
                        arrayList6.add(Double.valueOf(AFc1tSDK.values(decimalFormat9.format(bigDecimal5))));
                        BigDecimal bigDecimal6 = (BigDecimal) arrayList2.get(2);
                        DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                        decimalFormat10.setRoundingMode(RoundingMode.DOWN);
                        arrayList6.add(Double.valueOf(AFc1tSDK.values(decimalFormat10.format(bigDecimal6))));
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(arrayList6);
                        arrayList7.add(arrayList5);
                        arrayList = arrayList7;
                    }
                    hashMap2.put("v", arrayList);
                    hashMap.put(AFi1mSDK.AFa1vSDK.values()[num.intValue()].AFKeystoreWrapper, hashMap2);
                    if (aFa1zSDK2 == AFi1mSDK.AFa1zSDK.FIRST) {
                        hashMap.put("er", "no_svs");
                    }
                    concurrentHashMap2 = concurrentHashMap;
                    it2 = it;
                } else {
                    hashMap = new HashMap();
                    hashMap.put("er", "na");
                    break;
                }
            }
            concurrentHashMap2.put("sensors", hashMap);
            return concurrentHashMap2;
        }
        concurrentHashMap2.put("sensors", "na");
        return concurrentHashMap2;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final Map<String, Object> AFInAppEventType() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> e = e();
        if (!e.isEmpty()) {
            concurrentHashMap.put("sensors", e);
            return concurrentHashMap;
        }
        List<Map<String, Object>> d = d();
        if (!d.isEmpty()) {
            concurrentHashMap.put("sensors", d);
        }
        return concurrentHashMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFi1nSDK(Context context, ExecutorService executorService) {
        this(r3, new Handler(r0.getLooper()), executorService);
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
    }
}
