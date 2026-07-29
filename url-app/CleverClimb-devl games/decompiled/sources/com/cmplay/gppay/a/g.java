package com.cmplay.gppay.a;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public String f4096a;

    /* renamed from: b, reason: collision with root package name */
    String f4097b;

    /* renamed from: c, reason: collision with root package name */
    String f4098c;

    /* renamed from: d, reason: collision with root package name */
    String f4099d;
    long e;
    int f;
    String g;
    String h;
    String i;
    String j;
    boolean k;

    public g(String str, String str2, String str3) {
        this.f4096a = str;
        this.i = str2;
        JSONObject jSONObject = new JSONObject(this.i);
        this.f4097b = jSONObject.optString("orderId");
        this.f4098c = jSONObject.optString("packageName");
        this.f4099d = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.e = jSONObject.optLong("purchaseTime");
        this.f = jSONObject.optInt("purchaseState");
        this.g = jSONObject.optString("developerPayload");
        this.h = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        this.k = jSONObject.optBoolean("autoRenewing");
        this.j = str3;
    }

    public String a() {
        return this.f4096a;
    }

    public String b() {
        return this.f4097b;
    }

    public String c() {
        return this.f4098c;
    }

    public String d() {
        return this.f4099d;
    }

    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof g) && TextUtils.equals(((g) obj).e(), e());
    }

    public String f() {
        return this.i;
    }

    public String g() {
        return this.j;
    }

    public int hashCode() {
        return this.h.hashCode();
    }

    public String toString() {
        return this.i;
    }
}
