package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
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
        aFe1lSDK.getClass();
        aFe1lSDKArr.getClass();
        aFd1zSDK.getClass();
        map.getClass();
        this.component2 = aFe1lSDK;
        this.copy = map;
        AFc1kSDK AFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        AFAdRevenueData.getClass();
        this.hashCode = AFAdRevenueData;
        AFc1jSDK mediationNetwork = aFd1zSDK.getMediationNetwork();
        mediationNetwork.getClass();
        this.equals = mediationNetwork;
        AFg1vSDK areAllFieldsValid = aFd1zSDK.areAllFieldsValid();
        areAllFieldsValid.getClass();
        this.copydefault = areAllFieldsValid;
        AFf1gSDK force = aFd1zSDK.force();
        force.getClass();
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
        map.getClass();
        return null;
    }

    public void getMonetizationNetwork(Map<String, Object> map, String str) {
        map.getClass();
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

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFd1fSDK<String> getRevenue(String str) {
        AFd1cSDK aFd1cSDK;
        str.getClass();
        Map<String, Object> map = this.copy;
        map.getClass();
        Map<String, Object> linkedHashMap = new LinkedHashMap<>(map);
        String monetizationNetwork = getMonetizationNetwork(linkedHashMap);
        String currencyIso4217Code = getCurrencyIso4217Code(linkedHashMap);
        Map<String, Object> linkedHashMap2 = new LinkedHashMap<>(linkedHashMap);
        getMonetizationNetwork(linkedHashMap2, monetizationNetwork);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        String monetizationNetwork2 = this.hashCode.getMonetizationNetwork();
        if (monetizationNetwork2 != null && !StringsKt.n(monetizationNetwork2)) {
            linkedHashMap3.put("advertising_id", monetizationNetwork2);
        }
        AFb1mSDK revenue = AFb1jSDK.getRevenue(this.hashCode.getRevenue.getCurrencyIso4217Code);
        String str2 = null;
        String str3 = revenue != null ? revenue.getRevenue : null;
        if (str3 != null && !StringsKt.n(str3)) {
            linkedHashMap3.put("oaid", str3);
        }
        AFb1mSDK l_ = AFb1jSDK.l_(this.hashCode.getRevenue.getCurrencyIso4217Code.getContentResolver());
        String str4 = l_ != null ? l_.getRevenue : null;
        if (str4 != null && !StringsKt.n(str4)) {
            linkedHashMap3.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            linkedHashMap2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            String revenue2 = ((AFe1bSDK) this).component1.getRevenue(this.equals);
            if (revenue2 != null && !StringsKt.n(revenue2)) {
                linkedHashMap3.put("imei", revenue2);
            }
        }
        String currencyIso4217Code2 = AFb1iSDK.getCurrencyIso4217Code(this.hashCode.getCurrencyIso4217Code);
        if (currencyIso4217Code2 == null) {
            currencyIso4217Code2 = "";
        }
        linkedHashMap3.put("appsflyer_id", currencyIso4217Code2);
        linkedHashMap3.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap3.put("sdk_version", "6.18.0");
        if (currencyIso4217Code != null && !StringsKt.n(currencyIso4217Code)) {
            linkedHashMap3.put("sdk_connector_version", currencyIso4217Code);
        }
        this.copydefault.getRevenue(linkedHashMap3, this.component2);
        linkedHashMap2.put("device_data", linkedHashMap3);
        this.toString.getCurrencyIso4217Code(linkedHashMap2, this.component2);
        AFd1fSDK<String> currencyIso4217Code3 = getCurrencyIso4217Code(linkedHashMap2, str, monetizationNetwork);
        if (currencyIso4217Code3 != null && (aFd1cSDK = currencyIso4217Code3.getMediationNetwork) != null) {
            str2 = aFd1cSDK.AFAdRevenueData;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(linkedHashMap2);
            AFg1fSDK.AFAdRevenueData(toString() + ": preparing data: ", jSONObject);
            AFd1lSDK aFd1lSDK = ((AFe1bSDK) this).areAllFieldsValid;
            String jSONObject2 = jSONObject.toString();
            jSONObject2.getClass();
            aFd1lSDK.getMonetizationNetwork(str2, jSONObject2);
        }
        return currencyIso4217Code3;
    }

    public String getMonetizationNetwork(Map<String, Object> map) {
        map.getClass();
        return null;
    }
}
