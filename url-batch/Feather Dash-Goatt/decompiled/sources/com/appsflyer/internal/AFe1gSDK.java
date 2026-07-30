package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class AFe1gSDK extends AFe1hSDK {
    private final PurchaseHandler.PurchaseValidationCallback component2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1gSDK(AFe1lSDK aFe1lSDK, AFe1lSDK[] aFe1lSDKArr, AFd1zSDK aFd1zSDK, Map<String, ? extends Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFe1lSDK, aFe1lSDKArr, aFd1zSDK, null, map);
        aFe1lSDK.getClass();
        aFe1lSDKArr.getClass();
        aFd1zSDK.getClass();
        map.getClass();
        this.component2 = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public boolean AFAdRevenueData() {
        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
        if (responseNetwork != null) {
            responseNetwork.getClass();
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final boolean areAllFieldsValid() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final String getCurrencyIso4217Code(Map<String, Object> map) {
        map.getClass();
        if (map.containsKey("connector_version")) {
            Object remove = map.remove("connector_version");
            if (remove instanceof String) {
                return (String) remove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.getMonetizationNetwork();
        Throwable component2 = component2();
        if (component2 != null && (purchaseValidationCallback2 = this.component2) != null) {
            purchaseValidationCallback2.onFailure(component2);
        }
        ResponseNetwork<String> responseNetwork = ((AFe1bSDK) this).component4;
        if (responseNetwork == null || (purchaseValidationCallback = this.component2) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final String getMonetizationNetwork(Map<String, Object> map) {
        map.getClass();
        if (map.containsKey("billing_library_version")) {
            Object remove = map.remove("billing_library_version");
            if (remove instanceof String) {
                return (String) remove;
            }
        }
        return null;
    }
}
