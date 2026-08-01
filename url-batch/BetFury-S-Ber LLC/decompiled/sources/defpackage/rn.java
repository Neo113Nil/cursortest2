package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class rn {
    public final n70 a;
    public final tn b;
    public final sn c;
    public boolean d;
    public final q70 e;

    public rn(n70 n70Var, tn tnVar, sn snVar) {
        tnVar.getClass();
        this.a = n70Var;
        this.b = tnVar;
        this.c = snVar;
        this.e = snVar.g();
    }

    public final u90 a(boolean z) {
        try {
            u90 f = this.c.f(z);
            if (f == null) {
                return f;
            }
            f.m = this;
            return f;
        } catch (IOException e) {
            b(e);
            throw e;
        }
    }

    public final void b(IOException iOException) {
        this.d = true;
        this.b.b(iOException);
        q70 g = this.c.g();
        n70 n70Var = this.a;
        synchronized (g) {
            try {
                if (!(iOException instanceof lf0)) {
                    if (!(g.g != null) || (iOException instanceof le)) {
                        g.j = true;
                        if (g.m == 0) {
                            q70.d(n70Var.f, g.b, iOException);
                            g.l++;
                        }
                    }
                } else if (((lf0) iOException).f == kn.REFUSED_STREAM) {
                    int i = g.n + 1;
                    g.n = i;
                    if (i > 1) {
                        g.j = true;
                        g.l++;
                    }
                } else if (((lf0) iOException).f != kn.CANCEL || !n70Var.r) {
                    g.j = true;
                    g.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
