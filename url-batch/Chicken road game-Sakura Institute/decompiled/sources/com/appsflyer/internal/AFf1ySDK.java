package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFf1ySDK extends AFf1sSDK {
    public AFf1ySDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.ARS_VALIDATE, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, map, purchaseValidationCallback);
        this.AFInAppEventParameterName.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(Map<String, Object> map, String str, String str2) {
        return ((AFf1nSDK) this).AFLogger.values(map, str, str2);
    }

    @Override // com.appsflyer.internal.AFf1sSDK, com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        if (((AFf1nSDK) this).registerClient == null || ((AFf1nSDK) this).registerClient.getStatusCode() != 424) {
            return super.valueOf();
        }
        return true;
    }
}
