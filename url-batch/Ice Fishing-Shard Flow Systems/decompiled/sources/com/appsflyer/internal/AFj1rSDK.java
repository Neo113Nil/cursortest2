package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1zSDK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class AFj1rSDK {
    public final CopyOnWriteArrayList<AFj1zSDK> AFAdRevenueData = new CopyOnWriteArrayList<>();
    public final AFd1zSDK getCurrencyIso4217Code;

    public AFj1rSDK(AFd1zSDK aFd1zSDK) {
        this.getCurrencyIso4217Code = aFd1zSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void areAllFieldsValid(Runnable runnable) {
        AFj1xSDK aFj1xSDK = new AFj1xSDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getCurrencyIso4217Code(), AFj1vSDK.INSTAGRAM, runnable, new n(this, runnable, 2));
        this.AFAdRevenueData.add(aFj1xSDK);
        aFj1xSDK.getMonetizationNetwork(this.getCurrencyIso4217Code.registerClient().getCurrencyIso4217Code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(Runnable runnable) {
        this.getCurrencyIso4217Code.getCurrencyIso4217Code().execute(new n(this, runnable, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
        int i2 = 0;
        List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
        if (queryIntentContentProviders == null || queryIntentContentProviders.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
        while (it.hasNext()) {
            ProviderInfo providerInfo = it.next().providerInfo;
            if (providerInfo != null) {
                arrayList.add(new AFj1wSDK(providerInfo, runnable, aFd1zSDK));
            } else {
                AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.AFAdRevenueData.addAll(arrayList);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
        StringBuilder sb = new StringBuilder("Detected ");
        sb.append(arrayList.size());
        sb.append(" valid preinstall provider(s)");
        aFLogger.d(aFg1cSDK, sb.toString());
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((AFj1zSDK) obj).getMonetizationNetwork(aFd1zSDK.registerClient().getCurrencyIso4217Code);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getRevenue() {
    }

    public final AFi1aSDK AFAdRevenueData(Runnable runnable) {
        return new AFi1aSDK(new n(this, runnable, 1), this.getCurrencyIso4217Code.getCurrencyIso4217Code(), this.getCurrencyIso4217Code.AFAdRevenueData());
    }

    public final void getMediationNetwork(Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
        if (aFd1zSDK.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0) > 0) {
            AFLogger.INSTANCE.d(AFg1cSDK.PREINSTALL, "Preinstall referrer will not load, the counter >= 1, ");
        } else {
            aFd1zSDK.getCurrencyIso4217Code().execute(new o(this, context, runnable, aFd1zSDK, 0));
        }
    }

    public final void getRevenue(Runnable runnable) {
        this.AFAdRevenueData.add(new AFj1xSDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getCurrencyIso4217Code(), AFj1vSDK.FACEBOOK, runnable, new n(this, runnable, 3)));
    }

    public final boolean getCurrencyIso4217Code(AFh1sSDK aFh1sSDK) {
        int currencyIso4217Code = this.getCurrencyIso4217Code.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0);
        return (!this.getCurrencyIso4217Code.getMediationNetwork().getRevenue(AppsFlyerProperties.NEW_REFERRER_SENT) && currencyIso4217Code == 1) || (currencyIso4217Code == 1 && !(aFh1sSDK instanceof AFh1pSDK));
    }

    public final boolean AFAdRevenueData() {
        Iterator<AFj1zSDK> it = this.AFAdRevenueData.iterator();
        while (it.hasNext()) {
            if (it.next().component2 == AFj1zSDK.AFa1ySDK.STARTED) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(Runnable runnable) {
        try {
            if (getCurrencyIso4217Code(new AFh1pSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public final Runnable getCurrencyIso4217Code(AFi1aSDK aFi1aSDK, Runnable runnable) {
        return new B5.b(this, aFi1aSDK, runnable, 5);
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork("AF_PREINSTALL_DISABLED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFi1aSDK aFi1aSDK, Runnable runnable) {
        AFc1jSDK mediationNetwork = this.getCurrencyIso4217Code.getMediationNetwork();
        int currencyIso4217Code = this.getCurrencyIso4217Code.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0);
        boolean revenue = mediationNetwork.getRevenue(AppsFlyerProperties.NEW_REFERRER_SENT);
        boolean z7 = aFi1aSDK.component2 == AFj1zSDK.AFa1ySDK.NOT_STARTED;
        if (currencyIso4217Code == 1) {
            if (z7 || revenue) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(Runnable runnable) {
        AFj1xSDK aFj1xSDK = new AFj1xSDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getCurrencyIso4217Code(), AFj1vSDK.FACEBOOK_LITE, runnable, new p(0));
        this.AFAdRevenueData.add(aFj1xSDK);
        aFj1xSDK.getMonetizationNetwork(this.getCurrencyIso4217Code.registerClient().getCurrencyIso4217Code);
    }
}
