package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class AFe1cSDK extends AFe1bSDK<String> {
    public AFh1eSDK component2;
    private final AFc1kSDK copy;
    private final AFg1vSDK copydefault;
    private final AFc1fSDK hashCode;
    private final AFi1nSDK toString;

    public /* synthetic */ AFe1cSDK(AFi1nSDK aFi1nSDK, AFc1kSDK aFc1kSDK, AFd1zSDK aFd1zSDK, AFg1vSDK aFg1vSDK, AFc1fSDK aFc1fSDK, AFh1eSDK aFh1eSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1nSDK, aFc1kSDK, aFd1zSDK, aFg1vSDK, aFc1fSDK, (i2 & 32) != 0 ? new AFh1eSDK() : aFh1eSDK);
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final long getRevenue() {
        return TimeUnit.MINUTES.toMillis(1L);
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFd1fSDK<String> getRevenue(String str) {
        AFd1cSDK aFd1cSDK;
        String str2;
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(str, "");
        AFh1eSDK aFh1eSDK = this.component2;
        Map<String, Object> map = aFh1eSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put("app_id", this.copy.getRevenue.getCurrencyIso4217Code.getPackageName());
        map.put("sdk_version", AFc1kSDK.getRevenue());
        map.put("app_version_name", this.copy.n_().versionName);
        this.copydefault.AFAdRevenueData(map);
        try {
            AFi1mSDK monetizationNetwork = this.toString.getMonetizationNetwork();
            if (monetizationNetwork != null) {
                linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("pia_timestamp", Long.valueOf(monetizationNetwork.getMonetizationNetwork));
                linkedHashMap2.put("ttr_millis", Long.valueOf(monetizationNetwork.getCurrencyIso4217Code));
                String str3 = monetizationNetwork.AFAdRevenueData;
                if (str3 != null) {
                    linkedHashMap2.put("pia_token", str3);
                }
                String str4 = monetizationNetwork.getMediationNetwork;
                if (str4 != null) {
                    linkedHashMap2.put("error_code", str4);
                }
                linkedHashMap.put("pia", linkedHashMap2);
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                aFh1eSDK.getCurrencyIso4217Code(linkedHashMap);
            }
            if (!this.toString.getMediationNetwork()) {
                Map<String, Object> map2 = aFh1eSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map2, "");
                AFj1cSDK.AFAdRevenueData(map2).put("pia_disabled", Boolean.TRUE);
            }
        } catch (Throwable th) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th, true, false, false, false, 96, null);
        }
        AFd1mSDK aFd1mSDK = ((AFe1bSDK) this).component3;
        AFd1fSDK<String> aFd1fSDK = (AFd1fSDK) AFd1mSDK.getCurrencyIso4217Code(new Object[]{aFd1mSDK, this.component2, ((AFe1bSDK) this).component1.getMonetizationNetwork(), this.hashCode}, -846475552, 846475554, System.identityHashCode(aFd1mSDK));
        Map<String, Object> map3 = this.component2.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        if (aFd1fSDK != null && (aFd1cSDK = aFd1fSDK.getMediationNetwork) != null && (str2 = aFd1cSDK.AFAdRevenueData) != null) {
            JSONObject jSONObject = new JSONObject(map3);
            if (jSONObject.has("pia")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("pia");
                if (jSONObject2.has("pia_token")) {
                    jSONObject2.put("pia_token", AFg1fSDK.getMediationNetwork(jSONObject2.getString("pia_token")));
                }
            }
            AFg1fSDK.AFAdRevenueData(toString() + ": preparing data: ", jSONObject);
            AFd1lSDK aFd1lSDK = ((AFe1bSDK) this).areAllFieldsValid;
            String jSONObject3 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject3, "");
            aFd1lSDK.getMonetizationNetwork(str2, jSONObject3);
        }
        return aFd1fSDK;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFe1cSDK(AFi1nSDK aFi1nSDK, AFc1kSDK aFc1kSDK, AFd1zSDK aFd1zSDK, AFg1vSDK aFg1vSDK, AFc1fSDK aFc1fSDK, AFh1eSDK aFh1eSDK) {
        super(r0, new AFe1lSDK[]{r1}, aFd1zSDK, "PIA");
        Intrinsics.checkNotNullParameter(aFi1nSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFh1eSDK, "");
        AFe1lSDK aFe1lSDK = AFe1lSDK.PLAY_INTEGRITY_API;
        AFe1lSDK aFe1lSDK2 = AFe1lSDK.CONVERSION;
        this.toString = aFi1nSDK;
        this.copy = aFc1kSDK;
        this.copydefault = aFg1vSDK;
        this.hashCode = aFc1fSDK;
        this.component2 = aFh1eSDK;
        this.getRevenue.add(aFe1lSDK2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1cSDK(AFi1nSDK aFi1nSDK, AFc1kSDK aFc1kSDK, AFd1zSDK aFd1zSDK, AFg1vSDK aFg1vSDK, AFc1fSDK aFc1fSDK) {
        this(aFi1nSDK, aFc1kSDK, aFd1zSDK, aFg1vSDK, aFc1fSDK, null, 32, null);
        Intrinsics.checkNotNullParameter(aFi1nSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
    }
}
