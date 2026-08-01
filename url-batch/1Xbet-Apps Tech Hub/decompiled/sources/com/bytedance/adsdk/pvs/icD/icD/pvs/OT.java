package com.bytedance.adsdk.pvs.icD.icD.pvs;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VariableNode.java */
/* loaded from: classes.dex */
public class OT implements com.bytedance.adsdk.pvs.icD.icD.pvs {
    private final String pvs;

    public OT(String str) {
        this.pvs = str;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public Object pvs(Map<String, JSONObject> map) {
        Object pvs;
        if (map == null || map.size() <= 0 || (pvs = pvs(this.pvs, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return pvs;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public com.bytedance.adsdk.pvs.icD.Jd.NB pvs() {
        return com.bytedance.adsdk.pvs.icD.Jd.sUS.VARIABLE;
    }

    public String toString() {
        return "VariableNode [literals=" + this.pvs + "]";
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public String icD() {
        return this.pvs;
    }

    public Object pvs(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return pvs(str.split("\\."), 0, jSONObject);
    }

    private Object pvs(String[] strArr, int i, JSONObject jSONObject) {
        Object opt;
        if (strArr != null && strArr.length > 0 && i < strArr.length && jSONObject != null) {
            String str = strArr[i];
            int indexOf = str.indexOf("[");
            int indexOf2 = str.indexOf("]");
            if (indexOf < 0 || indexOf2 < 0 || indexOf > indexOf2) {
                opt = jSONObject.opt(str);
            } else {
                String substring = str.substring(0, indexOf);
                try {
                    int parseInt = Integer.parseInt(str.substring(indexOf + 1, indexOf2));
                    Object opt2 = jSONObject.opt(substring);
                    opt = opt2 instanceof JSONArray ? ((JSONArray) opt2).opt(parseInt) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            if (i == strArr.length - 1) {
                return opt;
            }
            if (opt instanceof String) {
                try {
                    return pvs(strArr, i + 1, new JSONObject((String) opt));
                } catch (JSONException unused2) {
                    return opt;
                }
            }
            if (opt instanceof JSONObject) {
                return pvs(strArr, i + 1, (JSONObject) opt);
            }
        }
        return null;
    }
}
