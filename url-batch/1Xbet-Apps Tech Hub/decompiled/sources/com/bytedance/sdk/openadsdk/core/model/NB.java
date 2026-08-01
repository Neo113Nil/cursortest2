package com.bytedance.sdk.openadsdk.core.model;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ArbitrageInterceptorInfo.java */
/* loaded from: classes2.dex */
public class NB {
    private int Jd;
    private List<String> NB;
    private int icD;
    private int pvs;
    private List<Integer> vG;

    public List<String> pvs() {
        return this.NB;
    }

    public void pvs(List<String> list) {
        this.NB = list;
    }

    public int icD() {
        return this.pvs;
    }

    public void pvs(int i) {
        this.pvs = i;
    }

    public int vG() {
        return this.icD;
    }

    public void icD(int i) {
        this.icD = i;
    }

    public List<Integer> Jd() {
        return this.vG;
    }

    public void icD(List<Integer> list) {
        this.vG = list;
    }

    public int NB() {
        return this.Jd;
    }

    public void vG(int i) {
        this.Jd = i;
    }

    public JSONObject sUS() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.pvs);
            jSONObject.put("interceptor_y", this.icD);
            if (this.vG != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.vG.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.Jd);
            if (this.NB != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = this.NB.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.icD(th.getMessage());
        }
        return jSONObject;
    }
}
