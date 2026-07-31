package com.bytedance.adsdk.zmn;

import android.text.TextUtils;
import com.pubmatic.sdk.common.POBCommonConstants;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class btk implements iv {
    @Override // com.bytedance.adsdk.zmn.iv
    public Object zmn(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                String valueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(valueOf) && !TextUtils.equals(valueOf, POBCommonConstants.NULL_VALUE)) {
                    return valueOf;
                }
            }
        }
        return null;
    }
}
