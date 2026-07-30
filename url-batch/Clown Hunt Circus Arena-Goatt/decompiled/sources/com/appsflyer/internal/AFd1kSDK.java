package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import com.appsflyer.PurchaseHandler;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFd1kSDK extends AFd1qSDK {
    private final AFb1cSDK afInfoLog;

    public AFd1kSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFc1zSDK aFc1zSDK) {
        super(AFd1vSDK.PURCHASE_VALIDATE, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, null, map, purchaseValidationCallback);
        this.afInfoLog = aFc1zSDK.AFInAppEventParameterName();
        this.valueOf.add(AFd1vSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final AFc1nSDK<String> AFKeystoreWrapper(String str) {
        String obj = new StringBuilder().append(String.format("https://%sviap.%s/api/v1/android/validate_purchase?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName())).append(this.afInfoLog.values.AFInAppEventParameterName.getPackageName()).toString();
        String jSONObject = new JSONObject(AFVersionDeclaration()).toString();
        AFc1pSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(jSONObject).toString());
        ((AFd1nSDK) this).afDebugLog.valueOf(obj, jSONObject);
        return ((AFd1nSDK) this).afErrorLog.AFInAppEventParameterName(AFVersionDeclaration(), str);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        if (((AFd1nSDK) this).AFLogger == null || ((AFd1nSDK) this).AFLogger.getStatusCode() != 503) {
            return super.AFInAppEventType();
        }
        return true;
    }
}
