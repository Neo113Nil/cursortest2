package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class AFd1uSDK<Result> implements Comparable<AFd1uSDK<?>>, Callable<AFd1ySDK> {
    private static final AtomicInteger afInfoLog = new AtomicInteger();
    public volatile int AFInAppEventParameterName;
    public final Set<AFd1vSDK> AFInAppEventType;
    public AFd1ySDK AFKeystoreWrapper;
    private long AFLogger;
    private boolean AFVersionDeclaration;
    private Throwable afDebugLog;
    private final int afErrorLog;
    private final String afRDLog;
    public final Set<AFd1vSDK> valueOf;
    public final AFd1vSDK values;

    protected abstract boolean AFInAppEventType();

    protected abstract long AFKeystoreWrapper();

    protected void valueOf() {
    }

    protected void valueOf(Throwable th) {
    }

    protected abstract AFd1ySDK values() throws Exception;

    public AFd1uSDK(AFd1vSDK aFd1vSDK, AFd1vSDK[] aFd1vSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.AFInAppEventType = hashSet;
        this.valueOf = new HashSet();
        int incrementAndGet = afInfoLog.incrementAndGet();
        this.afErrorLog = incrementAndGet;
        this.AFVersionDeclaration = false;
        this.AFInAppEventParameterName = 0;
        this.values = aFd1vSDK;
        Collections.addAll(hashSet, aFd1vSDKArr);
        if (str != null) {
            this.afRDLog = str;
        } else {
            this.afRDLog = String.valueOf(incrementAndGet);
        }
    }

    public void AFInAppEventParameterName() {
        this.AFVersionDeclaration = true;
    }

    protected final boolean AFLogger() {
        return this.AFVersionDeclaration;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: afErrorLog, reason: merged with bridge method [inline-methods] */
    public final AFd1ySDK call() throws Exception {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.AFKeystoreWrapper = null;
        this.afDebugLog = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.AFInAppEventParameterName++;
        try {
            AFd1ySDK values = values();
            this.AFKeystoreWrapper = values;
            return values;
        } finally {
        }
    }

    public final Throwable afInfoLog() {
        return this.afDebugLog;
    }

    @Override // java.lang.Comparable
    /* renamed from: values, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFd1uSDK<?> aFd1uSDK) {
        int i = this.values.onAttributionFailureNative - aFd1uSDK.values.onAttributionFailureNative;
        if (i != 0) {
            return i;
        }
        if (this.afRDLog.equals(aFd1uSDK.afRDLog)) {
            return 0;
        }
        return this.afErrorLog - aFd1uSDK.afErrorLog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFd1uSDK aFd1uSDK = (AFd1uSDK) obj;
        if (this.values != aFd1uSDK.values) {
            return false;
        }
        return this.afRDLog.equals(aFd1uSDK.afRDLog);
    }

    public final int hashCode() {
        return (this.values.hashCode() * 31) + this.afRDLog.hashCode();
    }

    public String toString() {
        String obj = new StringBuilder().append(this.values).append("-").append(this.afRDLog).toString();
        return !String.valueOf(this.afErrorLog).equals(this.afRDLog) ? new StringBuilder().append(obj).append("-").append(this.afErrorLog).toString() : obj;
    }
}
