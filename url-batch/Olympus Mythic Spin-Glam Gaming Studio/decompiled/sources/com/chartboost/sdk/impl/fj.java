package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class fj {
    public final String a(JSONObject jSONObject) {
        String optString = jSONObject != null ? jSONObject.optString("url", "") : null;
        return optString == null ? "" : optString;
    }

    public final o3 b(JSONObject jSONObject) {
        return new o3(a(jSONObject), c(jSONObject));
    }

    public final Boolean c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return c3.a(jSONObject, "shouldDismiss");
        }
        return null;
    }
}
