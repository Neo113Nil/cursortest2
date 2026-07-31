package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p extends y0.l implements v1.e, w1.v {

    /* renamed from: u, reason: collision with root package name */
    public static final n f127u = new n();

    /* renamed from: r, reason: collision with root package name */
    public z.e f128r;

    /* renamed from: s, reason: collision with root package name */
    public l f129s;

    /* renamed from: t, reason: collision with root package name */
    public u.j0 f130t;

    @Override // w1.v
    public final u1.f0 e(w1.n0 n0Var, u1.d0 d0Var, long j7) {
        u1.l0 e8 = d0Var.e(j7);
        return n0Var.e0(e8.f7230d, e8.f7231e, d6.v.f2327d, new m(e8, 0));
    }

    @Override // v1.e
    public final r2.r g() {
        v1.h hVar = new v1.h(u1.g.f7218a);
        hVar.f7458b.setValue(this);
        return hVar;
    }

    public final boolean r0(k kVar, int i) {
        if (i == 5 || i == 6) {
            if (this.f130t == u.j0.f7028e) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.f130t == u.j0.f7027d) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (s0(i)) {
            if (kVar.f108b >= this.f128r.f9014a.g().f9052n - 1) {
                return false;
            }
        } else if (kVar.f107a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean s0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int ordinal = w1.f.u(this).f7660z.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            throw new a5.c();
        }
        if (i != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int ordinal2 = w1.f.u(this).f7660z.ordinal();
        if (ordinal2 == 0) {
            return true;
        }
        if (ordinal2 == 1) {
            return false;
        }
        throw new a5.c();
    }
}
