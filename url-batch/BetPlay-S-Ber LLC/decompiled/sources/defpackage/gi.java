package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class gi {
    public final vy a;
    public final ii b;
    public final hi c;
    public boolean d;
    public final yy e;

    public gi(vy vyVar, ii iiVar, hi hiVar) {
        iiVar.getClass();
        this.a = vyVar;
        this.b = iiVar;
        this.c = hiVar;
        this.e = hiVar.g();
    }

    public final x00 a(boolean z) {
        try {
            x00 e = this.c.e(z);
            if (e == null) {
                return e;
            }
            e.m = this;
            return e;
        } catch (IOException e2) {
            b(e2);
            throw e2;
        }
    }

    public final void b(IOException iOException) {
        this.d = true;
        this.b.b(iOException);
        yy g = this.c.g();
        vy vyVar = this.a;
        synchronized (g) {
            try {
                if (!(iOException instanceof k40)) {
                    if (!(g.g != null) || (iOException instanceof fc)) {
                        g.j = true;
                        if (g.m == 0) {
                            yy.d(vyVar.f, g.b, iOException);
                            g.l++;
                        }
                    }
                } else if (((k40) iOException).f == 8) {
                    int i = g.n + 1;
                    g.n = i;
                    if (i > 1) {
                        g.j = true;
                        g.l++;
                    }
                } else if (((k40) iOException).f != 9 || !vyVar.r) {
                    g.j = true;
                    g.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
