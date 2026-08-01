package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGNodeTree.java */
/* loaded from: classes.dex */
public class sUS {
    private JSONObject Jd;
    private JSONObject icD;
    private JSONObject pvs;
    private String vG;

    public sUS(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            this.pvs = jSONObject.optJSONObject("main_template");
            this.icD = jSONObject.optJSONObject("sub_templates");
            JSONObject optJSONObject = jSONObject.optJSONObject("template_info");
            if (optJSONObject != null) {
                this.vG = optJSONObject.optString("sdk_version");
            }
            this.Jd = jSONObject2;
        }
    }

    public pvs pvs() {
        return pvs(this.pvs, null);
    }

    public String icD() {
        return this.vG;
    }

    public List<pvs> vG() {
        if (this.icD == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.icD.keys();
        while (keys.hasNext()) {
            pvs pvs2 = pvs(this.icD.optJSONObject(keys.next()), null);
            if (pvs2 != null) {
                arrayList.add(pvs2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private pvs pvs(JSONObject jSONObject, pvs pvsVar) {
        pvs pvs2;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("name");
        String optString2 = jSONObject.optString(FacebookMediationAdapter.KEY_ID);
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        pvs pvsVar2 = new pvs();
        pvsVar2.pvs = optString2;
        pvsVar2.icD = optString;
        pvsVar2.vG = jSONObject2;
        pvsVar2.NB = pvsVar;
        pvsVar2.sUS = this.vG;
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                String optString3 = optJSONObject.optString("name");
                String pvs3 = com.bytedance.adsdk.ugeno.pvs.vG.pvs(optJSONObject.optString(FacebookMediationAdapter.KEY_ID), this.Jd);
                if (TextUtils.equals(optString3, "Template")) {
                    JSONObject jSONObject3 = this.icD;
                    if (jSONObject3 != null) {
                        optJSONObject = jSONObject3.optJSONObject(pvs3);
                    } else {
                        pvs2 = null;
                        if (pvs2 == null) {
                            pvsVar2.pvs(pvs2);
                        }
                    }
                }
                pvs2 = pvs(optJSONObject, pvsVar2);
                if (pvs2 == null) {
                }
            }
        }
        return pvsVar2;
    }

    public static boolean pvs(pvs pvsVar) {
        return (pvsVar == null || pvsVar.vG == null) ? false : true;
    }

    /* compiled from: UGNodeTree.java */
    public static class pvs {
        private List<pvs> Jd;
        private pvs NB;
        private String icD;
        private String pvs;
        private String sUS;
        private JSONObject vG;

        public String pvs() {
            return this.pvs;
        }

        public String icD() {
            return this.sUS;
        }

        public String vG() {
            return this.icD;
        }

        public JSONObject Jd() {
            return this.vG;
        }

        public List<pvs> NB() {
            return this.Jd;
        }

        public void pvs(pvs pvsVar) {
            if (this.Jd == null) {
                this.Jd = new ArrayList();
            }
            this.Jd.add(pvsVar);
        }

        public String toString() {
            return "UGNode{id='" + this.pvs + "', name='" + this.icD + "'}";
        }
    }
}
