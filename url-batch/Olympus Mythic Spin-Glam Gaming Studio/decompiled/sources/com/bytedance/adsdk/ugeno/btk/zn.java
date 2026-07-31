package com.bytedance.adsdk.ugeno.btk;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class zn {
    int btk;
    int bvs;
    int cn;
    int cyb;
    int hhw;
    float iv;
    boolean kgc;
    int klz;
    int mw;
    int nps;
    boolean olo;
    float rc;
    int zg;
    int zmn = Integer.MAX_VALUE;
    int fs = Integer.MAX_VALUE;
    int zn = Integer.MIN_VALUE;
    int fb = Integer.MIN_VALUE;
    List<Integer> rt = new ArrayList();

    zn() {
    }

    public int zmn() {
        return this.nps;
    }

    public int fs() {
        return this.zg - this.bvs;
    }

    void zmn(View view, int i, int i2, int i3, int i4) {
        fs fsVar = (fs) view.getLayoutParams();
        this.zmn = Math.min(this.zmn, (view.getLeft() - fsVar.mw()) - i);
        this.fs = Math.min(this.fs, (view.getTop() - fsVar.rt()) - i2);
        this.zn = Math.max(this.zn, view.getRight() + fsVar.cn() + i3);
        this.fb = Math.max(this.fb, view.getBottom() + fsVar.cyb() + i4);
    }
}
