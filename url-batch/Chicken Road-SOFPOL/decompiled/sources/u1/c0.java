package u1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c0 implements p {

    /* renamed from: d, reason: collision with root package name */
    public final w1.o0 f7198d;

    public c0(w1.o0 o0Var) {
        this.f7198d = o0Var;
    }

    @Override // u1.p
    public final boolean C() {
        return this.f7198d.f7737r.E0().f8718q;
    }

    @Override // u1.p
    public final long F(p pVar, long j7) {
        return b(pVar, j7);
    }

    @Override // u1.p
    public final long G() {
        w1.o0 o0Var = this.f7198d;
        return (o0Var.f7230d << 32) | (o0Var.f7231e & 4294967295L);
    }

    @Override // u1.p
    public final e1.c K(p pVar, boolean z3) {
        return this.f7198d.f7737r.K(pVar, z3);
    }

    public final long a() {
        w1.o0 o0Var = this.f7198d;
        w1.o0 h8 = s0.h(o0Var);
        return e1.b.d(b(h8.f7740u, 0L), o0Var.f7737r.N0(h8.f7737r, 0L));
    }

    public final long b(p pVar, long j7) {
        boolean z3 = pVar instanceof c0;
        w1.o0 o0Var = this.f7198d;
        if (!z3) {
            w1.o0 h8 = s0.h(o0Var);
            w1.d1 d1Var = h8.f7737r;
            long b8 = b(h8.f7740u, j7);
            long j8 = h8.f7738s;
            long d8 = e1.b.d(b8, (4294967295L & Float.floatToRawIntBits((int) (j8 & 4294967295L))) | (Float.floatToRawIntBits((int) (j8 >> 32)) << 32));
            if (!d1Var.E0().f8718q) {
                t1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            d1Var.P0();
            w1.d1 d1Var2 = d1Var.f7616t;
            if (d1Var2 != null) {
                d1Var = d1Var2;
            }
            return e1.b.e(d8, d1Var.N0(pVar, 0L));
        }
        w1.o0 o0Var2 = ((c0) pVar).f7198d;
        w1.d1 d1Var3 = o0Var2.f7737r;
        d1Var3.P0();
        w1.o0 C0 = o0Var.f7737r.A0(d1Var3).C0();
        if (C0 != null) {
            long b9 = r2.i.b(r2.i.c(o0Var2.w0(C0, false), m.a.K(j7)), o0Var.w0(C0, false));
            return (Float.floatToRawIntBits((int) (b9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (b9 & 4294967295L)) & 4294967295L);
        }
        w1.o0 h9 = s0.h(o0Var2);
        long c8 = r2.i.c(r2.i.c(o0Var2.w0(h9, false), h9.f7738s), m.a.K(j7));
        w1.o0 h10 = s0.h(o0Var);
        long b10 = r2.i.b(c8, r2.i.c(o0Var.w0(h10, false), h10.f7738s));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (b10 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (b10 & 4294967295L)) & 4294967295L;
        w1.d1 d1Var4 = h10.f7737r.f7616t;
        q6.i.b(d1Var4);
        w1.d1 d1Var5 = h9.f7737r.f7616t;
        q6.i.b(d1Var5);
        return d1Var4.N0(d1Var5, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // u1.p
    public final long d(long j7) {
        return this.f7198d.f7737r.d(e1.b.e(0L, a()));
    }

    @Override // u1.p
    public final long f(long j7) {
        return this.f7198d.f7737r.f(e1.b.e(j7, a()));
    }

    @Override // u1.p
    public final p h() {
        w1.o0 C0;
        if (!C()) {
            t1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        w1.d1 d1Var = this.f7198d.f7737r.f7614r.F.f7598d.f7616t;
        if (d1Var == null || (C0 = d1Var.C0()) == null) {
            return null;
        }
        return C0.f7740u;
    }
}
