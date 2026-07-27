package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class AFe1dSDK<Result> implements Comparable<AFe1dSDK<?>>, Callable<AFe1bSDK> {
    private static final AtomicInteger unregisterClient = new AtomicInteger();
    public final Set<AFf1zSDK> AFInAppEventParameterName;
    public final AFf1zSDK AFInAppEventType;
    public volatile int AFKeystoreWrapper;
    private long AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f5878d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5879e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5880i;
    private final String registerClient;
    public final Set<AFf1zSDK> valueOf;
    public AFe1bSDK values;

    public AFe1dSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.valueOf = hashSet;
        this.AFInAppEventParameterName = new HashSet();
        int incrementAndGet = unregisterClient.incrementAndGet();
        this.f5879e = incrementAndGet;
        this.f5880i = false;
        this.AFKeystoreWrapper = 0;
        this.AFInAppEventType = aFf1zSDK;
        Collections.addAll(hashSet, aFf1zSDKArr);
        if (str != null) {
            this.registerClient = str;
        } else {
            this.registerClient = String.valueOf(incrementAndGet);
        }
    }

    public abstract long AFInAppEventParameterName();

    public void AFInAppEventParameterName(Throwable th) {
    }

    public void AFInAppEventType() {
    }

    public abstract AFe1bSDK AFKeystoreWrapper();

    @Override // java.util.concurrent.Callable
    /* renamed from: AFLogger, reason: merged with bridge method [inline-methods] */
    public final AFe1bSDK call() {
        TrafficStats.setThreadStatsTag(82339054);
        this.values = null;
        this.f5878d = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.AFKeystoreWrapper++;
        try {
            AFe1bSDK AFKeystoreWrapper = AFKeystoreWrapper();
            this.values = AFKeystoreWrapper;
            return AFKeystoreWrapper;
        } finally {
        }
    }

    public final boolean d() {
        return this.f5880i;
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
        return this.registerClient.hashCode() + (this.AFInAppEventType.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.AFInAppEventType);
        sb.append("-");
        sb.append(this.registerClient);
        String obj = sb.toString();
        if (String.valueOf(this.f5879e).equals(this.registerClient)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("-");
        sb2.append(this.f5879e);
        return sb2.toString();
    }

    public final Throwable unregisterClient() {
        return this.f5878d;
    }

    public abstract boolean valueOf();

    public void values() {
        this.f5880i = true;
    }

    @Override // java.lang.Comparable
    /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1dSDK<?> aFe1dSDK) {
        int i2 = this.AFInAppEventType.AFPurchaseDetails - aFe1dSDK.AFInAppEventType.AFPurchaseDetails;
        if (i2 != 0) {
            return i2;
        }
        if (this.registerClient.equals(aFe1dSDK.registerClient)) {
            return 0;
        }
        return this.f5879e - aFe1dSDK.f5879e;
    }
}
