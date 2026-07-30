package com.appsflyer.internal;

import com.appsflyer.internal.AFe1qSDK.AnonymousClass1;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFa1uSDK implements Runnable {
    private final Map<String, Object> getCurrencyIso4217Code;
    private final AFd1zSDK getMediationNetwork;
    private final AFh1sSDK getRevenue;

    public AFa1uSDK(AFd1zSDK aFd1zSDK, AFh1sSDK aFh1sSDK, Map<String, ? extends Object> map) {
        aFd1zSDK.getClass();
        aFh1sSDK.getClass();
        this.getMediationNetwork = aFd1zSDK;
        this.getRevenue = aFh1sSDK;
        this.getCurrencyIso4217Code = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFf1rSDK aFf1rSDK;
        if (this.getRevenue.AFAdRevenueData()) {
            AFf1tSDK aFf1tSDK = new AFf1tSDK(this.getRevenue, this.getMediationNetwork);
            aFf1tSDK.copy = this.getCurrencyIso4217Code;
            aFf1rSDK = aFf1tSDK;
        } else {
            aFf1rSDK = this.getRevenue instanceof AFh1qSDK ? new AFf1xSDK((AFh1qSDK) this.getRevenue, this.getMediationNetwork) : new AFf1rSDK(this.getRevenue, this.getMediationNetwork);
        }
        AFe1qSDK equals = this.getMediationNetwork.equals();
        equals.getMonetizationNetwork.execute(equals.new AnonymousClass1(aFf1rSDK));
    }
}
