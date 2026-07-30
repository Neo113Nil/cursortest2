package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class s11 {
    public static final s11 e = new s11(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public s11(float f, float f2, float f3, float f4) {
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

    public final s11 c(s11 s11Var) {
        return new s11(Math.max(this.a, s11Var.a), Math.max(this.b, s11Var.b), Math.min(this.c, s11Var.c), Math.min(this.d, s11Var.d));
    }

    public final s11 d(float f, float f2) {
        return new s11(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final s11 e(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new s11(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s11)) {
            return false;
        }
        s11 s11Var = (s11) obj;
        return Float.compare(this.a, s11Var.a) == 0 && Float.compare(this.b, s11Var.b) == 0 && Float.compare(this.c, s11Var.c) == 0 && Float.compare(this.d, s11Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + qy0.b(this.c, qy0.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + la0.X(this.a) + ", " + la0.X(this.b) + ", " + la0.X(this.c) + ", " + la0.X(this.d) + ')';
    }
}
