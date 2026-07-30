package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class js extends mg1 {
    public int g;

    public js(int i) {
        super(0L, false);
        this.g = i;
    }

    public abstract dn d();

    public Throwable e(Object obj) {
        hj hjVar = obj instanceof hj ? (hj) obj : null;
        if (hjVar != null) {
            return hjVar.a;
        }
        return null;
    }

    public final void h(Throwable th) {
        m90.z(new wn("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().g());
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.jb0) r5.d(defpackage.j41.m);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            dn d = d();
            d.getClass();
            hs hsVar = (hs) d;
            fn fnVar = hsVar.i;
            Object obj = hsVar.k;
            CoroutineContext g = fnVar.g();
            Object c = bi1.c(g, obj);
            jb0 jb0Var = null;
            zk1 c2 = c != bi1.a ? jn.c(fnVar, g, c) : null;
            try {
                CoroutineContext g2 = fnVar.g();
                Object i = i();
                Throwable e = e(i);
                if (e == null) {
                    int i2 = this.g;
                    boolean z = true;
                    if (i2 != 1 && i2 != 2) {
                        z = false;
                    }
                }
                if (jb0Var != null && !jb0Var.b()) {
                    CancellationException o = jb0Var.o();
                    b(o);
                    i31 i31Var = k31.d;
                    fnVar.l(ca0.g(o));
                } else if (e != null) {
                    i31 i31Var2 = k31.d;
                    fnVar.l(new j31(e));
                } else {
                    i31 i31Var3 = k31.d;
                    fnVar.l(f(i));
                }
                if (c2 != null && !c2.s0()) {
                    return;
                }
                bi1.a(g, c);
            } catch (Throwable th) {
                if (c2 == null || c2.s0()) {
                    bi1.a(g, c);
                }
                throw th;
            }
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
