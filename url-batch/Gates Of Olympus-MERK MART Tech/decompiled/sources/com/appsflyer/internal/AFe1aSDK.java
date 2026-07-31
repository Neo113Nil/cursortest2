package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFe1aSDK extends AFf1zSDK {
    public AFe1aSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFd1mSDK aFd1mSDK) {
        super(AFe1eSDK.ARS_VALIDATE, new AFe1eSDK[]{AFe1eSDK.RC_CDN}, aFd1mSDK, map, purchaseValidationCallback);
        this.valueOf.add(AFe1eSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AFe1xSDK<String> values(String str) {
        AFe1xSDK<String> AFInAppEventParameterName = this.AFLogger.AFInAppEventParameterName(i(), str, v());
        if (AFInAppEventParameterName != null) {
            AFInAppEventType(AFInAppEventParameterName.values.valueOf);
        }
        return AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFf1zSDK, com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean AFKeystoreWrapper() {
        if (((AFf1rSDK) this).d == null || ((AFf1rSDK) this).d.getStatusCode() != 424) {
            return super.AFKeystoreWrapper();
        }
        return true;
    }
}
