package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f1 extends y0 {
    @Override // defpackage.y0
    public final boolean a(h1 h1Var, c1 c1Var, c1 c1Var2) {
        synchronized (h1Var) {
            try {
                if (h1Var.listeners != c1Var) {
                    return false;
                }
                h1Var.listeners = c1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.y0
    public final boolean b(h1 h1Var, Object obj, Object obj2) {
        synchronized (h1Var) {
            try {
                if (h1Var.value != obj) {
                    return false;
                }
                h1Var.value = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.y0
    public final boolean c(h1 h1Var, g1 g1Var, g1 g1Var2) {
        synchronized (h1Var) {
            try {
                if (h1Var.waiters != g1Var) {
                    return false;
                }
                h1Var.waiters = g1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.y0
    public final void d(g1 g1Var, g1 g1Var2) {
        g1Var.b = g1Var2;
    }

    @Override // defpackage.y0
    public final void e(g1 g1Var, Thread thread) {
        g1Var.a = thread;
    }
}
