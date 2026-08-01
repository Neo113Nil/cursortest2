package v1;

import java.io.IOException;
import r1.s;
import r1.t;
import r1.u;
import y1.A;
import y1.C0320a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f4031a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4032b;

    /* renamed from: c, reason: collision with root package name */
    public final w1.d f4033c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f4034e;

    public e(j jVar, f fVar, w1.d dVar) {
        g1.d.e(jVar, "call");
        g1.d.e(fVar, "finder");
        this.f4031a = jVar;
        this.f4032b = fVar;
        this.f4033c = dVar;
        this.f4034e = dVar.h();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f4031a;
        if (z3) {
            if (iOException != null) {
                g1.d.e(jVar, "call");
            } else {
                g1.d.e(jVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                g1.d.e(jVar, "call");
            } else {
                g1.d.e(jVar, "call");
            }
        }
        return jVar.g(this, z3, z2, iOException);
    }

    public final u b(t tVar) {
        w1.d dVar = this.f4033c;
        try {
            String g2 = t.g("Content-Type", tVar);
            long g3 = dVar.g(tVar);
            return new u(g2, g3, new E1.p(new d(this, dVar.b(tVar), g3)), 1);
        } catch (IOException e2) {
            g1.d.e(this.f4031a, "call");
            d(e2);
            throw e2;
        }
    }

    public final s c(boolean z2) {
        try {
            s f2 = this.f4033c.f(z2);
            if (f2 != null) {
                f2.f3528m = this;
            }
            return f2;
        } catch (IOException e2) {
            g1.d.e(this.f4031a, "call");
            d(e2);
            throw e2;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f4032b.c(iOException);
        m h = this.f4033c.h();
        j jVar = this.f4031a;
        synchronized (h) {
            try {
                g1.d.e(jVar, "call");
                if (!(iOException instanceof A)) {
                    if (!(h.f4065g != null) || (iOException instanceof C0320a)) {
                        h.f4066j = true;
                        if (h.f4069m == 0) {
                            m.d(jVar.f4046a, h.f4061b, iOException);
                            h.f4068l++;
                        }
                    }
                } else if (((A) iOException).f4224a == 8) {
                    int i = h.f4070n + 1;
                    h.f4070n = i;
                    if (i > 1) {
                        h.f4066j = true;
                        h.f4068l++;
                    }
                } else if (((A) iOException).f4224a != 9 || !jVar.f4055m) {
                    h.f4066j = true;
                    h.f4068l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
