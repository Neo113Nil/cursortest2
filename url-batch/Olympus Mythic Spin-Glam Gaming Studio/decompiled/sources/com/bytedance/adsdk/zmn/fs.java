package com.bytedance.adsdk.zmn;

import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class fs implements iv {
    @Override // com.bytedance.adsdk.zmn.iv
    public Object zmn(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        String valueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(valueOf)) {
            return null;
        }
        return Uri.decode(valueOf);
    }
}
