package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AFe1hSDK extends AFe1bSDK<String> {
    private final AFe1lSDK component2;
    private final Map<String, Object> copy;
    private final AFg1vSDK copydefault;
    private final AFc1jSDK equals;
    private final AFc1kSDK hashCode;
    private final AFf1gSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1hSDK(AFe1lSDK aFe1lSDK, AFe1lSDK[] aFe1lSDKArr, AFd1zSDK aFd1zSDK, String str, Map<String, ? extends Object> map) {
        super(aFe1lSDK, aFe1lSDKArr, aFd1zSDK, null);
        Intrinsics.checkNotNullParameter(aFe1lSDK, "");
        Intrinsics.checkNotNullParameter(aFe1lSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component2 = aFe1lSDK;
        this.copy = map;
        AFc1kSDK AFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        this.hashCode = AFAdRevenueData;
        AFc1jSDK mediationNetwork = aFd1zSDK.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
        this.equals = mediationNetwork;
        AFg1vSDK areAllFieldsValid = aFd1zSDK.areAllFieldsValid();
        Intrinsics.checkNotNullExpressionValue(areAllFieldsValid, "");
        this.copydefault = areAllFieldsValid;
        AFf1gSDK force = aFd1zSDK.force();
        Intrinsics.checkNotNullExpressionValue(force, "");
        this.toString = force;
    }

    public boolean areAllFieldsValid() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        return true;
    }

    public abstract AFd1fSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str, String str2);

    public String getCurrencyIso4217Code(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public String getMonetizationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFd1fSDK<String> getRevenue(String str) {
        AFd1cSDK aFd1cSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> j = I.j(this.copy);
        String monetizationNetwork = getMonetizationNetwork(j);
        String currencyIso4217Code = getCurrencyIso4217Code(j);
        Map<String, Object> j7 = I.j(j);
        getMonetizationNetwork(j7, monetizationNetwork);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String monetizationNetwork2 = this.hashCode.getMonetizationNetwork();
        if (monetizationNetwork2 != null && !StringsKt.z(monetizationNetwork2)) {
            linkedHashMap.put("advertising_id", monetizationNetwork2);
        }
        AFb1mSDK revenue = AFb1jSDK.getRevenue(this.hashCode.getRevenue.getCurrencyIso4217Code);
        String str2 = null;
        String str3 = revenue != null ? revenue.getRevenue : null;
        if (str3 != null && !StringsKt.z(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFb1mSDK l_ = AFb1jSDK.l_(this.hashCode.getRevenue.getCurrencyIso4217Code.getContentResolver());
        String str4 = l_ != null ? l_.getRevenue : null;
        if (str4 != null && !StringsKt.z(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            j7.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            String revenue2 = ((AFe1bSDK) this).component1.getRevenue(this.equals);
            if (revenue2 != null && !StringsKt.z(revenue2)) {
                linkedHashMap.put("imei", revenue2);
            }
        }
        String currencyIso4217Code2 = AFb1iSDK.getCurrencyIso4217Code(this.hashCode.getCurrencyIso4217Code);
        if (currencyIso4217Code2 == null) {
            currencyIso4217Code2 = "";
        }
        linkedHashMap.put("appsflyer_id", currencyIso4217Code2);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.18.0");
        if (currencyIso4217Code != null && !StringsKt.z(currencyIso4217Code)) {
            linkedHashMap.put("sdk_connector_version", currencyIso4217Code);
        }
        this.copydefault.getRevenue(linkedHashMap, this.component2);
        j7.put("device_data", linkedHashMap);
        this.toString.getCurrencyIso4217Code(j7, this.component2);
        AFd1fSDK<String> currencyIso4217Code3 = getCurrencyIso4217Code(j7, str, monetizationNetwork);
        if (currencyIso4217Code3 != null && (aFd1cSDK = currencyIso4217Code3.getMediationNetwork) != null) {
            str2 = aFd1cSDK.AFAdRevenueData;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(j7);
            AFg1fSDK.AFAdRevenueData(toString() + ": preparing data: ", jSONObject);
            AFd1lSDK aFd1lSDK = ((AFe1bSDK) this).areAllFieldsValid;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            aFd1lSDK.getMonetizationNetwork(str2, jSONObject2);
        }
        return currencyIso4217Code3;
    }

    public void getMonetizationNetwork(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.hashCode.getRevenue.getCurrencyIso4217Code.getPackageName());
        String currencyIso4217Code = AFc1kSDK.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            map.put("cuid", currencyIso4217Code);
        }
        map.put("app_version_name", this.hashCode.n_().versionName);
        if (areAllFieldsValid()) {
            map.put("event_timestamp", Long.valueOf(this.copydefault.getCurrencyIso4217Code()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }
}
