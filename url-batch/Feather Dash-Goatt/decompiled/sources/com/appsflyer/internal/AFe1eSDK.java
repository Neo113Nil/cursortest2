package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFe1eSDK extends AFe1gSDK {
    public AFe1eSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFd1zSDK aFd1zSDK) {
        super(AFe1lSDK.PURCHASE_VALIDATE, new AFe1lSDK[]{AFe1lSDK.RC_CDN, AFe1lSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, map, purchaseValidationCallback);
        this.getMediationNetwork.add(AFe1lSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final AFd1fSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str, String str2) {
        return ((AFe1bSDK) this).component3.getMediationNetwork(map, str, str2);
    }
}
