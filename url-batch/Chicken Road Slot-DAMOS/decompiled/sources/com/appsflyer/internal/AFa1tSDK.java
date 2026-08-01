package com.appsflyer.internal;

import com.appsflyer.internal.AFe1oSDK.AnonymousClass1;
import com.appsflyer.internal.AFe1rSDK;
import com.appsflyer.internal.AFe1sSDK;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFa1tSDK implements Runnable {
    private final AFh1mSDK getCurrencyIso4217Code;
    private final AFd1zSDK getMonetizationNetwork;
    private final Map<String, Object> getRevenue;

    public AFa1tSDK(AFd1zSDK aFd1zSDK, AFh1mSDK aFh1mSDK, Map<String, ? extends Object> map) {
        aFd1zSDK.getClass();
        aFh1mSDK.getClass();
        this.getMonetizationNetwork = aFd1zSDK;
        this.getCurrencyIso4217Code = aFh1mSDK;
        this.getRevenue = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFf1sSDK aFf1sSDK;
        if (this.getCurrencyIso4217Code.getRevenue()) {
            AFf1rSDK aFf1rSDK = new AFf1rSDK(this.getCurrencyIso4217Code, this.getMonetizationNetwork);
            aFf1rSDK.hashCode = this.getRevenue;
            aFf1sSDK = aFf1rSDK;
        } else {
            aFf1sSDK = this.getCurrencyIso4217Code instanceof AFh1lSDK ? new AFf1tSDK((AFh1lSDK) this.getCurrencyIso4217Code, this.getMonetizationNetwork) : new AFf1sSDK(this.getCurrencyIso4217Code, this.getMonetizationNetwork);
        }
        AFe1oSDK copydefault = this.getMonetizationNetwork.copydefault();
        copydefault.getCurrencyIso4217Code.execute(copydefault.new AnonymousClass1(aFf1sSDK));
        this.getMonetizationNetwork.AFKeystoreWrapper();
        if (AFe1vSDK.getMediationNetwork()) {
            AFe1sSDK currencyIso4217Code = this.getMonetizationNetwork.getCurrencyIso4217Code();
            AFh1mSDK aFh1mSDK = this.getCurrencyIso4217Code;
            aFh1mSDK.getClass();
            if (AFj1kSDK.getRevenue(currencyIso4217Code.AFAdRevenueData.getMonetizationNetwork)) {
                AFe1rSDK.Companion companion = AFe1rSDK.INSTANCE;
                AFe1rSDK mediationNetwork = AFe1rSDK.Companion.getMediationNetwork(aFh1mSDK);
                if (mediationNetwork == null) {
                    return;
                }
                currencyIso4217Code.AFAdRevenueData(mediationNetwork, AFe1sSDK.AnonymousClass4.getCurrencyIso4217Code);
            }
        }
    }
}
