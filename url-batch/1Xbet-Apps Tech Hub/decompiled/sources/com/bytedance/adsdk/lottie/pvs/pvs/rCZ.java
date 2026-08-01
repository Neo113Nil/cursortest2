package com.bytedance.adsdk.lottie.pvs.pvs;

import com.bytedance.adsdk.lottie.pvs.icD.pvs;
import com.bytedance.adsdk.lottie.vG.icD.zM;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent.java */
/* loaded from: classes.dex */
public class rCZ implements pvs.InterfaceC0030pvs, vG {
    private final zM.pvs Jd;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> NB;
    private final boolean icD;
    private final String pvs;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> sUS;
    private final List<pvs.InterfaceC0030pvs> vG = new ArrayList();
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> yiw;

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.vG
    public void pvs(List<vG> list, List<vG> list2) {
    }

    public rCZ(com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, com.bytedance.adsdk.lottie.vG.icD.zM zMVar) {
        this.pvs = zMVar.pvs();
        this.icD = zMVar.sUS();
        this.Jd = zMVar.icD();
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs = zMVar.Jd().pvs();
        this.NB = pvs;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs2 = zMVar.vG().pvs();
        this.sUS = pvs2;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs3 = zMVar.NB().pvs();
        this.yiw = pvs3;
        pvsVar.pvs(pvs);
        pvsVar.pvs(pvs2);
        pvsVar.pvs(pvs3);
        pvs.pvs(this);
        pvs2.pvs(this);
        pvs3.pvs(this);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
    public void pvs() {
        for (int i = 0; i < this.vG.size(); i++) {
            this.vG.get(i).pvs();
        }
    }

    void pvs(pvs.InterfaceC0030pvs interfaceC0030pvs) {
        this.vG.add(interfaceC0030pvs);
    }

    zM.pvs icD() {
        return this.Jd;
    }

    public com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> vG() {
        return this.NB;
    }

    public com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> Jd() {
        return this.sUS;
    }

    public com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> NB() {
        return this.yiw;
    }

    public boolean sUS() {
        return this.icD;
    }
}
