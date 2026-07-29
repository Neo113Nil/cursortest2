package com.cmplay.gppay.a;

import com.tapjoy.TJAdUnitConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    String f4102a;

    /* renamed from: b, reason: collision with root package name */
    String f4103b;

    /* renamed from: c, reason: collision with root package name */
    String f4104c;

    /* renamed from: d, reason: collision with root package name */
    String f4105d;
    String e;
    String f;
    String g;

    public j(String str, String str2) {
        this.f4102a = str;
        this.g = str2;
        JSONObject jSONObject = new JSONObject(this.g);
        this.f4103b = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f4104c = jSONObject.optString("type");
        this.f4105d = jSONObject.optString(InAppPurchaseMetaData.KEY_PRICE);
        this.e = jSONObject.optString(TJAdUnitConstants.String.TITLE);
        this.f = jSONObject.optString("description");
    }

    public String a() {
        return this.f4103b;
    }

    public String b() {
        return this.f4104c;
    }

    public String toString() {
        return "SkuDetails:" + this.g;
    }
}
