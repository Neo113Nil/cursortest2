package c7;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class f0 extends j7.i {

    /* renamed from: h, reason: collision with root package name */
    public int f1691h;

    public f0(int i7) {
        super(0L, false);
        this.f1691h = i7;
    }

    public abstract h6.d c();

    public Throwable d(Object obj) {
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null) {
            return pVar.f1725a;
        }
        return null;
    }

    public final void f(Throwable th) {
        a0.l(c().getContext(), new z("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r4 = (c7.x0) r5.u(c7.u.f1748g);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            h6.d c4 = c();
            r6.k.d(c4, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            h7.f fVar = (h7.f) c4;
            j6.c cVar = fVar.f4678j;
            Object obj = fVar.f4680l;
            h6.i context = cVar.getContext();
            Object l8 = h7.a.l(context, obj);
            x0 x0Var = null;
            u1 w4 = l8 != h7.a.f4667d ? a0.w(cVar, context, l8) : null;
            try {
                h6.i context2 = cVar.getContext();
                Object h3 = h();
                Throwable d8 = d(h3);
                if (d8 == null) {
                    int i7 = this.f1691h;
                    boolean z8 = true;
                    if (i7 != 1 && i7 != 2) {
                        z8 = false;
                    }
                }
                if (x0Var != null && !x0Var.b()) {
                    CancellationException w5 = x0Var.w();
                    b(w5);
                    cVar.resumeWith(d6.a.b(w5));
                } else if (d8 != null) {
                    cVar.resumeWith(d6.a.b(d8));
                } else {
                    cVar.resumeWith(e(h3));
                }
                if (w4 != null && !w4.g0()) {
                    return;
                }
                h7.a.g(context, l8);
            } catch (Throwable th) {
                if (w4 == null || w4.g0()) {
                    h7.a.g(context, l8);
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
