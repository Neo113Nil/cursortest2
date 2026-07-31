package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.b9;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.t2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2976t2 {
    public static void a(C2580dm c2580dm, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(com.ironsource.c9.f15699c);
        if (optJSONObject != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = optJSONObject.optJSONArray("deeplink_conditions");
            if (optJSONArray != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i4);
                    String optString = optJSONObject2.optString(b9.h.f15463W, null);
                    if (!TextUtils.isEmpty(optString)) {
                        String optString2 = optJSONObject2.optString("value", null);
                        arrayList.add(new Pair(optString, optString2 != null ? new C2899q2(optString2) : null));
                    }
                }
            }
            c2580dm.f38878t = new C2924r2(arrayList);
        }
    }
}
