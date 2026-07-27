package com.appsflyer;

import com.appsflyer.internal.AFb1lSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1sSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* loaded from: classes.dex */
public final class PurchaseHandler {
    public final AFd1kSDK AFInAppEventParameterName;
    private final AFd1sSDK AFInAppEventType;
    public final AFe1cSDK valueOf;

    public interface PurchaseValidationCallback {
        void onFailure(Throwable th);

        void onResponse(ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(AFd1kSDK aFd1kSDK) {
        this.AFInAppEventParameterName = aFd1kSDK;
        this.AFInAppEventType = aFd1kSDK.AFInAppEventType();
        this.valueOf = aFd1kSDK.afInfoLog();
    }

    public final boolean valueOf(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean AFInAppEventParameterName = AFb1lSDK.AFInAppEventParameterName(map, strArr, this.AFInAppEventType);
        if (!AFInAppEventParameterName && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return AFInAppEventParameterName;
    }
}
