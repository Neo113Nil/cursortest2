package k0;

import a.AbstractC0016a;
import java.util.concurrent.CancellationException;
import p0.AbstractC0084a;

/* renamed from: k0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0062x extends q0.h {

    /* renamed from: d, reason: collision with root package name */
    public int f949d;

    public AbstractC0062x(int i2) {
        super(0L, q0.j.f1224g);
        this.f949d = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract W.d c();

    public Throwable e(Object obj) {
        C0050k c0050k = obj instanceof C0050k ? (C0050k) obj : null;
        if (c0050k != null) {
            return c0050k.f925a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0016a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        e0.h.b(th);
        AbstractC0058t.c(c().i(), new C0057s("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = U.g.f433a;
        E.D d2 = this.f1216c;
        try {
            W.d c2 = c();
            e0.h.c(c2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            p0.h hVar = (p0.h) c2;
            Y.b bVar = hVar.f1149f;
            Object obj2 = hVar.f1151h;
            W.i iVar = bVar.f454c;
            e0.h.b(iVar);
            Object m2 = AbstractC0084a.m(iVar, obj2);
            if (m2 != AbstractC0084a.f1139f) {
                AbstractC0058t.i(bVar, iVar);
            }
            try {
                W.i iVar2 = bVar.f454c;
                e0.h.b(iVar2);
                Object j2 = j();
                Throwable e2 = e(j2);
                K k2 = (e2 == null && AbstractC0058t.e(this.f949d)) ? (K) iVar2.k(C0056q.f936c) : null;
                if (k2 != null && !k2.b()) {
                    CancellationException v2 = ((T) k2).v();
                    b(j2, v2);
                    bVar.d(AbstractC0016a.h(v2));
                } else if (e2 != null) {
                    bVar.d(AbstractC0016a.h(e2));
                } else {
                    bVar.d(f(j2));
                }
                AbstractC0084a.h(iVar, m2);
                try {
                    d2.getClass();
                } catch (Throwable th) {
                    obj = AbstractC0016a.h(th);
                }
                h(null, U.d.a(obj));
            } catch (Throwable th2) {
                AbstractC0084a.h(iVar, m2);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                d2.getClass();
            } catch (Throwable th4) {
                obj = AbstractC0016a.h(th4);
            }
            h(th3, U.d.a(obj));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
