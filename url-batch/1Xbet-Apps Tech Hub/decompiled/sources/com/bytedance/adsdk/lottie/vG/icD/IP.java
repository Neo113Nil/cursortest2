package com.bytedance.adsdk.lottie.vG.icD;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ShapeData.java */
/* loaded from: classes.dex */
public class IP {
    private PointF icD;
    private final List<com.bytedance.adsdk.lottie.vG.pvs> pvs;
    private boolean vG;

    public IP(PointF pointF, boolean z, List<com.bytedance.adsdk.lottie.vG.pvs> list) {
        this.icD = pointF;
        this.vG = z;
        this.pvs = new ArrayList(list);
    }

    public IP() {
        this.pvs = new ArrayList();
    }

    public void pvs(float f, float f2) {
        if (this.icD == null) {
            this.icD = new PointF();
        }
        this.icD.set(f, f2);
    }

    public PointF pvs() {
        return this.icD;
    }

    public void pvs(boolean z) {
        this.vG = z;
    }

    public boolean icD() {
        return this.vG;
    }

    public List<com.bytedance.adsdk.lottie.vG.pvs> vG() {
        return this.pvs;
    }

    public void pvs(IP ip, IP ip2, float f) {
        if (this.icD == null) {
            this.icD = new PointF();
        }
        this.vG = ip.icD() || ip2.icD();
        if (ip.vG().size() != ip2.vG().size()) {
            ip.vG().size();
            ip2.vG().size();
        }
        int min = Math.min(ip.vG().size(), ip2.vG().size());
        if (this.pvs.size() < min) {
            for (int size = this.pvs.size(); size < min; size++) {
                this.pvs.add(new com.bytedance.adsdk.lottie.vG.pvs());
            }
        } else if (this.pvs.size() > min) {
            for (int size2 = this.pvs.size() - 1; size2 >= min; size2--) {
                List<com.bytedance.adsdk.lottie.vG.pvs> list = this.pvs;
                list.remove(list.size() - 1);
            }
        }
        PointF pvs = ip.pvs();
        PointF pvs2 = ip2.pvs();
        pvs(com.bytedance.adsdk.lottie.sUS.NB.pvs(pvs.x, pvs2.x, f), com.bytedance.adsdk.lottie.sUS.NB.pvs(pvs.y, pvs2.y, f));
        for (int size3 = this.pvs.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.lottie.vG.pvs pvsVar = ip.vG().get(size3);
            com.bytedance.adsdk.lottie.vG.pvs pvsVar2 = ip2.vG().get(size3);
            PointF pvs3 = pvsVar.pvs();
            PointF icD = pvsVar.icD();
            PointF vG = pvsVar.vG();
            PointF pvs4 = pvsVar2.pvs();
            PointF icD2 = pvsVar2.icD();
            PointF vG2 = pvsVar2.vG();
            this.pvs.get(size3).pvs(com.bytedance.adsdk.lottie.sUS.NB.pvs(pvs3.x, pvs4.x, f), com.bytedance.adsdk.lottie.sUS.NB.pvs(pvs3.y, pvs4.y, f));
            this.pvs.get(size3).icD(com.bytedance.adsdk.lottie.sUS.NB.pvs(icD.x, icD2.x, f), com.bytedance.adsdk.lottie.sUS.NB.pvs(icD.y, icD2.y, f));
            this.pvs.get(size3).vG(com.bytedance.adsdk.lottie.sUS.NB.pvs(vG.x, vG2.x, f), com.bytedance.adsdk.lottie.sUS.NB.pvs(vG.y, vG2.y, f));
        }
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.pvs.size() + "closed=" + this.vG + AbstractJsonLexerKt.END_OBJ;
    }
}
