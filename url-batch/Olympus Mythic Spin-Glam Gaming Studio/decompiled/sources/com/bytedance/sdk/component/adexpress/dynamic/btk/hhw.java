package com.bytedance.sdk.component.adexpress.dynamic.btk;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.btk.btk;
import com.bytedance.sdk.component.adexpress.fs.mw;
import com.facebook.internal.NativeProtocol;
import com.ironsource.X3;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class hhw {
    private static HashMap<String, String> nps;
    private zn btk;
    private zmn fb;
    private JSONObject fs;
    private com.bytedance.sdk.component.adexpress.dynamic.fb.fb hhw;
    private JSONObject zmn;
    private com.bytedance.sdk.component.adexpress.dynamic.fb.zn zn;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        nps = hashMap;
        hashMap.put("subtitle", "description");
        nps.put("source", "source|app.app_name");
        nps.put("screenshot", "dynamic_creative.screenshot");
    }

    public hhw(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.zmn = jSONObject;
        this.fs = jSONObject2;
        this.zn = new com.bytedance.sdk.component.adexpress.dynamic.fb.zn(jSONObject2);
        this.fb = zmn.zmn(jSONObject3);
        this.hhw = com.bytedance.sdk.component.adexpress.dynamic.fb.fb.zmn(jSONObject4);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.fb.zg zmn(double d, int i, double d2, String str, mw mwVar) {
        JSONObject jSONObject;
        this.zn.zmn();
        try {
            jSONObject = PangleNetworkBridge.jsonObjectInit(this.hhw.fs);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.fb.zg zmn2 = zmn(fb.zmn(this.zmn, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.fb.zg) null);
        zmn(zmn2);
        btk btkVar = new btk(d, i, d2, str, mwVar);
        btk.zmn zmnVar = new btk.zmn();
        zmn zmnVar2 = this.fb;
        zmnVar.zmn = zmnVar2.zmn;
        zmnVar.fs = zmnVar2.fs;
        zmnVar.zn = 0.0f;
        btkVar.zmn(zmnVar);
        btkVar.zmn(zmn2, 0.0f, 0.0f);
        btkVar.zmn();
        com.bytedance.sdk.component.adexpress.dynamic.fb.fs fsVar = btkVar.zmn;
        if (fsVar.fb == 65536.0f) {
            return null;
        }
        return fsVar.hhw;
    }

    private void zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        int zmn2;
        if (zgVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn() != null) {
            zmn2 = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().cyb();
        } else {
            zmn2 = com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn());
        }
        int fs = com.bytedance.sdk.component.adexpress.fb.nps.fs(com.bytedance.sdk.component.adexpress.fb.zmn(), zmn2);
        zmn zmnVar = this.fb;
        float min = zmnVar.zn ? zmnVar.zmn : Math.min(zmnVar.zmn, fs);
        if (this.fb.fs == 0.0f) {
            zgVar.btk(min);
            zgVar.iv().btk().iv("auto");
            zgVar.hhw(0.0f);
        } else {
            zgVar.btk(min);
            int fs2 = com.bytedance.sdk.component.adexpress.fb.nps.fs(com.bytedance.sdk.component.adexpress.fb.zmn(), com.bytedance.sdk.component.adexpress.fb.nps.fs(com.bytedance.sdk.component.adexpress.fb.zmn()));
            zmn zmnVar2 = this.fb;
            zgVar.hhw(zmnVar2.zn ? zmnVar2.fs : Math.min(zmnVar2.fs, fs2));
            zgVar.iv().btk().iv("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.fb.zg zmn(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("type");
        if (TextUtils.equals(optString, "custom-component-vessel")) {
            int optInt = jSONObject.optInt("componentId");
            if (this.hhw != null) {
                zn znVar = new zn();
                this.btk = znVar;
                JSONObject zmn2 = znVar.zmn(this.hhw.zmn, optInt, jSONObject);
                if (zmn2 != null) {
                    jSONObject = zmn2;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.fb.zg zmn3 = zmn(jSONObject);
        zmn3.zmn(zgVar);
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null) {
            zmn3.zmn((List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>) null);
            return zmn3;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i);
            if (optJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(optString, "tag-group")) {
                    length = zmn3.iv().btk().zi();
                } else {
                    length = optJSONArray2.length();
                }
                for (int i2 = 0; i2 < length; i2++) {
                    com.bytedance.sdk.component.adexpress.dynamic.fb.zg zmn4 = zmn(optJSONArray2.optJSONObject(i2), zmn3);
                    if (com.bytedance.sdk.component.adexpress.fb.fs() && "skip-with-time".equals(zmn3.iv().fs()) && !X3.i.T.equals(zmn3.nqi()) && !TextUtils.isEmpty(zmn3.nqi())) {
                        zmn4.zn(zmn3.nqi());
                    }
                    arrayList.add(zmn4);
                    arrayList3.add(zmn4);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            zmn3.zmn(arrayList);
        }
        if (arrayList2.size() > 0) {
            zmn3.fs(arrayList2);
        }
        return zmn3;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.fb.zg zmn(JSONObject jSONObject) {
        String zmn2;
        JSONObject jSONObject2;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("id");
        JSONObject optJSONObject = jSONObject.optJSONObject("values");
        bvs.zmn(optString, optJSONObject);
        JSONObject zmn3 = bvs.zmn(optString, bvs.zmn(jSONObject.optJSONArray("sceneValues")), optJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar = new com.bytedance.sdk.component.adexpress.dynamic.fb.zg();
        if (TextUtils.isEmpty(optString2)) {
            zgVar.fs(String.valueOf(zgVar.hashCode()));
        } else {
            zgVar.fs(optString2);
        }
        if (optJSONObject != null) {
            fs(zgVar);
            zgVar.zn((float) optJSONObject.optDouble(VastAttributes.HORIZONTAL_POSITION));
            zgVar.fb((float) optJSONObject.optDouble(VastAttributes.VERTICAL_POSITION));
            zgVar.btk((float) optJSONObject.optDouble("width"));
            zgVar.hhw((float) optJSONObject.optDouble("height"));
            zgVar.nps(optJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.fb.btk btkVar = new com.bytedance.sdk.component.adexpress.dynamic.fb.btk();
            btkVar.zmn(optString);
            btkVar.fs(optJSONObject.optString("data"));
            btkVar.zn(optJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.fb.hhw zmn4 = com.bytedance.sdk.component.adexpress.dynamic.fb.hhw.zmn(optJSONObject);
            btkVar.zmn(zmn4);
            com.bytedance.sdk.component.adexpress.dynamic.fb.hhw zmn5 = com.bytedance.sdk.component.adexpress.dynamic.fb.hhw.zmn(zmn3);
            if (zmn5 == null) {
                btkVar.fs(zmn4);
            } else {
                btkVar.fs(zmn5);
            }
            zmn(zmn4);
            zmn(zmn5);
            if (TextUtils.equals(optString, "video-image-budget") && (jSONObject2 = this.fs) != null) {
                zmn(btkVar, jSONObject2.optInt("image_mode"));
            }
            String fs = btkVar.fs();
            com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk = btkVar.btk();
            if (nps.containsKey(fs) && !btk.bxw()) {
                btk.iqz(nps.get(fs));
            }
            if (btk.bxw()) {
                zmn2 = btkVar.zn();
            } else {
                zmn2 = zmn(btkVar.zn());
            }
            if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                if (TextUtils.equals(fs, "star") || TextUtils.equals(fs, "text_star")) {
                    zmn2 = zmn("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(fs, "score-count") || TextUtils.equals(fs, "score-count-type-1") || TextUtils.equals(fs, "score-count-type-2")) {
                    zmn2 = zmn("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(fs) && zmn4.va()) {
                    zmn2 = zmn("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(zmn()) && (TextUtils.equals("logo-union", optString) || TextUtils.equals("logo", optString))) {
                btkVar.fs(zmn2 + "adx:" + zmn());
            } else {
                btkVar.fs(zmn2);
            }
            zgVar.zmn(btkVar);
        }
        return zgVar;
    }

    private void fs(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        com.bytedance.sdk.component.adexpress.dynamic.fb.zn znVar;
        Object zmn2;
        Object zmn3;
        Object zmn4;
        Object zmn5;
        if (zgVar == null || (znVar = this.zn) == null || (zmn2 = znVar.zmn("image.0.url")) == null) {
            return;
        }
        String valueOf = String.valueOf(zmn2);
        if (TextUtils.isEmpty(valueOf) || (zmn3 = this.zn.zmn("title")) == null) {
            return;
        }
        String valueOf2 = String.valueOf(zmn3);
        if (TextUtils.isEmpty(valueOf2) || (zmn4 = this.zn.zmn("description")) == null) {
            return;
        }
        String valueOf3 = String.valueOf(zmn4);
        if (TextUtils.isEmpty(valueOf3) || (zmn5 = this.zn.zmn("icon")) == null) {
            return;
        }
        String valueOf4 = String.valueOf(zmn5);
        if (TextUtils.isEmpty(valueOf4)) {
            return;
        }
        Object zmn6 = this.zn.zmn("app.app_name");
        Object zmn7 = this.zn.zmn("source");
        if (zmn6 == null && zmn7 == null) {
            return;
        }
        if (zmn6 == null) {
            zmn6 = zmn7;
        }
        String valueOf5 = String.valueOf(zmn6);
        if (TextUtils.isEmpty(valueOf5)) {
            return;
        }
        zgVar.zmn(UnifiedMediationParams.KEY_IMAGE_URL, valueOf);
        zgVar.zmn("title", valueOf2);
        zgVar.zmn("description", valueOf3);
        zgVar.zmn("icon", valueOf4);
        zgVar.zmn(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, valueOf5);
        zgVar.zmn(true);
    }

    private void zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.btk btkVar, int i) {
        int lastIndexOf;
        if (i == 5 || i == 15 || i == 50 || i == 154) {
            btkVar.zmn("video");
            String zmn2 = bvs.zmn("video");
            btkVar.btk().iqz(zmn2);
            String zmn3 = bvs.zmn("video", "clickArea");
            if (!TextUtils.isEmpty(zmn3)) {
                btkVar.btk().cn(zmn3);
                btkVar.nps().cn(zmn3);
            }
            btkVar.nps().iqz(zmn2);
            btkVar.fs(zmn2);
            btkVar.btk().vgx();
            return;
        }
        btkVar.zmn("image");
        String zmn4 = bvs.zmn("image");
        com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk = btkVar.btk();
        btk.iqz(zmn4);
        btkVar.nps().iqz(zmn4);
        String zmn5 = bvs.zmn("image", "clickArea");
        if (!TextUtils.isEmpty(zmn5)) {
            btk.cn(zmn5);
            btkVar.nps().cn(zmn5);
        }
        JSONObject tj = btk.tj();
        if (tj != null) {
            btk.nqi(tj.optString("imageLottieTosPath"));
            btk.klz(tj.optBoolean("animationsLoop"));
            btk.rp(tj.optInt("lottieAppNameMaxLength"));
            btk.zak(tj.optInt("lottieAdDescMaxLength"));
            btk.kjb(tj.optInt("lottieAdTitleMaxLength"));
        }
        btkVar.fs(zmn4);
        if (zmn4 != null && (lastIndexOf = zmn4.lastIndexOf(".")) > 0) {
            String substring = zmn4.substring(0, lastIndexOf);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", zmn(substring + ".width"));
                jSONObject.put("height", zmn(substring + ".height"));
            } catch (JSONException unused) {
            }
            btkVar.zn(jSONObject.toString());
        }
        btk.hz();
    }

    private String zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.zn.fs(str2)) {
                String valueOf = String.valueOf(this.zn.zmn(str2));
                if (!TextUtils.isEmpty(valueOf)) {
                    return valueOf;
                }
            }
        }
        return "";
    }

    private String zmn() {
        Object zmn2;
        com.bytedance.sdk.component.adexpress.dynamic.fb.zn znVar = this.zn;
        return (znVar == null || (zmn2 = znVar.zmn("adx_name")) == null) ? "" : String.valueOf(zmn2);
    }

    private void zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.hhw hhwVar) {
        if (hhwVar == null) {
            return;
        }
        String am = hhwVar.am();
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            String zn = com.bytedance.sdk.component.adexpress.fb.nps.zn(com.bytedance.sdk.component.adexpress.fb.zmn());
            if ("zh".equals(zn)) {
                zn = "cn";
            }
            if (!TextUtils.isEmpty(zn) && hhwVar.hhw() != null) {
                String optString = hhwVar.hhw().optString(zn);
                if (!TextUtils.isEmpty(optString)) {
                    am = optString;
                }
            }
        }
        if (TextUtils.isEmpty(am)) {
            return;
        }
        int indexOf = am.indexOf("{{");
        int indexOf2 = am.indexOf("}}");
        if (indexOf < 0 || indexOf2 < 0 || indexOf2 < indexOf) {
            hhwVar.klz(am);
            return;
        }
        String zmn2 = zmn(am.substring(indexOf + 2, indexOf2));
        StringBuilder sb = new StringBuilder(am.substring(0, indexOf));
        if (!TextUtils.isEmpty(zmn2)) {
            sb.append(zmn2);
        }
        sb.append(am.substring(indexOf2 + 2));
        hhwVar.klz(sb.toString());
    }

    static class zmn {
        float fs;
        float zmn;
        boolean zn;

        public static zmn zmn(JSONObject jSONObject) {
            zmn zmnVar = new zmn();
            if (jSONObject != null) {
                zmnVar.zmn = (float) jSONObject.optDouble("width");
                zmnVar.fs = (float) jSONObject.optDouble("height");
                zmnVar.zn = jSONObject.optBoolean("isLandscape");
            }
            return zmnVar;
        }
    }
}
