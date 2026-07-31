package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFf1uSDK extends AFf1zSDK {
    public AFf1uSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFd1mSDK aFd1mSDK) {
        super(AFe1eSDK.PURCHASE_VALIDATE, new AFe1eSDK[]{AFe1eSDK.RC_CDN}, aFd1mSDK, map, purchaseValidationCallback);
        this.valueOf.add(AFe1eSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AFe1xSDK<String> values(String str) {
        AFe1xSDK<String> AFInAppEventType = this.AFLogger.AFInAppEventType(i(), str, v());
        if (AFInAppEventType != null) {
            AFInAppEventType(AFInAppEventType.values.valueOf);
        }
        return AFInAppEventType;
    }
}
