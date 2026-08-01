package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.gA;

/* compiled from: TTAppOpenAdReportModel.java */
/* loaded from: classes2.dex */
public class ny {
    private long Mxy;
    private long NB;
    private long Wyp;
    public long icD;
    public boolean pvs;
    private int qh;
    private long sUS;
    private long so;
    private long yiw;
    private gA vG = gA.icD();
    private gA Jd = gA.icD();

    public void pvs(gA gAVar, gA gAVar2, int i, gA gAVar3) {
        this.NB = gAVar.pvs(this.vG);
        this.sUS = gAVar2.pvs(gAVar);
        this.yiw = i;
        this.so = gAVar3.pvs(gAVar2);
    }

    public void pvs(gA gAVar) {
        this.vG = gAVar;
    }

    public void icD(gA gAVar) {
        this.Jd = gAVar;
        this.Mxy = gAVar.pvs(this.vG);
    }

    public gA pvs() {
        return this.vG;
    }

    public long icD() {
        return this.NB;
    }

    public long vG() {
        return this.sUS;
    }

    public long Jd() {
        return this.yiw;
    }

    public long NB() {
        return this.so;
    }

    public long sUS() {
        return this.Mxy;
    }

    public long yiw() {
        return this.Wyp;
    }

    public void pvs(long j) {
        this.Wyp = j;
    }

    public int so() {
        return this.qh;
    }

    public void pvs(int i) {
        this.qh = i;
    }
}
