package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class AFe1dSDK<Result> implements Comparable<AFe1dSDK<?>>, Callable<AFe1bSDK> {
    private static final AtomicInteger AFLogger = new AtomicInteger();
    public final Set<AFe1eSDK> AFInAppEventParameterName;
    public final AFe1eSDK AFInAppEventType;
    public AFe1bSDK AFKeystoreWrapper;
    private Throwable d;
    private long e;
    private boolean i;
    private final String registerClient;
    private final int unregisterClient;
    public final Set<AFe1eSDK> valueOf;
    public volatile int values;

    protected abstract long AFInAppEventParameterName();

    protected void AFInAppEventType() {
    }

    protected void AFInAppEventType(Throwable th) {
    }

    protected abstract boolean AFKeystoreWrapper();

    protected abstract AFe1bSDK values() throws Exception;

    public AFe1dSDK(AFe1eSDK aFe1eSDK, AFe1eSDK[] aFe1eSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.AFInAppEventParameterName = hashSet;
        this.valueOf = new HashSet();
        int incrementAndGet = AFLogger.incrementAndGet();
        this.unregisterClient = incrementAndGet;
        this.i = false;
        this.values = 0;
        this.AFInAppEventType = aFe1eSDK;
        Collections.addAll(hashSet, aFe1eSDKArr);
        if (str != null) {
            this.registerClient = str;
        } else {
            this.registerClient = String.valueOf(incrementAndGet);
        }
    }

    public void valueOf() {
        this.i = true;
    }

    protected final boolean d() {
        return this.i;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AFe1bSDK call() throws Exception {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.AFKeystoreWrapper = null;
        this.d = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.values++;
        try {
            AFe1bSDK values = values();
            this.AFKeystoreWrapper = values;
            return values;
        } finally {
        }
    }

    public final Throwable AFLogger() {
        return this.d;
    }

    @Override // java.lang.Comparable
    /* renamed from: values, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1dSDK<?> aFe1dSDK) {
        int i = this.AFInAppEventType.afRDLog - aFe1dSDK.AFInAppEventType.afRDLog;
        if (i != 0) {
            return i;
        }
        if (this.registerClient.equals(aFe1dSDK.registerClient)) {
            return 0;
        }
        return this.unregisterClient - aFe1dSDK.unregisterClient;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1dSDK aFe1dSDK = (AFe1dSDK) obj;
        if (this.AFInAppEventType != aFe1dSDK.AFInAppEventType) {
            return false;
        }
        return this.registerClient.equals(aFe1dSDK.registerClient);
    }

    public final int hashCode() {
        return (this.AFInAppEventType.hashCode() * 31) + this.registerClient.hashCode();
    }

    public String toString() {
        String obj = new StringBuilder().append(this.AFInAppEventType).append("-").append(this.registerClient).toString();
        return !String.valueOf(this.unregisterClient).equals(this.registerClient) ? new StringBuilder().append(obj).append("-").append(this.unregisterClient).toString() : obj;
    }
}
