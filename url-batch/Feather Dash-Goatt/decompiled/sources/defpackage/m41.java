package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class m41 implements u91 {
    public final in a;
    public final in b;
    public final in c;
    public final in d;

    public m41(in inVar, in inVar2, in inVar3, in inVar4) {
        this.a = inVar;
        this.b = inVar2;
        this.c = inVar3;
        this.d = inVar4;
    }

    @Override // defpackage.u91
    public final ka0 a(long j, vc0 vc0Var, nr nrVar) {
        float a = this.a.a(j, nrVar);
        float a2 = this.b.a(j, nrVar);
        float a3 = this.c.a(j, nrVar);
        float a4 = this.d.a(j, nrVar);
        float b = va1.b(j);
        float f = a + a4;
        if (f > b) {
            float f2 = b / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a2 + a3;
        if (f3 > b) {
            float f4 = b / f3;
            a2 *= f4;
            a3 *= f4;
        }
        if (a < 0.0f || a2 < 0.0f || a3 < 0.0f || a4 < 0.0f) {
            r80.a("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + a4 + ")!");
        }
        if (a + a2 + a3 + a4 == 0.0f) {
            return new ht0(t90.c(0L, j));
        }
        s11 c = t90.c(0L, j);
        vc0 vc0Var2 = vc0.d;
        float f5 = vc0Var == vc0Var2 ? a : a2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
        if (vc0Var == vc0Var2) {
            a = a2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        float f6 = vc0Var == vc0Var2 ? a3 : a4;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        if (vc0Var != vc0Var2) {
            a4 = a3;
        }
        return new it0(new l41(c.a, c.b, c.c, c.d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m41)) {
            return false;
        }
        m41 m41Var = (m41) obj;
        return this.a.equals(m41Var.a) && this.b.equals(m41Var.b) && this.c.equals(m41Var.c) && this.d.equals(m41Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
