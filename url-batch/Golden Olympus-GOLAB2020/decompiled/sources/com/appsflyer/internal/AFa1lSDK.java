package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1lSDK implements AFa1gSDK {
    private final AFc1qSDK getMonetizationNetwork;

    public AFa1lSDK(AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.getMonetizationNetwork = aFc1qSDK;
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    public final Map<String, Object> getCurrencyIso4217Code() {
        if (this.getMonetizationNetwork.getMediationNetwork("deeplink_data")) {
            try {
                String AFAdRevenueData = this.getMonetizationNetwork.AFAdRevenueData("deeplink_data", (String) null);
                return AFAdRevenueData == null ? MapsKt.emptyMap() : AFj1eSDK.getCurrencyIso4217Code(new JSONObject(AFAdRevenueData));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        return MapsKt.emptyMap();
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    public final void getMediationNetwork(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getMonetizationNetwork.getMediationNetwork("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    public final void getMonetizationNetwork() {
        this.getMonetizationNetwork.getMonetizationNetwork("deeplink_data");
    }
}
