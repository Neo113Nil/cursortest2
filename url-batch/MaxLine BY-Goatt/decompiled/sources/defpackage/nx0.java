package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nx0 implements xu1 {
    public long m;
    public final Object n;

    public nx0(pq pqVar) {
        pqVar.getClass();
        this.n = pqVar;
        this.m = 262144L;
    }

    public mx0 a() {
        lx0 lx0Var = new lx0(0);
        while (true) {
            String z = ((pq) this.n).z(this.m);
            this.m -= z.length();
            if (z.length() == 0) {
                return lx0Var.c();
            }
            int v = up2.v(z, ':', 1, 4);
            if (v != -1) {
                lx0Var.a(z.substring(0, v), z.substring(v + 1));
            } else if (z.charAt(0) == ':') {
                lx0Var.a(BuildConfig.FLAVOR, z.substring(1));
            } else {
                lx0Var.a(BuildConfig.FLAVOR, z);
            }
        }
    }

    @Override // defpackage.xu1
    public /* synthetic */ void c(Exception exc) {
        t13 t13Var = (t13) this.n;
        ((AtomicLong) t13Var.n).set(this.m);
    }

    public nx0(qb2 qb2Var) {
        ll3.v(qb2Var);
        this.n = qb2Var;
    }

    public /* synthetic */ nx0(t13 t13Var, long j) {
        this.n = t13Var;
        this.m = j;
    }

    public nx0(ww1 ww1Var) {
        this.n = ww1Var;
        this.m = 0L;
    }
}
