package m1;

import i1.t;
import i1.u;
import i1.v;
import java.io.IOException;
import p1.B;
import p1.C0284a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f3209a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3210b;

    /* renamed from: c, reason: collision with root package name */
    public final n1.d f3211c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3212e;

    public e(j jVar, f fVar, n1.d dVar) {
        X0.e.e(jVar, "call");
        X0.e.e(fVar, "finder");
        this.f3209a = jVar;
        this.f3210b = fVar;
        this.f3211c = dVar;
        this.f3212e = dVar.g();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f3209a;
        if (z3) {
            if (iOException != null) {
                X0.e.e(jVar, "call");
            } else {
                X0.e.e(jVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                X0.e.e(jVar, "call");
            } else {
                X0.e.e(jVar, "call");
            }
        }
        return jVar.g(this, z3, z2, iOException);
    }

    public final v b(u uVar) {
        n1.d dVar = this.f3211c;
        try {
            u.e(uVar, "Content-Type");
            long h = dVar.h(uVar);
            return new v(h, new v1.o(new d(this, dVar.f(uVar), h)), 1);
        } catch (IOException e2) {
            X0.e.e(this.f3209a, "call");
            d(e2);
            throw e2;
        }
    }

    public final t c(boolean z2) {
        try {
            t e2 = this.f3211c.e(z2);
            if (e2 != null) {
                e2.f2517m = this;
            }
            return e2;
        } catch (IOException e3) {
            X0.e.e(this.f3209a, "call");
            d(e3);
            throw e3;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f3210b.c(iOException);
        m g2 = this.f3211c.g();
        j jVar = this.f3209a;
        synchronized (g2) {
            try {
                X0.e.e(jVar, "call");
                if (!(iOException instanceof B)) {
                    if (!(g2.f3243g != null) || (iOException instanceof C0284a)) {
                        g2.f3244j = true;
                        if (g2.f3247m == 0) {
                            m.d(jVar.f3224a, g2.f3239b, iOException);
                            g2.f3246l++;
                        }
                    }
                } else if (((B) iOException).f3397a == 8) {
                    int i = g2.f3248n + 1;
                    g2.f3248n = i;
                    if (i > 1) {
                        g2.f3244j = true;
                        g2.f3246l++;
                    }
                } else if (((B) iOException).f3397a != 9 || !jVar.f3233m) {
                    g2.f3244j = true;
                    g2.f3246l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
