package q2;

import d2.C0408a;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class D extends x2.i {

    /* renamed from: f, reason: collision with root package name */
    public int f7850f;

    public D(int i3) {
        super(0L, false);
        this.f7850f = i3;
    }

    public abstract V1.d c();

    public Throwable d(Object obj) {
        C0829p c0829p = obj instanceof C0829p ? (C0829p) obj : null;
        if (c0829p != null) {
            return c0829p.f7917a;
        }
        return null;
    }

    public final void f(Throwable th) {
        AbstractC0837y.m(c().t(), new C0408a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            V1.d c2 = c();
            f2.j.d(c2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            v2.f fVar = (v2.f) c2;
            X1.c cVar = fVar.f9796h;
            Object obj = fVar.f9798j;
            V1.i t3 = cVar.t();
            Object n3 = v2.a.n(t3, obj);
            X x3 = null;
            u0 y3 = n3 != v2.a.f9785d ? AbstractC0837y.y(cVar, t3, n3) : null;
            try {
                V1.i t4 = cVar.t();
                Object g3 = g();
                Throwable d3 = d(g3);
                if (d3 == null && AbstractC0837y.q(this.f7850f)) {
                    x3 = (X) t4.v(C0832t.f7929e);
                }
                if (x3 != null && !x3.b()) {
                    CancellationException g4 = x3.g();
                    b(g4);
                    cVar.u(R1.a.b(g4));
                } else if (d3 != null) {
                    cVar.u(R1.a.b(d3));
                } else {
                    cVar.u(e(g3));
                }
                if (y3 == null || y3.l0()) {
                    v2.a.i(t3, n3);
                }
            } catch (Throwable th) {
                if (y3 == null || y3.l0()) {
                    v2.a.i(t3, n3);
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
