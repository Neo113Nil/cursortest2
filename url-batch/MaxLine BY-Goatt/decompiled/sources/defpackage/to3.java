package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class to3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;
    public final /* synthetic */ ep3 o;

    public to3(ep3 ep3Var, long j, int i) {
        this.m = i;
        switch (i) {
            case 1:
                this.n = j;
                Objects.requireNonNull(ep3Var);
                this.o = ep3Var;
                break;
            default:
                this.n = j;
                Objects.requireNonNull(ep3Var);
                this.o = ep3Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (r10.E.a() != false) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i = this.m;
        ep3 ep3Var = this.o;
        switch (i) {
            case 0:
                o42 o42Var = ep3Var.r;
                ep3Var.v();
                ep3Var.A();
                pj3 pj3Var = (pj3) ep3Var.m;
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                g10 g10Var = vh3Var.z;
                long j = this.n;
                g10Var.c(Long.valueOf(j), "Activity resumed, time");
                ec3 ec3Var = pj3Var.p;
                if (!ec3Var.G(null, ug3.U0)) {
                    if (!ec3Var.K()) {
                        qi3 qi3Var = pj3Var.q;
                        pj3.k(qi3Var);
                        break;
                    }
                    ((ep3) o42Var.d).v();
                    ((zo3) o42Var.c).c();
                    o42Var.a = j;
                    o42Var.b = j;
                } else if (ec3Var.K() || ep3Var.p) {
                    ((ep3) o42Var.d).v();
                    ((zo3) o42Var.c).c();
                    o42Var.a = j;
                    o42Var.b = j;
                }
                tt1 tt1Var = ep3Var.s;
                ep3 ep3Var2 = (ep3) tt1Var.o;
                ep3Var2.v();
                pj3 pj3Var2 = (pj3) ep3Var2.m;
                xo3 xo3Var = (xo3) tt1Var.n;
                if (xo3Var != null) {
                    ep3Var2.o.removeCallbacks(xo3Var);
                }
                qi3 qi3Var2 = pj3Var2.q;
                jm3 jm3Var = pj3Var2.y;
                pj3.k(qi3Var2);
                qi3Var2.E.b(false);
                ep3Var2.v();
                ep3Var2.p = false;
                if (pj3Var2.p.G(null, ug3.T0)) {
                    pj3.l(jm3Var);
                    if (jm3Var.z) {
                        vh3 vh3Var2 = pj3Var2.r;
                        pj3.m(vh3Var2);
                        vh3Var2.z.b("Retrying trigger URI registration in foreground");
                        pj3.l(jm3Var);
                        jm3Var.V();
                    }
                }
                ot2 ot2Var = ep3Var.q;
                ep3 ep3Var3 = (ep3) ot2Var.n;
                ep3Var3.v();
                pj3 pj3Var3 = (pj3) ep3Var3.m;
                if (pj3Var3.b()) {
                    pj3Var3.w.getClass();
                    ot2Var.s(System.currentTimeMillis());
                    break;
                }
                break;
            default:
                ep3Var.v();
                ep3Var.A();
                pj3 pj3Var4 = (pj3) ep3Var.m;
                vh3 vh3Var3 = pj3Var4.r;
                pj3.m(vh3Var3);
                g10 g10Var2 = vh3Var3.z;
                long j2 = this.n;
                g10Var2.c(Long.valueOf(j2), "Activity paused, time");
                tt1 tt1Var2 = ep3Var.s;
                ep3 ep3Var4 = (ep3) tt1Var2.o;
                ((pj3) ep3Var4.m).w.getClass();
                xo3 xo3Var2 = new xo3(tt1Var2, System.currentTimeMillis(), j2);
                tt1Var2.n = xo3Var2;
                ep3Var4.o.postDelayed(xo3Var2, 2000L);
                if (pj3Var4.p.K()) {
                    ((zo3) ep3Var.r.c).c();
                    break;
                }
                break;
        }
    }
}
