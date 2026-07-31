package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1qSDK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class AFj1sSDK {
    public final List<AFj1qSDK> getCurrencyIso4217Code = new ArrayList();
    public final AFc1dSDK getMediationNetwork;

    public AFj1sSDK(AFc1dSDK aFc1dSDK) {
        this.getMediationNetwork = aFc1dSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component2(final Runnable runnable) {
        AFj1zSDK aFj1zSDK = new AFj1zSDK(this.getMediationNetwork.getRevenue(), this.getMediationNetwork.getMonetizationNetwork(), AFj1ySDK.INSTAGRAM, runnable, new Runnable() { // from class: com.appsflyer.internal.M
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.this.getMonetizationNetwork(runnable);
            }
        });
        getMediationNetwork(aFj1zSDK);
        aFj1zSDK.getRevenue(this.getMediationNetwork.AFInAppEventType().getMonetizationNetwork);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getCurrencyIso4217Code() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(AFi1aSDK aFi1aSDK, Runnable runnable) {
        AFc1qSDK component2 = this.getMediationNetwork.component2();
        int AFAdRevenueData = this.getMediationNetwork.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0);
        boolean mediationNetwork = component2.getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false);
        boolean z4 = aFi1aSDK.component4 == AFj1qSDK.AFa1ySDK.NOT_STARTED;
        if (AFAdRevenueData == 1) {
            if (z4 || mediationNetwork) {
                runnable.run();
            }
        }
    }

    public final AFi1aSDK AFAdRevenueData(final Runnable runnable) {
        return new AFi1aSDK(new Runnable() { // from class: com.appsflyer.internal.I
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.this.getCurrencyIso4217Code(runnable);
            }
        }, this.getMediationNetwork.getMonetizationNetwork(), this.getMediationNetwork.getRevenue());
    }

    public final synchronized void getMediationNetwork(AFj1qSDK aFj1qSDK) {
        this.getCurrencyIso4217Code.add(aFj1qSDK);
    }

    public final synchronized AFj1qSDK[] getRevenue() {
        return (AFj1qSDK[]) this.getCurrencyIso4217Code.toArray(new AFj1qSDK[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(final Runnable runnable) {
        AFj1dSDK.getMediationNetwork(this.getMediationNetwork.AFAdRevenueData(), new Runnable() { // from class: com.appsflyer.internal.J
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.this.getRevenue(runnable);
            }
        }, 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Runnable runnable) {
        try {
            if (getCurrencyIso4217Code(new AFh1kSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public final void getMediationNetwork(final Runnable runnable) {
        getMediationNetwork(new AFj1zSDK(this.getMediationNetwork.getRevenue(), this.getMediationNetwork.getMonetizationNetwork(), AFj1ySDK.FACEBOOK, runnable, new Runnable() { // from class: com.appsflyer.internal.L
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.this.component2(runnable);
            }
        }));
    }

    public final Runnable AFAdRevenueData(final AFi1aSDK aFi1aSDK, final Runnable runnable) {
        return new Runnable() { // from class: com.appsflyer.internal.N
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.this.getMonetizationNetwork(aFi1aSDK, runnable);
            }
        };
    }

    public final boolean getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        int AFAdRevenueData = this.getMediationNetwork.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0);
        return (!this.getMediationNetwork.component2().getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false) && AFAdRevenueData == 1) || (AFAdRevenueData == 1 && !(aFh1rSDK instanceof AFh1kSDK));
    }

    public final boolean AFAdRevenueData() {
        Iterator<AFj1qSDK> it = this.getCurrencyIso4217Code.iterator();
        while (it.hasNext()) {
            if (it.next().component4 == AFj1qSDK.AFa1ySDK.STARTED) {
                return false;
            }
        }
        return true;
    }

    public final boolean getMonetizationNetwork() {
        return this.getMediationNetwork.getRevenue().getMonetizationNetwork("AF_PREINSTALL_DISABLED", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(Runnable runnable) {
        AFj1zSDK aFj1zSDK = new AFj1zSDK(this.getMediationNetwork.getRevenue(), this.getMediationNetwork.getMonetizationNetwork(), AFj1ySDK.FACEBOOK_LITE, runnable, new Runnable() { // from class: com.appsflyer.internal.K
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.getCurrencyIso4217Code();
            }
        });
        getMediationNetwork(aFj1zSDK);
        aFj1zSDK.getRevenue(this.getMediationNetwork.AFInAppEventType().getMonetizationNetwork);
    }
}
