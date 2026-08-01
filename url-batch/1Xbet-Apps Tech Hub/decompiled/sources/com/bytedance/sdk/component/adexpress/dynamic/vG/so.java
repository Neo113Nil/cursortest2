package com.bytedance.sdk.component.adexpress.dynamic.vG;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DynamicLayoutUnit.java */
/* loaded from: classes.dex */
public class so {
    private boolean IP;
    private float Jd;
    private String Ju;
    private NB Mxy;
    private float NB;
    private List<so> Wyp;
    private float icD;
    private List<List<so>> kj;
    private String pvs;
    private so qh;
    private float sUS;
    private float so;
    private float vG;
    private float yiw;
    private Map<String, String> bNS = new HashMap();
    private Map<Integer, String> mnm = new HashMap();

    public String pvs() {
        return this.Ju;
    }

    public void pvs(String str) {
        this.Ju = str;
    }

    public Map<Integer, String> icD() {
        return this.mnm;
    }

    public void pvs(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    this.mnm.put(Integer.valueOf(optJSONObject.optInt(FacebookMediationAdapter.KEY_ID)), optJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public String vG() {
        return this.pvs;
    }

    public void icD(String str) {
        this.pvs = str;
    }

    public float Jd() {
        return this.Jd;
    }

    public void pvs(float f) {
        this.Jd = f;
    }

    public float NB() {
        return this.NB;
    }

    public void icD(float f) {
        this.NB = f;
    }

    public float sUS() {
        return this.icD;
    }

    public void vG(float f) {
        this.icD = f;
    }

    public float yiw() {
        return this.vG;
    }

    public void Jd(float f) {
        this.vG = f;
    }

    public float so() {
        return this.sUS;
    }

    public void NB(float f) {
        this.sUS = f;
    }

    public float Mxy() {
        return this.yiw;
    }

    public void sUS(float f) {
        this.yiw = f;
    }

    public void yiw(float f) {
        this.so = f;
    }

    public NB Wyp() {
        return this.Mxy;
    }

    public void pvs(NB nb) {
        this.Mxy = nb;
    }

    public List<so> qh() {
        return this.Wyp;
    }

    public void pvs(List<so> list) {
        this.Wyp = list;
    }

    public void pvs(so soVar) {
        this.qh = soVar;
    }

    public so kj() {
        return this.qh;
    }

    public int Ju() {
        sUS NB = this.Mxy.NB();
        return NB.ZsW() + NB.CjQ();
    }

    public int IP() {
        sUS NB = this.Mxy.NB();
        return NB.sq() + NB.ea();
    }

    public float bNS() {
        sUS NB = this.Mxy.NB();
        return Ju() + NB.bNS() + NB.mnm() + (NB.kj() * 2.0f);
    }

    public float mnm() {
        sUS NB = this.Mxy.NB();
        return IP() + NB.vA() + NB.IP() + (NB.kj() * 2.0f);
    }

    public void icD(List<List<so>> list) {
        this.kj = list;
    }

    public List<List<so>> vA() {
        return this.kj;
    }

    public boolean cR() {
        List<so> list = this.Wyp;
        return list == null || list.size() <= 0;
    }

    public boolean zM() {
        return this.IP;
    }

    public void pvs(boolean z) {
        this.IP = z;
    }

    public Map<String, String> uc() {
        return this.bNS;
    }

    public void pvs(String str, String str2) {
        this.bNS.put(str, str2);
    }

    public void rCZ() {
        List<List<so>> list = this.kj;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<so> list2 : this.kj) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.kj = arrayList;
    }

    public boolean OT() {
        return TextUtils.equals(this.Mxy.NB().Gp(), "flex");
    }

    public String ny() {
        return this.Mxy.NB().ny();
    }

    public void vG(String str) {
        this.Mxy.NB().sUS(str);
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.pvs + "', x=" + this.icD + ", y=" + this.vG + ", width=" + this.sUS + ", height=" + this.yiw + ", remainWidth=" + this.so + ", rootBrick=" + this.Mxy + ", childrenBrickUnits=" + this.Wyp + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean ZhG() {
        return this.Mxy.NB().MY() < 0 || this.Mxy.NB().rcB() < 0 || this.Mxy.NB().tCd() < 0 || this.Mxy.NB().Wby() < 0;
    }

    public String pvs(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.Mxy.icD());
        sb.append(":");
        sb.append(this.pvs);
        if (this.Mxy.NB() != null) {
            sb.append(":");
            sb.append(this.Mxy.NB().Oa());
        }
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }
}
