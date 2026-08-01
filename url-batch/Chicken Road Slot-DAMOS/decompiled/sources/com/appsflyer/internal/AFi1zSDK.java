package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFi1zSDK {
    public final AFh1aSDK getCurrencyIso4217Code;
    public AFi1xSDK getMediationNetwork;
    public final AFi1uSDK getMonetizationNetwork;

    public AFi1zSDK(JSONObject jSONObject) {
        jSONObject.getClass();
        this.getMediationNetwork = AFAdRevenueData(jSONObject);
        this.getCurrencyIso4217Code = getMediationNetwork(jSONObject);
        this.getMonetizationNetwork = getCurrencyIso4217Code(jSONObject);
    }

    private static AFi1xSDK AFAdRevenueData(JSONObject jSONObject) {
        Object mVar;
        List list;
        try {
            hd.l lVar = hd.n.f4511e;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (AFAdRevenueData != null) {
                long j = AFAdRevenueData.getLong("ttl");
                int i3 = AFAdRevenueData.getInt("counter");
                String optString = AFAdRevenueData.optString("app_ver", "");
                String optString2 = AFAdRevenueData.optString("sdk_ver", "");
                float optDouble = (float) AFAdRevenueData.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = AFAdRevenueData.optJSONArray("tags");
                if (optJSONArray != null) {
                    list = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = optJSONArray.getString(i10);
                        string.getClass();
                        list.add(string);
                    }
                } else {
                    list = j0.f5574d;
                }
                List list2 = list;
                optString.getClass();
                optString2.getClass();
                mVar = new AFi1xSDK(j, optDouble, list2, i3, optString, optString2);
            } else {
                mVar = null;
            }
        } catch (Throwable th) {
            hd.l lVar2 = hd.n.f4511e;
            mVar = new hd.m(th);
        }
        hd.l lVar3 = hd.n.f4511e;
        return (AFi1xSDK) (mVar instanceof hd.m ? null : mVar);
    }

    private static AFi1uSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object mVar;
        try {
            hd.l lVar = hd.n.f4511e;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            mVar = AFAdRevenueData != null ? new AFi1uSDK(AFAdRevenueData.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th) {
            hd.l lVar2 = hd.n.f4511e;
            mVar = new hd.m(th);
        }
        return (AFi1uSDK) (mVar instanceof hd.m ? null : mVar);
    }

    private static AFh1aSDK getMediationNetwork(JSONObject jSONObject) {
        Object mVar;
        try {
            hd.l lVar = hd.n.f4511e;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            mVar = AFAdRevenueData != null ? new AFh1aSDK(AFAdRevenueData.getString("sdk_ver"), AFAdRevenueData.optInt("min", -1), AFAdRevenueData.optInt("expire", -1), AFAdRevenueData.optLong("ttl", -1L)) : null;
        } catch (Throwable th) {
            hd.l lVar2 = hd.n.f4511e;
            mVar = new hd.m(th);
        }
        return (AFh1aSDK) (mVar instanceof hd.m ? null : mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFi1zSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        return Intrinsics.a(this.getCurrencyIso4217Code, aFi1zSDK.getCurrencyIso4217Code) && Intrinsics.a(this.getMonetizationNetwork, aFi1zSDK.getMonetizationNetwork) && Intrinsics.a(this.getMediationNetwork, aFi1zSDK.getMediationNetwork);
    }

    public final int hashCode() {
        AFh1aSDK aFh1aSDK = this.getCurrencyIso4217Code;
        int hashCode = (aFh1aSDK != null ? aFh1aSDK.hashCode() : 0) * 31;
        AFi1uSDK aFi1uSDK = this.getMonetizationNetwork;
        int hashCode2 = (hashCode + (aFi1uSDK != null ? aFi1uSDK.hashCode() : 0)) * 31;
        AFi1xSDK aFi1xSDK = this.getMediationNetwork;
        return hashCode2 + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0);
    }

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
