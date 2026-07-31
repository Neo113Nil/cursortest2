package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.DataUseConsent;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class z8 {
    public JSONObject a(List list) {
        JSONObject jSONObject = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DataUseConsent dataUseConsent = (DataUseConsent) it.next();
            try {
                jSONObject.put(dataUseConsent.getPrivacyStandard(), dataUseConsent.getConsent());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }
}
