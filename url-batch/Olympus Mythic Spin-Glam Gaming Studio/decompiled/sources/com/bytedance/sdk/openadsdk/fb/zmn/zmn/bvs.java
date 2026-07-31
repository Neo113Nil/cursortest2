package com.bytedance.sdk.openadsdk.fb.zmn.zmn;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.zmn.zmn;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class bvs extends iv<JSONObject> {
    private static final AtomicInteger zmn = new AtomicInteger(0);
    private com.bytedance.sdk.openadsdk.fb.zmn fs;

    public bvs(final com.bytedance.sdk.openadsdk.fb.zmn zmnVar) {
        super(zmnVar.zmn, (zmn.InterfaceC0212zmn) new zmn.InterfaceC0212zmn<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.bvs.1
            final int zmn = bvs.zmn.getAndAdd(1);
            final long fs = SystemClock.elapsedRealtime();

            @Override // com.bytedance.zmn.zmn.InterfaceC0212zmn
            /* renamed from: fs, reason: merged with bridge method [inline-methods] */
            public JSONObject zmn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject fb = com.bytedance.sdk.openadsdk.fb.zmn.this.fb();
                    Iterator<String> keys = fb.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.putOpt(next, fb.opt(next));
                    }
                    String optString = jSONObject.optString("ad_extra_data", null);
                    JSONObject jSONObject2 = TextUtils.isEmpty(optString) ? new JSONObject() : PangleNetworkBridge.jsonObjectInit(optString);
                    String optString2 = jSONObject2.optString("pag_json_data");
                    JSONObject jSONObject3 = TextUtils.isEmpty(optString2) ? new JSONObject() : PangleNetworkBridge.jsonObjectInit(optString2);
                    jSONObject3.putOpt("_nl", 1);
                    jSONObject3.putOpt("_ei", Integer.valueOf(this.zmn));
                    jSONObject3.putOpt("_reqc", 0);
                    jSONObject3.putOpt("_c_t_s", Long.valueOf(SystemClock.elapsedRealtime() - this.fs));
                    if (hhw.fs()) {
                        jSONObject3.put("_ad_staging_flag", 3);
                    }
                    jSONObject2.putOpt("pag_json_data", jSONObject3.toString());
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
        zmn(zmnVar.zg() ? 1 : 0);
        this.fs = zmnVar;
    }

    public bvs(String str, JSONObject jSONObject) {
        super(str, jSONObject);
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

    public String zg() {
        com.bytedance.sdk.openadsdk.fb.zmn zmnVar = this.fs;
        if (zmnVar != null) {
            return zmnVar.hhw();
        }
        return null;
    }

    @Override // com.bytedance.zmn.zmn
    public String toString() {
        com.bytedance.sdk.openadsdk.fb.zmn zmnVar = this.fs;
        if (zmnVar != null) {
            return zmnVar.hhw();
        }
        return super.toString();
    }
}
