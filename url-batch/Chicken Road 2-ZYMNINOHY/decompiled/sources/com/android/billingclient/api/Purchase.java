package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Purchase {

    /* renamed from: a, reason: collision with root package name */
    public final String f5745a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5746b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f5747c;

    public Purchase(String str, String str2) {
        this.f5745a = str;
        this.f5746b = str2;
        this.f5747c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f5747c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    arrayList.add(optJSONArray.optString(i4));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final String b() {
        JSONObject jSONObject = this.f5747c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f5745a, purchase.f5745a) && TextUtils.equals(this.f5746b, purchase.f5746b);
    }

    public final int hashCode() {
        return this.f5745a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f5745a));
    }
}
