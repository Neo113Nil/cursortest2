package com.bytedance.adsdk.fs.zn.fs;

import java.util.Arrays;

/* loaded from: classes11.dex */
public class fb {
    private final int[] fs;
    private final float[] zmn;

    public fb(float[] fArr, int[] iArr) {
        this.zmn = fArr;
        this.fs = iArr;
    }

    public float[] zmn() {
        return this.zmn;
    }

    public int[] fs() {
        return this.fs;
    }

    public int zn() {
        return this.fs.length;
    }

    public void zmn(fb fbVar, fb fbVar2, float f) {
        if (fbVar.fs.length != fbVar2.fs.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + fbVar.fs.length + " vs " + fbVar2.fs.length + ")");
        }
        for (int i = 0; i < fbVar.fs.length; i++) {
            this.zmn[i] = com.bytedance.adsdk.fs.hhw.btk.zmn(fbVar.zmn[i], fbVar2.zmn[i], f);
            this.fs[i] = com.bytedance.adsdk.fs.hhw.fs.zmn(f, fbVar.fs[i], fbVar2.fs[i]);
        }
    }

    public fb zmn(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = zmn(fArr[i]);
        }
        return new fb(fArr, iArr);
    }

    private int zmn(float f) {
        int binarySearch = Arrays.binarySearch(this.zmn, f);
        if (binarySearch >= 0) {
            return this.fs[binarySearch];
        }
        int i = -(binarySearch + 1);
        if (i == 0) {
            return this.fs[0];
        }
        int[] iArr = this.fs;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.zmn;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return com.bytedance.adsdk.fs.hhw.fs.zmn((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }
}
