package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import z2.C1412P;
import z2.C1441y;

@Metadata
/* loaded from: classes.dex */
public final class AFf1pSDK extends AFf1tSDK {
    private final AFj1zSDK afInfoLog;
    private final AppsFlyerInAppPurchaseValidationCallback force;

    /* renamed from: i, reason: collision with root package name */
    private final AFPurchaseDetails f5916i;
    private final AppsFlyerProperties unregisterClient;

    /* renamed from: w, reason: collision with root package name */
    private final Map<String, String> f5917w;

    public static final class AFa1tSDK extends RuntimeException {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1pSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    private final void valueOf(String str, int i2) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.force;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(C1412P.e(new Pair("error_code", Integer.valueOf(i2)), new Pair("error_message", str)));
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        Object a4;
        super.AFInAppEventType();
        Throwable unregisterClient = unregisterClient();
        if (unregisterClient != null && !(unregisterClient instanceof AFf1wSDK)) {
            if (unregisterClient instanceof AFe1aSDK) {
                valueOf("No dev key", -1);
            } else if (unregisterClient instanceof AFa1tSDK) {
                valueOf("One or more of provided arguments is empty", -1);
            } else {
                valueOf("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.force;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(C1412P.e(new Pair("error_code", Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.force;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1sSDK.values(new JSONObject((String) responseNetwork.getBody())));
                    a4 = Unit.f7487a;
                } else {
                    a4 = null;
                }
            } catch (Throwable th) {
                AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                a4 = AbstractC1343r.a(th);
            }
            if (AbstractC1341p.a(a4) != null) {
                valueOf("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(Map<String, Object> map, String str, String str2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        return ((AFf1nSDK) this).AFLogger.valueOf(map, str);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final String values(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return this.afInfoLog.AFInAppEventType();
    }

    public /* synthetic */ AFf1pSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1zSDK aFj1zSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i2 & 32) != 0 ? new AFj1wSDK() : aFj1zSDK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1pSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1zSDK aFj1zSDK) {
        super(AFf1zSDK.MANUAL_PURCHASE_VALIDATION, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, null, C1412P.c());
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        this.unregisterClient = appsFlyerProperties;
        this.f5916i = aFPurchaseDetails;
        this.f5917w = map;
        this.force = appsFlyerInAppPurchaseValidationCallback;
        this.afInfoLog = aFj1zSDK;
        this.AFInAppEventParameterName.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void AFInAppEventType(Map<String, Object> map, String str) {
        Map<String, Object> c4;
        Intrinsics.checkNotNullParameter(map, "");
        super.AFInAppEventType(map, str);
        List e4 = C1441y.e(this.f5916i.getPurchaseToken(), this.f5916i.getProductId(), this.f5916i.getPrice(), this.f5916i.getCurrency());
        if (e4 == null || !e4.isEmpty()) {
            Iterator it = e4.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1tSDK();
                }
            }
        }
        map.put("purchase_token", this.f5916i.getPurchaseToken());
        map.put("product_id", this.f5916i.getProductId());
        map.put("revenue", this.f5916i.getPrice());
        map.put("currency", this.f5916i.getCurrency());
        map.put("purchase_type", this.f5916i.getPurchaseType().getValue());
        Map<String, String> map2 = this.f5917w;
        if (map2 != null && !map2.isEmpty()) {
            map.put("extra_event_values", this.f5917w);
        }
        String string = this.unregisterClient.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string != null && string.length() != 0) {
            c4 = AFj1sSDK.values(new JSONObject(string));
        } else {
            c4 = C1412P.c();
        }
        map.put("custom_data", c4);
    }
}
