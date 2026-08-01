package com.bytedance.sdk.openadsdk.Wyp.pvs;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.jlb;

/* compiled from: BrowserLogModel.java */
/* loaded from: classes2.dex */
public class icD {
    private int Jd;
    private boolean NB;
    private cR icD;
    private String pvs;
    private String sUS;
    private String vG;
    private int yiw;
    private int so = 0;
    private int Mxy = 0;

    public String pvs() {
        return this.pvs;
    }

    public void pvs(String str) {
        this.pvs = str;
    }

    public cR icD() {
        return this.icD;
    }

    public void pvs(cR cRVar) {
        this.icD = cRVar;
    }

    public String vG() {
        cR cRVar;
        if (TextUtils.isEmpty(this.vG) && (cRVar = this.icD) != null) {
            this.vG = jlb.pvs(cRVar);
        }
        return this.vG;
    }

    public void icD(String str) {
        this.vG = str;
    }

    public int Jd() {
        return this.Jd;
    }

    public void pvs(int i) {
        this.Jd = i;
    }

    public boolean NB() {
        return this.NB;
    }

    public void pvs(boolean z) {
        this.NB = z;
    }

    public String sUS() {
        return this.sUS;
    }

    public void vG(String str) {
        this.sUS = str;
    }

    public int yiw() {
        return this.yiw;
    }

    public void icD(int i) {
        this.yiw = i;
    }

    public int so() {
        return this.so;
    }

    public void vG(int i) {
        this.so = i;
    }

    public int Mxy() {
        return this.Mxy;
    }

    public void Jd(int i) {
        this.Mxy = i;
    }
}
