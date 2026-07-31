package u;

import r0.AbstractC0833f;

/* renamed from: u.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944l implements s0.f {

    /* renamed from: f, reason: collision with root package name */
    public static final C0942j f8074f = new C0942j();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0945m f8075a;

    /* renamed from: b, reason: collision with root package name */
    public final n0.f f8076b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8077c;

    /* renamed from: d, reason: collision with root package name */
    public final M0.j f8078d;

    /* renamed from: e, reason: collision with root package name */
    public final o.J f8079e;

    public C0944l(InterfaceC0945m interfaceC0945m, n0.f fVar, boolean z3, M0.j jVar, o.J j3) {
        this.f8075a = interfaceC0945m;
        this.f8076b = fVar;
        this.f8077c = z3;
        this.f8078d = jVar;
        this.f8079e = j3;
    }

    @Override // s0.f
    public final s0.h getKey() {
        return AbstractC0833f.f7143a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        if (r2 == o.J.f6443d) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r2 == o.J.f6444e) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(C0941i c0941i, int i3) {
        boolean z3;
        boolean f3 = r0.M.f(i3, 5) ? true : r0.M.f(i3, 6);
        o.J j3 = this.f8079e;
        if (!f3) {
            if (!(r0.M.f(i3, 3) ? true : r0.M.f(i3, 4))) {
                if (!(r0.M.f(i3, 1) ? true : r0.M.f(i3, 2))) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                }
            }
            z3 = false;
        }
        if (z3) {
            return false;
        }
        if (i(i3)) {
            if (c0941i.f8070b < this.f8075a.a() - 1) {
                return true;
            }
        } else if (c0941i.f8069a > 0) {
            return true;
        }
        return false;
    }

    public final boolean i(int i3) {
        if (!r0.M.f(i3, 1)) {
            if (r0.M.f(i3, 2)) {
                return true;
            }
            boolean f3 = r0.M.f(i3, 5);
            boolean z3 = this.f8077c;
            if (!f3) {
                if (!r0.M.f(i3, 6)) {
                    boolean f4 = r0.M.f(i3, 3);
                    M0.j jVar = this.f8078d;
                    if (f4) {
                        int ordinal = jVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new L1.f();
                            }
                            if (!z3) {
                                return true;
                            }
                        }
                    } else {
                        if (!r0.M.f(i3, 4)) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                        }
                        int ordinal2 = jVar.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new L1.f();
                            }
                        } else if (!z3) {
                            return true;
                        }
                    }
                } else if (!z3) {
                    return true;
                }
            }
            return z3;
        }
        return false;
    }

    @Override // s0.f
    public final Object getValue() {
        return this;
    }
}
