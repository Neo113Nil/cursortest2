package com.bytedance.adsdk.zmn;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class hhw implements iv {
    @Override // com.bytedance.adsdk.zmn.iv
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public String zmn(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String valueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(valueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(valueOf);
            String valueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(valueOf2)) {
                return null;
            }
            Object zmn = com.bytedance.adsdk.zmn.fs.zmn.zmn(valueOf2).zmn(jSONObject2);
            if (TextUtils.isEmpty(String.valueOf(zmn))) {
                if (objArr.length >= 3) {
                    return String.valueOf(objArr[2]);
                }
                return null;
            }
            return String.valueOf(zmn);
        } catch (JSONException unused) {
            return null;
        }
    }
}
