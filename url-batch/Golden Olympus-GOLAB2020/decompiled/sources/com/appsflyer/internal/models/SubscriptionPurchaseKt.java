package com.appsflyer.internal.models;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class SubscriptionPurchaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T getNullable(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return (T) jSONObject.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<T> toList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            arrayList.add(jSONArray.get(i4));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T toObject(JSONObject jSONObject, String str, Deserialize<T> deserialize) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return deserialize.fromJson(optJSONObject);
        }
        return null;
    }
}
