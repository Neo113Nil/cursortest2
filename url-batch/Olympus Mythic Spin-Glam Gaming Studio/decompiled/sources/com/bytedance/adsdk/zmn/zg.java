package com.bytedance.adsdk.zmn;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zg implements iv {
    @Override // com.bytedance.adsdk.zmn.iv
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public Boolean zmn(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length >= 2) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (obj2 == null) {
                return Boolean.FALSE;
            }
            if (obj instanceof String) {
                return Boolean.valueOf(((String) obj).contains(String.valueOf(obj2)));
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() > 0) {
                    return Boolean.valueOf(zmn(jSONArray, obj2));
                }
            }
        }
        return Boolean.FALSE;
    }

    private boolean zmn(JSONArray jSONArray, Object obj) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (jSONArray.get(i).equals(obj)) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
