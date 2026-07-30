package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AFd1qSDK extends AFd1nSDK<String> {
    private final Map<String, Object> AFLogger$LogLevel;
    private final PurchaseHandler.PurchaseValidationCallback AFVersionDeclaration;
    private final AFb1fSDK afErrorLogForExcManagerOnly;
    private final AFb1cSDK afInfoLog;

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final boolean afRDLog() {
        return true;
    }

    public AFd1qSDK(AFd1vSDK aFd1vSDK, AFd1vSDK[] aFd1vSDKArr, AFc1zSDK aFc1zSDK, String str, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFd1vSDK, aFd1vSDKArr, aFc1zSDK, str);
        AFb1cSDK AFInAppEventParameterName = aFc1zSDK.AFInAppEventParameterName();
        this.afInfoLog = AFInAppEventParameterName;
        AFb1fSDK AFKeystoreWrapper = aFc1zSDK.AFKeystoreWrapper();
        this.afErrorLogForExcManagerOnly = AFKeystoreWrapper;
        HashMap hashMap = new HashMap(new HashMap(map));
        hashMap.put("app_id", AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName());
        String values = AFb1cSDK.values();
        if (values != null) {
            hashMap.put("cuid", values);
        }
        hashMap.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(AFInAppEventParameterName.values.AFInAppEventParameterName, AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName()));
        HashMap hashMap2 = new HashMap();
        AFc1uSDK.AFa1wSDK valueOf = AFa1bSDK.valueOf(AFInAppEventParameterName.values.AFInAppEventParameterName, new HashMap());
        String str2 = valueOf != null ? valueOf.AFInAppEventParameterName : null;
        if (!AFb1vSDK.AFInAppEventParameterName(str2)) {
            hashMap2.put("advertising_id", str2);
        }
        AFc1uSDK.AFa1wSDK values2 = AFa1bSDK.values(AFInAppEventParameterName.values.AFInAppEventParameterName.getContentResolver());
        String str3 = values2 != null ? values2.AFInAppEventParameterName : null;
        if (!AFb1vSDK.AFInAppEventParameterName(str3)) {
            hashMap2.put("oaid", str3);
        }
        AFc1uSDK.AFa1wSDK values3 = AFa1bSDK.values(AFInAppEventParameterName.values.AFInAppEventParameterName.getContentResolver());
        String str4 = values3 != null ? values3.AFInAppEventParameterName : null;
        if (!AFb1vSDK.AFInAppEventParameterName(str4)) {
            hashMap2.put("amazon_aid", str4);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String AFInAppEventType = ((AFd1nSDK) this).afRDLog.AFInAppEventType(AFKeystoreWrapper);
            if (!AFb1vSDK.AFInAppEventParameterName(AFInAppEventType)) {
                hashMap2.put("imei", AFInAppEventType);
            }
        }
        hashMap2.put("appsflyer_id", AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName.values, AFInAppEventParameterName.AFInAppEventType));
        hashMap2.put("os_version", new StringBuilder().append(Build.VERSION.SDK_INT).toString());
        hashMap2.put("sdk_version", AFa1dSDK.AFKeystoreWrapper);
        hashMap.put("device_data", hashMap2);
        this.AFLogger$LogLevel = hashMap;
        this.AFVersionDeclaration = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.valueOf();
        Throwable afInfoLog = afInfoLog();
        if (afInfoLog != null && (purchaseValidationCallback2 = this.AFVersionDeclaration) != null) {
            purchaseValidationCallback2.onFailure(afInfoLog);
        }
        ResponseNetwork<String> responseNetwork = ((AFd1nSDK) this).AFLogger;
        if (responseNetwork == null || (purchaseValidationCallback = this.AFVersionDeclaration) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    protected final Map<String, Object> AFVersionDeclaration() {
        return this.AFLogger$LogLevel;
    }
}
