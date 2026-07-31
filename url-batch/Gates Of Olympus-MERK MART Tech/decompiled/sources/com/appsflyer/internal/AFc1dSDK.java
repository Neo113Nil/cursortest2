package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFc1dSDK {
    public final Map<String, Object> AFKeystoreWrapper = new HashMap();
    public Map<String, Object> AFInAppEventParameterName = new HashMap();

    public final void valueOf(Map<String, Object> map) {
        if (!this.AFKeystoreWrapper.isEmpty()) {
            map.put("partner_data", this.AFKeystoreWrapper);
        }
        if (this.AFInAppEventParameterName.isEmpty()) {
            return;
        }
        AFb1tSDK.AFInAppEventParameterName(map).put("partner_data", this.AFInAppEventParameterName);
        this.AFInAppEventParameterName = new HashMap();
    }
}
