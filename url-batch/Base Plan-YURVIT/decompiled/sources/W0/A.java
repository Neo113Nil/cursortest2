package W0;

import a.AbstractC0086a;
import b1.AbstractC0115a;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class A extends d1.h {

    /* renamed from: g, reason: collision with root package name */
    public int f904g;

    public A(int i2) {
        super(0L, d1.k.f1844g);
        this.f904g = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract G0.d c();

    public Throwable h(Object obj) {
        C0074n c0074n = obj instanceof C0074n ? (C0074n) obj : null;
        if (c0074n != null) {
            return c0074n.f965a;
        }
        return null;
    }

    public final void j(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0086a.c(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        P0.h.b(th);
        AbstractC0081v.d(c().e(), new N0.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (W0.P) r7.m(W0.C0079t.f974f);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = D0.h.f206a;
        d1.i iVar = this.f1835f;
        try {
            G0.d c2 = c();
            P0.h.c(c2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            b1.h hVar = (b1.h) c2;
            I0.b bVar = hVar.f1750i;
            Object obj2 = hVar.f1752k;
            G0.i e2 = bVar.e();
            Object l2 = AbstractC0115a.l(e2, obj2);
            j0 l3 = l2 != AbstractC0115a.f1740f ? AbstractC0081v.l(bVar, e2, l2) : null;
            try {
                G0.i e3 = bVar.e();
                Object k2 = k();
                Throwable h2 = h(k2);
                if (h2 == null) {
                    int i2 = this.f904g;
                    boolean z2 = true;
                    if (i2 != 1 && i2 != 2) {
                        z2 = false;
                    }
                }
                P p2 = null;
                if (p2 != null && !p2.a()) {
                    CancellationException z3 = ((Z) p2).z();
                    b(k2, z3);
                    bVar.g(AbstractC0086a.l(z3));
                } else if (h2 != null) {
                    bVar.g(AbstractC0086a.l(h2));
                } else {
                    bVar.g(i(k2));
                }
                if (l3 == null || l3.W()) {
                    AbstractC0115a.f(e2, l2);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = AbstractC0086a.l(th);
                }
                j(null, D0.e.a(obj));
            } catch (Throwable th2) {
                if (l3 == null || l3.W()) {
                    AbstractC0115a.f(e2, l2);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = AbstractC0086a.l(th4);
            }
            j(th3, D0.e.a(obj));
        }
    }

    public Object i(Object obj) {
        return obj;
    }
}
