package Y0;

import a.AbstractC0132a;
import d1.AbstractC0184a;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class A extends f1.h {

    /* renamed from: g, reason: collision with root package name */
    public int f1158g;

    public A(int i2) {
        super(0L, f1.k.f2214g);
        this.f1158g = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract H0.d d();

    public Throwable g(Object obj) {
        C0120n c0120n = obj instanceof C0120n ? (C0120n) obj : null;
        if (c0120n != null) {
            return c0120n.f1219a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0132a.c(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Q0.h.b(th);
        AbstractC0127v.d(d().f(), new O0.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = F0.h.f469a;
        f1.i iVar = this.f2205f;
        try {
            H0.d d2 = d();
            Q0.h.c(d2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            d1.h hVar = (d1.h) d2;
            J0.b bVar = hVar.f2077i;
            Object obj2 = hVar.f2079k;
            H0.i f2 = bVar.f();
            Object m2 = AbstractC0184a.m(f2, obj2);
            j0 m3 = m2 != AbstractC0184a.f2067f ? AbstractC0127v.m(bVar, f2, m2) : null;
            try {
                H0.i f3 = bVar.f();
                Object k2 = k();
                Throwable g2 = g(k2);
                P p2 = (g2 == null && AbstractC0127v.f(this.f1158g)) ? (P) f3.k(C0125t.f1230f) : null;
                if (p2 != null && !p2.b()) {
                    CancellationException A2 = ((Z) p2).A();
                    b(k2, A2);
                    bVar.j(i1.a.b(A2));
                } else if (g2 != null) {
                    bVar.j(i1.a.b(g2));
                } else {
                    bVar.j(h(k2));
                }
                if (m3 == null || m3.X()) {
                    AbstractC0184a.g(f2, m2);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = i1.a.b(th);
                }
                i(null, F0.e.a(obj));
            } catch (Throwable th2) {
                if (m3 == null || m3.X()) {
                    AbstractC0184a.g(f2, m2);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = i1.a.b(th4);
            }
            i(th3, F0.e.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
