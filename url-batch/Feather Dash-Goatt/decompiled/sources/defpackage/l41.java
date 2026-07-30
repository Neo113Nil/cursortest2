package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class l41 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        xa0.c(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public l41(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l41)) {
            return false;
        }
        l41 l41Var = (l41) obj;
        return Float.compare(this.a, l41Var.a) == 0 && Float.compare(this.b, l41Var.b) == 0 && Float.compare(this.c, l41Var.c) == 0 && Float.compare(this.d, l41Var.d) == 0 && mo.o(this.e, l41Var.e) && mo.o(this.f, l41Var.f) && mo.o(this.g, l41Var.g) && mo.o(this.h, l41Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + qy0.e(this.g, qy0.e(this.f, qy0.e(this.e, qy0.b(this.d, qy0.b(this.c, qy0.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String str = la0.X(this.a) + ", " + la0.X(this.b) + ", " + la0.X(this.c) + ", " + la0.X(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean o = mo.o(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!o || !mo.o(j2, j3) || !mo.o(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) mo.I(j)) + ", topRight=" + ((Object) mo.I(j2)) + ", bottomRight=" + ((Object) mo.I(j3)) + ", bottomLeft=" + ((Object) mo.I(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + la0.X(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + la0.X(Float.intBitsToFloat(i)) + ", y=" + la0.X(Float.intBitsToFloat(i2)) + ')';
    }
}
