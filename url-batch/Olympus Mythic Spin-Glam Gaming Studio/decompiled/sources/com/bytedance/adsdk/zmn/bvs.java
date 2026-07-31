package com.bytedance.adsdk.zmn;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class bvs implements iv {
    @Override // com.bytedance.adsdk.zmn.iv
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public Boolean zmn(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return Boolean.FALSE;
        }
        try {
            Double.parseDouble(String.valueOf(objArr[0]));
            return Boolean.TRUE;
        } catch (NumberFormatException unused) {
            return Boolean.FALSE;
        }
    }
}
