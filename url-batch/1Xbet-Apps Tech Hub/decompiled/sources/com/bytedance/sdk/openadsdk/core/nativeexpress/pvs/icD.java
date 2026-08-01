package com.bytedance.sdk.openadsdk.core.nativeexpress.pvs;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.bNS;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.pvs;
import com.bytedance.sdk.openadsdk.core.model.zM;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.LinkHeader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TemplateUtils.java */
/* loaded from: classes2.dex */
public class icD {
    public static boolean pvs() {
        return true;
    }

    public static JSONObject pvs(float f, float f2, boolean z, cR cRVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f);
            jSONObject2.put("height", f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            if ((cRVar instanceof zM) && ((zM) cRVar).aSt()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put("choose_ui_data", jSONObject3);
                pvs.C0075pvs LmF = ((zM) cRVar).LmF();
                JSONObject icD = LmF.icD();
                if (TextUtils.isEmpty(LmF.so())) {
                    icD.put("data", icD(LmF));
                }
                jSONObject3.put("tpl_info", icD);
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("creatives", jSONArray);
                for (cR cRVar2 : ((zM) cRVar).XY()) {
                    JSONObject pvs = pvs(false, cRVar2);
                    if (pvs != null) {
                        pvs.put("template_Plugin", icD(cRVar2.gSd()));
                        pvs.put("diff_template_Plugin", pvs(cRVar2.gSd()));
                        jSONArray.put(pvs);
                    }
                }
                return jSONObject;
            }
            jSONObject.put("creative", pvs(false, cRVar));
            jSONObject.put("template_Plugin", icD(cRVar.gSd()));
            jSONObject.put("diff_template_Plugin", pvs(cRVar.gSd()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String pvs(cR.pvs pvsVar) {
        return pvsVar != null ? pvsVar.Mxy() : "";
    }

    private static String icD(cR.pvs pvsVar) {
        com.bytedance.sdk.component.adexpress.pvs.vG.icD vG;
        if (pvsVar == null) {
            return "";
        }
        String so = pvsVar.so();
        return (!TextUtils.isEmpty(so) || (vG = com.bytedance.sdk.component.adexpress.pvs.icD.icD.vG(pvsVar.NB())) == null) ? so : vG.NB();
    }

    public static JSONObject pvs(boolean z, cR cRVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", cRVar.Cwg());
            if (cRVar.ea() != null) {
                if (cRVar.ea() != null && !TextUtils.isEmpty(cRVar.ea().pvs())) {
                    jSONObject.put("icon", cRVar.ea().pvs());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (cRVar.BSi() != null) {
                for (int i = 0; i < cRVar.BSi().size(); i++) {
                    bNS bns = cRVar.BSi().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", bns.vG());
                    jSONObject2.put("width", bns.icD());
                    jSONObject2.put(ImagesContract.URL, bns.pvs());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", cRVar.Ye());
            jSONObject.put("interaction_type", cRVar.jhZ());
            jSONObject.put("interaction_method", cRVar.vA());
            jSONObject.put("is_compliance_template", pvs());
            jSONObject.put(LinkHeader.Parameters.Title, cRVar.qd());
            jSONObject.put("description", cRVar.rW());
            jSONObject.put(FirebaseAnalytics.Param.SOURCE, cRVar.OhP());
            if (cRVar.Ca() != null) {
                jSONObject.put("comment_num", cRVar.Ca().NB());
                jSONObject.put(FirebaseAnalytics.Param.SCORE, cRVar.Ca().Jd());
                jSONObject.put("app_size", cRVar.Ca().sUS());
                jSONObject.put("app", cRVar.Ca().so());
            }
            com.bykv.vk.openvk.component.video.api.vG.icD od = cRVar.od();
            if (od != null) {
                JSONObject cR = od.cR();
                cR.put("video_duration", od.sUS() * od.OT());
                jSONObject.put("video", cR);
            }
            if (cRVar.gSd() != null) {
                jSONObject.put("dynamic_creative", cRVar.gSd().Wyp());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String pvs(cR cRVar, String str) {
        List<bNS> BSi;
        if (cRVar != null && (BSi = cRVar.BSi()) != null && BSi.size() > 0) {
            for (bNS bns : BSi) {
                if (bns != null && TextUtils.equals(str, bns.pvs())) {
                    return bns.yiw();
                }
            }
        }
        return null;
    }

    public static Map<String, String> pvs(cR cRVar) {
        HashMap hashMap = null;
        if (cRVar == null) {
            return null;
        }
        List<bNS> BSi = cRVar.BSi();
        if (BSi != null && BSi.size() > 0) {
            hashMap = new HashMap();
            for (bNS bns : BSi) {
                if (bns != null) {
                    hashMap.put(bns.pvs(), bns.yiw());
                }
            }
        }
        return hashMap;
    }
}
