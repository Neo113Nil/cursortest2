package com.chartboost.sdk.impl;

import com.ironsource.B5;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class ni {
    public static final List a = CollectionsKt.emptyList();

    public static final mi b(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONObject optJSONObject = jSONObject.optJSONObject("tracking");
        if (optJSONObject == null) {
            return new mi(false, null, null, 0, 0, false, 0, false, 255, null);
        }
        boolean optBoolean = optJSONObject.optBoolean("enabled", false);
        String optString = optJSONObject.optString(B5.r, "https://ssp-events.chartboost.com/track/sdk");
        int optInt = optJSONObject.optInt("eventLimit", 10);
        int optInt2 = optJSONObject.optInt("windowDuration", 60);
        boolean optBoolean2 = optJSONObject.optBoolean("persistenceEnabled", true);
        int optInt3 = optJSONObject.optInt("persistenceMaxEvents", 100);
        boolean optBoolean3 = optJSONObject.optBoolean("logContextEnabled", true);
        List a2 = a(optJSONObject);
        Intrinsics.checkNotNull(optString);
        return new mi(optBoolean, a2, optString, optInt, optInt2, optBoolean2, optInt3, optBoolean3);
    }

    public static final List a(JSONObject jSONObject) {
        List asList;
        List a2;
        JSONArray optJSONArray = jSONObject.optJSONArray("blacklist");
        return (optJSONArray == null || (asList = q8.asList(optJSONArray)) == null || (a2 = ti.a(asList)) == null) ? a : a2;
    }

    public static final List a() {
        return a;
    }
}
