package com.bytedance.adsdk.lottie.yiw;

/* compiled from: ScaleXY.java */
/* loaded from: classes.dex */
public class vG {
    private float icD;
    private float pvs;

    public vG(float f, float f2) {
        this.pvs = f;
        this.icD = f2;
    }

    public vG() {
        this(1.0f, 1.0f);
    }

    public float pvs() {
        return this.pvs;
    }

    public float icD() {
        return this.icD;
    }

    public void pvs(float f, float f2) {
        this.pvs = f;
        this.icD = f2;
    }

    public boolean icD(float f, float f2) {
        return this.pvs == f && this.icD == f2;
    }

    public String toString() {
        return pvs() + "x" + icD();
    }
}
