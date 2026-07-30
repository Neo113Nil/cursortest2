package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hu1 {
    public final long PxuCJdSBwIXG;
    public final tb RAsUl2FVSrh6;
    public final long TSizfFm2Yiuu;
    public final long Y1f8riQaR6yg;
    public final float[] a92UlCVFR9N8;
    public final long e9gEMXR7LXtO;
    public final long lS5Rgt96tfkO;

    public hu1(long j, long j2, long j3, long j4, long j5, float[] fArr, tb tbVar) {
        this.PxuCJdSBwIXG = j;
        this.lS5Rgt96tfkO = j2;
        this.TSizfFm2Yiuu = j3;
        this.Y1f8riQaR6yg = j4;
        this.e9gEMXR7LXtO = j5;
        this.a92UlCVFR9N8 = fArr;
        this.RAsUl2FVSrh6 = tbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj != null && hu1.class == obj.getClass()) {
            hu1 hu1Var = (hu1) obj;
            if (this.PxuCJdSBwIXG == hu1Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == hu1Var.lS5Rgt96tfkO && this.e9gEMXR7LXtO == hu1Var.e9gEMXR7LXtO && wq0.PxuCJdSBwIXG(this.TSizfFm2Yiuu, hu1Var.TSizfFm2Yiuu) && wq0.PxuCJdSBwIXG(this.Y1f8riQaR6yg, hu1Var.Y1f8riQaR6yg)) {
                float[] fArr = hu1Var.a92UlCVFR9N8;
                float[] fArr2 = this.a92UlCVFR9N8;
                if (fArr2 == null) {
                    if (fArr == null) {
                        equals = true;
                        return equals && this.RAsUl2FVSrh6 == hu1Var.RAsUl2FVSrh6;
                    }
                    equals = false;
                    if (equals) {
                    }
                } else {
                    if (fArr != null) {
                        equals = fArr2.equals(fArr);
                        if (equals) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int TSizfFm2Yiuu = o0.TSizfFm2Yiuu(o0.TSizfFm2Yiuu(o0.TSizfFm2Yiuu(o0.TSizfFm2Yiuu(Long.hashCode(this.PxuCJdSBwIXG) * 31, 31, this.lS5Rgt96tfkO), 31, this.e9gEMXR7LXtO), 31, this.TSizfFm2Yiuu), 31, this.Y1f8riQaR6yg);
        float[] fArr = this.a92UlCVFR9N8;
        return this.RAsUl2FVSrh6.hashCode() + ((TSizfFm2Yiuu + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
