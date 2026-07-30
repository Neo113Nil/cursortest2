package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class f21 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final ic g;

    public f21(long j, long j2, long j3, long j4, long j5, float[] fArr, ic icVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = icVar;
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
        if (obj != null && f21.class == obj.getClass()) {
            f21 f21Var = (f21) obj;
            if (this.a == f21Var.a && this.b == f21Var.b && this.e == f21Var.e && s90.a(this.c, f21Var.c) && s90.a(this.d, f21Var.d)) {
                float[] fArr = f21Var.f;
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    if (fArr == null) {
                        equals = true;
                        return equals && this.g == f21Var.g;
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
        int e = qy0.e(this.d, qy0.e(this.c, qy0.e(this.e, qy0.e(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
        float[] fArr = this.f;
        return this.g.hashCode() + ((e + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
