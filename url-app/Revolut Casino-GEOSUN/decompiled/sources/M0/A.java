package M0;

import R0.AbstractC0068a;
import java.util.concurrent.CancellationException;
import u0.AbstractC0244d;
import u0.C0247g;

/* loaded from: classes.dex */
public abstract class A extends T0.h {

    /* renamed from: g, reason: collision with root package name */
    public int f615g;

    public A(int i2) {
        super(0L, T0.k.f984g);
        this.f615g = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract w0.d d();

    public Throwable f(Object obj) {
        C0056n c0056n = obj instanceof C0056n ? (C0056n) obj : null;
        if (c0056n != null) {
            return c0056n.f676a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            o.g.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        F0.i.b(th);
        AbstractC0063v.d(new D0.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().getContext());
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = C0247g.f3005a;
        T0.i iVar = this.f975f;
        try {
            w0.d d2 = d();
            F0.i.c(d2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            R0.h hVar = (R0.h) d2;
            y0.b bVar = hVar.f908i;
            Object obj2 = hVar.f910k;
            w0.i context = bVar.getContext();
            Object n2 = AbstractC0068a.n(context, obj2);
            j0 m2 = n2 != AbstractC0068a.f898f ? AbstractC0063v.m(bVar, context, n2) : null;
            try {
                w0.i context2 = bVar.getContext();
                Object k2 = k();
                Throwable f2 = f(k2);
                P p2 = (f2 == null && AbstractC0063v.f(this.f615g)) ? (P) context2.f(C0061t.f687f) : null;
                if (p2 != null && !p2.b()) {
                    CancellationException y2 = ((Z) p2).y();
                    b(k2, y2);
                    bVar.resumeWith(o.g.f(y2));
                } else if (f2 != null) {
                    bVar.resumeWith(o.g.f(f2));
                } else {
                    bVar.resumeWith(h(k2));
                }
                if (m2 == null || m2.V()) {
                    AbstractC0068a.h(context, n2);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = o.g.f(th);
                }
                i(null, AbstractC0244d.a(obj));
            } catch (Throwable th2) {
                if (m2 == null || m2.V()) {
                    AbstractC0068a.h(context, n2);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = o.g.f(th4);
            }
            i(th3, AbstractC0244d.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
