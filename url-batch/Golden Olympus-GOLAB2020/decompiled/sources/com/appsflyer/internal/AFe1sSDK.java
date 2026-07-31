package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class AFe1sSDK<Result> implements Comparable<AFe1sSDK<?>>, Callable<AFe1rSDK> {
    private static final AtomicInteger component4 = new AtomicInteger();
    public final Set<AFe1mSDK> AFAdRevenueData;
    private Throwable areAllFieldsValid;
    private final String component1;
    private final int component2;
    private long component3;
    public final Set<AFe1mSDK> getCurrencyIso4217Code;
    public AFe1rSDK getMediationNetwork;
    public final AFe1mSDK getMonetizationNetwork;
    public volatile int getRevenue;
    private boolean hashCode;

    public AFe1sSDK(AFe1mSDK aFe1mSDK, AFe1mSDK[] aFe1mSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.getCurrencyIso4217Code = hashSet;
        this.AFAdRevenueData = new HashSet();
        int incrementAndGet = component4.incrementAndGet();
        this.component2 = incrementAndGet;
        this.hashCode = false;
        this.getRevenue = 0;
        this.getMonetizationNetwork = aFe1mSDK;
        Collections.addAll(hashSet, aFe1mSDKArr);
        if (str != null) {
            this.component1 = str;
        } else {
            this.component1 = String.valueOf(incrementAndGet);
        }
    }

    public void AFAdRevenueData() {
        this.hashCode = true;
    }

    protected final boolean areAllFieldsValid() {
        return this.hashCode;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: component2, reason: merged with bridge method [inline-methods] */
    public final AFe1rSDK call() {
        TrafficStats.setThreadStatsTag(82339054);
        this.getMediationNetwork = null;
        this.areAllFieldsValid = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.getRevenue++;
        try {
            AFe1rSDK currencyIso4217Code = getCurrencyIso4217Code();
            this.getMediationNetwork = currencyIso4217Code;
            return currencyIso4217Code;
        } finally {
        }
    }

    public final Throwable component4() {
        return this.areAllFieldsValid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1sSDK aFe1sSDK = (AFe1sSDK) obj;
        if (this.getMonetizationNetwork != aFe1sSDK.getMonetizationNetwork) {
            return false;
        }
        return this.component1.equals(aFe1sSDK.component1);
    }

    protected abstract AFe1rSDK getCurrencyIso4217Code();

    protected void getCurrencyIso4217Code(Throwable th) {
    }

    protected abstract boolean getMediationNetwork();

    protected abstract long getMonetizationNetwork();

    public void getRevenue() {
    }

    public final int hashCode() {
        return (this.getMonetizationNetwork.hashCode() * 31) + this.component1.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMonetizationNetwork);
        sb.append("-");
        sb.append(this.component1);
        String obj = sb.toString();
        if (String.valueOf(this.component2).equals(this.component1)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("-");
        sb2.append(this.component2);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1sSDK<?> aFe1sSDK) {
        int i4 = this.getMonetizationNetwork.f13364w - aFe1sSDK.getMonetizationNetwork.f13364w;
        if (i4 != 0) {
            return i4;
        }
        if (this.component1.equals(aFe1sSDK.component1)) {
            return 0;
        }
        return this.component2 - aFe1sSDK.component2;
    }
}
