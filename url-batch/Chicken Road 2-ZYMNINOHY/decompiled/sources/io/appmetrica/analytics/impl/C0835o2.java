package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835o2 {
    public static void a(C0571dm c0571dm, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = optJSONObject.optJSONArray("deeplink_conditions");
            if (optJSONArray != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i4);
                    String optString = optJSONObject2.optString("key", null);
                    if (!TextUtils.isEmpty(optString)) {
                        String optString2 = optJSONObject2.optString("value", null);
                        arrayList.add(new Pair(optString, optString2 != null ? new C0757l2(optString2) : null));
                    }
                }
            }
            c0571dm.f11703s = new C0783m2(arrayList);
        }
    }
}
