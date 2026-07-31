package com.bytedance.sdk.openadsdk.core.iv.fs;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.component.reward.zn.zg;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.ev;
import com.bytedance.sdk.openadsdk.core.model.kw;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.mw;
import com.facebook.internal.NativeProtocol;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zn {
    private static String fs = "";
    public static String zmn = "https://pag_open_icon_id/appicon.png";

    public static boolean zn() {
        return true;
    }

    public static String zmn() {
        return fs;
    }

    public static JSONObject zmn(float f, float f2, boolean z, @NonNull nqi nqiVar) {
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
            jSONObject.put("creative", zmn(false, nqiVar));
            jSONObject.put("template_Plugin", fs(nqiVar.ouf()));
            jSONObject.put("diff_template_Plugin", zmn(nqiVar.ouf()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject zmn(nqi nqiVar) {
        return zmn(nqiVar, false, (JSONObject) null);
    }

    public static JSONObject zmn(nqi nqiVar, boolean z, JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        if (nqiVar == null) {
            return null;
        }
        try {
            jSONObject2 = zmn(nqiVar, false, z);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONObject jSONObject3 = new JSONObject();
            fkt.fs(jSONObject3);
            jSONObject3.put("platform", "android");
            jSONObject2.put("xAppInfo", jSONObject3);
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            JSONObject fs2 = fkt.fs(nqiVar);
            fs2.put(POBConstants.KEY_LANGUAGE, mw.fs());
            jSONObject2.put("xSetting", fs2);
        } catch (Throwable th) {
            th.getMessage();
        }
        return jSONObject2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2.length() <= r4.zn()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        r4 = r2.optJSONObject(r4.zn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        r5 = com.safedk.android.internal.partials.PangleNetworkBridge.jsonObjectInit(r4.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static JSONObject zmn(nqi nqiVar, boolean z, boolean z2) {
        JSONObject jSONObject = null;
        if (nqiVar == null) {
            return null;
        }
        try {
            String iyj = nqiVar.iyj();
            if (iyj != null) {
                JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(iyj);
                JSONArray optJSONArray = jsonObjectInit.optJSONArray("creatives");
                if (!z && !z2) {
                    jSONObject = new JSONObject();
                    if (optJSONArray != null && optJSONArray.length() > 1) {
                        optJSONArray.remove(0);
                        jSONObject.put("xRestCreatives", optJSONArray);
                    }
                    jsonObjectInit.remove("creatives");
                    jSONObject.put("xRestResponse", jsonObjectInit);
                }
                JSONObject jSONObject2 = null;
                if (jSONObject2 == null) {
                    return null;
                }
                jSONObject = jSONObject2;
                if (optJSONArray != null) {
                    optJSONArray.remove(0);
                    jSONObject.put("xRestCreatives", optJSONArray);
                }
                jsonObjectInit.remove("creatives");
                jSONObject.put("xRestResponse", jsonObjectInit);
            }
        } catch (Throwable th) {
            iqz.zmn("TemplateUtils", "filterTemplateInfo", th);
        }
        return jSONObject;
    }

    public static JSONObject zmn(float f, float f2, boolean z, nqi nqiVar, String str, com.bytedance.sdk.openadsdk.core.mw.nps.zn znVar) {
        fs = "";
        JSONObject jSONObject = null;
        if (nqiVar == null) {
            return null;
        }
        try {
            jSONObject = zmn(f, f2, z, nqiVar, str);
            if (znVar != null) {
                znVar.zmn("adv3");
            }
            ev rsi = nqiVar.rsi();
            if (rsi != null) {
                String fb = rsi.fb();
                if (!TextUtils.isEmpty(fb)) {
                    jSONObject.put("xTemplate", PangleNetworkBridge.jsonObjectInit(fb));
                    fs = "getTemplate success by local data";
                    if (znVar != null) {
                        znVar.fs("local");
                    }
                } else {
                    String zmn2 = com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn().zmn("adv3", rsi.zmn(), rsi.fs());
                    if (!TextUtils.isEmpty(zmn2)) {
                        jSONObject.put("xTemplate", PangleNetworkBridge.jsonObjectInit(zmn2));
                        fs = "getTemplate success by db data";
                        if (znVar != null) {
                            znVar.fs("local");
                        }
                    } else {
                        String str2 = "local db data is null id is " + rsi.zmn() + " md5 is " + rsi.fs();
                        fs = str2;
                        if (znVar != null) {
                            znVar.zmn(3, str2, "net");
                        }
                    }
                }
            }
        } catch (Exception e) {
            String str3 = "load template exception " + e.getMessage();
            fs = str3;
            if (znVar != null) {
                znVar.zmn(3, str3, "net");
            }
        }
        return jSONObject;
    }

    public static JSONObject zmn(float f, float f2, boolean z, nqi nqiVar, String str) {
        JSONObject jSONObject = null;
        if (nqiVar == null) {
            return null;
        }
        try {
            JSONObject zmn2 = zmn(nqiVar, true, true);
            if (zmn2 == null) {
                return null;
            }
            try {
                if (!zg.zmn(nqiVar)) {
                    zmn(zmn2, nqiVar, str);
                }
                JSONObject fs2 = fkt.fs(nqiVar);
                fs2.put(POBConstants.KEY_LANGUAGE, mw.fs());
                zmn2.put("xSetting", fs2);
                zmn2.put("xAdInfo", zmn(str, zn(nqiVar), nqiVar));
                JSONObject jSONObject2 = new JSONObject();
                fkt.fs(jSONObject2);
                jSONObject2.put("platform", "android");
                zmn2.put("xAppInfo", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", f);
                jSONObject3.put("height", f2);
                if (z) {
                    jSONObject3.put("isLandscape", true);
                }
                zmn2.put("xSize", jSONObject3);
                return zmn2;
            } catch (Throwable unused) {
                jSONObject = zmn2;
                return jSONObject;
            }
        } catch (Throwable unused2) {
        }
    }

    public static JSONObject fs() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(POBConstants.KEY_LANGUAGE, mw.fs());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            fkt.fs(jSONObject3);
            jSONObject3.put("platform", "android");
            jSONObject.put("xAppInfo", jSONObject3);
        } catch (Exception e) {
            iqz.zn("TemplateUtils", e.getMessage());
        }
        return jSONObject;
    }

    private static void zmn(JSONObject jSONObject, nqi nqiVar, String str) {
        if (nqiVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt = nqiVar.mrt();
            if (mrt != null) {
                JSONObject kgc = mrt.kgc();
                kgc.put("video_duration", mrt.hhw() * mrt.doe());
                jSONObject.put("video", kgc);
            } else if ("open_ad".equals(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("video_duration", kgc.fb().uqh(String.valueOf(nqiVar.qvo())));
                jSONObject.put("video", jSONObject2);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static JSONObject zmn(String str, JSONObject jSONObject, nqi nqiVar) {
        if (nqiVar == null) {
            return jSONObject;
        }
        try {
            if ("open_ad".equals(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, iv.fs().zg());
                int bvs = iv.fs().bvs();
                if (bvs != 0) {
                    int skn = nqiVar.skn();
                    if (9 == skn || 11 == skn) {
                        jSONObject2.put("app_icon", zmn);
                    } else if (10 == skn) {
                        jSONObject2.put("app_icon", "@".concat(String.valueOf(bvs)));
                    }
                }
                jSONObject.put("open_app_info", jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject zmn(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray optJSONArray = jSONObject2.optJSONArray("keys");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (jSONObject.has(optString)) {
                        jSONObject3.put(optString, jSONObject.opt(optString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static JSONObject zn(nqi nqiVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            fkt.zmn(jSONObject, nqiVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String zmn(nqi.zmn zmnVar) {
        if (zmnVar == null) {
            return "";
        }
        return zmnVar.zg();
    }

    private static String fs(nqi.zmn zmnVar) {
        com.bytedance.sdk.component.adexpress.zmn.zn.fs zn;
        if (zmnVar == null) {
            return "";
        }
        String nps = zmnVar.nps();
        return (!TextUtils.isEmpty(nps) || (zn = com.bytedance.sdk.component.adexpress.zmn.fs.fs.zn(zmnVar.fb())) == null) ? nps : zn.btk();
    }

    public static JSONObject zmn(boolean z, @NonNull nqi nqiVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", nqiVar.gt());
            if (nqiVar.uaq() != null) {
                if (nqiVar.uaq() != null && !TextUtils.isEmpty(nqiVar.uaq().zmn())) {
                    jSONObject.put("icon", nqiVar.uaq().zmn());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (nqiVar.tj() != null) {
                for (int i = 0; i < nqiVar.tj().size(); i++) {
                    com.bytedance.sdk.openadsdk.core.model.kgc kgcVar = nqiVar.tj().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", kgcVar.zn());
                    jSONObject2.put("width", kgcVar.fs());
                    jSONObject2.put("url", kgcVar.zmn());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", nqiVar.zq());
            jSONObject.put("interaction_type", nqiVar.va());
            jSONObject.put("interaction_method", nqiVar.lt());
            jSONObject.put("is_compliance_template", zn());
            jSONObject.put("title", nqiVar.db());
            jSONObject.put("description", nqiVar.pf());
            jSONObject.put("source", nqiVar.dey());
            JSONObject jSONObject3 = new JSONObject();
            kw rp = nqiVar.rp();
            if (rp == null) {
                rp = new kw();
            }
            jSONObject3.put("ceiling_time", rp.fb());
            jSONObject3.put("ceiling_ratio", rp.btk());
            jSONObject3.put("expand_ratio", rp.hhw());
            jSONObject.put("interaction_params", jSONObject3);
            if (nqiVar.pw() != null) {
                jSONObject.put("comment_num", nqiVar.pw().btk());
                jSONObject.put("score", nqiVar.pw().fb());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, nqiVar.pw().hhw());
                jSONObject.put("app", nqiVar.pw().zg());
            }
            com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt = nqiVar.mrt();
            if (mrt != null) {
                JSONObject kgc = mrt.kgc();
                kgc.put("video_duration", mrt.hhw() * mrt.doe());
                jSONObject.put("video", kgc);
            }
            if (nqiVar.ouf() != null) {
                jSONObject.put("dynamic_creative", nqiVar.ouf().bvs());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String zmn(nqi nqiVar, String str) {
        List<com.bytedance.sdk.openadsdk.core.model.kgc> tj;
        if (nqiVar != null && (tj = nqiVar.tj()) != null && tj.size() > 0) {
            for (com.bytedance.sdk.openadsdk.core.model.kgc kgcVar : tj) {
                if (kgcVar != null && TextUtils.equals(str, kgcVar.zmn())) {
                    return kgcVar.nps();
                }
            }
        }
        return null;
    }

    public static Map<String, String> fs(nqi nqiVar) {
        HashMap hashMap = null;
        if (nqiVar == null) {
            return null;
        }
        List<com.bytedance.sdk.openadsdk.core.model.kgc> tj = nqiVar.tj();
        if (tj != null && tj.size() > 0) {
            hashMap = new HashMap();
            for (com.bytedance.sdk.openadsdk.core.model.kgc kgcVar : tj) {
                if (kgcVar != null) {
                    hashMap.put(kgcVar.zmn(), kgcVar.nps());
                }
            }
            com.bytedance.sdk.openadsdk.core.model.kgc uaq = nqiVar.uaq();
            if (uaq != null) {
                hashMap.put(uaq.zmn(), uaq.nps());
            }
        }
        return hashMap;
    }
}
