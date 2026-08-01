package m1;

import i1.x;
import i1.y;
import i1.z;
import java.io.IOException;
import p1.B;
import p1.C0313a;
import v1.q;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f3556a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3557b;

    /* renamed from: c, reason: collision with root package name */
    public final n1.d f3558c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3559d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3560e;

    public e(j jVar, f fVar, n1.d dVar) {
        X0.f.e(jVar, "call");
        X0.f.e(fVar, "finder");
        this.f3556a = jVar;
        this.f3557b = fVar;
        this.f3558c = dVar;
        this.f3560e = dVar.g();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f3556a;
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
        n1.d dVar = this.f3558c;
        try {
            String g2 = y.g(yVar, "Content-Type");
            long h = dVar.h(yVar);
            return new z(g2, h, new q(new d(this, dVar.f(yVar), h)), 1);
        } catch (IOException e2) {
            X0.f.e(this.f3556a, "call");
            d(e2);
            throw e2;
        }
    }

    public final x c(boolean z2) {
        try {
            x e2 = this.f3558c.e(z2);
            if (e2 != null) {
                e2.f2795m = this;
            }
            return e2;
        } catch (IOException e3) {
            X0.f.e(this.f3556a, "call");
            d(e3);
            throw e3;
        }
    }

    public final void d(IOException iOException) {
        this.f3559d = true;
        this.f3557b.c(iOException);
        m g2 = this.f3558c.g();
        j jVar = this.f3556a;
        synchronized (g2) {
            try {
                X0.f.e(jVar, "call");
                if (!(iOException instanceof B)) {
                    if (!(g2.f3595g != null) || (iOException instanceof C0313a)) {
                        g2.f3596j = true;
                        if (g2.f3599m == 0) {
                            m.d(jVar.f3573a, g2.f3590b, iOException);
                            g2.f3598l++;
                        }
                    }
                } else if (((B) iOException).f3771a == 8) {
                    int i = g2.f3600n + 1;
                    g2.f3600n = i;
                    if (i > 1) {
                        g2.f3596j = true;
                        g2.f3598l++;
                    }
                } else if (((B) iOException).f3771a != 9 || !jVar.f3583m) {
                    g2.f3596j = true;
                    g2.f3598l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
