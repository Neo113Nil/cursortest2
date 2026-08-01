package q1;

import java.io.IOException;
import m1.r;
import m1.s;
import m1.t;
import t1.B;
import t1.C0315a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f3458a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3459b;

    /* renamed from: c, reason: collision with root package name */
    public final r1.d f3460c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3461e;

    public e(j jVar, f fVar, r1.d dVar) {
        b1.d.e(jVar, "call");
        b1.d.e(fVar, "finder");
        this.f3458a = jVar;
        this.f3459b = fVar;
        this.f3460c = dVar;
        this.f3461e = dVar.g();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f3458a;
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

    public final t b(s sVar) {
        r1.d dVar = this.f3460c;
        try {
            String g2 = s.g("Content-Type", sVar);
            long h = dVar.h(sVar);
            return new t(g2, h, new z1.p(new d(this, dVar.f(sVar), h)), 1);
        } catch (IOException e2) {
            b1.d.e(this.f3458a, "call");
            d(e2);
            throw e2;
        }
    }

    public final r c(boolean z2) {
        try {
            r e2 = this.f3460c.e(z2);
            if (e2 != null) {
                e2.f3248m = this;
            }
            return e2;
        } catch (IOException e3) {
            b1.d.e(this.f3458a, "call");
            d(e3);
            throw e3;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f3459b.c(iOException);
        m g2 = this.f3460c.g();
        j jVar = this.f3458a;
        synchronized (g2) {
            try {
                b1.d.e(jVar, "call");
                if (!(iOException instanceof B)) {
                    if (!(g2.f3492g != null) || (iOException instanceof C0315a)) {
                        g2.f3493j = true;
                        if (g2.f3496m == 0) {
                            m.d(jVar.f3473a, g2.f3488b, iOException);
                            g2.f3495l++;
                        }
                    }
                } else if (((B) iOException).f3750a == 8) {
                    int i = g2.f3497n + 1;
                    g2.f3497n = i;
                    if (i > 1) {
                        g2.f3493j = true;
                        g2.f3495l++;
                    }
                } else if (((B) iOException).f3750a != 9 || !jVar.f3482m) {
                    g2.f3493j = true;
                    g2.f3495l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
