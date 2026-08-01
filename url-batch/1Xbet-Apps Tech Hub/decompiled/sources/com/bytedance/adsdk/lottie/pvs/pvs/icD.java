package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompoundTrimPathContent.java */
/* loaded from: classes.dex */
public class icD {
    private final List<rCZ> pvs = new ArrayList();

    void pvs(rCZ rcz) {
        this.pvs.add(rcz);
    }

    public void pvs(Path path) {
        for (int size = this.pvs.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.lottie.sUS.sUS.pvs(path, this.pvs.get(size));
        }
    }
}
