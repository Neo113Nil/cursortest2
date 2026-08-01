package com.bytedance.sdk.openadsdk.icD;

import org.json.JSONObject;

/* compiled from: AdShowTime.java */
/* loaded from: classes2.dex */
public class yiw {
    private long Jd;
    private long NB;
    private long icD;
    private long pvs;
    private long vG;

    public void pvs(long j) {
        if (this.pvs <= 0) {
            this.pvs = j;
        }
    }

    public void icD(long j) {
        if (this.icD <= 0) {
            this.icD = j;
        }
    }

    public void vG(long j) {
        if (this.vG <= 0) {
            this.vG = j;
        }
    }

    public void Jd(long j) {
        if (this.Jd <= 0) {
            this.Jd = j;
        }
    }

    public void NB(long j) {
        if (this.NB <= 0) {
            this.NB = j;
        }
    }

    public boolean pvs() {
        return this.pvs > 0;
    }

    public void pvs(long j, float f) {
        if (f > 0.0f) {
            pvs(j);
        }
        double d = f;
        if (d >= 0.25d) {
            pvs(j);
            icD(j);
        }
        if (d >= 0.5d) {
            pvs(j);
            icD(j);
            vG(j);
        }
        if (d >= 0.75d) {
            pvs(j);
            icD(j);
            vG(j);
            Jd(j);
        }
        if (f >= 1.0f) {
            pvs(j);
            icD(j);
            vG(j);
            Jd(j);
            NB(j);
        }
    }

    public JSONObject icD() {
        return pvs((JSONObject) null);
    }

    public JSONObject pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j = this.pvs;
        if (j > 0) {
            jSONObject.put("show_start", j);
            long j2 = this.icD;
            if (j2 > 0) {
                jSONObject.put("show_firstQuartile", j2);
                long j3 = this.vG;
                if (j3 > 0) {
                    jSONObject.put("show_mid", j3);
                    long j4 = this.Jd;
                    if (j4 > 0) {
                        jSONObject.put("show_thirdQuartile", j4);
                        long j5 = this.NB;
                        if (j5 > 0) {
                            jSONObject.put("show_full", j5);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
