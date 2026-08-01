package com.bytedance.sdk.component.adexpress.pvs.pvs;

import com.bytedance.sdk.component.NB.bNS;

/* compiled from: AdapterInstance.java */
/* loaded from: classes.dex */
public class pvs {
    private static pvs NB = new pvs();
    private volatile bNS Jd;
    private volatile Jd icD;
    private volatile icD pvs;
    private volatile NB sUS;
    private volatile vG vG;

    private pvs() {
    }

    public static pvs pvs() {
        return NB;
    }

    public void pvs(icD icd) {
        this.pvs = icd;
    }

    public icD icD() {
        return this.pvs;
    }

    public void pvs(vG vGVar) {
        this.vG = vGVar;
    }

    public vG vG() {
        return this.vG;
    }

    public void pvs(Jd jd) {
        this.icD = jd;
    }

    public Jd Jd() {
        return this.icD;
    }

    public void pvs(bNS bns) {
        this.Jd = bns;
    }

    public bNS NB() {
        return this.Jd;
    }

    public NB sUS() {
        return this.sUS;
    }
}
