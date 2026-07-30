package com.appsflyer.internal;

import defpackage.i31;
import defpackage.j31;
import defpackage.k31;
import defpackage.nv;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFh1aSDK {
    public AFi1zSDK AFAdRevenueData;
    public final AFh1bSDK getCurrencyIso4217Code;
    public final AFh1dSDK getMonetizationNetwork;

    public AFh1aSDK(JSONObject jSONObject) {
        jSONObject.getClass();
        this.AFAdRevenueData = getCurrencyIso4217Code(jSONObject);
        this.getCurrencyIso4217Code = getMonetizationNetwork(jSONObject);
        this.getMonetizationNetwork = getMediationNetwork(jSONObject);
    }

    private static AFi1zSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object j31Var;
        List list;
        try {
            i31 i31Var = k31.d;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "r_debugger");
            if (mediationNetwork != null) {
                long j = mediationNetwork.getLong("ttl");
                int i = mediationNetwork.getInt("counter");
                String optString = mediationNetwork.optString("app_ver", "");
                String optString2 = mediationNetwork.optString("sdk_ver", "");
                float optDouble = (float) mediationNetwork.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = mediationNetwork.optJSONArray("tags");
                if (optJSONArray != null) {
                    list = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = optJSONArray.getString(i2);
                        string.getClass();
                        list.add(string);
                    }
                } else {
                    list = nv.d;
                }
                List list2 = list;
                optString.getClass();
                optString2.getClass();
                j31Var = new AFi1zSDK(j, optDouble, list2, i, optString, optString2);
            } else {
                j31Var = null;
            }
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        i31 i31Var3 = k31.d;
        return (AFi1zSDK) (j31Var instanceof j31 ? null : j31Var);
    }

    private static AFh1dSDK getMediationNetwork(JSONObject jSONObject) {
        Object j31Var;
        try {
            i31 i31Var = k31.d;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "meta_data");
            j31Var = mediationNetwork != null ? new AFh1dSDK(mediationNetwork.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        return (AFh1dSDK) (j31Var instanceof j31 ? null : j31Var);
    }

    private static AFh1bSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object j31Var;
        try {
            i31 i31Var = k31.d;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "exc_mngr");
            j31Var = mediationNetwork != null ? new AFh1bSDK(mediationNetwork.getString("sdk_ver"), mediationNetwork.optInt("min", -1), mediationNetwork.optInt("expire", -1), mediationNetwork.optLong("ttl", -1L)) : null;
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        return (AFh1bSDK) (j31Var instanceof j31 ? null : j31Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFh1aSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
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
