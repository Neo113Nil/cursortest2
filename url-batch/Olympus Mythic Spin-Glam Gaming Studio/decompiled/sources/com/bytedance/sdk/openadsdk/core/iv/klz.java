package com.bytedance.sdk.openadsdk.core.iv;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.moloco.sdk.internal.services.init.i;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class klz {
    public static void zmn(String str, int i, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.bvs.zmn(i);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            nqi.zmn ouf = nqiVar.ouf();
            if (ouf != null) {
                jSONObject.put("tpl_id", ouf.fb());
                if ("Web".equals(str)) {
                    if (ouf.klz()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", i.a);
                    }
                }
            } else if (nqiVar.rsi() != null) {
                jSONObject.put("tpl_id", nqiVar.rsi().zmn());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.cyb.fb.zmn().zmn(com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn(zmn(str3)).zn(str4).btk(nqiVar != null ? nqiVar.wbj() : "").fs(i).fs(jSONObject.toString()).hhw(str2));
    }

    private static int zmn(String str) {
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }
}
