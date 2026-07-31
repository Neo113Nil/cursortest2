package k2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class D extends r2.i {

    /* renamed from: f, reason: collision with root package name */
    public int f5311f;

    public D(int i3) {
        super(0L, false);
        this.f5311f = i3;
    }

    public abstract P1.d c();

    public Throwable d(Object obj) {
        C0544p c0544p = obj instanceof C0544p ? (C0544p) obj : null;
        if (c0544p != null) {
            return c0544p.f5378a;
        }
        return null;
    }

    public final void f(Throwable th) {
        AbstractC0552y.l(c().getContext(), new X1.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            P1.d c3 = c();
            Z1.i.d(c3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            p2.f fVar = (p2.f) c3;
            R1.c cVar = fVar.f6775h;
            Object obj = fVar.f6777j;
            P1.i context = cVar.getContext();
            Object n3 = p2.a.n(context, obj);
            X x3 = null;
            u0 x4 = n3 != p2.a.f6764d ? AbstractC0552y.x(cVar, context, n3) : null;
            try {
                P1.i context2 = cVar.getContext();
                Object g3 = g();
                Throwable d3 = d(g3);
                if (d3 == null && AbstractC0552y.p(this.f5311f)) {
                    x3 = (X) context2.k(C0547t.f5390e);
                }
                if (x3 != null && !x3.b()) {
                    CancellationException m3 = x3.m();
                    b(m3);
                    cVar.resumeWith(I2.l.t(m3));
                } else if (d3 != null) {
                    cVar.resumeWith(I2.l.t(d3));
                } else {
                    cVar.resumeWith(e(g3));
                }
                if (x4 == null || x4.h0()) {
                    p2.a.i(context, n3);
                }
            } catch (Throwable th) {
                if (x4 == null || x4.h0()) {
                    p2.a.i(context, n3);
                }
                throw th;
            }
        } catch (Throwable th2) {
            f(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
