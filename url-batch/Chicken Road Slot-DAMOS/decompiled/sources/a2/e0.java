package a2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 implements n {

    /* renamed from: d, reason: collision with root package name */
    public final c2.p0 f80d;

    public e0(c2.p0 p0Var) {
        this.f80d = p0Var;
    }

    @Override // a2.n
    public final long F(n nVar, long j) {
        boolean z10 = nVar instanceof e0;
        c2.p0 p0Var = this.f80d;
        if (!z10) {
            c2.p0 i3 = q.i(p0Var);
            c2.i1 i1Var = i3.B;
            long F = F(i3.E, j);
            long j3 = i3.C;
            long c10 = j1.b.c(F, (4294967295L & Float.floatToRawIntBits((int) (j3 & 4294967295L))) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32));
            if (!i1Var.D0().B) {
                z1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            i1Var.M0();
            c2.i1 i1Var2 = i1Var.D;
            if (i1Var2 != null) {
                i1Var = i1Var2;
            }
            return j1.b.d(c10, i1Var.F(nVar, 0L));
        }
        c2.p0 p0Var2 = ((e0) nVar).f80d;
        c2.i1 i1Var3 = p0Var2.B;
        i1Var3.M0();
        c2.p0 B0 = p0Var.B.z0(i1Var3).B0();
        if (B0 != null) {
            long b10 = x2.i.b(x2.i.c(p0Var2.v0(B0, false), x3.j0.c(j)), p0Var.v0(B0, false));
            return (Float.floatToRawIntBits((int) (b10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (b10 & 4294967295L)) & 4294967295L);
        }
        c2.p0 i10 = q.i(p0Var2);
        long c11 = x2.i.c(x2.i.c(p0Var2.v0(i10, false), i10.C), x3.j0.c(j));
        c2.p0 i11 = q.i(p0Var);
        long b11 = x2.i.b(c11, x2.i.c(p0Var.v0(i11, false), i11.C));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (b11 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (b11 & 4294967295L)) & 4294967295L;
        c2.i1 i1Var4 = i11.B.D;
        i1Var4.getClass();
        c2.i1 i1Var5 = i10.B.D;
        i1Var5.getClass();
        return i1Var4.F(i1Var5, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // a2.n
    public final boolean G() {
        return this.f80d.B.D0().B;
    }

    @Override // a2.n
    public final long J() {
        c2.p0 p0Var = this.f80d;
        return (p0Var.f131d << 32) | (p0Var.f132e & 4294967295L);
    }

    @Override // a2.n
    public final long K(long j) {
        return this.f80d.B.K(j1.b.d(0L, a()));
    }

    @Override // a2.n
    public final long O(n nVar, long j) {
        return F(nVar, j);
    }

    public final long a() {
        c2.p0 p0Var = this.f80d;
        c2.p0 i3 = q.i(p0Var);
        return j1.b.c(F(i3.E, 0L), p0Var.B.F(i3.B, 0L));
    }

    @Override // a2.n
    public final long b(long j) {
        return this.f80d.B.b(j1.b.d(0L, a()));
    }

    @Override // a2.n
    public final long e(long j) {
        return this.f80d.B.e(j1.b.d(j, a()));
    }

    @Override // a2.n
    public final n k() {
        c2.p0 B0;
        if (!G()) {
            z1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        c2.i1 i1Var = ((c2.i1) this.f80d.B.B.S.f1494e).D;
        if (i1Var == null || (B0 = i1Var.B0()) == null) {
            return null;
        }
        return B0.E;
    }

    @Override // a2.n
    public final j1.c p(n nVar, boolean z10) {
        return this.f80d.B.p(nVar, z10);
    }
}
