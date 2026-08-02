package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcu {
    public final String a;
    public final fcv b;
    public final gbc c;
    public final Object d;
    public final gth e;
    public List f;
    private final hvi g;
    private final hum h;
    private final gbc i;

    public fcu(fcv fcvVar, hvi hviVar, boolean z) {
        fct fctVar = new fct(this);
        huf hufVar = huf.a;
        this.i = new gbc(fctVar, hufVar);
        this.d = new Object();
        this.f = new ArrayList();
        this.b = fcvVar;
        this.g = hviVar;
        this.a = fcvVar.d();
        this.c = new gbc(fcvVar.a(), hufVar);
        this.h = new hum();
        if (z) {
            this.e = new gtg();
        } else {
            this.e = new gtf();
        }
        c(new doj(this, 15));
    }

    public final hvi a(gzf gzfVar, Executor executor) {
        return b(gvx.c(new doj(gzfVar, 14)), executor);
    }

    public final hvi b(htr htrVar, Executor executor) {
        hab.c(gyd.a);
        gty b = this.e.b("Update ".concat(String.valueOf(this.a)));
        try {
            hvi c = this.i.c();
            hum humVar = this.h;
            cbc cbcVar = new cbc(c, 14);
            huf hufVar = huf.a;
            humVar.a(cbcVar, hufVar);
            hvi a = humVar.a(gvx.b(new fca(this, c, htrVar, executor, 3)), hufVar);
            hnu.aU(a, c);
            hnu.aK(this.g);
            hvi m = exf.m(a);
            b.b(m);
            b.close();
            return m;
        } finally {
        }
    }

    public final void c(htr htrVar) {
        synchronized (this.d) {
            this.f.add(htrVar);
        }
    }

    public final hvi d() {
        hvi hviVar;
        gth gthVar = this.e;
        gthVar.a();
        hab.c(gyd.a);
        gbc gbcVar = this.i;
        if (gbcVar.e()) {
            hviVar = this.b.h();
        } else {
            gty b = gthVar.b("Get ".concat(String.valueOf(this.a)));
            try {
                hvi g = hti.g(gbcVar.c(), gvx.c(new doj(this, 16)), huf.a);
                b.b(g);
                b.close();
                hviVar = g;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        hnu.aK(this.g);
        return hnu.aK(hviVar);
    }
}
