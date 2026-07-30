package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class AFe1dSDK<Result> implements Comparable<AFe1dSDK<?>>, Callable<AFe1bSDK> {
    private static final AtomicInteger unregisterClient = new AtomicInteger();
    public final Set<AFf1zSDK> AFInAppEventParameterName;
    public final AFf1zSDK AFInAppEventType;
    public volatile int AFKeystoreWrapper;
    private long AFLogger;
    private Throwable d;
    private final int e;
    private boolean i;
    private final String registerClient;
    public final Set<AFf1zSDK> valueOf;
    public AFe1bSDK values;

    protected abstract long AFInAppEventParameterName();

    protected void AFInAppEventParameterName(Throwable th) {
    }

    protected void AFInAppEventType() {
    }

    protected abstract AFe1bSDK AFKeystoreWrapper() throws Exception;

    protected abstract boolean valueOf();

    public AFe1dSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.valueOf = hashSet;
        this.AFInAppEventParameterName = new HashSet();
        int incrementAndGet = unregisterClient.incrementAndGet();
        this.e = incrementAndGet;
        this.i = false;
        this.AFKeystoreWrapper = 0;
        this.AFInAppEventType = aFf1zSDK;
        Collections.addAll(hashSet, aFf1zSDKArr);
        if (str != null) {
            this.registerClient = str;
        } else {
            this.registerClient = String.valueOf(incrementAndGet);
        }
    }

    public void values() {
        this.i = true;
    }

    protected final boolean d() {
        return this.i;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: AFLogger, reason: merged with bridge method [inline-methods] */
    public final AFe1bSDK call() throws Exception {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.values = null;
        this.d = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.AFKeystoreWrapper++;
        try {
            AFe1bSDK AFKeystoreWrapper = AFKeystoreWrapper();
            this.values = AFKeystoreWrapper;
            return AFKeystoreWrapper;
        } finally {
        }
    }

    public final Throwable unregisterClient() {
        return this.d;
    }

    @Override // java.lang.Comparable
    /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1dSDK<?> aFe1dSDK) {
        int i = this.AFInAppEventType.AFPurchaseDetails - aFe1dSDK.AFInAppEventType.AFPurchaseDetails;
        if (i != 0) {
            return i;
        }
        if (this.registerClient.equals(aFe1dSDK.registerClient)) {
            return 0;
        }
        return this.e - aFe1dSDK.e;
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
        return !String.valueOf(this.e).equals(this.registerClient) ? new StringBuilder().append(obj).append("-").append(this.e).toString() : obj;
    }
}
