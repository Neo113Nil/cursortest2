package E1;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: E1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043t {

    /* renamed from: a, reason: collision with root package name */
    public final String f659a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f660b;

    /* renamed from: c, reason: collision with root package name */
    public final String f661c;

    /* renamed from: d, reason: collision with root package name */
    public final String f662d;

    /* renamed from: e, reason: collision with root package name */
    public final String f663e;

    /* renamed from: f, reason: collision with root package name */
    public final String f664f;

    /* renamed from: g, reason: collision with root package name */
    public final String f665g;

    /* renamed from: h, reason: collision with root package name */
    public final String f666h;

    /* renamed from: i, reason: collision with root package name */
    public final String f667i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f668j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f669k;

    public C0043t(String str) {
        this.f659a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f660b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f661c = optString;
        String optString2 = jSONObject.optString("type");
        this.f662d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f663e = jSONObject.optString("title");
        this.f664f = jSONObject.optString("name");
        this.f665g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f666h = jSONObject.optString("skuDetailsToken");
        this.f667i = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                arrayList.add(new C0042s(optJSONArray.getJSONObject(i4)));
            }
            this.f668j = arrayList;
        } else {
            this.f668j = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.f660b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.f660b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
                arrayList2.add(new C0040p(optJSONArray2.getJSONObject(i5)));
            }
            this.f669k = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.f669k = null;
        } else {
            arrayList2.add(new C0040p(optJSONObject));
            this.f669k = arrayList2;
        }
    }

    public final C0040p a() {
        ArrayList arrayList = this.f669k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (C0040p) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0043t) {
            return TextUtils.equals(this.f659a, ((C0043t) obj).f659a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f659a.hashCode();
    }

    public final String toString() {
        return "ProductDetails{jsonString='" + this.f659a + "', parsedJson=" + this.f660b.toString() + ", productId='" + this.f661c + "', productType='" + this.f662d + "', title='" + this.f663e + "', productDetailsToken='" + this.f666h + "', subscriptionOfferDetails=" + String.valueOf(this.f668j) + "}";
    }
}
