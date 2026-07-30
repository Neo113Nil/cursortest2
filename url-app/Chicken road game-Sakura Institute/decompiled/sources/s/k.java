package s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k implements q1.f {

    /* renamed from: e, reason: collision with root package name */
    public static final i f8029e = new i();

    /* renamed from: a, reason: collision with root package name */
    public final r.d f8030a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.i f8031b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.k f8032c;

    /* renamed from: d, reason: collision with root package name */
    public final o.j0 f8033d;

    public k(r.d dVar, l1.i iVar, m2.k kVar, o.j0 j0Var) {
        this.f8030a = dVar;
        this.f8031b = iVar;
        this.f8032c = kVar;
        this.f8033d = j0Var;
    }

    @Override // q1.f
    public final q1.h getKey() {
        return p1.f.f7042a;
    }

    public final boolean l(h hVar, int i7) {
        o.j0 j0Var = this.f8033d;
        if (i7 == 5 || i7 == 6) {
            if (j0Var == o.j0.f6658g) {
                return false;
            }
        } else if (i7 == 3 || i7 == 4) {
            if (j0Var == o.j0.f6657f) {
                return false;
            }
        } else if (i7 != 1 && i7 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (m(i7)) {
            if (hVar.f8011b >= this.f8030a.f7596a.g().f7641m - 1) {
                return false;
            }
        } else if (hVar.f8010a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean m(int i7) {
        if (i7 == 1) {
            return false;
        }
        if (i7 != 2) {
            if (i7 != 5) {
                if (i7 != 6) {
                    m2.k kVar = this.f8032c;
                    if (i7 == 3) {
                        int ordinal = kVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new b4.c();
                            }
                        }
                    } else {
                        if (i7 != 4) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                        }
                        int ordinal2 = kVar.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new b4.c();
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // q1.f
    public final Object getValue() {
        return this;
    }
}
