package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdInfo.java */
/* loaded from: classes2.dex */
public class pvs {
    private C0075pvs Jd;
    private long Mxy;
    private boolean NB;
    private boolean Wyp;
    private int icD;
    private int kj;
    private String pvs;
    private String so;
    private String vG;
    private List<cR> sUS = new ArrayList();
    private List<so> yiw = new ArrayList();
    private volatile boolean qh = false;

    public String pvs() {
        cR NB = NB();
        return NB != null ? NB.Yjw() : "";
    }

    public void pvs(String str) {
        this.pvs = str;
    }

    public int icD() {
        return this.icD;
    }

    public void pvs(int i) {
        this.icD = i;
    }

    public void icD(String str) {
        this.vG = str;
    }

    public List<cR> vG() {
        return this.sUS;
    }

    public void pvs(cR cRVar) {
        this.sUS.add(cRVar);
    }

    public void pvs(List<cR> list) {
        this.sUS = list;
    }

    public void pvs(so soVar) {
        this.yiw.add(soVar);
    }

    public void vG(String str) {
        this.so = str;
    }

    public void pvs(long j) {
        this.Mxy = j;
    }

    public static Map<String, cR> pvs(pvs pvsVar) {
        if (pvsVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (cR cRVar : pvsVar.vG()) {
            if (!TextUtils.isEmpty(cRVar.tQ())) {
                hashMap.put(cRVar.tQ(), cRVar);
            }
        }
        if (hashMap.size() != 0) {
            return hashMap;
        }
        return null;
    }

    public boolean Jd() {
        List<cR> list = this.sUS;
        return list != null && list.size() > 0;
    }

    public cR NB() {
        if (this.sUS.size() > 0) {
            return this.sUS.get(0);
        }
        return null;
    }

    public boolean sUS() {
        if (so() != null && vG() != null && vG().size() > 1) {
            this.NB = true;
        } else {
            this.NB = false;
            pvs((C0075pvs) null);
        }
        return this.NB;
    }

    public boolean yiw() {
        return this.Wyp;
    }

    public void pvs(boolean z) {
        this.Wyp = z;
    }

    public C0075pvs so() {
        return this.Jd;
    }

    public void pvs(C0075pvs c0075pvs) {
        this.Jd = c0075pvs;
        if (c0075pvs == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.pvs.icD.icD.pvs(cR.pvs.pvs(c0075pvs, ""));
    }

    public boolean Mxy() {
        return this.qh;
    }

    public void Wyp() {
        this.qh = false;
    }

    public void pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        pvs(C0075pvs.pvs(jSONObject.optJSONObject("tpl_info")));
    }

    public void icD(int i) {
        this.kj = i;
    }

    public boolean qh() {
        return this.kj == 1;
    }

    /* compiled from: AdInfo.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.model.pvs$pvs, reason: collision with other inner class name */
    public static class C0075pvs extends cR.pvs {
        private int pvs;

        public void pvs(int i) {
            this.pvs = i;
        }

        public int pvs() {
            return this.pvs;
        }

        public JSONObject icD() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FacebookMediationAdapter.KEY_ID, NB());
                jSONObject.put("md5", sUS());
                jSONObject.put(ImagesContract.URL, yiw());
                jSONObject.put("data", so());
                jSONObject.put("diff_data", Mxy());
                jSONObject.put("version", Jd());
                jSONObject.put("dynamic_creative", Wyp());
                jSONObject.put("count_down_time", pvs());
                return jSONObject;
            } catch (Throwable unused) {
                return null;
            }
        }

        public static C0075pvs pvs(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0075pvs c0075pvs = new C0075pvs();
            c0075pvs.icD(jSONObject.optString(FacebookMediationAdapter.KEY_ID));
            c0075pvs.vG(jSONObject.optString("md5"));
            c0075pvs.Jd(jSONObject.optString(ImagesContract.URL));
            c0075pvs.NB(jSONObject.optString("data"));
            c0075pvs.sUS(jSONObject.optString("diff_data"));
            c0075pvs.pvs(jSONObject.optString("version"));
            c0075pvs.yiw(jSONObject.optString("dynamic_creative"));
            c0075pvs.pvs(jSONObject.optInt("count_down_time"));
            if (pvs(c0075pvs)) {
                return c0075pvs;
            }
            return null;
        }

        private static boolean pvs(C0075pvs c0075pvs) {
            return (c0075pvs == null || TextUtils.isEmpty(c0075pvs.NB()) || TextUtils.isEmpty(c0075pvs.yiw())) ? false : true;
        }
    }

    public JSONObject kj() {
        try {
            JSONObject jSONObject = new JSONObject();
            C0075pvs so = so();
            if (so != null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject icD = so.icD();
                if (icD != null) {
                    jSONObject2.put("tpl_info", icD);
                    jSONObject.put("choose_ui_data", jSONObject2);
                }
            }
            List<cR> list = this.sUS;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.sUS.size(); i++) {
                    jSONArray.put(this.sUS.get(i).wjr());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("is_choose_ad_original", this.Wyp);
            jSONObject.put("multi_ad_style", this.kj);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("AdInfo", "toJsonObj: ", th);
            return null;
        }
    }

    public static pvs icD(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            pvs pvsVar = new pvs();
            JSONObject optJSONObject = jSONObject.optJSONObject("choose_ui_data");
            if (optJSONObject != null) {
                pvsVar.pvs(optJSONObject);
            }
            pvsVar.icD(jSONObject.optInt("multi_ad_style", 0));
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    cR pvs = com.bytedance.sdk.openadsdk.core.icD.pvs(optJSONArray.optJSONObject(i));
                    if (pvs != null) {
                        pvs.Mxy(pvsVar.qh());
                        arrayList.add(pvs);
                    }
                }
                pvsVar.pvs(arrayList);
            }
            pvsVar.pvs(jSONObject.optBoolean("is_choose_ad_original", false));
            return pvsVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("AdInfo", "fromJson: ", th);
            return null;
        }
    }
}
