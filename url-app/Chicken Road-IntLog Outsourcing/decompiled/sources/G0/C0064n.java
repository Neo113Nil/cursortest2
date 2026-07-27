package G0;

import org.json.JSONObject;

/* renamed from: G0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064n {

    /* renamed from: a, reason: collision with root package name */
    public final String f872a;

    /* renamed from: b, reason: collision with root package name */
    public final long f873b;

    /* renamed from: c, reason: collision with root package name */
    public final String f874c;

    /* renamed from: d, reason: collision with root package name */
    public final String f875d;

    /* renamed from: e, reason: collision with root package name */
    public final int f876e;

    /* renamed from: f, reason: collision with root package name */
    public final int f877f;

    public C0064n(JSONObject jSONObject) {
        this.f875d = jSONObject.optString("billingPeriod");
        this.f874c = jSONObject.optString("priceCurrencyCode");
        this.f872a = jSONObject.optString("formattedPrice");
        this.f873b = jSONObject.optLong("priceAmountMicros");
        this.f877f = jSONObject.optInt("recurrenceMode");
        this.f876e = jSONObject.optInt("billingCycleCount");
    }
}
