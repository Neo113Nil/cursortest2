package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class PurchaseHistoryRecord {

    /* renamed from: a, reason: collision with root package name */
    public final String f4944a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4945b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f4946c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f4944a = str;
        this.f4945b = str2;
        this.f4946c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f4946c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    arrayList.add(optJSONArray.optString(i2));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final String b() {
        JSONObject jSONObject = this.f4946c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f4944a, purchaseHistoryRecord.f4944a) && TextUtils.equals(this.f4945b, purchaseHistoryRecord.f4945b);
    }

    public final int hashCode() {
        return this.f4944a.hashCode();
    }

    public final String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f4944a));
    }
}
