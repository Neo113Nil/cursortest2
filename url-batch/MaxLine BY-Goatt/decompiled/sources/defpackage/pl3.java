package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pl3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;
    public final /* synthetic */ jm3 o;

    public pl3(jm3 jm3Var, long j, int i) {
        this.m = i;
        switch (i) {
            case 1:
                this.n = j;
                Objects.requireNonNull(jm3Var);
                this.o = jm3Var;
                break;
            default:
                this.n = j;
                Objects.requireNonNull(jm3Var);
                this.o = jm3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        long j = this.n;
        jm3 jm3Var = this.o;
        switch (i) {
            case 0:
                pj3 pj3Var = (pj3) jm3Var.m;
                qi3 qi3Var = pj3Var.q;
                pj3.k(qi3Var);
                qi3Var.w.b(j);
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.y.c(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                jm3Var.v();
                jm3Var.x();
                pj3 pj3Var2 = (pj3) jm3Var.m;
                vh3 vh3Var2 = pj3Var2.r;
                pj3.m(vh3Var2);
                vh3Var2.y.b("Resetting analytics data (FE)");
                ep3 ep3Var = pj3Var2.t;
                pj3.l(ep3Var);
                ep3Var.v();
                o42 o42Var = ep3Var.r;
                ((zo3) o42Var.c).c();
                ((pj3) ((ep3) o42Var.d).m).w.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                o42Var.a = elapsedRealtime;
                o42Var.b = elapsedRealtime;
                pj3Var2.r().B();
                boolean z = !pj3Var2.b();
                qi3 qi3Var2 = pj3Var2.q;
                pj3.k(qi3Var2);
                qi3Var2.r.b(j);
                pj3 pj3Var3 = (pj3) qi3Var2.m;
                qi3 qi3Var3 = pj3Var3.q;
                pj3.k(qi3Var3);
                if (!TextUtils.isEmpty(qi3Var3.H.d())) {
                    qi3Var2.H.e(null);
                }
                qi3Var2.B.b(0L);
                qi3Var2.C.b(0L);
                if (!pj3Var3.p.J()) {
                    qi3Var2.F(z);
                }
                qi3Var2.I.e(null);
                qi3Var2.J.b(0L);
                qi3Var2.K.K(null);
                jo3 p = pj3Var2.p();
                p.v();
                p.x();
                cs3 M = p.M(false);
                p.I();
                ((pj3) p.m).o().A();
                p.K(new ln3(p, M, 0));
                pj3.l(ep3Var);
                ep3Var.q.q();
                jm3Var.E = z;
                pj3Var2.p().A(new AtomicReference());
                break;
        }
    }
}
