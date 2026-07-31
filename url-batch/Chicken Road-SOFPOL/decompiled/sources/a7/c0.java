package a7;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c0 extends h7.i {

    /* renamed from: f, reason: collision with root package name */
    public int f247f;

    public c0(int i) {
        super(0L, false);
        this.f247f = i;
    }

    public abstract g6.c c();

    public Throwable d(Object obj) {
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar != null) {
            return oVar.f286a;
        }
        return null;
    }

    public final void h(Throwable th) {
        x.j(c().f(), new w("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r4 = (a7.s0) r5.l(a7.r.f297e);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            g6.c c8 = c();
            q6.i.c(c8, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            f7.f fVar = (f7.f) c8;
            i6.c cVar = fVar.f2774h;
            Object obj = fVar.f2775j;
            g6.h f6 = cVar.f();
            Object l3 = f7.a.l(f6, obj);
            s0 s0Var = null;
            q1 t3 = l3 != f7.a.f2763d ? x.t(cVar, f6, l3) : null;
            try {
                g6.h f8 = cVar.f();
                Object i = i();
                Throwable d8 = d(i);
                if (d8 == null) {
                    int i8 = this.f247f;
                    boolean z3 = true;
                    if (i8 != 1 && i8 != 2) {
                        z3 = false;
                    }
                }
                if (s0Var != null && !s0Var.b()) {
                    CancellationException p7 = s0Var.p();
                    b(p7);
                    cVar.k(s6.a.l(p7));
                } else if (d8 != null) {
                    cVar.k(s6.a.l(d8));
                } else {
                    cVar.k(g(i));
                }
                if (t3 != null && !t3.i0()) {
                    return;
                }
                f7.a.g(f6, l3);
            } catch (Throwable th) {
                if (t3 == null || t3.i0()) {
                    f7.a.g(f6, l3);
                }
                throw th;
            }
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
