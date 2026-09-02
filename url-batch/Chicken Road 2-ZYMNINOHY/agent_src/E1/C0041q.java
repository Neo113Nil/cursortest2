package E1;

import org.json.JSONObject;

/* renamed from: E1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041q {

    /* renamed from: a, reason: collision with root package name */
    public final String f646a;

    /* renamed from: b, reason: collision with root package name */
    public final long f647b;

    /* renamed from: c, reason: collision with root package name */
    public final String f648c;

    /* renamed from: d, reason: collision with root package name */
    public final String f649d;

    /* renamed from: e, reason: collision with root package name */
    public final int f650e;

    /* renamed from: f, reason: collision with root package name */
    public final int f651f;

    public C0041q(JSONObject jSONObject) {
        this.f649d = jSONObject.optString("billingPeriod");
        this.f648c = jSONObject.optString("priceCurrencyCode");
        this.f646a = jSONObject.optString("formattedPrice");
        this.f647b = jSONObject.optLong("priceAmountMicros");
        this.f651f = jSONObject.optInt("recurrenceMode");
        this.f650e = jSONObject.optInt("billingCycleCount");
    }
}
