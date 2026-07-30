package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFb1bSDK;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFb1aSDK implements AFb1bSDK {
    private final AFi1rSDK AFAdRevenueData;
    private final AFa1oSDK getCurrencyIso4217Code;
    private final ScheduledExecutorService getMediationNetwork;
    private AFb1lSDK getRevenue;

    public AFb1aSDK(ScheduledExecutorService scheduledExecutorService, AFa1oSDK aFa1oSDK, AFi1rSDK aFi1rSDK) {
        scheduledExecutorService.getClass();
        aFa1oSDK.getClass();
        aFi1rSDK.getClass();
        this.getMediationNetwork = scheduledExecutorService;
        this.getCurrencyIso4217Code = aFa1oSDK;
        this.AFAdRevenueData = aFi1rSDK;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void getMediationNetwork() {
        AFb1bSDK.AFa1zSDK aFa1zSDK;
        AFb1lSDK aFb1lSDK = this.getRevenue;
        if (aFb1lSDK == null || (aFa1zSDK = aFb1lSDK.getCurrencyIso4217Code) == null) {
            return;
        }
        aFa1zSDK.getCurrencyIso4217Code();
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void getMonetizationNetwork(Context context, AFb1bSDK.AFa1zSDK aFa1zSDK) {
        context.getClass();
        aFa1zSDK.getClass();
        context.getClass();
        if (this.getRevenue != null) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.getRevenue);
        }
        this.getRevenue = null;
        AFb1lSDK aFb1lSDK = new AFb1lSDK(this.getMediationNetwork, this.getCurrencyIso4217Code, this.AFAdRevenueData, aFa1zSDK);
        this.getRevenue = aFb1lSDK;
        if (context instanceof Activity) {
            aFb1lSDK.onActivityResumed((Activity) context);
        }
        Application O_ = AFj1pSDK.O_(context);
        if (O_ != null) {
            O_.registerActivityLifecycleCallbacks(this.getRevenue);
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean getMonetizationNetwork() {
        return this.getRevenue != null;
    }
}
