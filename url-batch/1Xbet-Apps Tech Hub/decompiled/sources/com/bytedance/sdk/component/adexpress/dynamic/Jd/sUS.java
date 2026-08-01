package com.bytedance.sdk.component.adexpress.dynamic.Jd;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.Jd.NB;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicLayoutInflater.java */
/* loaded from: classes.dex */
public class sUS {
    private static HashMap<String, String> yiw;
    private pvs Jd;
    private vG NB;
    private JSONObject icD;
    private JSONObject pvs;
    private com.bytedance.sdk.component.adexpress.dynamic.vG.Jd sUS;
    private com.bytedance.sdk.component.adexpress.dynamic.vG.vG vG;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        yiw = hashMap;
        hashMap.put("subtitle", "description");
        yiw.put(FirebaseAnalytics.Param.SOURCE, "source|app.app_name");
        yiw.put("screenshot", "dynamic_creative.screenshot");
    }

    public sUS(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.pvs = jSONObject;
        this.icD = jSONObject2;
        this.vG = new com.bytedance.sdk.component.adexpress.dynamic.vG.vG(jSONObject2);
        this.Jd = pvs.pvs(jSONObject3);
        this.sUS = com.bytedance.sdk.component.adexpress.dynamic.vG.Jd.pvs(jSONObject4);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.vG.so pvs(double d, int i, double d2, String str, Ju ju) {
        JSONObject jSONObject;
        this.vG.pvs();
        try {
            jSONObject = new JSONObject(this.sUS.icD);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.vG.so pvs2 = pvs(Jd.pvs(this.pvs, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.vG.so) null);
        pvs(pvs2);
        NB nb = new NB(d, i, d2, str, ju);
        NB.pvs pvsVar = new NB.pvs();
        pvsVar.pvs = this.Jd.pvs;
        pvsVar.icD = this.Jd.icD;
        pvsVar.vG = 0.0f;
        nb.pvs(pvsVar);
        nb.pvs(pvs2, 0.0f, 0.0f);
        nb.pvs();
        if (nb.pvs.Jd == 65536.0f) {
            return null;
        }
        return nb.pvs.sUS;
    }

    private void pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar) {
        int pvs2;
        if (soVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG() != null) {
            pvs2 = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().bNS();
        } else {
            pvs2 = com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs());
        }
        float min = this.Jd.vG ? this.Jd.pvs : Math.min(this.Jd.pvs, com.bytedance.sdk.component.adexpress.Jd.yiw.icD(com.bytedance.sdk.component.adexpress.Jd.pvs(), pvs2));
        if (this.Jd.icD == 0.0f) {
            soVar.NB(min);
            soVar.Wyp().NB().Wyp(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            soVar.sUS(0.0f);
        } else {
            soVar.NB(min);
            soVar.sUS(this.Jd.vG ? this.Jd.icD : Math.min(this.Jd.icD, com.bytedance.sdk.component.adexpress.Jd.yiw.icD(com.bytedance.sdk.component.adexpress.Jd.pvs(), com.bytedance.sdk.component.adexpress.Jd.yiw.icD(com.bytedance.sdk.component.adexpress.Jd.pvs()))));
            soVar.Wyp().NB().Wyp("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.vG.so pvs(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(LinkHeader.Parameters.Type);
        if (TextUtils.equals(optString, "custom-component-vessel")) {
            int optInt = jSONObject.optInt("componentId");
            if (this.sUS != null) {
                vG vGVar = new vG();
                this.NB = vGVar;
                JSONObject pvs2 = vGVar.pvs(this.sUS.pvs, optInt, jSONObject);
                if (pvs2 != null) {
                    jSONObject = pvs2;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.vG.so pvs3 = pvs(jSONObject);
        pvs3.pvs(soVar);
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null) {
            pvs3.pvs((List<com.bytedance.sdk.component.adexpress.dynamic.vG.so>) null);
            return pvs3;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i);
            if (optJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(optString, "tag-group")) {
                    length = pvs3.Wyp().NB().Ye();
                } else {
                    length = optJSONArray2.length();
                }
                for (int i2 = 0; i2 < length; i2++) {
                    com.bytedance.sdk.component.adexpress.dynamic.vG.so pvs4 = pvs(optJSONArray2.optJSONObject(i2), pvs3);
                    if (com.bytedance.sdk.component.adexpress.Jd.icD() && "skip-with-time".equals(pvs3.Wyp().icD()) && !"transparent".equals(pvs3.ny()) && !TextUtils.isEmpty(pvs3.ny())) {
                        pvs4.vG(pvs3.ny());
                    }
                    arrayList.add(pvs4);
                    arrayList3.add(pvs4);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            pvs3.pvs(arrayList);
        }
        if (arrayList2.size() > 0) {
            pvs3.icD(arrayList2);
        }
        return pvs3;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.vG.so pvs(JSONObject jSONObject) {
        String pvs2;
        JSONObject jSONObject2;
        String optString = jSONObject.optString(LinkHeader.Parameters.Type);
        String optString2 = jSONObject.optString(FacebookMediationAdapter.KEY_ID);
        JSONObject optJSONObject = jSONObject.optJSONObject("values");
        Mxy.pvs(optString, optJSONObject);
        JSONObject pvs3 = Mxy.pvs(optString, Mxy.pvs(jSONObject.optJSONArray("sceneValues")), optJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar = new com.bytedance.sdk.component.adexpress.dynamic.vG.so();
        if (TextUtils.isEmpty(optString2)) {
            soVar.icD(String.valueOf(soVar.hashCode()));
        } else {
            soVar.icD(optString2);
        }
        if (optJSONObject != null) {
            icD(soVar);
            soVar.vG((float) optJSONObject.optDouble("x"));
            soVar.Jd((float) optJSONObject.optDouble("y"));
            soVar.NB((float) optJSONObject.optDouble("width"));
            soVar.sUS((float) optJSONObject.optDouble("height"));
            soVar.yiw(optJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.vG.NB nb = new com.bytedance.sdk.component.adexpress.dynamic.vG.NB();
            nb.pvs(optString);
            nb.icD(optJSONObject.optString("data"));
            nb.vG(optJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.vG.sUS pvs4 = com.bytedance.sdk.component.adexpress.dynamic.vG.sUS.pvs(optJSONObject);
            nb.pvs(pvs4);
            com.bytedance.sdk.component.adexpress.dynamic.vG.sUS pvs5 = com.bytedance.sdk.component.adexpress.dynamic.vG.sUS.pvs(pvs3);
            if (pvs5 == null) {
                nb.icD(pvs4);
            } else {
                nb.icD(pvs5);
            }
            pvs(pvs4);
            pvs(pvs5);
            if (TextUtils.equals(optString, "video-image-budget") && (jSONObject2 = this.icD) != null) {
                pvs(nb, jSONObject2.optInt("image_mode"));
            }
            String icD = nb.icD();
            com.bytedance.sdk.component.adexpress.dynamic.vG.sUS NB = nb.NB();
            if (yiw.containsKey(icD) && !NB.OyE()) {
                NB.uc(yiw.get(icD));
            }
            if (NB.OyE()) {
                pvs2 = nb.vG();
            } else {
                pvs2 = pvs(nb.vG());
            }
            if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                if (TextUtils.equals(icD, "star") || TextUtils.equals(icD, "text_star")) {
                    pvs2 = pvs("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(icD, "score-count") || TextUtils.equals(icD, "score-count-type-1") || TextUtils.equals(icD, "score-count-type-2")) {
                    pvs2 = pvs("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(icD) && pvs4.nS()) {
                    pvs2 = pvs("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(pvs()) && (TextUtils.equals("logo-union", optString) || TextUtils.equals("logo", optString))) {
                nb.icD(pvs2 + "adx:" + pvs());
            } else {
                nb.icD(pvs2);
            }
            soVar.pvs(nb);
        }
        return soVar;
    }

    private void icD(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar) {
        com.bytedance.sdk.component.adexpress.dynamic.vG.vG vGVar;
        Object pvs2;
        Object pvs3;
        Object pvs4;
        Object pvs5;
        if (soVar == null || (vGVar = this.vG) == null || (pvs2 = vGVar.pvs("image.0.url")) == null) {
            return;
        }
        String valueOf = String.valueOf(pvs2);
        if (TextUtils.isEmpty(valueOf) || (pvs3 = this.vG.pvs(LinkHeader.Parameters.Title)) == null) {
            return;
        }
        String valueOf2 = String.valueOf(pvs3);
        if (TextUtils.isEmpty(valueOf2) || (pvs4 = this.vG.pvs("description")) == null) {
            return;
        }
        String valueOf3 = String.valueOf(pvs4);
        if (TextUtils.isEmpty(valueOf3) || (pvs5 = this.vG.pvs("icon")) == null) {
            return;
        }
        String valueOf4 = String.valueOf(pvs5);
        if (TextUtils.isEmpty(valueOf4)) {
            return;
        }
        Object pvs6 = this.vG.pvs("app.app_name");
        Object pvs7 = this.vG.pvs(FirebaseAnalytics.Param.SOURCE);
        if (pvs6 == null && pvs7 == null) {
            return;
        }
        if (pvs6 == null) {
            pvs6 = pvs7;
        }
        String valueOf5 = String.valueOf(pvs6);
        if (TextUtils.isEmpty(valueOf5)) {
            return;
        }
        soVar.pvs("imageUrl", valueOf);
        soVar.pvs(LinkHeader.Parameters.Title, valueOf2);
        soVar.pvs("description", valueOf3);
        soVar.pvs("icon", valueOf4);
        soVar.pvs("app_name", valueOf5);
        soVar.pvs(true);
    }

    private void pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.NB nb, int i) {
        int lastIndexOf;
        if (i == 5 || i == 15 || i == 50 || i == 154) {
            nb.pvs("video");
            String pvs2 = Mxy.pvs("video");
            nb.NB().uc(pvs2);
            String pvs3 = Mxy.pvs("video", "clickArea");
            if (!TextUtils.isEmpty(pvs3)) {
                nb.NB().bNS(pvs3);
                nb.yiw().bNS(pvs3);
            }
            nb.yiw().uc(pvs2);
            nb.icD(pvs2);
            nb.NB().wr();
            return;
        }
        nb.pvs("image");
        String pvs4 = Mxy.pvs("image");
        com.bytedance.sdk.component.adexpress.dynamic.vG.sUS NB = nb.NB();
        NB.uc(pvs4);
        nb.yiw().uc(pvs4);
        String pvs5 = Mxy.pvs("image", "clickArea");
        if (!TextUtils.isEmpty(pvs5)) {
            NB.bNS(pvs5);
            nb.yiw().bNS(pvs5);
        }
        JSONObject xa = NB.xa();
        if (xa != null) {
            NB.ny(xa.optString("imageLottieTosPath"));
            NB.kj(xa.optBoolean("animationsLoop"));
            NB.dX(xa.optInt("lottieAppNameMaxLength"));
            NB.Gp(xa.optInt("lottieAdDescMaxLength"));
            NB.CvL(xa.optInt("lottieAdTitleMaxLength"));
        }
        nb.icD(pvs4);
        if (pvs4 != null && (lastIndexOf = pvs4.lastIndexOf(".")) > 0) {
            String substring = pvs4.substring(0, lastIndexOf);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", pvs(substring + ".width"));
                jSONObject.put("height", pvs(substring + ".height"));
            } catch (JSONException unused) {
            }
            nb.vG(jSONObject.toString());
        }
        NB.MA();
    }

    private String pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.vG.icD(str2)) {
                String valueOf = String.valueOf(this.vG.pvs(str2));
                if (!TextUtils.isEmpty(valueOf)) {
                    return valueOf;
                }
            }
        }
        return "";
    }

    private String pvs() {
        com.bytedance.sdk.component.adexpress.dynamic.vG.vG vGVar = this.vG;
        return vGVar == null ? "" : String.valueOf(vGVar.pvs("adx_name"));
    }

    private void pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.sUS sus) {
        if (sus == null) {
            return;
        }
        String ae = sus.ae();
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            String vG = com.bytedance.sdk.component.adexpress.Jd.yiw.vG(com.bytedance.sdk.component.adexpress.Jd.pvs());
            if ("zh".equals(vG)) {
                vG = "cn";
            }
            if (!TextUtils.isEmpty(vG) && sus.sUS() != null) {
                String optString = sus.sUS().optString(vG);
                if (!TextUtils.isEmpty(optString)) {
                    ae = optString;
                }
            }
        }
        if (TextUtils.isEmpty(ae)) {
            return;
        }
        int indexOf = ae.indexOf("{{");
        int indexOf2 = ae.indexOf("}}");
        if (indexOf < 0 || indexOf2 < 0 || indexOf2 < indexOf) {
            sus.kj(ae);
            return;
        }
        String pvs2 = pvs(ae.substring(indexOf + 2, indexOf2));
        StringBuilder sb = new StringBuilder(ae.substring(0, indexOf));
        if (!TextUtils.isEmpty(pvs2)) {
            sb.append(pvs2);
        }
        sb.append(ae.substring(indexOf2 + 2));
        sus.kj(sb.toString());
    }

    /* compiled from: DynamicLayoutInflater.java */
    static class pvs {
        float icD;
        float pvs;
        boolean vG;

        public static pvs pvs(JSONObject jSONObject) {
            pvs pvsVar = new pvs();
            if (jSONObject != null) {
                pvsVar.pvs = (float) jSONObject.optDouble("width");
                pvsVar.icD = (float) jSONObject.optDouble("height");
                pvsVar.vG = jSONObject.optBoolean("isLandscape");
            }
            return pvsVar;
        }
    }
}
