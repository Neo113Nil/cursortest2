package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.A;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1aSDK {
    public AFi1zSDK AFAdRevenueData;
    public final AFh1bSDK getCurrencyIso4217Code;
    public final AFh1dSDK getMonetizationNetwork;

    public AFh1aSDK(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.AFAdRevenueData = getCurrencyIso4217Code(jSONObject);
        this.getCurrencyIso4217Code = getMonetizationNetwork(jSONObject);
        this.getMonetizationNetwork = getMediationNetwork(jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.collections.A] */
    private static AFi1zSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object n7;
        ?? r22;
        try {
            R5.l lVar = R5.n.f2421d;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "r_debugger");
            if (mediationNetwork != null) {
                long j = mediationNetwork.getLong("ttl");
                int i2 = mediationNetwork.getInt("counter");
                String optString = mediationNetwork.optString("app_ver", "");
                String optString2 = mediationNetwork.optString("sdk_ver", "");
                float optDouble = (float) mediationNetwork.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = mediationNetwork.optJSONArray("tags");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    r22 = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i5 = 0; i5 < length; i5++) {
                        String string = optJSONArray.getString(i5);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        r22.add(string);
                    }
                } else {
                    r22 = A.f6115d;
                }
                List list = r22;
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                n7 = new AFi1zSDK(j, optDouble, list, i2, optString, optString2);
            } else {
                n7 = null;
            }
        } catch (Throwable th) {
            R5.l lVar2 = R5.n.f2421d;
            n7 = V6.b.n(th);
        }
        R5.l lVar3 = R5.n.f2421d;
        return (AFi1zSDK) (n7 instanceof R5.m ? null : n7);
    }

    private static AFh1dSDK getMediationNetwork(JSONObject jSONObject) {
        Object n7;
        try {
            R5.l lVar = R5.n.f2421d;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "meta_data");
            n7 = mediationNetwork != null ? new AFh1dSDK(mediationNetwork.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th) {
            R5.l lVar2 = R5.n.f2421d;
            n7 = V6.b.n(th);
        }
        return (AFh1dSDK) (n7 instanceof R5.m ? null : n7);
    }

    private static AFh1bSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object n7;
        try {
            R5.l lVar = R5.n.f2421d;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "exc_mngr");
            n7 = mediationNetwork != null ? new AFh1bSDK(mediationNetwork.getString("sdk_ver"), mediationNetwork.optInt("min", -1), mediationNetwork.optInt("expire", -1), mediationNetwork.optLong("ttl", -1L)) : null;
        } catch (Throwable th) {
            R5.l lVar2 = R5.n.f2421d;
            n7 = V6.b.n(th);
        }
        return (AFh1bSDK) (n7 instanceof R5.m ? null : n7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFh1aSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "");
        AFh1aSDK aFh1aSDK = (AFh1aSDK) obj;
        return Intrinsics.a(this.getCurrencyIso4217Code, aFh1aSDK.getCurrencyIso4217Code) && Intrinsics.a(this.getMonetizationNetwork, aFh1aSDK.getMonetizationNetwork) && Intrinsics.a(this.AFAdRevenueData, aFh1aSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        AFh1bSDK aFh1bSDK = this.getCurrencyIso4217Code;
        int hashCode = (aFh1bSDK != null ? aFh1bSDK.hashCode() : 0) * 31;
        AFh1dSDK aFh1dSDK = this.getMonetizationNetwork;
        int hashCode2 = (hashCode + (aFh1dSDK != null ? aFh1dSDK.hashCode() : 0)) * 31;
        AFi1zSDK aFi1zSDK = this.AFAdRevenueData;
        return hashCode2 + (aFi1zSDK != null ? aFi1zSDK.hashCode() : 0);
    }

    private static JSONObject getMediationNetwork(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
