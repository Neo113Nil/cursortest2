package s1;

import java.io.IOException;
import o1.r;
import o1.s;
import o1.t;
import v1.A;
import v1.C0308a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f3705a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3706b;

    /* renamed from: c, reason: collision with root package name */
    public final t1.d f3707c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3708e;

    public e(j jVar, f fVar, t1.d dVar) {
        d1.d.e(jVar, "call");
        d1.d.e(fVar, "finder");
        this.f3705a = jVar;
        this.f3706b = fVar;
        this.f3707c = dVar;
        this.f3708e = dVar.h();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f3705a;
        if (z3) {
            if (iOException != null) {
                d1.d.e(jVar, "call");
            } else {
                d1.d.e(jVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                d1.d.e(jVar, "call");
            } else {
                d1.d.e(jVar, "call");
            }
        }
        return jVar.g(this, z3, z2, iOException);
    }

    public final t b(s sVar) {
        t1.d dVar = this.f3707c;
        try {
            String g2 = s.g("Content-Type", sVar);
            long c2 = dVar.c(sVar);
            return new t(g2, c2, new B1.p(new d(this, dVar.g(sVar), c2)), 1);
        } catch (IOException e2) {
            d1.d.e(this.f3705a, "call");
            d(e2);
            throw e2;
        }
    }

    public final r c(boolean z2) {
        try {
            r f2 = this.f3707c.f(z2);
            if (f2 != null) {
                f2.f3382m = this;
            }
            return f2;
        } catch (IOException e2) {
            d1.d.e(this.f3705a, "call");
            d(e2);
            throw e2;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f3706b.c(iOException);
        m h = this.f3707c.h();
        j jVar = this.f3705a;
        synchronized (h) {
            try {
                d1.d.e(jVar, "call");
                if (!(iOException instanceof A)) {
                    if (!(h.f3739g != null) || (iOException instanceof C0308a)) {
                        h.f3740j = true;
                        if (h.f3743m == 0) {
                            m.d(jVar.f3720a, h.f3735b, iOException);
                            h.f3742l++;
                        }
                    }
                } else if (((A) iOException).f4052a == 8) {
                    int i = h.f3744n + 1;
                    h.f3744n = i;
                    if (i > 1) {
                        h.f3740j = true;
                        h.f3742l++;
                    }
                } else if (((A) iOException).f4052a != 9 || !jVar.f3729m) {
                    h.f3740j = true;
                    h.f3742l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
