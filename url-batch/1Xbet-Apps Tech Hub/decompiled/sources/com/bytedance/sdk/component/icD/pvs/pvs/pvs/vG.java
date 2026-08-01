package com.bytedance.sdk.component.icD.pvs.pvs.pvs;

import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.bNS;
import com.bytedance.sdk.component.icD.pvs.so;
import java.io.IOException;
import java.util.List;

/* compiled from: NetChain.java */
/* loaded from: classes.dex */
public class vG implements so.pvs {
    Ju icD;
    List<com.bytedance.sdk.component.icD.pvs.so> pvs;
    int vG = 0;

    vG(List<com.bytedance.sdk.component.icD.pvs.so> list, Ju ju) {
        this.pvs = list;
        this.icD = ju;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.so.pvs
    public Ju pvs() {
        return this.icD;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.so.pvs
    public bNS pvs(Ju ju) throws IOException {
        this.icD = ju;
        int i = this.vG + 1;
        this.vG = i;
        if (i >= this.pvs.size()) {
            return null;
        }
        return this.pvs.get(this.vG).pvs(this);
    }
}
