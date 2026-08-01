package com.bytedance.sdk.component.so.vG;

/* compiled from: PagRunnable.java */
/* loaded from: classes.dex */
public abstract class icD implements Comparable<icD>, Runnable {
    private long Jd;
    private long NB;
    private String icD;
    private int pvs;
    private long sUS;
    private Runnable vG;

    public icD(String str) {
        this.pvs = 5;
        this.icD = str;
    }

    public icD(int i, String str) {
        this.pvs = i;
        this.icD = str;
    }

    public icD(String str, Runnable runnable) {
        this.pvs = 5;
        this.icD = str;
        this.vG = runnable;
    }

    public void pvs(int i) {
        this.pvs = i;
    }

    public int pvs() {
        return this.pvs;
    }

    @Override // java.lang.Comparable
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public int compareTo(icD icd) {
        if (pvs() < icd.pvs()) {
            return 1;
        }
        return pvs() >= icd.pvs() ? -1 : 0;
    }

    public String icD() {
        return this.icD;
    }

    public long vG() {
        return this.Jd;
    }

    public void pvs(long j) {
        this.Jd = j;
    }

    public long Jd() {
        return this.NB;
    }

    public void icD(long j) {
        this.NB = j;
    }

    public long NB() {
        return this.sUS;
    }

    public void vG(long j) {
        this.sUS = j;
    }

    public long sUS() {
        return this.NB - this.Jd;
    }

    public long yiw() {
        return this.sUS - this.NB;
    }

    public Runnable so() {
        return this.vG;
    }
}
