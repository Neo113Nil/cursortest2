package com.bytedance.adsdk.lottie.pvs.icD;

import android.graphics.Path;
import com.bytedance.adsdk.lottie.pvs.pvs.zM;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation.java */
/* loaded from: classes.dex */
public class Ju extends pvs<com.bytedance.adsdk.lottie.vG.icD.IP, Path> {
    private final com.bytedance.adsdk.lottie.vG.icD.IP Jd;
    private final Path NB;
    private List<zM> sUS;

    public Ju(List<com.bytedance.adsdk.lottie.yiw.pvs<com.bytedance.adsdk.lottie.vG.icD.IP>> list) {
        super(list);
        this.Jd = new com.bytedance.adsdk.lottie.vG.icD.IP();
        this.NB = new Path();
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs
    /* renamed from: icD, reason: merged with bridge method [inline-methods] */
    public Path pvs(com.bytedance.adsdk.lottie.yiw.pvs<com.bytedance.adsdk.lottie.vG.icD.IP> pvsVar, float f) {
        this.Jd.pvs(pvsVar.pvs, pvsVar.icD, f);
        com.bytedance.adsdk.lottie.vG.icD.IP ip = this.Jd;
        List<zM> list = this.sUS;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ip = this.sUS.get(size).pvs(ip);
            }
        }
        com.bytedance.adsdk.lottie.sUS.NB.pvs(ip, this.NB);
        return this.NB;
    }

    public void pvs(List<zM> list) {
        this.sUS = list;
    }
}
