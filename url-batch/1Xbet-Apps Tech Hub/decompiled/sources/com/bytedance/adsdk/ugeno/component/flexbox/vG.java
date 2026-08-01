package com.bytedance.adsdk.ugeno.component.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FlexLine.java */
/* loaded from: classes.dex */
public class vG {
    int Ju;
    int Mxy;
    int NB;
    float Wyp;
    int bNS;
    boolean cR;
    int kj;
    int mnm;
    float qh;
    int sUS;
    int so;
    boolean vA;
    int yiw;
    int pvs = Integer.MAX_VALUE;
    int icD = Integer.MAX_VALUE;
    int vG = Integer.MIN_VALUE;
    int Jd = Integer.MIN_VALUE;
    List<Integer> IP = new ArrayList();

    vG() {
    }

    public int pvs() {
        return this.yiw;
    }

    public int icD() {
        return this.so - this.Mxy;
    }

    void pvs(View view, int i, int i2, int i3, int i4) {
        icD icd = (icD) view.getLayoutParams();
        this.pvs = Math.min(this.pvs, (view.getLeft() - icd.Ju()) - i);
        this.icD = Math.min(this.icD, (view.getTop() - icd.IP()) - i2);
        this.vG = Math.max(this.vG, view.getRight() + icd.bNS() + i3);
        this.Jd = Math.max(this.Jd, view.getBottom() + icd.mnm() + i4);
    }
}
