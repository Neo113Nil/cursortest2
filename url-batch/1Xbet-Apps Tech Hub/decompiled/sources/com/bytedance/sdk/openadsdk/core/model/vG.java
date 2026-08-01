package com.bytedance.sdk.openadsdk.core.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* compiled from: AppInfo.java */
/* loaded from: classes2.dex */
public class vG {
    private int yiw;
    private String pvs = "";
    private String icD = "";
    private String vG = "";
    private String Jd = "";
    private double NB = -1.0d;
    private int sUS = -1;

    public String pvs() {
        return this.pvs;
    }

    public void pvs(String str) {
        this.pvs = str;
    }

    public String icD() {
        return this.icD;
    }

    public void icD(String str) {
        this.icD = str;
    }

    public String vG() {
        return this.vG;
    }

    public void vG(String str) {
        this.vG = str;
    }

    public double Jd() {
        return this.NB;
    }

    public void pvs(double d) {
        if (d < 1.0d || d > 5.0d) {
            this.NB = -1.0d;
        } else {
            this.NB = d;
        }
    }

    public int NB() {
        return this.sUS;
    }

    public void pvs(int i) {
        if (i <= 0) {
            this.sUS = -1;
        } else {
            this.sUS = i;
        }
    }

    public int sUS() {
        return this.yiw;
    }

    public void icD(int i) {
        this.yiw = i;
    }

    public String yiw() {
        return this.Jd;
    }

    public void Jd(String str) {
        this.Jd = str;
    }

    public JSONObject so() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", icD());
            jSONObject.put("app_size", sUS());
            jSONObject.put("comment_num", NB());
            jSONObject.put("download_url", pvs());
            jSONObject.put("package_name", vG());
            jSONObject.put(FirebaseAnalytics.Param.SCORE, Jd());
            jSONObject.put("app_category", yiw());
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.icD(e.toString());
        }
        return jSONObject;
    }
}
