package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFe1oSDK extends AFe1gSDK {
    public AFe1oSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFd1zSDK aFd1zSDK) {
        super(AFe1lSDK.ARS_VALIDATE, new AFe1lSDK[]{AFe1lSDK.RC_CDN, AFe1lSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, map, purchaseValidationCallback);
        this.getMediationNetwork.add(AFe1lSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFe1gSDK, com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
            return super.AFAdRevenueData();
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final AFd1fSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str, String str2) {
        AFd1mSDK aFd1mSDK = ((AFe1bSDK) this).component3;
        return (AFd1fSDK) AFd1mSDK.getCurrencyIso4217Code(new Object[]{aFd1mSDK, map, str, str2}, 158494896, -158494896, System.identityHashCode(aFd1mSDK));
    }
}
