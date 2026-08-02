package E1;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: E1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040p {

    /* renamed from: a, reason: collision with root package name */
    public final String f639a;

    /* renamed from: b, reason: collision with root package name */
    public final long f640b;

    /* renamed from: c, reason: collision with root package name */
    public final String f641c;

    /* renamed from: d, reason: collision with root package name */
    public final String f642d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f643e;

    /* renamed from: f, reason: collision with root package name */
    public final String f644f;

    /* renamed from: g, reason: collision with root package name */
    public final a2.i f645g;

    public C0040p(JSONObject jSONObject) {
        this.f639a = jSONObject.optString("formattedPrice");
        this.f640b = jSONObject.optLong("priceAmountMicros");
        this.f641c = jSONObject.optString("priceCurrencyCode");
        String optString = jSONObject.optString("offerIdToken");
        a2.i iVar = null;
        this.f642d = true == optString.isEmpty() ? null : optString;
        jSONObject.optString("offerId").getClass();
        jSONObject.optString("purchaseOptionId").getClass();
        jSONObject.optInt("offerType");
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        this.f643e = new ArrayList();
        if (optJSONArray != null) {
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                this.f643e.add(optJSONArray.getString(i4));
            }
        }
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (optJSONObject != null) {
            if (optJSONObject.has("percentageDiscount")) {
                optJSONObject.optInt("percentageDiscount");
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("discountAmount");
            if (optJSONObject2 != null) {
                optJSONObject2.optString("formattedDiscountAmount");
                optJSONObject2.optLong("discountAmountMicros");
                optJSONObject2.optString("discountAmountCurrencyCode");
            }
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("validTimeWindow");
        if (optJSONObject3 != null) {
            if (optJSONObject3.has("startTimeMillis")) {
                optJSONObject3.optLong("startTimeMillis");
            }
            if (optJSONObject3.has("endTimeMillis")) {
                optJSONObject3.optLong("endTimeMillis");
            }
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (optJSONObject4 != null) {
            optJSONObject4.getInt("maximumQuantity");
            optJSONObject4.getInt("remainingQuantity");
        }
        this.f644f = jSONObject.optString("serializedDocid");
        JSONObject optJSONObject5 = jSONObject.optJSONObject("preorderDetails");
        if (optJSONObject5 != null) {
            optJSONObject5.getLong("preorderReleaseTimeMillis");
            optJSONObject5.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("rentalDetails");
        if (optJSONObject6 != null) {
            optJSONObject6.getString("rentalPeriod");
            optJSONObject6.optString("rentalExpirationPeriod").getClass();
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("autoPayDetails");
        if (optJSONObject7 != null) {
            iVar = new a2.i(3);
            optJSONObject7.getString("type");
        }
        this.f645g = iVar;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("pricingPhases");
        if (optJSONArray2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
            JSONObject optJSONObject8 = optJSONArray2.optJSONObject(i5);
            if (optJSONObject8 != null) {
                arrayList.add(new C0041q(optJSONObject8));
            }
        }
    }
}
