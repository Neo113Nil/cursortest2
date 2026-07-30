package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kf1 extends tl {
    public static final jf1 Companion = new jf1();
    public static final float[] RAsUl2FVSrh6;
    public static final float[] Y1f8riQaR6yg;
    public static final float[] a92UlCVFR9N8;
    public static final float[] e9gEMXR7LXtO;

    static {
        j.Companion.getClass();
        float[] nLZGh9p8gVSu = ov2.nLZGh9p8gVSu(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ov2.EcgxDIVH5in8(j.lS5Rgt96tfkO.PxuCJdSBwIXG, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        Y1f8riQaR6yg = nLZGh9p8gVSu;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e9gEMXR7LXtO = fArr;
        a92UlCVFR9N8 = ov2.ozEBbv0hFTAB(nLZGh9p8gVSu);
        RAsUl2FVSrh6 = ov2.ozEBbv0hFTAB(fArr);
    }

    @Override // defpackage.tl
    public final float PxuCJdSBwIXG(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // defpackage.tl
    public final long Y1f8riQaR6yg(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = RAsUl2FVSrh6;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = a92UlCVFR9N8;
        return (Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8))) << 32) | (4294967295L & Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8)));
    }

    @Override // defpackage.tl
    public final long a92UlCVFR9N8(float f, float f2, float f3, float f4, tl tlVar) {
        float[] fArr = Y1f8riQaR6yg;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float XL4ISE6Oc65B = ni0.XL4ISE6Oc65B(f5);
        float XL4ISE6Oc65B2 = ni0.XL4ISE6Oc65B(f6);
        float XL4ISE6Oc65B3 = ni0.XL4ISE6Oc65B(f7);
        float[] fArr2 = e9gEMXR7LXtO;
        return mm2.lS5Rgt96tfkO((fArr2[6] * XL4ISE6Oc65B3) + (fArr2[3] * XL4ISE6Oc65B2) + (fArr2[0] * XL4ISE6Oc65B), (fArr2[7] * XL4ISE6Oc65B3) + (fArr2[4] * XL4ISE6Oc65B2) + (fArr2[1] * XL4ISE6Oc65B), (fArr2[8] * XL4ISE6Oc65B3) + (fArr2[5] * XL4ISE6Oc65B2) + (fArr2[2] * XL4ISE6Oc65B), f4, tlVar);
    }

    @Override // defpackage.tl
    public final float e9gEMXR7LXtO(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = RAsUl2FVSrh6;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = a92UlCVFR9N8;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // defpackage.tl
    public final float lS5Rgt96tfkO(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }
}
