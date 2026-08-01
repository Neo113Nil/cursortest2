package com.bytedance.adsdk.lottie.sUS;

/* compiled from: MeanCalculator.java */
/* loaded from: classes.dex */
public class Jd {
    private int icD;
    private float pvs;

    public void pvs(float f) {
        float f2 = this.pvs + f;
        this.pvs = f2;
        int i = this.icD + 1;
        this.icD = i;
        if (i == Integer.MAX_VALUE) {
            this.pvs = f2 / 2.0f;
            this.icD = i / 2;
        }
    }
}
