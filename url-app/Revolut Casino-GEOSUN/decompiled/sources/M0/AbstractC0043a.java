package M0;

import R0.AbstractC0068a;
import a.AbstractC0069a;
import u0.AbstractC0244d;
import u0.C0247g;

/* renamed from: M0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0043a extends Z implements w0.d, InterfaceC0062u {

    /* renamed from: g, reason: collision with root package name */
    public final w0.i f652g;

    public AbstractC0043a(w0.i iVar, boolean z2) {
        super(z2);
        F((P) iVar.f(C0061t.f687f));
        this.f652g = iVar.k(this);
    }

    @Override // M0.Z
    public final void E(M.c cVar) {
        AbstractC0063v.d(cVar, this.f652g);
    }

    @Override // M0.Z
    public final void M(Object obj) {
        if (!(obj instanceof C0056n)) {
            T(obj);
            return;
        }
        C0056n c0056n = (C0056n) obj;
        Throwable th = c0056n.f676a;
        c0056n.getClass();
        S(th, C0056n.f675b.get(c0056n) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(int i2, AbstractC0043a abstractC0043a, E0.p pVar) {
        int b2 = F.j.b(i2);
        if (b2 == 0) {
            AbstractC0069a.H(pVar, abstractC0043a, this);
            return;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                o.g.r(((y0.b) pVar).b(abstractC0043a, this)).resumeWith(C0247g.f3005a);
                return;
            }
            if (b2 != 3) {
                throw new M.c();
            }
            try {
                w0.i iVar = this.f652g;
                Object n2 = AbstractC0068a.n(iVar, null);
                try {
                    F0.s.a(2, pVar);
                    Object f2 = pVar.f(abstractC0043a, this);
                    if (f2 != x0.a.f3094e) {
                        resumeWith(f2);
                    }
                } finally {
                    AbstractC0068a.h(iVar, n2);
                }
            } catch (Throwable th) {
                resumeWith(o.g.f(th));
            }
        }
    }

    @Override // w0.d
    public final w0.i getContext() {
        return this.f652g;
    }

    @Override // M0.InterfaceC0062u
    public final w0.i m() {
        return this.f652g;
    }

    @Override // w0.d
    public final void resumeWith(Object obj) {
        Throwable a2 = AbstractC0244d.a(obj);
        if (a2 != null) {
            obj = new C0056n(a2, false);
        }
        Object J2 = J(obj);
        if (J2 == AbstractC0063v.f691d) {
            return;
        }
        p(J2);
    }

    @Override // M0.Z
    public final String t() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void T(Object obj) {
    }

    public void S(Throwable th, boolean z2) {
    }
}
