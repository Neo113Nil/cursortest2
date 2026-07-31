package t;

import n0.C0710h;
import p.P;
import r0.AbstractC0898U;
import r0.AbstractC0909f;
import s.C0936e;
import s0.C0962h;
import s0.InterfaceC0960f;

/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0984l implements InterfaceC0960f {

    /* renamed from: f, reason: collision with root package name */
    public static final C0982j f8486f = new C0982j();

    /* renamed from: a, reason: collision with root package name */
    public final C0936e f8487a;

    /* renamed from: b, reason: collision with root package name */
    public final C0710h f8488b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8489c;

    /* renamed from: d, reason: collision with root package name */
    public final O0.k f8490d;

    /* renamed from: e, reason: collision with root package name */
    public final P f8491e;

    public C0984l(C0936e c0936e, C0710h c0710h, boolean z3, O0.k kVar, P p3) {
        this.f8487a = c0936e;
        this.f8488b = c0710h;
        this.f8489c = z3;
        this.f8490d = kVar;
        this.f8491e = p3;
    }

    @Override // s0.InterfaceC0960f
    public final C0962h getKey() {
        return AbstractC0909f.f8155a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        if (r2 == p.P.f7567d) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r2 == p.P.f7568e) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(C0981i c0981i, int i3) {
        boolean z3;
        boolean f3 = AbstractC0898U.f(i3, 5) ? true : AbstractC0898U.f(i3, 6);
        P p3 = this.f8491e;
        if (!f3) {
            if (!(AbstractC0898U.f(i3, 3) ? true : AbstractC0898U.f(i3, 4))) {
                if (!(AbstractC0898U.f(i3, 1) ? true : AbstractC0898U.f(i3, 2))) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                }
            }
            z3 = false;
        }
        if (z3) {
            return false;
        }
        if (m(i3)) {
            if (c0981i.f8482b < this.f8487a.f8227a.g().f8280m - 1) {
                return true;
            }
        } else if (c0981i.f8481a > 0) {
            return true;
        }
        return false;
    }

    public final boolean m(int i3) {
        if (!AbstractC0898U.f(i3, 1)) {
            if (AbstractC0898U.f(i3, 2)) {
                return true;
            }
            boolean f3 = AbstractC0898U.f(i3, 5);
            boolean z3 = this.f8489c;
            if (!f3) {
                if (!AbstractC0898U.f(i3, 6)) {
                    boolean f4 = AbstractC0898U.f(i3, 3);
                    O0.k kVar = this.f8490d;
                    if (f4) {
                        int ordinal = kVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new C1.c();
                            }
                            if (!z3) {
                                return true;
                            }
                        }
                    } else {
                        if (!AbstractC0898U.f(i3, 4)) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                        }
                        int ordinal2 = kVar.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new C1.c();
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

    @Override // s0.InterfaceC0960f
    public final Object getValue() {
        return this;
    }
}
