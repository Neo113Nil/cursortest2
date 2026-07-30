package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yb2 implements fk2 {
    public final p40 a;
    public final p40 b;
    public final p40 c;
    public final p40 d;

    public yb2(p40 p40Var, p40 p40Var2, p40 p40Var3, p40 p40Var4) {
        this.a = p40Var;
        this.b = p40Var2;
        this.c = p40Var3;
        this.d = p40Var4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [p40] */
    /* JADX WARN: Type inference failed for: r3v2, types: [p40] */
    public static yb2 b(yb2 yb2Var, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, int i) {
        qc0 qc0Var4 = qc0Var;
        if ((i & 1) != 0) {
            qc0Var4 = yb2Var.a;
        }
        p40 p40Var = yb2Var.b;
        qc0 qc0Var5 = qc0Var2;
        if ((i & 4) != 0) {
            qc0Var5 = yb2Var.c;
        }
        yb2Var.getClass();
        return new yb2(qc0Var4, p40Var, qc0Var5, qc0Var3);
    }

    @Override // defpackage.fk2
    public final bx1 a(long j, u81 u81Var, ca0 ca0Var) {
        float a = this.a.a(j, ca0Var);
        float a2 = this.b.a(j, ca0Var);
        float a3 = this.c.a(j, ca0Var);
        float a4 = this.d.a(j, ca0Var);
        float c = ql2.c(j);
        float f = a + a4;
        if (f > c) {
            float f2 = c / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a2 + a3;
        if (f3 > c) {
            float f4 = c / f3;
            a2 *= f4;
            a3 *= f4;
        }
        if (a < 0.0f || a2 < 0.0f || a3 < 0.0f || a4 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + a4 + ")!").toString());
        }
        if (a + a2 + a3 + a4 == 0.0f) {
            return new zw1(tk3.p(0L, j));
        }
        w72 p = tk3.p(0L, j);
        u81 u81Var2 = u81.m;
        long m = tk3.m(u81Var == u81Var2 ? a : a2);
        if (u81Var == u81Var2) {
            a = a2;
        }
        long m2 = tk3.m(a);
        long m3 = tk3.m(u81Var == u81Var2 ? a3 : a4);
        if (u81Var != u81Var2) {
            a4 = a3;
        }
        return new ax1(new ub2(p.a, p.b, p.c, p.d, m, m2, m3, tk3.m(a4)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb2)) {
            return false;
        }
        yb2 yb2Var = (yb2) obj;
        return Intrinsics.b(this.a, yb2Var.a) && this.b.equals(yb2Var.b) && Intrinsics.b(this.c, yb2Var.c) && this.d.equals(yb2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
