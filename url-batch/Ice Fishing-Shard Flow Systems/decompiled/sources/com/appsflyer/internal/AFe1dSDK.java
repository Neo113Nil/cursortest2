package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFPurchaseType;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.I;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class AFe1dSDK extends AFe1hSDK {
    private final AppsFlyerProperties component2;
    private final AFj1gSDK copydefault;
    private final Map<String, String> equals;
    private final AFPurchaseDetails hashCode;
    private final AppsFlyerInAppPurchaseValidationCallback toString;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFPurchaseType.values().length];
            try {
                iArr[AFPurchaseType.SUBSCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFPurchaseType.ONE_TIME_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getMediationNetwork = iArr;
        }
    }

    public static final class AFa1vSDK extends RuntimeException {
    }

    public /* synthetic */ AFe1dSDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1gSDK aFj1gSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i2 & 32) != 0 ? new AFj1iSDK() : aFj1gSDK);
    }

    private final void AFAdRevenueData(String str, int i2) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.toString;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(I.e(new Pair("error_code", Integer.valueOf(i2)), new Pair("error_message", str)));
        }
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final AFd1fSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str, String str2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i2 = AFa1uSDK.getMediationNetwork[this.hashCode.getPurchaseType().ordinal()];
        if (i2 == 1) {
            return ((AFe1bSDK) this).component3.getMediationNetwork(map, str);
        }
        if (i2 == 2) {
            return ((AFe1bSDK) this).component3.getRevenue(map, str);
        }
        throw new R5.k();
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        Object n7;
        super.getMonetizationNetwork();
        Throwable component2 = component2();
        if (component2 != null && !(component2 instanceof AFe1nSDK)) {
            if (component2 instanceof AFe1pSDK) {
                AFAdRevenueData("No dev key", -1);
            } else if (component2 instanceof AFa1vSDK) {
                AFAdRevenueData("One or more of provided arguments is empty", -1);
            } else {
                AFAdRevenueData("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.toString;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(I.e(new Pair("error_code", Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                R5.l lVar = R5.n.f2421d;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.toString;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1eSDK.getMonetizationNetwork(new JSONObject((String) responseNetwork.getBody())));
                    n7 = Unit.f6114a;
                } else {
                    n7 = null;
                }
            } catch (Throwable th) {
                R5.l lVar2 = R5.n.f2421d;
                n7 = V6.b.n(th);
            }
            if (R5.n.a(n7) != null) {
                AFAdRevenueData("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1dSDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1gSDK aFj1gSDK) {
        super(AFe1lSDK.MANUAL_PURCHASE_VALIDATION, new AFe1lSDK[]{AFe1lSDK.RC_CDN, AFe1lSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, null, I.c());
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1gSDK, "");
        this.component2 = appsFlyerProperties;
        this.hashCode = aFPurchaseDetails;
        this.equals = map;
        this.toString = appsFlyerInAppPurchaseValidationCallback;
        this.copydefault = aFj1gSDK;
        this.getMediationNetwork.add(AFe1lSDK.CONVERSION);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1dSDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final void getMonetizationNetwork(Map<String, Object> map, String str) {
        Object c7;
        Intrinsics.checkNotNullParameter(map, "");
        super.getMonetizationNetwork(map, str);
        List d7 = r.d(this.hashCode.getPurchaseToken(), this.hashCode.getProductId());
        if (d7 == null || !d7.isEmpty()) {
            Iterator it = d7.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1vSDK();
                }
            }
        }
        map.put("purchase_token", this.hashCode.getPurchaseToken());
        map.put("product_id", this.hashCode.getProductId());
        map.put("purchase_type", this.hashCode.getPurchaseType().getValue());
        Map<String, String> map2 = this.equals;
        if (map2 != null && !map2.isEmpty()) {
            map.put("purchase_additional_details", this.equals);
        }
        String string = this.component2.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string != null && string.length() != 0) {
            c7 = AFj1eSDK.getMonetizationNetwork(new JSONObject(string));
        } else {
            c7 = I.c();
        }
        map.put("custom_data", c7);
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final String getMonetizationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return this.copydefault.getRevenue();
    }
}
