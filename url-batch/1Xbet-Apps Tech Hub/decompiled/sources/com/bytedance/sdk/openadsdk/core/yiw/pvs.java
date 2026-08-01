package com.bytedance.sdk.openadsdk.core.yiw;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.cR;
import io.ktor.http.LinkHeader;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastAdConfig.java */
/* loaded from: classes2.dex */
public class pvs {
    private String Jd;
    private int Mxy;
    private String NB;
    private int Wyp;
    private String bNS;
    icD icD;
    private String qh;
    private String sUS;
    private double so;
    vG vG;
    private String yiw;
    Jd pvs = new Jd(this);
    private final Set<Wyp> kj = new HashSet();
    private String Ju = "VAST_ACTION_BUTTON";
    private boolean IP = false;

    public Jd pvs() {
        return this.pvs;
    }

    public icD icD() {
        return this.icD;
    }

    public vG vG() {
        return this.vG;
    }

    public String Jd() {
        return this.Jd;
    }

    public String NB() {
        return this.NB;
    }

    public String sUS() {
        return this.sUS;
    }

    public String yiw() {
        return this.yiw;
    }

    public void pvs(icD icd) {
        if (icd != null) {
            icd.pvs(this.yiw);
        }
        this.icD = icd;
    }

    public void pvs(vG vGVar) {
        if (vGVar != null) {
            vGVar.pvs(this.yiw);
        }
        this.vG = vGVar;
    }

    public void pvs(String str) {
        this.Jd = str;
    }

    public void icD(String str) {
        this.NB = str;
    }

    public void vG(String str) {
        this.sUS = str;
    }

    public void Jd(String str) {
        this.yiw = str;
    }

    public double so() {
        return this.so;
    }

    public void pvs(double d) {
        this.so = d;
    }

    public String Mxy() {
        vG vGVar;
        String str = this.sUS;
        if (!TextUtils.isEmpty(this.bNS)) {
            String str2 = this.bNS;
            this.bNS = null;
            return str2;
        }
        String str3 = this.Ju;
        str3.hashCode();
        if (str3.equals("VAST_ICON")) {
            icD icd = this.icD;
            if (icd != null && !TextUtils.isEmpty(icd.so)) {
                str = this.icD.so;
            }
        } else if (str3.equals("VAST_END_CARD") && (vGVar = this.vG) != null && !TextUtils.isEmpty(vGVar.so)) {
            str = this.vG.so;
        }
        this.Ju = "VAST_ACTION_BUTTON";
        return str;
    }

    public void NB(String str) {
        this.Ju = str;
    }

    public JSONObject Wyp() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoTrackers", this.pvs.pvs());
        icD icd = this.icD;
        if (icd != null) {
            jSONObject.put("vastIcon", icd.pvs());
        }
        vG vGVar = this.vG;
        if (vGVar != null) {
            jSONObject.put("endCard", vGVar.pvs());
        }
        jSONObject.put(LinkHeader.Parameters.Title, this.Jd);
        jSONObject.put("description", this.NB);
        jSONObject.put("clickThroughUrl", this.sUS);
        jSONObject.put("videoUrl", this.yiw);
        jSONObject.put("videDuration", this.so);
        jSONObject.put("tag", this.qh);
        jSONObject.put("videoWidth", this.Mxy);
        jSONObject.put("videoHeight", this.Wyp);
        jSONObject.put("viewabilityVendor", mnm());
        return jSONObject;
    }

    private JSONArray mnm() {
        JSONArray jSONArray = new JSONArray();
        for (Wyp wyp : this.kj) {
            if (wyp != null) {
                jSONArray.put(wyp.Jd());
            }
        }
        return jSONArray;
    }

    public static pvs pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        pvs pvsVar = new pvs();
        pvsVar.pvs.pvs(jSONObject.optJSONObject("videoTrackers"));
        pvsVar.icD = icD.pvs(jSONObject.optJSONObject("vastIcon"));
        pvsVar.vG = vG.icD(jSONObject.optJSONObject("endCard"));
        pvsVar.Jd = jSONObject.optString(LinkHeader.Parameters.Title);
        pvsVar.NB = jSONObject.optString("description");
        pvsVar.sUS = jSONObject.optString("clickThroughUrl");
        pvsVar.yiw = jSONObject.optString("videoUrl");
        pvsVar.so = jSONObject.optDouble("videDuration");
        pvsVar.qh = jSONObject.optString("tag");
        pvsVar.Mxy = jSONObject.optInt("videoWidth");
        pvsVar.Mxy = jSONObject.optInt("videoHeight");
        pvsVar.kj.addAll(Wyp.pvs(jSONObject.optJSONArray("viewabilityVendor")));
        return pvsVar;
    }

    public void pvs(cR cRVar) {
        this.pvs.pvs(cRVar);
        icD icd = this.icD;
        if (icd != null) {
            icd.pvs(cRVar);
        }
        vG vGVar = this.vG;
        if (vGVar != null) {
            vGVar.pvs(cRVar);
        }
    }

    public String qh() {
        return this.qh;
    }

    public void sUS(String str) {
        this.qh = str;
        this.pvs.pvs(str);
    }

    public void pvs(int i) {
        this.Mxy = i;
    }

    public void icD(int i) {
        this.Wyp = i;
    }

    public int kj() {
        return this.Mxy;
    }

    public int Ju() {
        return this.Wyp;
    }

    public void pvs(Set<Wyp> set) {
        if (set == null || set.size() <= 0) {
            return;
        }
        this.kj.addAll(set);
    }

    public Set<Wyp> IP() {
        return this.kj;
    }

    public void yiw(String str) {
        this.bNS = str;
    }

    public void bNS() {
        this.IP = true;
    }
}
