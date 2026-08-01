package o1;

import java.util.concurrent.CancellationException;

/* renamed from: o1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0304x extends u1.h {

    /* renamed from: c, reason: collision with root package name */
    public int f3368c;

    public AbstractC0304x(int i) {
        super(0L, u1.k.f3777g);
        this.f3368c = i;
    }

    public abstract void a(Object obj, CancellationException cancellationException);

    public abstract X0.d c();

    public Throwable d(Object obj) {
        C0291j c0291j = obj instanceof C0291j ? (C0291j) obj : null;
        if (c0291j != null) {
            return c0291j.f3348a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            T.d.g(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        g1.f.b(th);
        AbstractC0299s.e(c().h(), new r("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = U0.i.f864a;
        u1.i iVar = this.f3769b;
        try {
            X0.d c2 = c();
            g1.f.c(c2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            s1.f fVar = (s1.f) c2;
            Z0.e eVar = fVar.f3647e;
            Object obj2 = fVar.f3649g;
            X0.i iVar2 = eVar.f1173b;
            g1.f.b(iVar2);
            Object g2 = s1.a.g(iVar2, obj2);
            e0 l2 = g2 != s1.a.f3642e ? AbstractC0299s.l(eVar, iVar2, g2) : null;
            try {
                X0.i iVar3 = eVar.f1173b;
                g1.f.b(iVar3);
                Object i = i();
                Throwable d = d(i);
                M m2 = (d == null && AbstractC0299s.g(this.f3368c)) ? (M) iVar3.j(C0297p.f3358b) : null;
                if (m2 != null && !m2.a()) {
                    CancellationException s2 = ((U) m2).s();
                    a(i, s2);
                    eVar.b(T.d.p(s2));
                } else if (d != null) {
                    eVar.b(T.d.p(d));
                } else {
                    eVar.b(f(i));
                }
                if (l2 == null || l2.J()) {
                    s1.a.b(iVar2, g2);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = T.d.p(th);
                }
                g(null, U0.f.a(obj));
            } catch (Throwable th2) {
                if (l2 == null || l2.J()) {
                    s1.a.b(iVar2, g2);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = T.d.p(th4);
            }
            g(th3, U0.f.a(obj));
        }
    }
}
