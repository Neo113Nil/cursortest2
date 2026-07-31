package com.appsflyer;

import com.appsflyer.internal.AFb1lSDK;
import com.appsflyer.internal.AFd1mSDK;
import com.appsflyer.internal.AFd1pSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* loaded from: classes3.dex */
public final class PurchaseHandler {
    public final AFe1cSDK AFInAppEventParameterName;
    private final AFd1pSDK AFInAppEventType;
    public final AFd1mSDK valueOf;

    public interface PurchaseValidationCallback {
        void onFailure(Throwable th);

        void onResponse(ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(AFd1mSDK aFd1mSDK) {
        this.valueOf = aFd1mSDK;
        this.AFInAppEventType = aFd1mSDK.values();
        this.AFInAppEventParameterName = aFd1mSDK.i();
    }

    public final boolean valueOf(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean valueOf = AFb1lSDK.valueOf(map, strArr, this.AFInAppEventType);
        if (!valueOf && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return valueOf;
    }
}
