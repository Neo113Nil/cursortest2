package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFd1kSDK extends AFd1qSDK {
    private final AFb1cSDK afInfoLog;

    public AFd1kSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFc1zSDK aFc1zSDK) {
        super(AFd1vSDK.PURCHASE_VALIDATE, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, null, map, purchaseValidationCallback);
        this.afInfoLog = aFc1zSDK.AFInAppEventParameterName();
        this.valueOf.add(AFd1vSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        ResponseNetwork responseNetwork = ((AFd1nSDK) this).AFLogger;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 503) {
            return super.AFInAppEventType();
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<String> AFKeystoreWrapper(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("https://" + AppsFlyerLib.getInstance().getHostPrefix() + "viap." + AFa1dSDK.valueOf().getHostName() + "/api/v1/android/validate_purchase?app_id=");
        sb.append(this.afInfoLog.values.AFInAppEventParameterName.getPackageName());
        String obj = sb.toString();
        String jSONObject = new JSONObject(AFVersionDeclaration()).toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append(": preparing data: ");
        sb2.append(jSONObject);
        AFc1pSDK.AFKeystoreWrapper(sb2.toString());
        ((AFd1nSDK) this).afDebugLog.valueOf(obj, jSONObject);
        return ((AFd1nSDK) this).afErrorLog.AFInAppEventParameterName(AFVersionDeclaration(), str);
    }
}
