package com.bytedance.sdk.openadsdk.component.NB;

import com.bytedance.sdk.openadsdk.core.model.cR;

/* compiled from: TTAppOpenAdCallBackResult.java */
/* loaded from: classes2.dex */
public class icD {
    private int Jd;
    private String NB;
    private int icD;
    private int pvs;
    private boolean sUS;
    private cR vG;

    public icD(int i, int i2, cR cRVar) {
        this.pvs = i;
        this.icD = i2;
        this.vG = cRVar;
    }

    public icD(int i, int i2, int i3, String str) {
        this.pvs = i;
        this.icD = i2;
        this.Jd = i3;
        this.NB = str;
    }

    public void pvs(boolean z) {
        this.sUS = z;
    }

    public boolean pvs() {
        return this.sUS;
    }

    public int icD() {
        return this.pvs;
    }

    public int vG() {
        return this.icD;
    }

    public cR Jd() {
        return this.vG;
    }

    public int NB() {
        return this.Jd;
    }

    public String sUS() {
        return this.NB;
    }
}
