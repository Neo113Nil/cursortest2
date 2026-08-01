package com.bytedance.sdk.openadsdk.core.ugen;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.so;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UgenUtils.java */
/* loaded from: classes2.dex */
public class vG {
    private static String pvs = "";

    public static JSONObject pvs(cR cRVar, String str) {
        JSONObject wjr = cRVar.wjr();
        try {
            wjr.put("show_dislike", cRVar.yhq());
            wjr.put("language", qh.pvs());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String NB = so.icD().NB();
                int sUS = so.icD().sUS();
                jSONObject.put("app_name", NB);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(sUS)));
                wjr.put("open_app_info", jSONObject);
            }
        } catch (Throwable th) {
            Ju.pvs("UgenUtils", "parseUGenDataInfo excaption", th.getMessage());
        }
        return wjr;
    }

    public static boolean pvs(cR cRVar) {
        return cRVar != null && cRVar.dyT() == 7;
    }

    public static String pvs() {
        return pvs;
    }

    public static JSONObject pvs(cR cRVar, com.bytedance.sdk.openadsdk.core.ugen.Jd.vG vGVar) {
        JSONObject jSONObject;
        vGVar.pvs();
        pvs = "";
        JSONObject jSONObject2 = null;
        try {
            cR.pvs gSd = cRVar.gSd();
            String mnm = cRVar.gSd() != null ? gSd.mnm() : "";
            if (TextUtils.isEmpty(mnm) && !TextUtils.isEmpty(gSd.bNS()) && !TextUtils.isEmpty(gSd.NB())) {
                mnm = com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.pvs().pvs("ad", gSd.NB(), gSd.bNS());
            }
            if (!TextUtils.isEmpty(mnm)) {
                try {
                    jSONObject = new JSONObject(mnm);
                    try {
                        try {
                            pvs = "getTemplate success";
                            vGVar.pvs(ImagesContract.LOCAL);
                            return jSONObject;
                        } catch (JSONException unused) {
                            String concat = "parse json exception data is ".concat(String.valueOf(mnm));
                            pvs = concat;
                            vGVar.pvs(2, concat, ImagesContract.LOCAL);
                            return null;
                        }
                    } catch (Throwable th) {
                        jSONObject2 = jSONObject;
                        th = th;
                        String str = "get template error " + th.getMessage();
                        pvs = str;
                        vGVar.pvs(2, str, ImagesContract.LOCAL);
                        return jSONObject2;
                    }
                } catch (JSONException unused2) {
                    jSONObject = null;
                }
            } else {
                String str2 = "local data is null id is " + gSd.NB() + " md5 is " + gSd.bNS();
                pvs = str2;
                vGVar.pvs(3, str2, "net");
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
