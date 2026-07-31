package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yp1 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f14778a;

    /* renamed from: b, reason: collision with root package name */
    private final tp1 f14779b;

    public yp1(Executor executor, tp1 tp1Var) {
        this.f14778a = executor;
        this.f14779b = tp1Var;
    }

    public final cc3<List<xp1>> a(JSONObject jSONObject, String str) {
        final String optString;
        cc3 m7;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return rb3.i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
            xp1 xp1Var = null;
            if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                String optString2 = optJSONObject.optString("type");
                if ("string".equals(optString2)) {
                    xp1Var = new xp1(optString, optJSONObject.optString("string_value"));
                } else if ("image".equals(optString2)) {
                    m7 = rb3.m(this.f14779b.e(optJSONObject, "image_value"), new e43() { // from class: com.google.android.gms.internal.ads.vp1
                        @Override // com.google.android.gms.internal.ads.e43
                        public final Object apply(Object obj) {
                            return new xp1(optString, (z30) obj);
                        }
                    }, this.f14778a);
                    arrayList.add(m7);
                }
            }
            m7 = rb3.i(xp1Var);
            arrayList.add(m7);
        }
        return rb3.m(rb3.e(arrayList), new e43() { // from class: com.google.android.gms.internal.ads.wp1
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (xp1 xp1Var2 : (List) obj) {
                    if (xp1Var2 != null) {
                        arrayList2.add(xp1Var2);
                    }
                }
                return arrayList2;
            }
        }, this.f14778a);
    }
}
