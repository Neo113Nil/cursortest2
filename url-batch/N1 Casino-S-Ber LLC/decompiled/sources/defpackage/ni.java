package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ni {
    public final gy a;
    public final pi b;
    public final oi c;
    public boolean d;
    public final jy e;

    public ni(gy gyVar, pi piVar, oi oiVar) {
        piVar.getClass();
        this.a = gyVar;
        this.b = piVar;
        this.c = oiVar;
        this.e = oiVar.g();
    }

    public final h00 a(boolean z) {
        try {
            h00 f = this.c.f(z);
            if (f == null) {
                return f;
            }
            f.m = this;
            return f;
        } catch (IOException e) {
            b(e);
            throw e;
        }
    }

    public final void b(IOException iOException) {
        this.d = true;
        this.b.b(iOException);
        jy g = this.c.g();
        gy gyVar = this.a;
        synchronized (g) {
            try {
                if (!(iOException instanceof b40)) {
                    if (!(g.g != null) || (iOException instanceof bc)) {
                        g.j = true;
                        if (g.m == 0) {
                            jy.d(gyVar.f, g.b, iOException);
                            g.l++;
                        }
                    }
                } else if (((b40) iOException).f == 8) {
                    int i = g.n + 1;
                    g.n = i;
                    if (i > 1) {
                        g.j = true;
                        g.l++;
                    }
                } else if (((b40) iOException).f != 9 || !gyVar.r) {
                    g.j = true;
                    g.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
