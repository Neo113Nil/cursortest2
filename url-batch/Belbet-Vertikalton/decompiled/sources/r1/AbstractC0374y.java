package r1;

import a.AbstractC0058a;
import c1.AbstractC0106c;
import java.util.concurrent.CancellationException;

/* renamed from: r1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0374y extends y1.h {

    /* renamed from: c, reason: collision with root package name */
    public int f4099c;

    public AbstractC0374y(int i) {
        super(0L, y1.k.f4760g);
        this.f4099c = i;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract a1.d c();

    public Throwable d(Object obj) {
        C0361k c0361k = obj instanceof C0361k ? (C0361k) obj : null;
        if (c0361k != null) {
            return c0361k.f4079a;
        }
        return null;
    }

    public Object e(Object obj) {
        return obj;
    }

    public final void f(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0058a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        j1.h.b(th);
        AbstractC0369t.e(c().getContext(), new C0368s("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = W0.i.f1345a;
        y1.i iVar = this.f4752b;
        try {
            a1.d c2 = c();
            j1.h.c(c2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            w1.g gVar = (w1.g) c2;
            AbstractC0106c abstractC0106c = gVar.e;
            Object obj2 = gVar.f4476g;
            a1.i context = abstractC0106c.getContext();
            Object m2 = w1.a.m(context, obj2);
            f0 l2 = m2 != w1.a.f4466f ? AbstractC0369t.l(abstractC0106c, context, m2) : null;
            try {
                a1.i context2 = abstractC0106c.getContext();
                Object g2 = g();
                Throwable d2 = d(g2);
                N n2 = (d2 == null && AbstractC0369t.g(this.f4099c)) ? (N) context2.d(C0367q.f4090b) : null;
                if (n2 != null && !n2.a()) {
                    CancellationException o2 = ((V) n2).o();
                    b(g2, o2);
                    abstractC0106c.resumeWith(H1.d.r(o2));
                } else if (d2 != null) {
                    abstractC0106c.resumeWith(H1.d.r(d2));
                } else {
                    abstractC0106c.resumeWith(e(g2));
                }
                if (l2 == null || l2.H()) {
                    w1.a.h(context, m2);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = H1.d.r(th);
                }
                f(null, W0.f.a(obj));
            } catch (Throwable th2) {
                if (l2 == null || l2.H()) {
                    w1.a.h(context, m2);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = H1.d.r(th4);
            }
            f(th3, W0.f.a(obj));
        }
    }
}
