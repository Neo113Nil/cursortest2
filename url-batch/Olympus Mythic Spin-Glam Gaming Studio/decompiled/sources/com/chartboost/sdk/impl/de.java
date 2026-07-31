package com.chartboost.sdk.impl;

import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class de {
    public static final List a(JSONObject jSONObject) {
        List<JSONObject> asListSkipNull;
        fk fkVar;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONArray optJSONArray = jSONObject.optJSONArray("verification");
        if (optJSONArray == null || (asListSkipNull = q8.asListSkipNull(optJSONArray)) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject2 : asListSkipNull) {
            try {
                String string = jSONObject2.getString("url");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = jSONObject2.getString(VastAttributes.VENDOR);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = jSONObject2.getString("params");
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                fkVar = new fk(string, string2, string3);
            } catch (Exception unused) {
                fkVar = null;
            }
            if (fkVar != null) {
                arrayList.add(fkVar);
            }
        }
        return arrayList;
    }

    public static final ce b(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        List a = a(config);
        JSONObject optJSONObject = config.optJSONObject("viewabilitySettings");
        return optJSONObject != null ? new ce(config.optBoolean("enabled", false), config.optBoolean("verificationEnabled", false), optJSONObject.optInt("minVisibleDips", 1), optJSONObject.optInt("minVisibleDurationMs", 0), optJSONObject.optLong("visibilityCheckIntervalMs", 100L), optJSONObject.optInt("traversalLimit", 25), a) : new ce(config.optBoolean("enabled", false), config.optBoolean("verificationEnabled", false), 0, 0, 0L, 0, a, 60, null);
    }
}
