package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFb1qSDK {
    public final Map<String, Object> getMonetizationNetwork = new HashMap();
    public Map<String, Object> getMediationNetwork = new HashMap();

    public final void AFAdRevenueData(Map<String, Object> map) {
        if (!this.getMonetizationNetwork.isEmpty()) {
            map.put("partner_data", this.getMonetizationNetwork);
        }
        if (this.getMediationNetwork.isEmpty()) {
            return;
        }
        AFa1tSDK.getMonetizationNetwork(map).put("partner_data", this.getMediationNetwork);
        this.getMediationNetwork = new HashMap();
    }
}
