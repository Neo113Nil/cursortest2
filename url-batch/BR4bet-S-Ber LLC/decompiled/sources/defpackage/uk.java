package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class uk {
    public final i10 a;
    public final wk b;
    public final vk c;
    public boolean d;
    public final l10 e;

    public uk(i10 i10Var, wk wkVar, vk vkVar) {
        wkVar.getClass();
        this.a = i10Var;
        this.b = wkVar;
        this.c = vkVar;
        this.e = vkVar.g();
    }

    public final m30 a(boolean z) {
        try {
            m30 f = this.c.f(z);
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
        l10 g = this.c.g();
        i10 i10Var = this.a;
        synchronized (g) {
            try {
                if (!(iOException instanceof e70)) {
                    if (!(g.g != null) || (iOException instanceof bd)) {
                        g.j = true;
                        if (g.m == 0) {
                            l10.d(i10Var.f, g.b, iOException);
                            g.l++;
                        }
                    }
                } else if (((e70) iOException).f == 8) {
                    int i = g.n + 1;
                    g.n = i;
                    if (i > 1) {
                        g.j = true;
                        g.l++;
                    }
                } else if (((e70) iOException).f != 9 || !i10Var.r) {
                    g.j = true;
                    g.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
