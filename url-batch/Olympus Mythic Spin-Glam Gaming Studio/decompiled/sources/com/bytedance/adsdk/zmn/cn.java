package com.bytedance.adsdk.zmn;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public class cn implements iv {
    @Override // com.bytedance.adsdk.zmn.iv
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public String zmn(JSONObject jSONObject, Object[] objArr) {
        Object obj;
        if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        return null;
    }
}
