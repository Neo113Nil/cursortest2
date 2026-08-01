package t1;

import java.io.IOException;
import p1.s;
import p1.t;
import p1.u;
import w1.A;
import w1.C0333a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f3744a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3745b;

    /* renamed from: c, reason: collision with root package name */
    public final u1.d f3746c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3747e;

    public e(j jVar, f fVar, u1.d dVar) {
        e1.d.e(jVar, "call");
        e1.d.e(fVar, "finder");
        this.f3744a = jVar;
        this.f3745b = fVar;
        this.f3746c = dVar;
        this.f3747e = dVar.h();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f3744a;
        if (z3) {
            if (iOException != null) {
                e1.d.e(jVar, "call");
            } else {
                e1.d.e(jVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                e1.d.e(jVar, "call");
            } else {
                e1.d.e(jVar, "call");
            }
        }
        return jVar.g(this, z3, z2, iOException);
    }

    public final u b(t tVar) {
        u1.d dVar = this.f3746c;
        try {
            String g2 = t.g("Content-Type", tVar);
            long f2 = dVar.f(tVar);
            return new u(g2, f2, new C1.p(new d(this, dVar.g(tVar), f2)), 1);
        } catch (IOException e2) {
            e1.d.e(this.f3744a, "call");
            d(e2);
            throw e2;
        }
    }

    public final s c(boolean z2) {
        try {
            s e2 = this.f3746c.e(z2);
            if (e2 != null) {
                e2.f3428m = this;
            }
            return e2;
        } catch (IOException e3) {
            e1.d.e(this.f3744a, "call");
            d(e3);
            throw e3;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f3745b.c(iOException);
        m h = this.f3746c.h();
        j jVar = this.f3744a;
        synchronized (h) {
            try {
                e1.d.e(jVar, "call");
                if (!(iOException instanceof A)) {
                    if (!(h.f3778g != null) || (iOException instanceof C0333a)) {
                        h.f3779j = true;
                        if (h.f3782m == 0) {
                            m.d(jVar.f3759a, h.f3774b, iOException);
                            h.f3781l++;
                        }
                    }
                } else if (((A) iOException).f4080a == 8) {
                    int i = h.f3783n + 1;
                    h.f3783n = i;
                    if (i > 1) {
                        h.f3779j = true;
                        h.f3781l++;
                    }
                } else if (((A) iOException).f4080a != 9 || !jVar.f3768m) {
                    h.f3779j = true;
                    h.f3781l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
