package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w72 {
    public static final w72 e = new w72(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public w72(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final long a() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long b() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final w72 c(w72 w72Var) {
        return new w72(Math.max(this.a, w72Var.a), Math.max(this.b, w72Var.b), Math.min(this.c, w72Var.c), Math.min(this.d, w72Var.d));
    }

    public final boolean d() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean e(w72 w72Var) {
        return (this.a < w72Var.c) & (w72Var.a < this.c) & (this.b < w72Var.d) & (w72Var.b < this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w72)) {
            return false;
        }
        w72 w72Var = (w72) obj;
        return Float.compare(this.a, w72Var.a) == 0 && Float.compare(this.b, w72Var.b) == 0 && Float.compare(this.c, w72Var.c) == 0 && Float.compare(this.d, w72Var.d) == 0;
    }

    public final w72 f(float f, float f2) {
        return new w72(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final w72 g(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new w72(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + q40.d(this.c, q40.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + tk3.i0(this.a) + ", " + tk3.i0(this.b) + ", " + tk3.i0(this.c) + ", " + tk3.i0(this.d) + ')';
    }
}
