package com.bytedance.adsdk.zmn;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class rt implements iv {
    @Override // com.bytedance.adsdk.zmn.iv
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public Number zmn(JSONObject jSONObject, Object[] objArr) {
        Object obj;
        if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            String trim = ((String) obj).trim();
            if (!trim.equalsIgnoreCase("true") && !trim.equalsIgnoreCase("false")) {
                if (trim.contains(".")) {
                    return Double.valueOf(Double.parseDouble(trim));
                }
                return Long.valueOf(Long.parseLong(trim));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
