package m1;

import i1.s;
import i1.t;
import i1.u;
import java.io.IOException;
import p1.B;
import p1.C0284a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f3192a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3193b;

    /* renamed from: c, reason: collision with root package name */
    public final n1.d f3194c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3195e;

    public e(j jVar, f fVar, n1.d dVar) {
        X0.e.e(jVar, "call");
        X0.e.e(fVar, "finder");
        this.f3192a = jVar;
        this.f3193b = fVar;
        this.f3194c = dVar;
        this.f3195e = dVar.g();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f3192a;
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

    public final u b(t tVar) {
        n1.d dVar = this.f3194c;
        try {
            t.e(tVar, "Content-Type");
            long h = dVar.h(tVar);
            return new u(h, new v1.o(new d(this, dVar.f(tVar), h)), 1);
        } catch (IOException e2) {
            X0.e.e(this.f3192a, "call");
            d(e2);
            throw e2;
        }
    }

    public final s c(boolean z2) {
        try {
            s e2 = this.f3194c.e(z2);
            if (e2 != null) {
                e2.f2500m = this;
            }
            return e2;
        } catch (IOException e3) {
            X0.e.e(this.f3192a, "call");
            d(e3);
            throw e3;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f3193b.c(iOException);
        m g2 = this.f3194c.g();
        j jVar = this.f3192a;
        synchronized (g2) {
            try {
                X0.e.e(jVar, "call");
                if (!(iOException instanceof B)) {
                    if (!(g2.f3226g != null) || (iOException instanceof C0284a)) {
                        g2.f3227j = true;
                        if (g2.f3230m == 0) {
                            m.d(jVar.f3207a, g2.f3222b, iOException);
                            g2.f3229l++;
                        }
                    }
                } else if (((B) iOException).f3380a == 8) {
                    int i = g2.f3231n + 1;
                    g2.f3231n = i;
                    if (i > 1) {
                        g2.f3227j = true;
                        g2.f3229l++;
                    }
                } else if (((B) iOException).f3380a != 9 || !jVar.f3216m) {
                    g2.f3227j = true;
                    g2.f3229l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
