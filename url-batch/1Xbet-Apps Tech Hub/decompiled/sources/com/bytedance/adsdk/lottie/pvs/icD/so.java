package com.bytedance.adsdk.lottie.pvs.icD;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation.java */
/* loaded from: classes.dex */
public class so {
    private final List<pvs<Integer, Integer>> icD;
    private final List<pvs<com.bytedance.adsdk.lottie.vG.icD.IP, Path>> pvs;
    private final List<com.bytedance.adsdk.lottie.vG.icD.so> vG;

    public so(List<com.bytedance.adsdk.lottie.vG.icD.so> list) {
        this.vG = list;
        this.pvs = new ArrayList(list.size());
        this.icD = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.pvs.add(list.get(i).icD().pvs());
            this.icD.add(list.get(i).vG().pvs());
        }
    }

    public List<com.bytedance.adsdk.lottie.vG.icD.so> pvs() {
        return this.vG;
    }

    public List<pvs<com.bytedance.adsdk.lottie.vG.icD.IP, Path>> icD() {
        return this.pvs;
    }

    public List<pvs<Integer, Integer>> vG() {
        return this.icD;
    }
}
