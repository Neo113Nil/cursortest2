package com.bytedance.sdk.component.zmn;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class mw {
    private final Map<String, Object> zmn = new ConcurrentHashMap();

    public static mw zmn() {
        return new mw();
    }

    private mw() {
    }

    public mw zmn(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.zmn.put(str, obj);
        }
        return this;
    }

    public String fs() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.zmn.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
