package m1;

import i1.x;
import i1.y;
import i1.z;
import java.io.IOException;
import p1.B;
import p1.C0311a;
import v1.q;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f3552a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3553b;

    /* renamed from: c, reason: collision with root package name */
    public final n1.d f3554c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3555d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3556e;

    public e(j jVar, f fVar, n1.d dVar) {
        X0.f.e(jVar, "call");
        X0.f.e(fVar, "finder");
        this.f3552a = jVar;
        this.f3553b = fVar;
        this.f3554c = dVar;
        this.f3556e = dVar.g();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f3552a;
        if (z3) {
            if (iOException != null) {
                X0.f.e(jVar, "call");
            } else {
                X0.f.e(jVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                X0.f.e(jVar, "call");
            } else {
                X0.f.e(jVar, "call");
            }
        }
        return jVar.g(this, z3, z2, iOException);
    }

    public final z b(y yVar) {
        n1.d dVar = this.f3554c;
        try {
            String g2 = y.g(yVar, "Content-Type");
            long h = dVar.h(yVar);
            return new z(g2, h, new q(new d(this, dVar.f(yVar), h)), 1);
        } catch (IOException e2) {
            X0.f.e(this.f3552a, "call");
            d(e2);
            throw e2;
        }
    }

    public final x c(boolean z2) {
        try {
            x e2 = this.f3554c.e(z2);
            if (e2 != null) {
                e2.f2791m = this;
            }
            return e2;
        } catch (IOException e3) {
            X0.f.e(this.f3552a, "call");
            d(e3);
            throw e3;
        }
    }

    public final void d(IOException iOException) {
        this.f3555d = true;
        this.f3553b.c(iOException);
        m g2 = this.f3554c.g();
        j jVar = this.f3552a;
        synchronized (g2) {
            try {
                X0.f.e(jVar, "call");
                if (!(iOException instanceof B)) {
                    if (!(g2.f3591g != null) || (iOException instanceof C0311a)) {
                        g2.f3592j = true;
                        if (g2.f3595m == 0) {
                            m.d(jVar.f3569a, g2.f3586b, iOException);
                            g2.f3594l++;
                        }
                    }
                } else if (((B) iOException).f3767a == 8) {
                    int i = g2.f3596n + 1;
                    g2.f3596n = i;
                    if (i > 1) {
                        g2.f3592j = true;
                        g2.f3594l++;
                    }
                } else if (((B) iOException).f3767a != 9 || !jVar.f3579m) {
                    g2.f3592j = true;
                    g2.f3594l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
