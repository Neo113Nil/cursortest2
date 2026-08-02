package n0;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: n0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1149k {

    /* renamed from: a, reason: collision with root package name */
    public final String f10096a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10097b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10098c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10099d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10100e;
    public final m1.c f;

    public C1149k(JSONObject jSONObject) {
        this.f10096a = jSONObject.optString("formattedPrice");
        this.f10097b = jSONObject.optLong("priceAmountMicros");
        this.f10098c = jSONObject.optString("priceCurrencyCode");
        String optString = jSONObject.optString("offerIdToken");
        m1.c cVar = null;
        this.f10099d = true == optString.isEmpty() ? null : optString;
        jSONObject.optString("offerId").getClass();
        jSONObject.optString("purchaseOptionId").getClass();
        jSONObject.optInt("offerType");
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                arrayList.add(optJSONArray.getString(i3));
            }
        }
        com.google.android.gms.internal.play_billing.C.k(arrayList);
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (optJSONObject != null) {
            optJSONObject.getInt("percentageDiscount");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
        if (optJSONObject2 != null) {
            optJSONObject2.getLong("startTimeMillis");
            optJSONObject2.getLong("endTimeMillis");
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (optJSONObject3 != null) {
            optJSONObject3.getInt("maximumQuantity");
            optJSONObject3.getInt("remainingQuantity");
        }
        this.f10100e = jSONObject.optString("serializedDocid");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
        if (optJSONObject4 != null) {
            optJSONObject4.getLong("preorderReleaseTimeMillis");
            optJSONObject4.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
        if (optJSONObject5 != null) {
            optJSONObject5.getString("rentalPeriod");
            optJSONObject5.optString("rentalExpirationPeriod").getClass();
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
        if (optJSONObject6 != null) {
            cVar = new m1.c();
            optJSONObject6.getString("type");
            JSONArray optJSONArray2 = optJSONObject6.optJSONArray("balanceThresholds");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray2 != null) {
                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                    arrayList2.add(Integer.valueOf(optJSONArray2.getInt(i4)));
                }
            }
            JSONArray jSONArray = optJSONObject6.getJSONArray("pricingPhases");
            ArrayList arrayList3 = new ArrayList();
            if (jSONArray != null) {
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    JSONObject optJSONObject7 = jSONArray.optJSONObject(i5);
                    if (optJSONObject7 != null) {
                        arrayList3.add(new C1150l(optJSONObject7));
                    }
                }
            }
        }
        this.f = cVar;
    }
}
