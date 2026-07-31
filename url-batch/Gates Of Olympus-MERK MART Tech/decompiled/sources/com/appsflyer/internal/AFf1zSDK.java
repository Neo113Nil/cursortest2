package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class AFf1zSDK extends AFf1rSDK<String> {
    private final Map<String, Object> afInfoLog;
    private final String afRDLog;
    private final AFd1pSDK e;
    private final AFd1xSDK force;
    private final String i;
    private final AFg1sSDK v;
    private final PurchaseHandler.PurchaseValidationCallback w;

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AppsFlyerRequestListener registerClient() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean unregisterClient() {
        return true;
    }

    public AFf1zSDK(AFe1eSDK aFe1eSDK, AFe1eSDK[] aFe1eSDKArr, AFd1mSDK aFd1mSDK, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFe1eSDK, aFe1eSDKArr, aFd1mSDK, null);
        AFd1pSDK values = aFd1mSDK.values();
        this.e = values;
        AFd1xSDK valueOf = aFd1mSDK.valueOf();
        this.force = valueOf;
        AFg1sSDK unregisterClient = aFd1mSDK.unregisterClient();
        this.v = unregisterClient;
        String str = map.containsKey("billing_library_version") ? (String) map.remove("billing_library_version") : null;
        this.i = str;
        String str2 = map.containsKey("connector_version") ? (String) map.remove("connector_version") : null;
        this.afRDLog = str2;
        HashMap hashMap = new HashMap(new HashMap(map));
        hashMap.put("app_id", values.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName());
        hashMap.put("event_timestamp", Long.valueOf(unregisterClient.AFKeystoreWrapper()));
        String AFInAppEventType = AFd1pSDK.AFInAppEventType();
        if (AFInAppEventType != null) {
            hashMap.put("cuid", AFInAppEventType);
        }
        hashMap.put("app_version_name", AFb1rSDK.AFInAppEventType(values.AFInAppEventParameterName.AFKeystoreWrapper, values.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName()));
        HashMap hashMap2 = new HashMap();
        AFa1bSDK values2 = AFb1qSDK.values(values.AFInAppEventParameterName.AFKeystoreWrapper, new HashMap());
        String str3 = values2 != null ? values2.valueOf : null;
        if (!AFc1vSDK.AFKeystoreWrapper(str3)) {
            hashMap2.put("advertising_id", str3);
        }
        AFa1bSDK AFInAppEventType2 = AFb1qSDK.AFInAppEventType(values.AFInAppEventParameterName.AFKeystoreWrapper.getContentResolver());
        String str4 = AFInAppEventType2 != null ? AFInAppEventType2.valueOf : null;
        if (!AFc1vSDK.AFKeystoreWrapper(str4)) {
            hashMap2.put("oaid", str4);
        }
        AFa1bSDK AFInAppEventType3 = AFb1qSDK.AFInAppEventType(values.AFInAppEventParameterName.AFKeystoreWrapper.getContentResolver());
        String str5 = AFInAppEventType3 != null ? AFInAppEventType3.valueOf : null;
        if (!AFc1vSDK.AFKeystoreWrapper(str5)) {
            hashMap2.put("amazon_aid", str5);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String values3 = ((AFf1rSDK) this).unregisterClient.values(valueOf);
            if (!AFc1vSDK.AFKeystoreWrapper(values3)) {
                hashMap2.put("imei", values3);
            }
        }
        hashMap2.put("appsflyer_id", AFb1iSDK.AFKeystoreWrapper(values.AFInAppEventParameterName, values.valueOf));
        hashMap2.put("os_version", new StringBuilder().append(Build.VERSION.SDK_INT).toString());
        hashMap2.put("sdk_version", "6.12.6");
        if (!AFc1vSDK.AFKeystoreWrapper(str2)) {
            hashMap2.put("sdk_connector_version", str2);
        }
        hashMap.put("device_data", hashMap2);
        if (!AFc1vSDK.AFKeystoreWrapper(str)) {
            hashMap.put("billing_lib_version", str);
        }
        this.afInfoLog = hashMap;
        this.w = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.AFInAppEventType();
        Throwable AFLogger = AFLogger();
        if (AFLogger != null && (purchaseValidationCallback2 = this.w) != null) {
            purchaseValidationCallback2.onFailure(AFLogger);
        }
        ResponseNetwork<String> responseNetwork = ((AFf1rSDK) this).d;
        if (responseNetwork == null || (purchaseValidationCallback = this.w) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    public final String v() {
        return this.i;
    }

    protected final Map<String, Object> i() {
        return this.afInfoLog;
    }

    protected final void AFInAppEventType(String str) {
        String jSONObject = new JSONObject(this.afInfoLog).toString();
        AFb1hSDK.AFInAppEventType(new StringBuilder().append(this).append(": preparing data: ").append(jSONObject).toString());
        ((AFf1rSDK) this).registerClient.AFInAppEventParameterName(str, jSONObject);
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public boolean AFKeystoreWrapper() {
        if (((AFf1rSDK) this).d == null || ((AFf1rSDK) this).d.getStatusCode() != 503) {
            return super.AFKeystoreWrapper();
        }
        return true;
    }
}
