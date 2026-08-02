package n0;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: n0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1152n {

    /* renamed from: a, reason: collision with root package name */
    public final String f10111a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f10112b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10113c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10114d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10115e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10116g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10117h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10118i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f10119j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f10120k;

    public C1152n(String str) {
        this.f10111a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f10112b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f10113c = optString;
        String optString2 = jSONObject.optString("type");
        this.f10114d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f10115e = jSONObject.optString("title");
        this.f = jSONObject.optString("name");
        this.f10116g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f10117h = jSONObject.optString("skuDetailsToken");
        this.f10118i = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                arrayList.add(new C1151m(optJSONArray.getJSONObject(i3)));
            }
            this.f10119j = arrayList;
        } else {
            this.f10119j = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.f10112b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.f10112b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                arrayList2.add(new C1149k(optJSONArray2.getJSONObject(i4)));
            }
            this.f10120k = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.f10120k = null;
        } else {
            arrayList2.add(new C1149k(optJSONObject));
            this.f10120k = arrayList2;
        }
    }

    public final C1149k a() {
        ArrayList arrayList = this.f10120k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (C1149k) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1152n) {
            return TextUtils.equals(this.f10111a, ((C1152n) obj).f10111a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10111a.hashCode();
    }

    public final String toString() {
        return "ProductDetails{jsonString='" + this.f10111a + "', parsedJson=" + this.f10112b.toString() + ", productId='" + this.f10113c + "', productType='" + this.f10114d + "', title='" + this.f10115e + "', productDetailsToken='" + this.f10117h + "', subscriptionOfferDetails=" + String.valueOf(this.f10119j) + "}";
    }
}
