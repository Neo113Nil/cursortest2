package k1;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class x extends q1.g {

    /* renamed from: d, reason: collision with root package name */
    public int f731d;

    public x(int i2) {
        super(0L, q1.i.f1123g);
        this.f731d = i2;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract v0.d e();

    public Throwable g(Object obj) {
        j jVar = obj instanceof j ? (j) obj : null;
        if (jVar != null) {
            return jVar.f689a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            a.a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        th.getClass();
        t.c(e().d(), new s("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r5 = (k1.q0) r5.j(k1.q.f713c);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = t0.g.f1178a;
        e0.c0 c0Var = this.f1115c;
        try {
            v0.d e2 = e();
            e2.getClass();
            p1.h hVar = (p1.h) e2;
            x0.b bVar = hVar.f1048f;
            Object obj2 = hVar.f1050h;
            v0.h hVar2 = bVar.f1231c;
            hVar2.getClass();
            Object k2 = p1.a.k(hVar2, obj2);
            if (k2 != p1.a.f1038f) {
                t.h(bVar, hVar2);
            }
            try {
                v0.h hVar3 = bVar.f1231c;
                hVar3.getClass();
                Object j2 = j();
                Throwable g2 = g(j2);
                if (g2 == null) {
                    int i2 = this.f731d;
                    boolean z2 = true;
                    if (i2 != 1 && i2 != 2) {
                        z2 = false;
                    }
                }
                q0 q0Var = null;
                if (q0Var != null && !q0Var.B()) {
                    CancellationException u = q0Var.u();
                    c(j2, u);
                    bVar.f(new t0.c(u));
                } else if (g2 != null) {
                    bVar.f(new t0.c(g2));
                } else {
                    bVar.f(h(j2));
                }
                p1.a.f(hVar2, k2);
                try {
                    c0Var.getClass();
                } catch (Throwable th) {
                    obj = new t0.c(th);
                }
                i(null, t0.d.a(obj));
            } catch (Throwable th2) {
                p1.a.f(hVar2, k2);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c0Var.getClass();
            } catch (Throwable th4) {
                obj = new t0.c(th4);
            }
            i(th3, t0.d.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
