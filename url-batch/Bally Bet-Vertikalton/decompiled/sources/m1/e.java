package m1;

import i1.s;
import i1.t;
import i1.u;
import java.io.IOException;
import p1.B;
import p1.C0285a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f3197a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3198b;

    /* renamed from: c, reason: collision with root package name */
    public final n1.d f3199c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3200e;

    public e(j jVar, f fVar, n1.d dVar) {
        X0.d.e(jVar, "call");
        X0.d.e(fVar, "finder");
        this.f3197a = jVar;
        this.f3198b = fVar;
        this.f3199c = dVar;
        this.f3200e = dVar.g();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f3197a;
        if (z3) {
            if (iOException != null) {
                X0.d.e(jVar, "call");
            } else {
                X0.d.e(jVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                X0.d.e(jVar, "call");
            } else {
                X0.d.e(jVar, "call");
            }
        }
        return jVar.g(this, z3, z2, iOException);
    }

    public final u b(t tVar) {
        n1.d dVar = this.f3199c;
        try {
            t.e(tVar, "Content-Type");
            long h = dVar.h(tVar);
            return new u(h, new v1.p(new d(this, dVar.f(tVar), h)), 1);
        } catch (IOException e2) {
            X0.d.e(this.f3197a, "call");
            d(e2);
            throw e2;
        }
    }

    public final s c(boolean z2) {
        try {
            s e2 = this.f3199c.e(z2);
            if (e2 != null) {
                e2.f2505m = this;
            }
            return e2;
        } catch (IOException e3) {
            X0.d.e(this.f3197a, "call");
            d(e3);
            throw e3;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f3198b.c(iOException);
        m g2 = this.f3199c.g();
        j jVar = this.f3197a;
        synchronized (g2) {
            try {
                X0.d.e(jVar, "call");
                if (!(iOException instanceof B)) {
                    if (!(g2.f3231g != null) || (iOException instanceof C0285a)) {
                        g2.f3232j = true;
                        if (g2.f3235m == 0) {
                            m.d(jVar.f3212a, g2.f3227b, iOException);
                            g2.f3234l++;
                        }
                    }
                } else if (((B) iOException).f3385a == 8) {
                    int i = g2.f3236n + 1;
                    g2.f3236n = i;
                    if (i > 1) {
                        g2.f3232j = true;
                        g2.f3234l++;
                    }
                } else if (((B) iOException).f3385a != 9 || !jVar.f3221m) {
                    g2.f3232j = true;
                    g2.f3234l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
