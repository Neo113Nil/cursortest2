package q1;

import java.io.IOException;
import m1.s;
import m1.t;
import m1.u;
import t1.B;
import t1.C0302a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f3511a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3512b;

    /* renamed from: c, reason: collision with root package name */
    public final r1.d f3513c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3514e;

    public e(j jVar, f fVar, r1.d dVar) {
        b1.d.e(jVar, "call");
        b1.d.e(fVar, "finder");
        this.f3511a = jVar;
        this.f3512b = fVar;
        this.f3513c = dVar;
        this.f3514e = dVar.g();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f3511a;
        if (z3) {
            if (iOException != null) {
                b1.d.e(jVar, "call");
            } else {
                b1.d.e(jVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                b1.d.e(jVar, "call");
            } else {
                b1.d.e(jVar, "call");
            }
        }
        return jVar.g(this, z3, z2, iOException);
    }

    public final u b(t tVar) {
        r1.d dVar = this.f3513c;
        try {
            String g2 = t.g("Content-Type", tVar);
            long h = dVar.h(tVar);
            return new u(g2, h, new z1.p(new d(this, dVar.f(tVar), h)), 1);
        } catch (IOException e2) {
            b1.d.e(this.f3511a, "call");
            d(e2);
            throw e2;
        }
    }

    public final s c(boolean z2) {
        try {
            s e2 = this.f3513c.e(z2);
            if (e2 != null) {
                e2.f3281m = this;
            }
            return e2;
        } catch (IOException e3) {
            b1.d.e(this.f3511a, "call");
            d(e3);
            throw e3;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f3512b.c(iOException);
        m g2 = this.f3513c.g();
        j jVar = this.f3511a;
        synchronized (g2) {
            try {
                b1.d.e(jVar, "call");
                if (!(iOException instanceof B)) {
                    if (!(g2.f3545g != null) || (iOException instanceof C0302a)) {
                        g2.f3546j = true;
                        if (g2.f3549m == 0) {
                            m.d(jVar.f3526a, g2.f3541b, iOException);
                            g2.f3548l++;
                        }
                    }
                } else if (((B) iOException).f3832a == 8) {
                    int i = g2.f3550n + 1;
                    g2.f3550n = i;
                    if (i > 1) {
                        g2.f3546j = true;
                        g2.f3548l++;
                    }
                } else if (((B) iOException).f3832a != 9 || !jVar.f3535m) {
                    g2.f3546j = true;
                    g2.f3548l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
