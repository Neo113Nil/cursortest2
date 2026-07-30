package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import defpackage.ov;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFa1lSDK implements AFa1gSDK {
    private final AFc1jSDK getMediationNetwork;

    public AFa1lSDK(AFc1jSDK aFc1jSDK) {
        aFc1jSDK.getClass();
        this.getMediationNetwork = aFc1jSDK;
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    public final Map<String, Object> getMediationNetwork() {
        if (this.getMediationNetwork.getMonetizationNetwork("deeplink_data")) {
            try {
                String revenue = this.getMediationNetwork.getRevenue("deeplink_data", (String) null);
                if (revenue != null) {
                    return AFj1eSDK.getMonetizationNetwork(new JSONObject(revenue));
                }
                ov ovVar = ov.d;
                ovVar.getClass();
                return ovVar;
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        ov ovVar2 = ov.d;
        ovVar2.getClass();
        return ovVar2;
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    public final void getMonetizationNetwork(Map<String, ? extends Object> map) {
        map.getClass();
        this.getMediationNetwork.getMediationNetwork("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    public final void getRevenue() {
        this.getMediationNetwork.getCurrencyIso4217Code("deeplink_data");
    }
}
