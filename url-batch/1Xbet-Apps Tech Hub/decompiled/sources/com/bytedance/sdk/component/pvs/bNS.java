package com.bytedance.sdk.component.pvs;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Java2JsMsg.java */
/* loaded from: classes.dex */
public final class bNS {
    private final Map<String, Object> pvs = new ConcurrentHashMap();

    public static bNS pvs() {
        return new bNS();
    }

    private bNS() {
    }

    public bNS pvs(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.pvs.put(str, obj);
        }
        return this;
    }

    public String icD() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.pvs.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
