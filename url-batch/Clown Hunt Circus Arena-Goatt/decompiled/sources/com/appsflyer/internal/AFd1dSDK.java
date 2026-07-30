package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFd1dSDK extends AFd1nSDK<String> {
    private final Map<String, Object> afInfoLog;

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final boolean afRDLog() {
        return false;
    }

    public AFd1dSDK(Map<String, Object> map, AFc1zSDK aFc1zSDK) {
        super(AFd1vSDK.MONITORSDK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, String.valueOf(map.hashCode()));
        this.afInfoLog = new HashMap(map);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final AFc1nSDK<String> AFKeystoreWrapper(String str) {
        return ((AFd1nSDK) this).afErrorLog.AFInAppEventParameterName(this.afInfoLog);
    }
}
