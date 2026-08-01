package com.bytedance.adsdk.lottie.vG.icD;

import java.util.Arrays;

/* compiled from: GradientColor.java */
/* loaded from: classes.dex */
public class Jd {
    private final int[] icD;
    private final float[] pvs;

    public Jd(float[] fArr, int[] iArr) {
        this.pvs = fArr;
        this.icD = iArr;
    }

    public float[] pvs() {
        return this.pvs;
    }

    public int[] icD() {
        return this.icD;
    }

    public int vG() {
        return this.icD.length;
    }

    public void pvs(Jd jd, Jd jd2, float f) {
        if (jd.icD.length != jd2.icD.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + jd.icD.length + " vs " + jd2.icD.length + ")");
        }
        for (int i = 0; i < jd.icD.length; i++) {
            this.pvs[i] = com.bytedance.adsdk.lottie.sUS.NB.pvs(jd.pvs[i], jd2.pvs[i], f);
            this.icD[i] = com.bytedance.adsdk.lottie.sUS.icD.pvs(f, jd.icD[i], jd2.icD[i]);
        }
    }

    public Jd pvs(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = pvs(fArr[i]);
        }
        return new Jd(fArr, iArr);
    }

    private int pvs(float f) {
        int binarySearch = Arrays.binarySearch(this.pvs, f);
        if (binarySearch >= 0) {
            return this.icD[binarySearch];
        }
        int i = -(binarySearch + 1);
        if (i == 0) {
            return this.icD[0];
        }
        int[] iArr = this.icD;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.pvs;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return com.bytedance.adsdk.lottie.sUS.icD.pvs((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }
}
