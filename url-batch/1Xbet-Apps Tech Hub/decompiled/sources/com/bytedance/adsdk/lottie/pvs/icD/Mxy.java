package com.bytedance.adsdk.lottie.pvs.icD;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: PathKeyframe.java */
/* loaded from: classes.dex */
public class Mxy extends com.bytedance.adsdk.lottie.yiw.pvs<PointF> {
    private Path Wyp;
    private final com.bytedance.adsdk.lottie.yiw.pvs<PointF> qh;

    public Mxy(com.bytedance.adsdk.lottie.sUS sus, com.bytedance.adsdk.lottie.yiw.pvs<PointF> pvsVar) {
        super(sus, pvsVar.pvs, pvsVar.icD, pvsVar.vG, pvsVar.Jd, pvsVar.NB, pvsVar.sUS, pvsVar.yiw);
        this.qh = pvsVar;
        pvs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void pvs() {
        boolean z = (this.icD == 0 || this.pvs == 0 || !((PointF) this.pvs).equals(((PointF) this.icD).x, ((PointF) this.icD).y)) ? false : true;
        if (this.pvs == 0 || this.icD == 0 || z) {
            return;
        }
        this.Wyp = com.bytedance.adsdk.lottie.sUS.sUS.pvs((PointF) this.pvs, (PointF) this.icD, this.qh.so, this.qh.Mxy);
    }

    Path icD() {
        return this.Wyp;
    }
}
