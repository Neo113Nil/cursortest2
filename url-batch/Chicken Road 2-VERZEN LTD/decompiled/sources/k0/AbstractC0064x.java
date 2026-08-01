package k0;

import java.util.concurrent.CancellationException;
import p0.AbstractC0090a;

/* renamed from: k0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0064x extends q0.h {

    /* renamed from: d, reason: collision with root package name */
    public int f896d;

    public AbstractC0064x(int i2) {
        super(0L, q0.j.f1224g);
        this.f896d = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract W.d c();

    public Throwable e(Object obj) {
        C0052k c0052k = obj instanceof C0052k ? (C0052k) obj : null;
        if (c0052k != null) {
            return c0052k.f872a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            a.a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        e0.h.b(th);
        AbstractC0060t.c(c().i(), new C0059s("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = U.g.f378a;
        D.G g2 = this.f1216c;
        try {
            W.d c2 = c();
            e0.h.c(c2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            p0.h hVar = (p0.h) c2;
            Y.b bVar = hVar.f1141f;
            Object obj2 = hVar.f1143h;
            W.i iVar = bVar.f399c;
            e0.h.b(iVar);
            Object m2 = AbstractC0090a.m(iVar, obj2);
            if (m2 != AbstractC0090a.f1131f) {
                AbstractC0060t.i(bVar, iVar);
            }
            try {
                W.i iVar2 = bVar.f399c;
                e0.h.b(iVar2);
                Object j2 = j();
                Throwable e2 = e(j2);
                K k2 = (e2 == null && AbstractC0060t.e(this.f896d)) ? (K) iVar2.k(C0058q.f883c) : null;
                if (k2 != null && !k2.b()) {
                    CancellationException v2 = ((T) k2).v();
                    b(j2, v2);
                    bVar.d(a.a.h(v2));
                } else if (e2 != null) {
                    bVar.d(a.a.h(e2));
                } else {
                    bVar.d(f(j2));
                }
                AbstractC0090a.h(iVar, m2);
                try {
                    g2.getClass();
                } catch (Throwable th) {
                    obj = a.a.h(th);
                }
                h(null, U.d.a(obj));
            } catch (Throwable th2) {
                AbstractC0090a.h(iVar, m2);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                g2.getClass();
            } catch (Throwable th4) {
                obj = a.a.h(th4);
            }
            h(th3, U.d.a(obj));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
