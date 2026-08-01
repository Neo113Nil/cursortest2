package D1;

import G1.C0000a;
import G1.E;
import java.io.IOException;
import z1.r;
import z1.s;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f163a;

    /* renamed from: b, reason: collision with root package name */
    public final f f164b;

    /* renamed from: c, reason: collision with root package name */
    public final E1.e f165c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f166e;

    public e(j jVar, f fVar, E1.e eVar) {
        k1.e.e(jVar, "call");
        k1.e.e(fVar, "finder");
        this.f163a = jVar;
        this.f164b = fVar;
        this.f165c = eVar;
        this.f166e = eVar.h();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f163a;
        if (z3) {
            if (iOException != null) {
                k1.e.e(jVar, "call");
            } else {
                k1.e.e(jVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                k1.e.e(jVar, "call");
            } else {
                k1.e.e(jVar, "call");
            }
        }
        return jVar.g(this, z3, z2, iOException);
    }

    public final E1.h b(s sVar) {
        E1.e eVar = this.f165c;
        try {
            String a2 = s.a("Content-Type", sVar);
            long e2 = eVar.e(sVar);
            return new E1.h(a2, e2, new M1.p(new d(this, eVar.c(sVar), e2)), 0);
        } catch (IOException e3) {
            k1.e.e(this.f163a, "call");
            d(e3);
            throw e3;
        }
    }

    public final r c(boolean z2) {
        try {
            r g2 = this.f165c.g(z2);
            if (g2 != null) {
                g2.f4758m = this;
            }
            return g2;
        } catch (IOException e2) {
            k1.e.e(this.f163a, "call");
            d(e2);
            throw e2;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f164b.c(iOException);
        m h = this.f165c.h();
        j jVar = this.f163a;
        synchronized (h) {
            try {
                k1.e.e(jVar, "call");
                if (!(iOException instanceof E)) {
                    if (!(h.f197g != null) || (iOException instanceof C0000a)) {
                        h.f198j = true;
                        if (h.f201m == 0) {
                            m.d(jVar.f178a, h.f193b, iOException);
                            h.f200l++;
                        }
                    }
                } else if (((E) iOException).f365a == 8) {
                    int i = h.f202n + 1;
                    h.f202n = i;
                    if (i > 1) {
                        h.f198j = true;
                        h.f200l++;
                    }
                } else if (((E) iOException).f365a != 9 || !jVar.f187m) {
                    h.f198j = true;
                    h.f200l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
