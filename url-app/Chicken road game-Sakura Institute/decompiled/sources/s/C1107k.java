package s;

import l0.C0810h;
import o.N;
import p0.AbstractC0960V;
import p0.AbstractC0970f;
import q0.C1055h;
import q0.InterfaceC1053f;
import y2.C1338m;

/* renamed from: s.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1107k implements InterfaceC1053f {

    /* renamed from: f, reason: collision with root package name */
    public static final C1105i f9938f = new C1105i();

    /* renamed from: a, reason: collision with root package name */
    public final r.e f9939a;

    /* renamed from: b, reason: collision with root package name */
    public final C0810h f9940b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9941c;

    /* renamed from: d, reason: collision with root package name */
    public final M0.k f9942d;

    /* renamed from: e, reason: collision with root package name */
    public final N f9943e;

    public C1107k(r.e eVar, C0810h c0810h, boolean z4, M0.k kVar, N n2) {
        this.f9939a = eVar;
        this.f9940b = c0810h;
        this.f9941c = z4;
        this.f9942d = kVar;
        this.f9943e = n2;
    }

    @Override // q0.InterfaceC1053f
    public final C1055h getKey() {
        return AbstractC0970f.f9039a;
    }

    @Override // q0.InterfaceC1053f
    public final Object getValue() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        if (r2 == o.N.f8665d) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r2 == o.N.f8666e) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(C1104h c1104h, int i2) {
        boolean z4;
        boolean f4 = AbstractC0960V.f(i2, 5) ? true : AbstractC0960V.f(i2, 6);
        N n2 = this.f9943e;
        if (!f4) {
            if (!(AbstractC0960V.f(i2, 3) ? true : AbstractC0960V.f(i2, 4))) {
                if (!(AbstractC0960V.f(i2, 1) ? true : AbstractC0960V.f(i2, 2))) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                }
            }
            z4 = false;
        }
        if (z4) {
            return false;
        }
        if (m(i2)) {
            if (c1104h.f9934b < this.f9939a.f9451a.g().f9514m - 1) {
                return true;
            }
        } else if (c1104h.f9933a > 0) {
            return true;
        }
        return false;
    }

    public final boolean m(int i2) {
        if (!AbstractC0960V.f(i2, 1)) {
            if (AbstractC0960V.f(i2, 2)) {
                return true;
            }
            boolean f4 = AbstractC0960V.f(i2, 5);
            boolean z4 = this.f9941c;
            if (!f4) {
                if (!AbstractC0960V.f(i2, 6)) {
                    boolean f5 = AbstractC0960V.f(i2, 3);
                    M0.k kVar = this.f9942d;
                    if (f5) {
                        int ordinal = kVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new C1338m();
                            }
                            if (!z4) {
                                return true;
                            }
                        }
                    } else {
                        if (!AbstractC0960V.f(i2, 4)) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                        }
                        int ordinal2 = kVar.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new C1338m();
                            }
                        } else if (!z4) {
                            return true;
                        }
                    }
                } else if (!z4) {
                    return true;
                }
            }
            return z4;
        }
        return false;
    }
}
