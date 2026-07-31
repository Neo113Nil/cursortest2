package com.bytedance.sdk.openadsdk.fb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class iv {
    public static void zmn(nqi nqiVar, String str, String str2, String str3) {
        zmn(nqiVar, str, str2, str3, null);
    }

    public static void zmn(nqi nqiVar, String str, String str2, String str3, JSONObject jSONObject) {
        zmn(nqiVar, str, str2, str3, jSONObject, 0);
    }

    public static void zmn(final nqi nqiVar, String str, String str2, final String str3, final JSONObject jSONObject, final int i) {
        if (nqiVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        zn.zmn(System.currentTimeMillis(), nqiVar, str2, str, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.iv.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                if (jSONObject != null) {
                    long olo = nqiVar.olo();
                    if (olo < 0) {
                        long bvs = nqiVar.bvs();
                        if (bvs > 0) {
                            long elapsedRealtime = SystemClock.elapsedRealtime() - bvs;
                            if (elapsedRealtime > 0) {
                                olo = elapsedRealtime;
                            }
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(IronSourceConstants.EVENTS_DURATION, olo);
                    } catch (Exception e) {
                        iqz.zn(e.getMessage(), new Object[0]);
                    }
                    return jSONObject2;
                }
                return super.fs();
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                return iv.fs(nqiVar, str3, i, jSONObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject fs(nqi nqiVar, String str, int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("error_msg", str);
            }
            int i2 = 1;
            jSONObject2.put("ad_show_order", i + 1);
            jSONObject2.put("interaction_method", nqiVar.lt());
            jSONObject2.put("real_interaction_method", nqiVar.cd());
            jSONObject2.put("give_up_reward", nqiVar.cyb() ? 1 : 2);
            if (!nqiVar.jy()) {
                i2 = 2;
            }
            jSONObject2.put("has_reward", i2);
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject2.put(next, jSONObject.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return jSONObject2;
    }

    public static void zmn(String str, boolean z, boolean z2, nqi nqiVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("has_close_invoke", z ? 1 : 2);
            jSONObject.put("has_show_invoke", z2 ? 1 : 2);
            zmn(nqiVar, str, nqiVar != null ? nqiVar.btk() : null, null, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void zmn(nqi nqiVar, String str, int i) {
        zmn(nqiVar, "close".equals(str) ? "close_listen_empty" : "show_listen_empty", nqiVar != null ? nqiVar.btk() : null, null, null, i);
    }
}
