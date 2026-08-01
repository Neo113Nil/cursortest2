package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlayableModel.java */
/* loaded from: classes2.dex */
public class rCZ {
    private int Jd;
    private int Mxy;
    private String NB;
    private boolean Wyp;
    private int icD;
    private int pvs;
    private String sUS;
    private int so;
    private boolean vG;
    private int yiw;

    private static int icD(int i) {
        return i == 1 ? 10 : 5;
    }

    public static int pvs(int i) {
        return i + 10;
    }

    public static boolean yiw(cR cRVar) {
        return true;
    }

    public rCZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.vG = jSONObject.optBoolean("is_playable");
        this.Jd = jSONObject.optInt("playable_type", 0);
        this.NB = jSONObject.optString("playable_style");
        JSONObject optJSONObject = jSONObject.optJSONObject("playable");
        if (optJSONObject != null) {
            this.sUS = optJSONObject.optString("playable_url", "");
            this.yiw = optJSONObject.optInt("playable_orientation", 0);
            this.icD = optJSONObject.optInt("new_style", 0);
            this.pvs = optJSONObject.optInt("close_2_app", 0);
            int icD = icD(this.Jd);
            this.so = optJSONObject.optInt("playable_webview_timeout", icD);
            this.Mxy = optJSONObject.optInt("playable_js_timeout", icD);
            this.Wyp = optJSONObject.optInt("playable_backup_enable", 0) == 1;
        }
    }

    public static int pvs(cR cRVar) {
        int i;
        rCZ bNS = cRVar.bNS();
        if (bNS != null && (i = bNS.pvs) >= 0 && i <= 100) {
            return i;
        }
        return 0;
    }

    public void pvs(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.vG);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("PlayableModel", e.getMessage());
        }
        if (!TextUtils.isEmpty(this.sUS)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.sUS);
                jSONObject2.put("playable_orientation", this.yiw);
                jSONObject2.put("new_style", this.icD);
                jSONObject2.put("close_2_app", this.pvs);
                jSONObject2.put("playable_webview_timeout", this.so);
                jSONObject2.put("playable_js_timeout", this.Mxy);
                jSONObject2.put("playable_backup_enable", this.Wyp ? 1 : 0);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.Ju.pvs("PlayableModel", e2.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", this.Jd);
        } catch (JSONException e3) {
            com.bytedance.sdk.component.utils.Ju.pvs("PlayableModel", e3.getMessage());
        }
        try {
            jSONObject.put("playable_style", this.NB);
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.Ju.pvs("PlayableModel", e4.getMessage());
        }
    }

    private static rCZ vA(cR cRVar) {
        if (cRVar == null) {
            return null;
        }
        return cRVar.bNS();
    }

    public static boolean icD(cR cRVar) {
        rCZ vA = vA(cRVar);
        return (vA == null || !vA.vG || TextUtils.isEmpty(sUS(cRVar))) ? false : true;
    }

    public static boolean vG(cR cRVar) {
        rCZ bNS = cRVar.bNS();
        return bNS != null && bNS.vG && bNS.icD == 1;
    }

    private static int cR(cR cRVar) {
        rCZ vA = vA(cRVar);
        if (vA == null) {
            return 0;
        }
        return vA.Jd;
    }

    public static String Jd(cR cRVar) {
        rCZ vA = vA(cRVar);
        if (vA == null) {
            return null;
        }
        return vA.NB;
    }

    public static String NB(cR cRVar) {
        rCZ vA = vA(cRVar);
        if (vA == null) {
            return null;
        }
        return vA.sUS;
    }

    public static String sUS(cR cRVar) {
        if (cRVar == null) {
            return null;
        }
        rCZ bNS = cRVar.bNS();
        if (bNS != null && bNS.vG) {
            String str = bNS.sUS;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (cRVar.mnm() == 20) {
            return cRVar.CjQ();
        }
        if (cRVar.od() != null) {
            return cRVar.od().kj();
        }
        return null;
    }

    public static boolean so(cR cRVar) {
        return ((cRVar == null || cRVar.od() == null) ? 0 : cRVar.od().uc()) != 1;
    }

    public static boolean Mxy(cR cRVar) {
        com.bykv.vk.openvk.component.video.api.vG.icD od = cRVar.od();
        return od != null && od.uc() == 1;
    }

    public static int Wyp(cR cRVar) {
        rCZ vA = vA(cRVar);
        if (vA == null) {
            return 0;
        }
        return vA.yiw;
    }

    public static boolean qh(cR cRVar) {
        return icD(cRVar) && cR(cRVar) == 1;
    }

    public static boolean kj(cR cRVar) {
        return icD(cRVar) && cR(cRVar) == 0;
    }

    public int pvs() {
        return this.so;
    }

    public int icD() {
        return this.Mxy;
    }

    public boolean vG() {
        return this.Wyp;
    }

    public static long Ju(cR cRVar) {
        return Math.max(IP(cRVar), bNS(cRVar));
    }

    public static long IP(cR cRVar) {
        if (vA(cRVar) == null) {
            return 5L;
        }
        return r2.pvs();
    }

    public static long bNS(cR cRVar) {
        if (vA(cRVar) == null) {
            return 5L;
        }
        return r2.icD();
    }

    public static boolean mnm(cR cRVar) {
        rCZ vA = vA(cRVar);
        return vA != null && vA.vG();
    }
}
