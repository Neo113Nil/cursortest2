package g3;

import c3.t;
import j3.c0;
import java.io.IOException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final i f1930a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1931b;
    public final h3.e c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1932d;

    /* renamed from: e, reason: collision with root package name */
    public final l f1933e;

    public d(i iVar, e eVar, h3.e eVar2) {
        u2.c.e(eVar, "finder");
        this.f1930a = iVar;
        this.f1931b = eVar;
        this.c = eVar2;
        this.f1933e = eVar2.g();
    }

    public final t a(boolean z3) {
        try {
            t f4 = this.c.f(z3);
            if (f4 == null) {
                return f4;
            }
            f4.f1140m = this;
            return f4;
        } catch (IOException e4) {
            b(e4);
            throw e4;
        }
    }

    public final void b(IOException iOException) {
        this.f1932d = true;
        this.f1931b.c(iOException);
        l g = this.c.g();
        i iVar = this.f1930a;
        synchronized (g) {
            try {
                if (!(iOException instanceof c0)) {
                    if (!(g.g != null) || (iOException instanceof j3.a)) {
                        g.f1963j = true;
                        if (g.f1966m == 0) {
                            l.d(iVar.f1943f, g.f1958b, iOException);
                            g.f1965l++;
                        }
                    }
                } else if (((c0) iOException).f2414f == 8) {
                    int i4 = g.f1967n + 1;
                    g.f1967n = i4;
                    if (i4 > 1) {
                        g.f1963j = true;
                        g.f1965l++;
                    }
                } else if (((c0) iOException).f2414f != 9 || !iVar.f1953r) {
                    g.f1963j = true;
                    g.f1965l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
