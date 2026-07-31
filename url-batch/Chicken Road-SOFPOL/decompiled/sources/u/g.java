package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends y0.l implements w1.j, w1.u {

    /* renamed from: r, reason: collision with root package name */
    public j0 f6987r;

    /* renamed from: s, reason: collision with root package name */
    public final e1 f6988s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6989t;

    /* renamed from: v, reason: collision with root package name */
    public u1.p f6991v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6992w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6993x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6995z;

    /* renamed from: u, reason: collision with root package name */
    public final a0.l f6990u = new a0.l(1);

    /* renamed from: y, reason: collision with root package name */
    public long f6994y = 0;

    public g(j0 j0Var, e1 e1Var, boolean z3) {
        this.f6987r = j0Var;
        this.f6988s = e1Var;
        this.f6989t = z3;
    }

    public static final float r0(g gVar, c cVar) {
        e1.c cVar2;
        int compare;
        if (r2.k.a(gVar.f6994y, 0L)) {
            return 0.0f;
        }
        o0.e eVar = gVar.f6990u.f112a;
        int i = eVar.f5580f - 1;
        Object[] objArr = eVar.f5578d;
        if (i < objArr.length) {
            cVar2 = null;
            while (true) {
                if (i < 0) {
                    break;
                }
                e1.c cVar3 = (e1.c) ((f) objArr[i]).f6974a.b();
                if (cVar3 != null) {
                    long b8 = cVar3.b();
                    long R = m.a.R(gVar.f6994y);
                    int ordinal = gVar.f6987r.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Float.intBitsToFloat((int) (b8 & 4294967295L)), Float.intBitsToFloat((int) (R & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            throw new a5.c();
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (b8 >> 32)), Float.intBitsToFloat((int) (R >> 32)));
                    }
                    if (compare <= 0) {
                        cVar2 = cVar3;
                    } else if (cVar2 == null) {
                        cVar2 = cVar3;
                    }
                }
                i--;
            }
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            e1.c s02 = gVar.f6992w ? gVar.s0() : null;
            if (s02 == null) {
                return 0.0f;
            }
            cVar2 = s02;
        }
        long R2 = m.a.R(gVar.f6994y);
        int ordinal2 = gVar.f6987r.ordinal();
        if (ordinal2 == 0) {
            float f6 = cVar2.f2458b;
            return cVar.a(f6, cVar2.f2460d - f6, Float.intBitsToFloat((int) (R2 & 4294967295L)));
        }
        if (ordinal2 != 1) {
            throw new a5.c();
        }
        float f8 = cVar2.f2457a;
        return cVar.a(f8, cVar2.f2459c - f8, Float.intBitsToFloat((int) (R2 >> 32)));
    }

    @Override // y0.l
    public final boolean g0() {
        return false;
    }

    @Override // w1.u
    public final void o(long j7) {
        int f6;
        e1.c s02;
        long j8 = this.f6994y;
        this.f6994y = j7;
        int ordinal = this.f6987r.ordinal();
        if (ordinal == 0) {
            f6 = q6.i.f((int) (j7 & 4294967295L), (int) (4294967295L & j8));
        } else {
            if (ordinal != 1) {
                throw new a5.c();
            }
            f6 = q6.i.f((int) (j7 >> 32), (int) (j8 >> 32));
        }
        if (f6 >= 0 || this.f6995z || this.f6992w || (s02 = s0()) == null || !t0(s02, j8)) {
            return;
        }
        this.f6993x = true;
    }

    public final e1.c s0() {
        if (this.f8718q) {
            w1.d1 t3 = w1.f.t(this);
            u1.p pVar = this.f6991v;
            if (pVar != null) {
                if (!pVar.C()) {
                    pVar = null;
                }
                if (pVar != null) {
                    return t3.K(pVar, false);
                }
            }
        }
        return null;
    }

    public final boolean t0(e1.c cVar, long j7) {
        long v02 = v0(cVar, j7);
        return Math.abs(Float.intBitsToFloat((int) (v02 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (v02 & 4294967295L))) <= 0.5f;
    }

    public final void u0() {
        m0.b0 b0Var = e.f6955a;
        c cVar = (c) w1.f.i(this, b0Var);
        if (this.f6995z) {
            w.a.c("launchAnimation called when previous animation was running");
        }
        ((c) w1.f.i(this, b0Var)).getClass();
        c.f6945a.getClass();
        a7.x.n(f0(), null, new c2.a(this, new l1(b.f6932b), cVar, null, 6), 1);
    }

    public final long v0(e1.c cVar, long j7) {
        long floatToRawIntBits;
        long j8;
        long R = m.a.R(j7);
        int ordinal = this.f6987r.ordinal();
        if (ordinal == 0) {
            c cVar2 = (c) w1.f.i(this, e.f6955a);
            float f6 = cVar.f2458b;
            float a8 = cVar2.a(f6, cVar.f2460d - f6, Float.intBitsToFloat((int) (R & 4294967295L)));
            long floatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(a8);
            j8 = floatToRawIntBits2 << 32;
        } else {
            if (ordinal != 1) {
                throw new a5.c();
            }
            c cVar3 = (c) w1.f.i(this, e.f6955a);
            float f8 = cVar.f2457a;
            long floatToRawIntBits3 = Float.floatToRawIntBits(cVar3.a(f8, cVar.f2459c - f8, Float.intBitsToFloat((int) (R >> 32))));
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j8 = floatToRawIntBits3 << 32;
        }
        return j8 | (floatToRawIntBits & 4294967295L);
    }
}
