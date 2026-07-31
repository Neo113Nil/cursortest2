package com.my.tracker.personalize;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.my.tracker.obfuscated.AbstractC1708y2;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class d extends b {
    d() {
    }

    static c b(JSONObject jSONObject) {
        String a4 = a(jSONObject, "sku", "payload", "value", "discount_value", "price", "discount_price");
        if (a4 != null) {
            return new c(null, a4);
        }
        String optString = jSONObject.optString("sku");
        if (TextUtils.isEmpty(optString)) {
            return a("Invalid value for key: ", "sku");
        }
        String optString2 = jSONObject.optString("payload");
        if (TextUtils.isEmpty(optString2)) {
            return a("Invalid value for key: ", "payload");
        }
        return new c(new PersonalizeItem(optString, optString2, jSONObject.optDouble("price"), jSONObject.optDouble("discount_price"), jSONObject.optInt("value"), jSONObject.optInt("discount_value")), null);
    }

    static c c(JSONObject jSONObject) {
        String str;
        StringBuilder sb;
        String a4 = a(jSONObject, "offer_id", "subitems");
        if (a4 != null) {
            return new c(null, a4);
        }
        int optInt = jSONObject.optInt("offer_id");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("subitems");
        if (optJSONArray == null) {
            return a("No value for key: ", "subitems");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
            c b4 = b(optJSONArray.optJSONObject(i4));
            String a5 = b4.a();
            if (TextUtils.isEmpty(a5)) {
                PersonalizeItem personalizeItem = (PersonalizeItem) b4.b();
                if (personalizeItem == null) {
                    str = "Can't parse item " + i4 + " without errors";
                    arrayList2.add(str);
                    sb = new StringBuilder();
                } else {
                    arrayList.add(personalizeItem);
                }
            } else {
                str = "Can't parse item " + i4 + " with errors: " + a5;
                arrayList2.add(str);
                sb = new StringBuilder();
            }
            sb.append("PersonalizePlacementsParser: ");
            sb.append(str);
            AbstractC1708y2.a(sb.toString());
        }
        return arrayList2.size() > 0 ? new c(null, h.a(", ", arrayList2)) : new c(new PersonalizeOffer(optInt, arrayList), null);
    }

    static c d(JSONObject jSONObject) {
        String a4 = a(jSONObject, "placement_id", "test_id", FirebaseAnalytics.Param.GROUP_ID, "offer");
        if (a4 != null) {
            return new c(null, a4);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("offer");
        if (optJSONObject == null) {
            return a("Invalid value for key: ", "offer");
        }
        c c4 = c(optJSONObject);
        String a5 = c4.a();
        if (a5 != null) {
            AbstractC1708y2.a("PersonalizePlacementsParser: Can't parse offer's object with error: " + a5);
            return new c(null, a5);
        }
        PersonalizeOffer personalizeOffer = (PersonalizeOffer) c4.b();
        if (personalizeOffer == null) {
            return a("Can't parse offer's object without error from parser", null);
        }
        String optString = jSONObject.optString("placement_id");
        return TextUtils.isEmpty(optString) ? a("Invalid value for key: ", "placement_id") : new c(new PersonalizePlacement(optString, jSONObject.optInt(FirebaseAnalytics.Param.GROUP_ID), jSONObject.optInt("test_id"), personalizeOffer), null);
    }

    @Override // com.my.tracker.personalize.b
    c a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("errors");
        ArrayList arrayList = new ArrayList();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                arrayList.add(next + ": " + optJSONObject.optString(next));
            }
            return new c(null, h.a(", ", arrayList));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            return a("No value for key: ", "data");
        }
        if (optJSONArray.length() == 0) {
            return a("No placements in the list");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
            c d4 = d(optJSONArray.optJSONObject(i4));
            String a4 = d4.a();
            if (a4 != null) {
                AbstractC1708y2.a("PersonalizePlacementsParser: Placement parsing error: " + a4);
            } else {
                PersonalizePlacement personalizePlacement = (PersonalizePlacement) d4.b();
                if (personalizePlacement != null) {
                    arrayList2.add(personalizePlacement);
                }
            }
        }
        return arrayList2.isEmpty() ? a("No placements in the list") : new c(arrayList2, null);
    }

    static c a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        String sb2 = sb.toString();
        AbstractC1708y2.a("PersonalizePlacementsParser: " + sb2);
        return new c(null, sb2);
    }

    static String a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                String str2 = "No value for key: " + str;
                AbstractC1708y2.a("PersonalizePlacementsParser: " + str2);
                return str2;
            }
        }
        return null;
    }
}
