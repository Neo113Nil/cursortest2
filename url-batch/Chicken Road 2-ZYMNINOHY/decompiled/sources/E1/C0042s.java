package E1;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: E1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042s {

    /* renamed from: a, reason: collision with root package name */
    public final String f653a;

    /* renamed from: b, reason: collision with root package name */
    public final String f654b;

    /* renamed from: c, reason: collision with root package name */
    public final String f655c;

    /* renamed from: d, reason: collision with root package name */
    public final r f656d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f657e;

    /* renamed from: f, reason: collision with root package name */
    public final C0039o f658f;

    public C0042s(JSONObject jSONObject) {
        this.f653a = jSONObject.optString("basePlanId");
        String optString = jSONObject.optString("offerId");
        this.f654b = true == optString.isEmpty() ? null : optString;
        this.f655c = jSONObject.getString("offerIdToken");
        this.f656d = new r(jSONObject.getJSONArray("pricingPhases"));
        JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        this.f658f = optJSONObject != null ? new C0039o(optJSONObject) : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (optJSONObject2 != null) {
            optJSONObject2.getString("productId");
            optJSONObject2.optString("title");
            optJSONObject2.optString("name");
            optJSONObject2.optString("description");
            optJSONObject2.optString("basePlanId");
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
            if (optJSONObject3 != null) {
                optJSONObject3.optString("billingPeriod");
                optJSONObject3.optString("priceCurrencyCode");
                optJSONObject3.optString("formattedPrice");
                optJSONObject3.optLong("priceAmountMicros");
                optJSONObject3.optInt("recurrenceMode");
                optJSONObject3.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                arrayList.add(optJSONArray.getString(i4));
            }
        }
        this.f657e = arrayList;
    }
}
