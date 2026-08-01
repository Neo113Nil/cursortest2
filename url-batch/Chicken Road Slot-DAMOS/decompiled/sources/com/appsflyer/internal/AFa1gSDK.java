package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.k0;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFa1gSDK implements AFa1lSDK {
    private final AFc1qSDK getRevenue;

    public AFa1gSDK(AFc1qSDK aFc1qSDK) {
        aFc1qSDK.getClass();
        this.getRevenue = aFc1qSDK;
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void AFAdRevenueData() {
        this.getRevenue.AFAdRevenueData("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void getMonetizationNetwork(Map<String, ? extends Object> map) {
        map.getClass();
        this.getRevenue.getRevenue("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final Map<String, Object> getRevenue() {
        if (this.getRevenue.getMonetizationNetwork("deeplink_data")) {
            try {
                String monetizationNetwork = this.getRevenue.getMonetizationNetwork("deeplink_data", (String) null);
                if (monetizationNetwork != null) {
                    return AFj1bSDK.getMonetizationNetwork(new JSONObject(monetizationNetwork));
                }
                k0 k0Var = k0.f5575d;
                k0Var.getClass();
                return k0Var;
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        k0 k0Var2 = k0.f5575d;
        k0Var2.getClass();
        return k0Var2;
    }
}
