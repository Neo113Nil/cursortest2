package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pc0 implements mc0 {
    public static final oc0 Companion = new oc0();
    public final float[] PxuCJdSBwIXG;
    public final float[] lS5Rgt96tfkO;

    public pc0(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            u9.XL4ISE6Oc65B("Array lengths must match and be nonzero");
            throw null;
        }
        this.PxuCJdSBwIXG = fArr;
        this.lS5Rgt96tfkO = fArr2;
    }

    @Override // defpackage.mc0
    public final float PxuCJdSBwIXG(float f) {
        return oc0.PxuCJdSBwIXG(Companion, f, this.lS5Rgt96tfkO, this.PxuCJdSBwIXG);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pc0)) {
            return false;
        }
        pc0 pc0Var = (pc0) obj;
        return Arrays.equals(this.PxuCJdSBwIXG, pc0Var.PxuCJdSBwIXG) && Arrays.equals(this.lS5Rgt96tfkO, pc0Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.lS5Rgt96tfkO) + (Arrays.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    @Override // defpackage.mc0
    public final float lS5Rgt96tfkO(float f) {
        return oc0.PxuCJdSBwIXG(Companion, f, this.PxuCJdSBwIXG, this.lS5Rgt96tfkO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.PxuCJdSBwIXG);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.lS5Rgt96tfkO);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
