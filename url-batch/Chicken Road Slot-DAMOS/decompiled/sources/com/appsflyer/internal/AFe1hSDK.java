package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class AFe1hSDK extends AFe1jSDK {
    private final PurchaseHandler.PurchaseValidationCallback component2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1hSDK(AFe1pSDK aFe1pSDK, AFe1pSDK[] aFe1pSDKArr, AFd1zSDK aFd1zSDK, Map<String, ? extends Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFe1pSDK, aFe1pSDKArr, aFd1zSDK, null, map);
        aFe1pSDK.getClass();
        aFe1pSDKArr.getClass();
        aFd1zSDK.getClass();
        map.getClass();
        this.component2 = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    public final boolean component3() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.getCurrencyIso4217Code();
        Throwable component1 = component1();
        if (component1 != null && (purchaseValidationCallback2 = this.component2) != null) {
            purchaseValidationCallback2.onFailure(component1);
        }
        ResponseNetwork<String> responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
        if (responseNetwork == null || (purchaseValidationCallback = this.component2) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    public final String getMonetizationNetwork(Map<String, Object> map) {
        map.getClass();
        if (map.containsKey("connector_version")) {
            Object remove = map.remove("connector_version");
            if (remove instanceof String) {
                return (String) remove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public boolean getMonetizationNetwork() {
        ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
        if (responseNetwork != null) {
            responseNetwork.getClass();
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.getMonetizationNetwork();
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    public final String getCurrencyIso4217Code(Map<String, Object> map) {
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
