package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends s0.n implements r1.v, r1.k {
    public boolean A;

    /* renamed from: s, reason: collision with root package name */
    public j0 f6635s;

    /* renamed from: t, reason: collision with root package name */
    public final f1 f6636t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6637u;

    /* renamed from: w, reason: collision with root package name */
    public p1.p f6639w;

    /* renamed from: x, reason: collision with root package name */
    public y0.d f6640x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6641y;

    /* renamed from: v, reason: collision with root package name */
    public final l1.i f6638v = new l1.i(1);

    /* renamed from: z, reason: collision with root package name */
    public long f6642z = 0;

    public i(j0 j0Var, f1 f1Var, boolean z8) {
        this.f6635s = j0Var;
        this.f6636t = f1Var;
        this.f6637u = z8;
    }

    public static final float A0(i iVar, d dVar) {
        y0.d dVar2;
        int compare;
        if (m2.j.a(iVar.f6642z, 0L)) {
            return 0.0f;
        }
        i0.d dVar3 = iVar.f6638v.f5811a;
        int i7 = dVar3.f4842h;
        if (i7 > 0) {
            int i8 = i7 - 1;
            Object[] objArr = dVar3.f4840f;
            dVar2 = null;
            while (true) {
                y0.d dVar4 = (y0.d) ((h) objArr[i8]).f6627a.a();
                if (dVar4 != null) {
                    long a3 = v0.d.a(dVar4.c(), dVar4.b());
                    long o02 = j1.c.o0(iVar.f6642z);
                    int ordinal = iVar.f6635s.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(y0.f.b(a3), y0.f.b(o02));
                    } else {
                        if (ordinal != 1) {
                            throw new b4.c();
                        }
                        compare = Float.compare(y0.f.d(a3), y0.f.d(o02));
                    }
                    if (compare <= 0) {
                        dVar2 = dVar4;
                    } else if (dVar2 == null) {
                        dVar2 = dVar4;
                    }
                }
                i8--;
                if (i8 < 0) {
                    break;
                }
            }
        } else {
            dVar2 = null;
        }
        if (dVar2 == null) {
            y0.d B0 = iVar.f6641y ? iVar.B0() : null;
            if (B0 == null) {
                return 0.0f;
            }
            dVar2 = B0;
        }
        long o03 = j1.c.o0(iVar.f6642z);
        int ordinal2 = iVar.f6635s.ordinal();
        if (ordinal2 == 0) {
            float f9 = dVar2.f9781b;
            return dVar.a(f9, dVar2.f9783d - f9, y0.f.b(o03));
        }
        if (ordinal2 != 1) {
            throw new b4.c();
        }
        float f10 = dVar2.f9780a;
        return dVar.a(f10, dVar2.f9782c - f10, y0.f.d(o03));
    }

    public final y0.d B0() {
        if (this.f8116r) {
            r1.a1 s5 = r1.f.s(this);
            p1.p pVar = this.f6639w;
            if (pVar != null) {
                if (!pVar.O()) {
                    pVar = null;
                }
                if (pVar != null) {
                    return s5.h(pVar, false);
                }
            }
        }
        return null;
    }

    public final boolean C0(y0.d dVar, long j8) {
        long E0 = E0(dVar, j8);
        return Math.abs(y0.c.d(E0)) <= 0.5f && Math.abs(y0.c.e(E0)) <= 0.5f;
    }

    public final void D0() {
        d dVar = (d) r1.f.i(this, g.f6619a);
        if (this.A) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        t1 t1Var = new t1(dVar.b());
        c7.a0.p(o0(), null, c7.y.f1759i, new androidx.lifecycle.g0(this, t1Var, dVar, (h6.d) null, 8), 1);
    }

    public final long E0(y0.d dVar, long j8) {
        long o02 = j1.c.o0(j8);
        int ordinal = this.f6635s.ordinal();
        if (ordinal == 0) {
            d dVar2 = (d) r1.f.i(this, g.f6619a);
            float f9 = dVar.f9781b;
            return u3.r.a(0.0f, dVar2.a(f9, dVar.f9783d - f9, y0.f.b(o02)));
        }
        if (ordinal != 1) {
            throw new b4.c();
        }
        d dVar3 = (d) r1.f.i(this, g.f6619a);
        float f10 = dVar.f9780a;
        return u3.r.a(dVar3.a(f10, dVar.f9782c - f10, y0.f.d(o02)), 0.0f);
    }

    @Override // s0.n
    public final boolean p0() {
        return false;
    }

    @Override // r1.v
    public final void u(long j8) {
        int g9;
        y0.d B0;
        long j9 = this.f6642z;
        this.f6642z = j8;
        int ordinal = this.f6635s.ordinal();
        if (ordinal == 0) {
            g9 = r6.k.g((int) (j8 & 4294967295L), (int) (4294967295L & j9));
        } else {
            if (ordinal != 1) {
                throw new b4.c();
            }
            g9 = r6.k.g((int) (j8 >> 32), (int) (j9 >> 32));
        }
        if (g9 < 0 && (B0 = B0()) != null) {
            y0.d dVar = this.f6640x;
            if (dVar == null) {
                dVar = B0;
            }
            if (!this.A && !this.f6641y && C0(dVar, j9) && !C0(B0, j8)) {
                this.f6641y = true;
                D0();
            }
            this.f6640x = B0;
        }
    }
}
