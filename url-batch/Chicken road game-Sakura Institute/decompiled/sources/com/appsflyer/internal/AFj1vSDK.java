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

/* loaded from: classes3.dex */
public final class AFj1vSDK implements AFi1cSDK {
    private static final BitSet AFInAppEventType;
    private final Handler AFInAppEventParameterName;
    private final Object AFKeystoreWrapper;
    private final Map<AFi1dSDK, Map<String, Object>> AFLogger;
    private final Runnable afInfoLog;
    private boolean d;
    private final Map<AFi1dSDK, AFi1dSDK> e;
    private final Runnable force;
    private final Runnable registerClient;
    private boolean unregisterClient;
    private final SensorManager valueOf;
    private final ExecutorService values;

    static {
        BitSet bitSet = new BitSet(6);
        AFInAppEventType = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFLogger() {
        synchronized (this.AFKeystoreWrapper) {
            this.AFInAppEventParameterName.post(new AFj1vSDK$$ExternalSyntheticLambda0(this));
        }
    }

    private AFj1vSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.AFKeystoreWrapper = new Object();
        BitSet bitSet = AFInAppEventType;
        this.e = new HashMap(bitSet.size());
        this.AFLogger = new ConcurrentHashMap(bitSet.size());
        this.registerClient = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1vSDK.this.AFKeystoreWrapper) {
                    AFj1vSDK.this.AFKeystoreWrapper();
                    AFj1vSDK.this.AFInAppEventParameterName.postDelayed(AFj1vSDK.this.force, 150L);
                    AFj1vSDK.this.unregisterClient = true;
                }
            }
        };
        this.force = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFj1vSDK.this.AFLogger();
            }
        };
        this.afInfoLog = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1vSDK.this.AFKeystoreWrapper) {
                    if (AFj1vSDK.this.unregisterClient) {
                        AFj1vSDK.this.AFInAppEventParameterName.removeCallbacks(AFj1vSDK.this.registerClient);
                        AFj1vSDK.this.AFInAppEventParameterName.removeCallbacks(AFj1vSDK.this.force);
                        AFj1vSDK.this.AFInAppEventType();
                        AFj1vSDK.this.unregisterClient = false;
                    }
                }
            }
        };
        this.valueOf = sensorManager;
        this.AFInAppEventParameterName = handler;
        this.values = executorService;
    }

    private static boolean valueOf(int i) {
        return i >= 0 && AFInAppEventType.get(i);
    }

    @Override // com.appsflyer.internal.AFi1cSDK
    public final void values() {
        this.AFInAppEventParameterName.post(this.afInfoLog);
        this.AFInAppEventParameterName.post(this.registerClient);
    }

    @Override // com.appsflyer.internal.AFi1cSDK
    public final synchronized void AFInAppEventParameterName() {
        this.AFInAppEventParameterName.post(this.afInfoLog);
    }

    final void AFKeystoreWrapper() {
        this.AFInAppEventParameterName.post(new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFj1vSDK.this.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        try {
            for (Sensor sensor : this.valueOf.getSensorList(-1)) {
                if (valueOf(sensor.getType())) {
                    AFi1dSDK aFi1dSDK = new AFi1dSDK(sensor, this.values);
                    if (!this.e.containsKey(aFi1dSDK)) {
                        this.e.put(aFi1dSDK, aFi1dSDK);
                    }
                    this.valueOf.registerListener(this.e.get(aFi1dSDK), sensor, 1, this.AFInAppEventParameterName);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.d = true;
    }

    final void AFInAppEventType() {
        this.AFInAppEventParameterName.post(new AFj1vSDK$$ExternalSyntheticLambda0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void unregisterClient() {
        try {
            if (!this.e.isEmpty()) {
                for (AFi1dSDK aFi1dSDK : this.e.values()) {
                    this.valueOf.unregisterListener(aFi1dSDK);
                    aFi1dSDK.AFInAppEventType(this.AFLogger, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.d = false;
    }

    private List<Map<String, Object>> d() {
        synchronized (this.AFKeystoreWrapper) {
            Iterator<AFi1dSDK> it = this.e.values().iterator();
            while (it.hasNext()) {
                it.next().AFInAppEventType(this.AFLogger, true);
            }
            if (this.AFLogger.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.AFLogger.values());
        }
    }

    private List<Map<String, Object>> registerClient() {
        synchronized (this.AFKeystoreWrapper) {
            if (!this.e.isEmpty() && this.d) {
                Iterator<AFi1dSDK> it = this.e.values().iterator();
                while (it.hasNext()) {
                    it.next().AFInAppEventType(this.AFLogger, false);
                }
            }
            if (this.AFLogger.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.AFLogger.values());
        }
    }

    @Override // com.appsflyer.internal.AFi1cSDK
    public final Map<String, Object> valueOf() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> registerClient = registerClient();
        if (!registerClient.isEmpty()) {
            concurrentHashMap.put("sensors", registerClient);
        } else {
            List<Map<String, Object>> d = d();
            if (!d.isEmpty()) {
                concurrentHashMap.put("sensors", d);
            }
        }
        return concurrentHashMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1vSDK(Context context, ExecutorService executorService) {
        this(r3, new Handler(r0.getLooper()), executorService);
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
    }
}
