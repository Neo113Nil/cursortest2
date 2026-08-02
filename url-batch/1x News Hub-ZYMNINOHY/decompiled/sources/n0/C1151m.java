package n0;

import E.C0009j;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: n0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1151m {

    /* renamed from: a, reason: collision with root package name */
    public final String f10106a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10107b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10108c;

    /* renamed from: d, reason: collision with root package name */
    public final b0.r f10109d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10110e;
    public final C0009j f;

    public C1151m(JSONObject jSONObject) {
        this.f10106a = jSONObject.optString("basePlanId");
        String optString = jSONObject.optString("offerId");
        this.f10107b = true == optString.isEmpty() ? null : optString;
        this.f10108c = jSONObject.getString("offerIdToken");
        JSONArray jSONArray = jSONObject.getJSONArray("pricingPhases");
        b0.r rVar = new b0.r();
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                if (optJSONObject != null) {
                    arrayList.add(new C1150l(optJSONObject));
                }
            }
        }
        rVar.f2543a = arrayList;
        this.f10109d = rVar;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("installmentPlanDetails");
        this.f = optJSONObject2 != null ? new C0009j(optJSONObject2) : null;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("transitionPlanDetails");
        if (optJSONObject3 != null) {
            optJSONObject3.getString("productId");
            optJSONObject3.optString("title");
            optJSONObject3.optString("name");
            optJSONObject3.optString("description");
            optJSONObject3.optString("basePlanId");
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("pricingPhase");
            if (optJSONObject4 != null) {
                optJSONObject4.optString("billingPeriod");
                optJSONObject4.optString("priceCurrencyCode");
                optJSONObject4.optString("formattedPrice");
                optJSONObject4.optLong("priceAmountMicros");
                optJSONObject4.optInt("recurrenceMode");
                optJSONObject4.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                arrayList2.add(optJSONArray.getString(i4));
            }
        }
        this.f10110e = arrayList2;
    }
}
