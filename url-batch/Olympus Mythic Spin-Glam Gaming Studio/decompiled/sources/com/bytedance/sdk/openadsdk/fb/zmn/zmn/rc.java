package com.bytedance.sdk.openadsdk.fb.zmn.zmn;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class rc extends iv<JSONObject> {
    private static final AtomicInteger zmn = new AtomicInteger(0);

    public rc(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    public static JSONObject zmn(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject2;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            String optString = jSONObject2.optString("event_extra");
            JSONObject jSONObject3 = TextUtils.isEmpty(optString) ? new JSONObject() : PangleNetworkBridge.jsonObjectInit(optString);
            jSONObject3.putOpt("_nl", 1);
            jSONObject3.putOpt("_ei", Integer.valueOf(zmn.getAndAdd(1)));
            jSONObject3.putOpt("_reqc", 0);
            jSONObject2.putOpt("event_extra", jSONObject3.toString());
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    @Override // com.bytedance.zmn.zmn
    public byte[] fb() {
        String jSONObject;
        JSONObject zn = zn();
        if (zn == null || (jSONObject = zn.toString()) == null) {
            return null;
        }
        return jSONObject.getBytes(StandardCharsets.UTF_8);
    }
}
