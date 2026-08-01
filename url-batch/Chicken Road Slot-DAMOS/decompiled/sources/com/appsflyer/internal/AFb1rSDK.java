package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFb1rSDK {
    public final Map<String, Object> getCurrencyIso4217Code = new HashMap();
    public Map<String, Object> getMonetizationNetwork = new HashMap();

    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        if (!this.getCurrencyIso4217Code.isEmpty()) {
            map.put("partner_data", this.getCurrencyIso4217Code);
        }
        if (this.getMonetizationNetwork.isEmpty()) {
            return;
        }
        AFa1ySDK.getMediationNetwork(map).put("partner_data", this.getMonetizationNetwork);
        this.getMonetizationNetwork = new HashMap();
    }
}
