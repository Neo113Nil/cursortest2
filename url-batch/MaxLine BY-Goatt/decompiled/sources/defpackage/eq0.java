package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eq0 implements cq0 {
    public final float[] a;
    public final float[] b;

    public eq0(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            lh.e("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.cq0
    public final float a(float f) {
        return u30.d(f, this.b, this.a);
    }

    @Override // defpackage.cq0
    public final float b(float f) {
        return u30.d(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof eq0)) {
            return false;
        }
        eq0 eq0Var = (eq0) obj;
        return Arrays.equals(this.a, eq0Var.a) && Arrays.equals(this.b, eq0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.a);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.b);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
