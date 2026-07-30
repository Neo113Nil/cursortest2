package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFf1eSDK;
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

/* loaded from: classes.dex */
public final class AFf1bSDK implements AFf1fSDK {
    private static final BitSet afDebugLog;
    boolean AFInAppEventParameterName;
    final Runnable AFInAppEventType;
    final Handler AFKeystoreWrapper;
    private boolean AFLogger;
    private long AFLogger$LogLevel;
    private final Map<AFf1dSDK, AFf1dSDK> afErrorLog;
    private final Runnable afErrorLogForExcManagerOnly;
    private final Map<AFf1dSDK, Map<String, Object>> afInfoLog;
    private final SensorManager afRDLog;
    private int afWarnLog;
    private Runnable getLevel;
    final Object valueOf;
    final Runnable values;

    static {
        BitSet bitSet = new BitSet(6);
        afDebugLog = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void afErrorLog() {
        synchronized (this.valueOf) {
            this.AFKeystoreWrapper.post(new AnonymousClass3());
        }
    }

    private AFf1bSDK(SensorManager sensorManager, Handler handler) {
        this.valueOf = new Object();
        BitSet bitSet = afDebugLog;
        this.afErrorLog = new HashMap(bitSet.size());
        this.afInfoLog = new ConcurrentHashMap(bitSet.size());
        this.AFInAppEventType = new Runnable() { // from class: com.appsflyer.internal.AFf1bSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFf1bSDK.this.valueOf) {
                    final AFf1bSDK aFf1bSDK = AFf1bSDK.this;
                    aFf1bSDK.AFKeystoreWrapper.post(new Runnable() { // from class: com.appsflyer.internal.AFf1bSDK.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                for (Sensor sensor : AFf1bSDK.this.afRDLog.getSensorList(-1)) {
                                    if (AFf1bSDK.AFInAppEventType(sensor.getType())) {
                                        AFf1dSDK aFf1dSDK = new AFf1dSDK(sensor);
                                        if (!AFf1bSDK.this.afErrorLog.containsKey(aFf1dSDK)) {
                                            AFf1bSDK.this.afErrorLog.put(aFf1dSDK, aFf1dSDK);
                                        }
                                        AFf1bSDK.this.afRDLog.registerListener((SensorEventListener) AFf1bSDK.this.afErrorLog.get(aFf1dSDK), sensor, 0, AFf1bSDK.this.AFKeystoreWrapper);
                                    }
                                }
                            } catch (Throwable th) {
                                AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
                            }
                            AFf1bSDK.this.AFLogger = true;
                        }
                    });
                    AFf1bSDK.this.AFKeystoreWrapper.postDelayed(AFf1bSDK.this.afErrorLogForExcManagerOnly, 100L);
                    AFf1bSDK.this.AFInAppEventParameterName = true;
                }
            }
        };
        this.values = new Runnable() { // from class: com.appsflyer.internal.AFf1bSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFf1bSDK.this.afErrorLog();
            }
        };
        this.getLevel = new Runnable() { // from class: com.appsflyer.internal.AFf1bSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFf1bSDK.this.valueOf) {
                    if (AFf1bSDK.this.AFInAppEventParameterName) {
                        AFf1bSDK.this.AFKeystoreWrapper.removeCallbacks(AFf1bSDK.this.AFInAppEventType);
                        AFf1bSDK.this.AFKeystoreWrapper.removeCallbacks(AFf1bSDK.this.values);
                        AFf1bSDK aFf1bSDK = AFf1bSDK.this;
                        aFf1bSDK.AFKeystoreWrapper.post(aFf1bSDK.new AnonymousClass3());
                        AFf1bSDK.this.AFInAppEventParameterName = false;
                    }
                }
            }
        };
        this.afWarnLog = 1;
        this.AFLogger$LogLevel = 0L;
        this.afErrorLogForExcManagerOnly = new Runnable() { // from class: com.appsflyer.internal.AFf1bSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFf1bSDK.this.valueOf) {
                    if (AFf1bSDK.this.afWarnLog == 0) {
                        AFf1bSDK.this.afWarnLog = 1;
                    }
                    AFf1bSDK.this.AFKeystoreWrapper.postDelayed(AFf1bSDK.this.values, AFf1bSDK.this.afWarnLog * 500);
                }
            }
        };
        this.afRDLog = sensorManager;
        this.AFKeystoreWrapper = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AFInAppEventType(int i) {
        return i >= 0 && afDebugLog.get(i);
    }

    @Override // com.appsflyer.internal.AFf1fSDK
    public final void AFInAppEventType() {
        this.AFKeystoreWrapper.post(this.getLevel);
        this.AFKeystoreWrapper.post(this.AFInAppEventType);
    }

    @Override // com.appsflyer.internal.AFf1fSDK
    public final synchronized void values() {
        this.AFKeystoreWrapper.post(this.getLevel);
    }

    /* renamed from: com.appsflyer.internal.AFf1bSDK$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {
        AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!AFf1bSDK.this.afErrorLog.isEmpty()) {
                    for (AFf1dSDK aFf1dSDK : AFf1bSDK.this.afErrorLog.values()) {
                        AFf1bSDK.this.afRDLog.unregisterListener(aFf1dSDK);
                        aFf1dSDK.AFKeystoreWrapper(AFf1bSDK.this.afInfoLog, true);
                    }
                }
            } catch (Throwable th) {
                AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
            }
            AFf1bSDK.this.afWarnLog = 0;
            AFf1bSDK.this.AFLogger = false;
        }
    }

    private List<Map<String, Object>> AFInAppEventParameterName() {
        Iterator<AFf1dSDK> it = this.afErrorLog.values().iterator();
        while (it.hasNext()) {
            it.next().AFKeystoreWrapper(this.afInfoLog, true);
        }
        Map<AFf1dSDK, Map<String, Object>> map = this.afInfoLog;
        if (map == null || map.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.afInfoLog.values());
    }

    private List<Map<String, Object>> afInfoLog() {
        synchronized (this.valueOf) {
            if (!this.afErrorLog.isEmpty() && this.AFLogger) {
                Iterator<AFf1dSDK> it = this.afErrorLog.values().iterator();
                while (it.hasNext()) {
                    it.next().AFKeystoreWrapper(this.afInfoLog, false);
                }
            }
            if (this.afInfoLog.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.afInfoLog.values());
        }
    }

    @Override // com.appsflyer.internal.AFf1fSDK
    public final Map<String, Object> valueOf() throws ParseException {
        AFf1eSDK.AFa1zSDK aFa1zSDK;
        ConcurrentHashMap concurrentHashMap;
        Iterator<Map<String, Object>> it;
        AFf1eSDK.AFa1zSDK aFa1zSDK2;
        ArrayList arrayList;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        List<Map<String, Object>> AFInAppEventParameterName = AFInAppEventParameterName();
        if (!AFInAppEventParameterName.isEmpty()) {
            new AFf1eSDK();
            HashMap hashMap = new HashMap();
            Iterator<Map<String, Object>> it2 = AFInAppEventParameterName.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map<String, Object> next = it2.next();
                HashMap hashMap2 = new HashMap();
                boolean z = next.get("sVS") != null;
                boolean z2 = next.get("sVE") != null;
                if (z && z2) {
                    aFa1zSDK = AFf1eSDK.AFa1zSDK.ALL;
                } else if (z) {
                    aFa1zSDK = AFf1eSDK.AFa1zSDK.FIRST;
                } else {
                    aFa1zSDK = AFf1eSDK.AFa1zSDK.NONE;
                }
                if (aFa1zSDK != AFf1eSDK.AFa1zSDK.NONE) {
                    Integer num = (Integer) next.get("sT");
                    String str = (String) next.get("sN");
                    if (str == null) {
                        hashMap2.put("n", "uk");
                    } else {
                        hashMap2.put("n", str);
                    }
                    AFf1eSDK.AFa1vSDK aFa1vSDK = AFf1eSDK.AFa1vSDK.values()[num.intValue()];
                    ArrayList arrayList2 = new ArrayList(AFf1eSDK.AFKeystoreWrapper(next.get("sVS")));
                    if (aFa1zSDK == AFf1eSDK.AFa1zSDK.ALL) {
                        arrayList2.addAll(AFf1eSDK.AFKeystoreWrapper(next.get("sVE")));
                    }
                    if (aFa1vSDK == AFf1eSDK.AFa1vSDK.MAGNETOMETER) {
                        ArrayList arrayList3 = new ArrayList();
                        BigDecimal bigDecimal = (BigDecimal) arrayList2.get(0);
                        aFa1zSDK2 = aFa1zSDK;
                        BigDecimal valueOf = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(1)).doubleValue(), bigDecimal.doubleValue()) * 57.29577951308232d);
                        DecimalFormat decimalFormat = new DecimalFormat("##.#");
                        decimalFormat.setRoundingMode(RoundingMode.DOWN);
                        arrayList3.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat.format(valueOf))));
                        BigDecimal bigDecimal2 = (BigDecimal) arrayList2.get(2);
                        DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                        decimalFormat2.setRoundingMode(RoundingMode.DOWN);
                        arrayList3.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat2.format(bigDecimal2))));
                        ArrayList arrayList4 = new ArrayList();
                        if (arrayList2.size() > 5) {
                            BigDecimal bigDecimal3 = (BigDecimal) arrayList2.get(3);
                            concurrentHashMap = concurrentHashMap2;
                            it = it2;
                            BigDecimal subtract = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(4)).doubleValue(), bigDecimal3.doubleValue()) * 57.29577951308232d).subtract(valueOf);
                            DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                            decimalFormat3.setRoundingMode(RoundingMode.DOWN);
                            arrayList4.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat3.format(subtract))));
                            BigDecimal subtract2 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                            DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                            decimalFormat4.setRoundingMode(RoundingMode.DOWN);
                            arrayList4.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat4.format(subtract2))));
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
                            arrayList5.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat5.format(subtract3))));
                            BigDecimal subtract4 = ((BigDecimal) arrayList2.get(4)).subtract((BigDecimal) arrayList2.get(1));
                            DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                            decimalFormat6.setRoundingMode(RoundingMode.DOWN);
                            arrayList5.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat6.format(subtract4))));
                            BigDecimal subtract5 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                            DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                            decimalFormat7.setRoundingMode(RoundingMode.DOWN);
                            arrayList5.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat7.format(subtract5))));
                        }
                        ArrayList arrayList6 = new ArrayList();
                        BigDecimal bigDecimal4 = (BigDecimal) arrayList2.get(0);
                        DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                        decimalFormat8.setRoundingMode(RoundingMode.DOWN);
                        arrayList6.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat8.format(bigDecimal4))));
                        BigDecimal bigDecimal5 = (BigDecimal) arrayList2.get(1);
                        DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                        decimalFormat9.setRoundingMode(RoundingMode.DOWN);
                        arrayList6.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat9.format(bigDecimal5))));
                        BigDecimal bigDecimal6 = (BigDecimal) arrayList2.get(2);
                        DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                        decimalFormat10.setRoundingMode(RoundingMode.DOWN);
                        arrayList6.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat10.format(bigDecimal6))));
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(arrayList6);
                        arrayList7.add(arrayList5);
                        arrayList = arrayList7;
                    }
                    hashMap2.put("v", arrayList);
                    hashMap.put(AFf1eSDK.AFa1wSDK.values()[num.intValue()].valueOf, hashMap2);
                    if (aFa1zSDK2 == AFf1eSDK.AFa1zSDK.FIRST) {
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

    @Override // com.appsflyer.internal.AFf1fSDK
    public final Map<String, Object> AFKeystoreWrapper() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> afInfoLog = afInfoLog();
        if (!afInfoLog.isEmpty()) {
            concurrentHashMap.put("sensors", afInfoLog);
            return concurrentHashMap;
        }
        List<Map<String, Object>> AFInAppEventParameterName = AFInAppEventParameterName();
        if (!AFInAppEventParameterName.isEmpty()) {
            concurrentHashMap.put("sensors", AFInAppEventParameterName);
        }
        return concurrentHashMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFf1bSDK(Context context) {
        this(r3, new Handler(r0.getLooper()));
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
    }
}
