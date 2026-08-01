package v1;

import java.io.IOException;
import r1.q;
import r1.r;
import r1.s;
import y1.A;
import y1.C0317a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f3861a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3862b;

    /* renamed from: c, reason: collision with root package name */
    public final w1.d f3863c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3864e;

    public e(j jVar, f fVar, w1.d dVar) {
        g1.d.e(jVar, "call");
        g1.d.e(fVar, "finder");
        this.f3861a = jVar;
        this.f3862b = fVar;
        this.f3863c = dVar;
        this.f3864e = dVar.h();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f3861a;
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

    public final s b(r rVar) {
        w1.d dVar = this.f3863c;
        try {
            String g2 = r.g("Content-Type", rVar);
            long g3 = dVar.g(rVar);
            return new s(g2, g3, new E1.p(new d(this, dVar.c(rVar), g3)), 1);
        } catch (IOException e2) {
            g1.d.e(this.f3861a, "call");
            d(e2);
            throw e2;
        }
    }

    public final q c(boolean z2) {
        try {
            q f2 = this.f3863c.f(z2);
            if (f2 != null) {
                f2.f3544m = this;
            }
            return f2;
        } catch (IOException e2) {
            g1.d.e(this.f3861a, "call");
            d(e2);
            throw e2;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f3862b.c(iOException);
        m h = this.f3863c.h();
        j jVar = this.f3861a;
        synchronized (h) {
            try {
                g1.d.e(jVar, "call");
                if (!(iOException instanceof A)) {
                    if (!(h.f3895g != null) || (iOException instanceof C0317a)) {
                        h.f3896j = true;
                        if (h.f3899m == 0) {
                            m.d(jVar.f3876a, h.f3891b, iOException);
                            h.f3898l++;
                        }
                    }
                } else if (((A) iOException).f4195a == 8) {
                    int i = h.f3900n + 1;
                    h.f3900n = i;
                    if (i > 1) {
                        h.f3896j = true;
                        h.f3898l++;
                    }
                } else if (((A) iOException).f4195a != 9 || !jVar.f3885m) {
                    h.f3896j = true;
                    h.f3898l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
