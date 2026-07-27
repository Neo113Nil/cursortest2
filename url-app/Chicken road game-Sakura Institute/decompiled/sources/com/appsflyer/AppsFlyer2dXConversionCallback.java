package com.appsflyer;

import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFg1aSDK;
import com.appsflyer.share.LinkGenerator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[Catch: JSONException -> 0x002b, TRY_LEAVE, TryCatch #0 {JSONException -> 0x002b, blocks: (B:2:0x0000, B:13:0x003e, B:15:0x0042, B:17:0x0021, B:20:0x002e), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFInAppEventType(String str, String str2) {
        char c4;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "failure");
            jSONObject.put("data", str2);
            int hashCode = str.hashCode();
            if (hashCode != -1390007222) {
                if (hashCode == 1050716216 && str.equals("onInstallConversionFailure")) {
                    c4 = 0;
                    if (c4 != 0) {
                        onInstallConversionFailureNative(jSONObject);
                        return;
                    } else {
                        if (c4 != 1) {
                            return;
                        }
                        onAttributionFailureNative(jSONObject);
                        return;
                    }
                }
                c4 = 65535;
                if (c4 != 0) {
                }
            } else {
                if (str.equals("onAttributionFailure")) {
                    c4 = 1;
                    if (c4 != 0) {
                    }
                }
                c4 = 65535;
                if (c4 != 0) {
                }
            }
        } catch (JSONException e4) {
            AFLogger.INSTANCE.e(AFg1aSDK.OTHER, "2dx error", e4, false, false);
        }
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public native void onAppOpenAttributionNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        AFInAppEventType("onInstallConversionFailure", str);
    }

    public native void onAttributionFailureNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        AFInAppEventType("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    public native void onDeepLinkingNative(DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponse(String str) {
        onResponseNative(str);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);
}
