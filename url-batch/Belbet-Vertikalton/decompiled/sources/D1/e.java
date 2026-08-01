package D1;

import G1.C0000a;
import G1.E;
import java.io.IOException;
import z1.u;
import z1.v;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f219a;

    /* renamed from: b, reason: collision with root package name */
    public final f f220b;

    /* renamed from: c, reason: collision with root package name */
    public final E1.e f221c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f222d;
    public final m e;

    public e(j jVar, f fVar, E1.e eVar) {
        j1.h.e(jVar, "call");
        j1.h.e(fVar, "finder");
        this.f219a = jVar;
        this.f220b = fVar;
        this.f221c = eVar;
        this.e = eVar.h();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f219a;
        if (z3) {
            if (iOException != null) {
                j1.h.e(jVar, "call");
            } else {
                j1.h.e(jVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                j1.h.e(jVar, "call");
            } else {
                j1.h.e(jVar, "call");
            }
        }
        return jVar.g(this, z3, z2, iOException);
    }

    public final E1.h b(v vVar) {
        E1.e eVar = this.f221c;
        try {
            String a2 = v.a("Content-Type", vVar);
            long f2 = eVar.f(vVar);
            return new E1.h(a2, f2, new M1.p(new d(this, eVar.e(vVar), f2)), 0);
        } catch (IOException e) {
            j1.h.e(this.f219a, "call");
            d(e);
            throw e;
        }
    }

    public final u c(boolean z2) {
        try {
            u g2 = this.f221c.g(z2);
            if (g2 != null) {
                g2.f4943m = this;
            }
            return g2;
        } catch (IOException e) {
            j1.h.e(this.f219a, "call");
            d(e);
            throw e;
        }
    }

    public final void d(IOException iOException) {
        this.f222d = true;
        this.f220b.c(iOException);
        m h2 = this.f221c.h();
        j jVar = this.f219a;
        synchronized (h2) {
            try {
                j1.h.e(jVar, "call");
                if (!(iOException instanceof E)) {
                    if (!(h2.f255g != null) || (iOException instanceof C0000a)) {
                        h2.j = true;
                        if (h2.f259m == 0) {
                            m.d(jVar.f235a, h2.f251b, iOException);
                            h2.f258l++;
                        }
                    }
                } else if (((E) iOException).f347a == 8) {
                    int i = h2.f260n + 1;
                    h2.f260n = i;
                    if (i > 1) {
                        h2.j = true;
                        h2.f258l++;
                    }
                } else if (((E) iOException).f347a != 9 || !jVar.f244m) {
                    h2.j = true;
                    h2.f258l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
