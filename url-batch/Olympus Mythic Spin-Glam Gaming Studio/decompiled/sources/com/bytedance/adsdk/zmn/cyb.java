package com.bytedance.adsdk.zmn;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class cyb implements iv {
    @Override // com.bytedance.adsdk.zmn.iv
    public Object zmn(JSONObject jSONObject, Object[] objArr) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        if (objArr == null || objArr.length != 0) {
            return null;
        }
        String valueOf = String.valueOf(objArr[2]);
        String valueOf2 = String.valueOf(objArr[1]);
        String valueOf3 = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(valueOf3) || jSONObject == null || (optJSONObject = jSONObject.optJSONObject("i18n")) == null || (optJSONObject2 = optJSONObject.optJSONObject(valueOf2)) == null) {
            return valueOf;
        }
        String optString = optJSONObject2.optString(valueOf3);
        return TextUtils.isEmpty(optString) ? valueOf : optString;
    }
}
