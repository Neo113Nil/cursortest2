package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class gk extends hh0 {
    public int h;

    public gk(int i) {
        super(0L, false);
        this.h = i;
    }

    public abstract dg g();

    public Throwable h(Object obj) {
        ld ldVar = obj instanceof ld ? (ld) obj : null;
        if (ldVar != null) {
            return ldVar.a;
        }
        return null;
    }

    public final void l(Throwable th) {
        n9.x(g().d(), new fh("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object m();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.mw) r2.w(defpackage.sl.k);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            dg g = g();
            g.getClass();
            ek ekVar = (ek) g;
            eg egVar = ekVar.j;
            qg qgVar = egVar.g;
            Object obj = ekVar.l;
            qgVar.getClass();
            Object U = gk0.U(qgVar, obj);
            mw mwVar = null;
            qk0 c0 = U != gk0.o ? d50.c0(egVar, qgVar, U) : null;
            try {
                qgVar.getClass();
                Object m = m();
                Throwable h = h(m);
                if (h == null) {
                    int i = this.h;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (mwVar != null && !mwVar.C()) {
                    CancellationException s = mwVar.s();
                    b(s);
                    egVar.e(new z90(s));
                } else if (h != null) {
                    egVar.e(new z90(h));
                } else {
                    egVar.e(i(m));
                }
                if (c0 != null && !c0.S()) {
                    return;
                }
                gk0.J(qgVar, U);
            } catch (Throwable th) {
                if (c0 == null || c0.S()) {
                    gk0.J(qgVar, U);
                }
                throw th;
            }
        } catch (Throwable th2) {
            l(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object i(Object obj) {
        return obj;
    }
}
