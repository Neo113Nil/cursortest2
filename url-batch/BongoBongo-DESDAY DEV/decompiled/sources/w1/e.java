package w1;

import java.io.IOException;
import s1.q;
import s1.r;
import s1.s;
import z1.A;
import z1.C0322a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f4221a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4222b;

    /* renamed from: c, reason: collision with root package name */
    public final x1.d f4223c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f4224e;

    public e(j jVar, f fVar, x1.d dVar) {
        h1.d.e(jVar, "call");
        h1.d.e(fVar, "finder");
        this.f4221a = jVar;
        this.f4222b = fVar;
        this.f4223c = dVar;
        this.f4224e = dVar.h();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f4221a;
        if (z3) {
            if (iOException != null) {
                h1.d.e(jVar, "call");
            } else {
                h1.d.e(jVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                h1.d.e(jVar, "call");
            } else {
                h1.d.e(jVar, "call");
            }
        }
        return jVar.g(this, z3, z2, iOException);
    }

    public final s b(r rVar) {
        x1.d dVar = this.f4223c;
        try {
            String g2 = r.g("Content-Type", rVar);
            long d = dVar.d(rVar);
            return new s(g2, d, new F1.p(new d(this, dVar.f(rVar), d)), 1);
        } catch (IOException e2) {
            h1.d.e(this.f4221a, "call");
            d(e2);
            throw e2;
        }
    }

    public final q c(boolean z2) {
        try {
            q e2 = this.f4223c.e(z2);
            if (e2 != null) {
                e2.f3701m = this;
            }
            return e2;
        } catch (IOException e3) {
            h1.d.e(this.f4221a, "call");
            d(e3);
            throw e3;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f4222b.c(iOException);
        m h2 = this.f4223c.h();
        j jVar = this.f4221a;
        synchronized (h2) {
            try {
                h1.d.e(jVar, "call");
                if (!(iOException instanceof A)) {
                    if (!(h2.f4257g != null) || (iOException instanceof C0322a)) {
                        h2.f4259j = true;
                        if (h2.f4262m == 0) {
                            m.d(jVar.f4237a, h2.f4253b, iOException);
                            h2.f4261l++;
                        }
                    }
                } else if (((A) iOException).f4419a == 8) {
                    int i = h2.f4263n + 1;
                    h2.f4263n = i;
                    if (i > 1) {
                        h2.f4259j = true;
                        h2.f4261l++;
                    }
                } else if (((A) iOException).f4419a != 9 || !jVar.f4247m) {
                    h2.f4259j = true;
                    h2.f4261l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
