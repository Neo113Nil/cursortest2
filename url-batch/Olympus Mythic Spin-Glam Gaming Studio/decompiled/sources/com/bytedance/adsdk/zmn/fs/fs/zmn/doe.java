package com.bytedance.adsdk.zmn.fs.fs.zmn;

import android.text.TextUtils;
import com.ironsource.X3;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class doe implements com.bytedance.adsdk.zmn.fs.fs.zmn {
    private final String zmn;

    public doe(String str) {
        this.zmn = str;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public Object zmn(Map<String, JSONObject> map) {
        Object zmn;
        if (map == null || map.size() <= 0 || (zmn = zmn(this.zmn, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return zmn;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public com.bytedance.adsdk.zmn.fs.fb.btk zmn() {
        return com.bytedance.adsdk.zmn.fs.fb.hhw.VARIABLE;
    }

    public String toString() {
        return "VariableNode [literals=" + this.zmn + X3.j.e;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public String fs() {
        return this.zmn;
    }

    public Object zmn(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return zmn(str.split("\\."), 0, jSONObject);
    }

    private Object zmn(String[] strArr, int i, JSONObject jSONObject) {
        Object opt;
        if (strArr != null && strArr.length > 0 && i < strArr.length && jSONObject != null) {
            String str = strArr[i];
            int indexOf = str.indexOf(X3.j.d);
            int indexOf2 = str.indexOf(X3.j.e);
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
                    return zmn(strArr, i + 1, new JSONObject((String) opt));
                } catch (JSONException unused2) {
                    return opt;
                }
            }
            if (opt instanceof JSONObject) {
                return zmn(strArr, i + 1, (JSONObject) opt);
            }
        }
        return null;
    }
}
