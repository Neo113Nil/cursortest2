package n0;

import org.json.JSONObject;

/* renamed from: n0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150l {

    /* renamed from: a, reason: collision with root package name */
    public final String f10101a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10102b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10103c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10104d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10105e;
    public final int f;

    public C1150l(JSONObject jSONObject) {
        this.f10104d = jSONObject.optString("billingPeriod");
        this.f10103c = jSONObject.optString("priceCurrencyCode");
        this.f10101a = jSONObject.optString("formattedPrice");
        this.f10102b = jSONObject.optLong("priceAmountMicros");
        this.f = jSONObject.optInt("recurrenceMode");
        this.f10105e = jSONObject.optInt("billingCycleCount");
    }
}
