package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.cR;
import org.json.JSONObject;

/* compiled from: ExpressEventManager.java */
/* loaded from: classes2.dex */
public class Mxy {
    public static void pvs(String str, int i, String str2, String str3, String str4, cR cRVar) {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.yiw.pvs(i);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            cR.pvs gSd = cRVar.gSd();
            if (gSd != null) {
                jSONObject.put("tpl_id", gSd.NB());
                if ("Web".equals(str)) {
                    if (gSd.Ju()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs().pvs(com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs(pvs(str3)).vG(str4).NB(cRVar != null ? cRVar.Yjw() : "").icD(i).icD(jSONObject.toString()).sUS(str2));
    }

    private static int pvs(String str) {
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
