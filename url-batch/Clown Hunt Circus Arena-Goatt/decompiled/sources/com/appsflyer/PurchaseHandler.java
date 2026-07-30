package com.appsflyer;

import com.appsflyer.internal.AFb1cSDK;
import com.appsflyer.internal.AFb1zSDK;
import com.appsflyer.internal.AFc1zSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* loaded from: classes.dex */
public final class PurchaseHandler {
    public final AFd1tSDK AFInAppEventParameterName;
    public final AFc1zSDK valueOf;
    private final AFb1cSDK values;

    public interface PurchaseValidationCallback {
        void onFailure(Throwable th);

        void onResponse(ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(AFc1zSDK aFc1zSDK) {
        this.valueOf = aFc1zSDK;
        this.values = aFc1zSDK.AFInAppEventParameterName();
        this.AFInAppEventParameterName = aFc1zSDK.getLevel();
    }

    public final boolean AFInAppEventParameterName(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean valueOf = AFb1zSDK.valueOf(map, strArr, this.values);
        if (!valueOf && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return valueOf;
    }
}
