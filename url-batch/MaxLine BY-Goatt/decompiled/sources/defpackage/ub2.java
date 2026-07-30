package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ub2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        l41.l(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public ub2(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
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
        if (!(obj instanceof ub2)) {
            return false;
        }
        ub2 ub2Var = (ub2) obj;
        return Float.compare(this.a, ub2Var.a) == 0 && Float.compare(this.b, ub2Var.b) == 0 && Float.compare(this.c, ub2Var.c) == 0 && Float.compare(this.d, ub2Var.d) == 0 && bd3.q(this.e, ub2Var.e) && bd3.q(this.f, ub2Var.f) && bd3.q(this.g, ub2Var.g) && bd3.q(this.h, ub2Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + in1.h(in1.h(in1.h(q40.d(this.d, q40.d(this.c, q40.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = tk3.i0(this.a) + ", " + tk3.i0(this.b) + ", " + tk3.i0(this.c) + ", " + tk3.i0(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean q = bd3.q(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!q || !bd3.q(j2, j3) || !bd3.q(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) bd3.O(j)) + ", topRight=" + ((Object) bd3.O(j2)) + ", bottomRight=" + ((Object) bd3.O(j3)) + ", bottomLeft=" + ((Object) bd3.O(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + tk3.i0(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + tk3.i0(Float.intBitsToFloat(i)) + ", y=" + tk3.i0(Float.intBitsToFloat(i2)) + ')';
    }
}
