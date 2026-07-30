package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class AFf1tSDK extends AFf1nSDK<String> {
    private final AFd1sSDK afInfoLog;
    private final Map<String, Object> force;
    private final AFg1tSDK i;
    private final AFf1zSDK unregisterClient;
    private final AFg1mSDK v;
    private final AFd1qSDK w;

    protected String AFInAppEventType(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public abstract AFe1sSDK<String> AFKeystoreWrapper(Map<String, Object> map, String str, String str2);

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final boolean i() {
        return true;
    }

    protected boolean registerClient() {
        return false;
    }

    protected String values(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1tSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFd1kSDK aFd1kSDK, String str, Map<String, ? extends Object> map) {
        super(aFf1zSDK, aFf1zSDKArr, aFd1kSDK, null);
        Intrinsics.checkNotNullParameter(aFf1zSDK, "");
        Intrinsics.checkNotNullParameter(aFf1zSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.unregisterClient = aFf1zSDK;
        this.force = map;
        AFd1sSDK AFInAppEventType = aFd1kSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.afInfoLog = AFInAppEventType;
        AFd1qSDK valueOf = aFd1kSDK.valueOf();
        Intrinsics.checkNotNullExpressionValue(valueOf, "");
        this.w = valueOf;
        AFg1mSDK e = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(e, "");
        this.v = e;
        AFg1tSDK purchaseType = aFd1kSDK.getPurchaseType();
        Intrinsics.checkNotNullExpressionValue(purchaseType, "");
        this.i = purchaseType;
    }

    protected void AFInAppEventType(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.afInfoLog.valueOf.AFKeystoreWrapper.getPackageName());
        String AFInAppEventParameterName = AFd1sSDK.AFInAppEventParameterName();
        if (AFInAppEventParameterName != null) {
            map.put("cuid", AFInAppEventParameterName);
        }
        AFd1sSDK aFd1sSDK = this.afInfoLog;
        map.put("app_version_name", AFb1uSDK.AFInAppEventType(aFd1sSDK.valueOf.AFKeystoreWrapper, aFd1sSDK.valueOf.AFKeystoreWrapper.getPackageName()));
        if (registerClient()) {
            map.put("event_timestamp", Long.valueOf(this.v.AFInAppEventType()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        AFe1nSDK aFe1nSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mutableMap = MapsKt.toMutableMap(this.force);
        String values = values(mutableMap);
        String AFInAppEventType = AFInAppEventType(mutableMap);
        Map<String, Object> mutableMap2 = MapsKt.toMutableMap(mutableMap);
        AFInAppEventType(mutableMap2, values);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String AFKeystoreWrapper = this.afInfoLog.AFKeystoreWrapper();
        String str2 = AFKeystoreWrapper;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            linkedHashMap.put("advertising_id", AFKeystoreWrapper);
        }
        AFb1zSDK AFInAppEventType2 = AFb1rSDK.AFInAppEventType(this.afInfoLog.valueOf.AFKeystoreWrapper);
        String str3 = null;
        String str4 = AFInAppEventType2 != null ? AFInAppEventType2.AFInAppEventParameterName : null;
        String str5 = str4;
        if (str5 != null && !StringsKt.isBlank(str5)) {
            linkedHashMap.put("oaid", str4);
        }
        AFb1zSDK AFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName(this.afInfoLog.valueOf.AFKeystoreWrapper.getContentResolver());
        String str6 = AFInAppEventParameterName != null ? AFInAppEventParameterName.AFInAppEventParameterName : null;
        String str7 = str6;
        if (str7 != null && !StringsKt.isBlank(str7)) {
            linkedHashMap.put("amazon_aid", str6);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String AFInAppEventParameterName2 = ((AFf1nSDK) this).d.AFInAppEventParameterName(this.w);
            String str8 = AFInAppEventParameterName2;
            if (str8 != null && !StringsKt.isBlank(str8)) {
                linkedHashMap.put("imei", AFInAppEventParameterName2);
            }
        }
        AFd1sSDK aFd1sSDK = this.afInfoLog;
        String valueOf = AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper);
        if (valueOf == null) {
            valueOf = "";
        }
        linkedHashMap.put("appsflyer_id", valueOf);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.14.0");
        String str9 = AFInAppEventType;
        if (str9 != null && !StringsKt.isBlank(str9)) {
            linkedHashMap.put("sdk_connector_version", AFInAppEventType);
        }
        mutableMap2.put("device_data", linkedHashMap);
        this.i.values(mutableMap2, this.unregisterClient);
        AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(mutableMap2, str, values);
        if (AFKeystoreWrapper2 != null && (aFe1nSDK = AFKeystoreWrapper2.AFInAppEventParameterName) != null) {
            str3 = aFe1nSDK.values;
        }
        if (str3 != null) {
            String jSONObject = new JSONObject(mutableMap2).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            AFb1mSDK.AFKeystoreWrapper(new StringBuilder().append(toString()).append(": preparing data: ").append(jSONObject).toString());
            ((AFf1nSDK) this).e.valueOf(str3, jSONObject);
        }
        return AFKeystoreWrapper2;
    }
}
