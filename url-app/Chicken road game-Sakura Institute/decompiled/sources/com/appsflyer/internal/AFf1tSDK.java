package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.json.JSONObject;
import z2.C1412P;

/* loaded from: classes.dex */
public abstract class AFf1tSDK extends AFf1nSDK<String> {
    private final AFd1sSDK afInfoLog;
    private final Map<String, Object> force;

    /* renamed from: i, reason: collision with root package name */
    private final AFg1tSDK f5923i;
    private final AFf1zSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private final AFg1mSDK f5924v;

    /* renamed from: w, reason: collision with root package name */
    private final AFd1qSDK f5925w;

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
        this.f5925w = valueOf;
        AFg1mSDK e4 = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(e4, "");
        this.f5924v = e4;
        AFg1tSDK purchaseType = aFd1kSDK.getPurchaseType();
        Intrinsics.checkNotNullExpressionValue(purchaseType, "");
        this.f5923i = purchaseType;
    }

    public String AFInAppEventType(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        AFe1nSDK aFe1nSDK;
        String AFInAppEventParameterName;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> j4 = C1412P.j(this.force);
        String values = values(j4);
        String AFInAppEventType = AFInAppEventType(j4);
        Map<String, Object> j5 = C1412P.j(j4);
        AFInAppEventType(j5, values);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String AFKeystoreWrapper = this.afInfoLog.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null && !y.x(AFKeystoreWrapper)) {
            linkedHashMap.put("advertising_id", AFKeystoreWrapper);
        }
        AFb1zSDK AFInAppEventType2 = AFb1rSDK.AFInAppEventType(this.afInfoLog.valueOf.AFKeystoreWrapper);
        String str2 = null;
        String str3 = AFInAppEventType2 != null ? AFInAppEventType2.AFInAppEventParameterName : null;
        if (str3 != null && !y.x(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFb1zSDK AFInAppEventParameterName2 = AFb1rSDK.AFInAppEventParameterName(this.afInfoLog.valueOf.AFKeystoreWrapper.getContentResolver());
        String str4 = AFInAppEventParameterName2 != null ? AFInAppEventParameterName2.AFInAppEventParameterName : null;
        if (str4 != null && !y.x(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false) && (AFInAppEventParameterName = ((AFf1nSDK) this).f5911d.AFInAppEventParameterName(this.f5925w)) != null && !y.x(AFInAppEventParameterName)) {
            linkedHashMap.put("imei", AFInAppEventParameterName);
        }
        AFd1sSDK aFd1sSDK = this.afInfoLog;
        String valueOf = AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper);
        if (valueOf == null) {
            valueOf = "";
        }
        linkedHashMap.put("appsflyer_id", valueOf);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.14.0");
        if (AFInAppEventType != null && !y.x(AFInAppEventType)) {
            linkedHashMap.put("sdk_connector_version", AFInAppEventType);
        }
        j5.put("device_data", linkedHashMap);
        this.f5923i.values(j5, this.unregisterClient);
        AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(j5, str, values);
        if (AFKeystoreWrapper2 != null && (aFe1nSDK = AFKeystoreWrapper2.AFInAppEventParameterName) != null) {
            str2 = aFe1nSDK.values;
        }
        if (str2 != null) {
            String jSONObject = new JSONObject(j5).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            StringBuilder sb = new StringBuilder();
            sb.append(toString());
            sb.append(": preparing data: ");
            sb.append(jSONObject);
            AFb1mSDK.AFKeystoreWrapper(sb.toString());
            ((AFf1nSDK) this).f5912e.valueOf(str2, jSONObject);
        }
        return AFKeystoreWrapper2;
    }

    public abstract AFe1sSDK<String> AFKeystoreWrapper(Map<String, Object> map, String str, String str2);

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return true;
    }

    public boolean registerClient() {
        return false;
    }

    public String values(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public void AFInAppEventType(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.afInfoLog.valueOf.AFKeystoreWrapper.getPackageName());
        String AFInAppEventParameterName = AFd1sSDK.AFInAppEventParameterName();
        if (AFInAppEventParameterName != null) {
            map.put("cuid", AFInAppEventParameterName);
        }
        Context context = this.afInfoLog.valueOf.AFKeystoreWrapper;
        map.put("app_version_name", AFb1uSDK.AFInAppEventType(context, context.getPackageName()));
        if (registerClient()) {
            map.put("event_timestamp", Long.valueOf(this.f5924v.AFInAppEventType()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }
}
