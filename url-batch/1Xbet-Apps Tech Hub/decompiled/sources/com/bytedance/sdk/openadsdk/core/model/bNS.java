package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* compiled from: Image.java */
/* loaded from: classes2.dex */
public class bNS {
    private double Jd;
    private boolean NB;
    private int icD;
    private String pvs;
    private String sUS;
    private int vG;

    public String pvs() {
        return this.pvs;
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

    public int vG() {
        return this.vG;
    }

    public void icD(int i) {
        this.vG = i;
    }

    public double Jd() {
        return this.Jd;
    }

    public boolean NB() {
        return !TextUtils.isEmpty(this.pvs) && this.icD > 0 && this.vG > 0;
    }

    public boolean sUS() {
        return this.NB;
    }

    public void pvs(boolean z) {
        this.NB = z;
    }

    public String yiw() {
        return this.sUS;
    }

    public void icD(String str) {
        this.sUS = str;
    }
}
