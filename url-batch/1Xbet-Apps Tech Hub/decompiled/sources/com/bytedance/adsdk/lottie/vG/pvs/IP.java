package com.bytedance.adsdk.lottie.vG.pvs;

import java.util.Arrays;
import java.util.List;

/* compiled from: BaseAnimatableValue.java */
/* loaded from: classes.dex */
abstract class IP<V, O> implements Ju<V, O> {
    final List<com.bytedance.adsdk.lottie.yiw.pvs<V>> pvs;

    IP(List<com.bytedance.adsdk.lottie.yiw.pvs<V>> list) {
        this.pvs = list;
    }

    @Override // com.bytedance.adsdk.lottie.vG.pvs.Ju
    public List<com.bytedance.adsdk.lottie.yiw.pvs<V>> vG() {
        return this.pvs;
    }

    @Override // com.bytedance.adsdk.lottie.vG.pvs.Ju
    public boolean icD() {
        return this.pvs.isEmpty() || (this.pvs.size() == 1 && this.pvs.get(0).NB());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.pvs.isEmpty()) {
            sb.append("values=").append(Arrays.toString(this.pvs.toArray()));
        }
        return sb.toString();
    }
}
