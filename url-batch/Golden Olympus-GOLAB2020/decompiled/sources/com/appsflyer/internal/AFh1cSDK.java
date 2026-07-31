package com.appsflyer.internal;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1cSDK {
    public AFi1xSDK AFAdRevenueData;
    public final AFh1bSDK getCurrencyIso4217Code;
    public final AFh1dSDK getRevenue;

    public AFh1cSDK(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.AFAdRevenueData = getCurrencyIso4217Code(jSONObject);
        this.getRevenue = getRevenue(jSONObject);
        this.getCurrencyIso4217Code = getMonetizationNetwork(jSONObject);
    }

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }

    private static AFi1xSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object m243constructorimpl;
        AFi1xSDK aFi1xSDK;
        List emptyList;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (AFAdRevenueData != null) {
                long j4 = AFAdRevenueData.getLong("ttl");
                int i4 = AFAdRevenueData.getInt("counter");
                String optString = AFAdRevenueData.optString("app_ver", "");
                String optString2 = AFAdRevenueData.optString(HiAnalyticsConstant.BI_KEY_SDK_VER, "");
                float optDouble = (float) AFAdRevenueData.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = AFAdRevenueData.optJSONArray("tags");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    emptyList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i5 = 0; i5 < length; i5++) {
                        String string = optJSONArray.getString(i5);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        emptyList.add(string);
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                List list = emptyList;
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                aFi1xSDK = new AFi1xSDK(j4, optDouble, list, i4, optString, optString2);
            } else {
                aFi1xSDK = null;
            }
            m243constructorimpl = Result.m243constructorimpl(aFi1xSDK);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        return (AFi1xSDK) (Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl);
    }

    private static AFh1bSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object m243constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            m243constructorimpl = Result.m243constructorimpl(AFAdRevenueData != null ? new AFh1bSDK(AFAdRevenueData.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1bSDK) (Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl);
    }

    private static AFh1dSDK getRevenue(JSONObject jSONObject) {
        Object m243constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            m243constructorimpl = Result.m243constructorimpl(AFAdRevenueData != null ? new AFh1dSDK(AFAdRevenueData.getString(HiAnalyticsConstant.BI_KEY_SDK_VER), AFAdRevenueData.optInt("min", -1), AFAdRevenueData.optInt("expire", -1), AFAdRevenueData.optLong("ttl", -1L)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1dSDK) (Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(AFh1cSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AFh1cSDK aFh1cSDK = (AFh1cSDK) obj;
        return Intrinsics.areEqual(this.getRevenue, aFh1cSDK.getRevenue) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFh1cSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.AFAdRevenueData, aFh1cSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        AFh1dSDK aFh1dSDK = this.getRevenue;
        int hashCode = (aFh1dSDK != null ? aFh1dSDK.hashCode() : 0) * 31;
        AFh1bSDK aFh1bSDK = this.getCurrencyIso4217Code;
        int hashCode2 = (hashCode + (aFh1bSDK != null ? aFh1bSDK.hashCode() : 0)) * 31;
        AFi1xSDK aFi1xSDK = this.AFAdRevenueData;
        return hashCode2 + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0);
    }
}
