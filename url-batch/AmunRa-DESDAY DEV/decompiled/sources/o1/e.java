package o1;

import java.io.IOException;
import k1.t;
import k1.u;
import k1.v;
import r1.B;
import r1.C0290a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f3377a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3378b;

    /* renamed from: c, reason: collision with root package name */
    public final p1.d f3379c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3380e;

    public e(j jVar, f fVar, p1.d dVar) {
        Z0.d.e(jVar, "call");
        Z0.d.e(fVar, "finder");
        this.f3377a = jVar;
        this.f3378b = fVar;
        this.f3379c = dVar;
        this.f3380e = dVar.h();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f3377a;
        if (z3) {
            if (iOException != null) {
                Z0.d.e(jVar, "call");
            } else {
                Z0.d.e(jVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                Z0.d.e(jVar, "call");
            } else {
                Z0.d.e(jVar, "call");
            }
        }
        return jVar.g(this, z3, z2, iOException);
    }

    public final v b(u uVar) {
        p1.d dVar = this.f3379c;
        try {
            String f2 = u.f("Content-Type", uVar);
            long c2 = dVar.c(uVar);
            return new v(f2, c2, new x1.p(new d(this, dVar.g(uVar), c2)), 1);
        } catch (IOException e2) {
            Z0.d.e(this.f3377a, "call");
            d(e2);
            throw e2;
        }
    }

    public final t c(boolean z2) {
        try {
            t f2 = this.f3379c.f(z2);
            if (f2 != null) {
                f2.f2896m = this;
            }
            return f2;
        } catch (IOException e2) {
            Z0.d.e(this.f3377a, "call");
            d(e2);
            throw e2;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f3378b.c(iOException);
        m h = this.f3379c.h();
        j jVar = this.f3377a;
        synchronized (h) {
            try {
                Z0.d.e(jVar, "call");
                if (!(iOException instanceof B)) {
                    if (!(h.f3411g != null) || (iOException instanceof C0290a)) {
                        h.f3412j = true;
                        if (h.f3415m == 0) {
                            m.d(jVar.f3392a, h.f3407b, iOException);
                            h.f3414l++;
                        }
                    }
                } else if (((B) iOException).f3529a == 8) {
                    int i = h.f3416n + 1;
                    h.f3416n = i;
                    if (i > 1) {
                        h.f3412j = true;
                        h.f3414l++;
                    }
                } else if (((B) iOException).f3529a != 9 || !jVar.f3401m) {
                    h.f3412j = true;
                    h.f3414l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
