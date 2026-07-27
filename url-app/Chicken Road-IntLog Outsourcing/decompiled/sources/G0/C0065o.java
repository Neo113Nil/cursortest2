package G0;

import E.C0042q;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import h2.C0482c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: G0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065o {

    /* renamed from: a, reason: collision with root package name */
    public final String f878a;

    /* renamed from: b, reason: collision with root package name */
    public final String f879b;

    /* renamed from: c, reason: collision with root package name */
    public final String f880c;

    /* renamed from: d, reason: collision with root package name */
    public final C0482c f881d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f882e;

    /* renamed from: f, reason: collision with root package name */
    public final C0042q f883f;

    public C0065o(JSONObject jSONObject) {
        this.f878a = jSONObject.optString("basePlanId");
        String optString = jSONObject.optString("offerId");
        this.f879b = true == optString.isEmpty() ? null : optString;
        this.f880c = jSONObject.getString("offerIdToken");
        this.f881d = new C0482c(jSONObject.getJSONArray("pricingPhases"));
        JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        this.f883f = optJSONObject != null ? new C0042q(optJSONObject) : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (optJSONObject2 != null) {
            optJSONObject2.getString("productId");
            optJSONObject2.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
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
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList.add(optJSONArray.getString(i2));
            }
        }
        this.f882e = arrayList;
    }
}
