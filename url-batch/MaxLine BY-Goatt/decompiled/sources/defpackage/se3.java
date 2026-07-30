package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class se3 extends bg3 {
    public final hi n;
    public final hi o;
    public long p;

    public se3(pj3 pj3Var) {
        super(pj3Var);
        this.o = new hi(0);
        this.n = new hi(0);
    }

    public final void A(long j, tm3 tm3Var) {
        pj3 pj3Var = (pj3) this.m;
        if (tm3Var == null) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.z.b("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.z.c(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zq3.o0(tm3Var, bundle, true);
            jm3 jm3Var = pj3Var.y;
            pj3.l(jm3Var);
            jm3Var.D("am", "_xa", bundle);
        }
    }

    public final void B(String str, long j, tm3 tm3Var) {
        pj3 pj3Var = (pj3) this.m;
        if (tm3Var == null) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.z.b("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                vh3 vh3Var2 = pj3Var.r;
                pj3.m(vh3Var2);
                vh3Var2.z.c(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zq3.o0(tm3Var, bundle, true);
            jm3 jm3Var = pj3Var.y;
            pj3.l(jm3Var);
            jm3Var.D("am", "_xu", bundle);
        }
    }

    public final void C(long j) {
        hi hiVar = this.n;
        Iterator it = ((ei) hiVar.keySet()).iterator();
        while (it.hasNext()) {
            hiVar.put((String) it.next(), Long.valueOf(j));
        }
        if (hiVar.isEmpty()) {
            return;
        }
        this.p = j;
    }

    public final void x(long j, String str) {
        pj3 pj3Var = (pj3) this.m;
        if (str == null || str.length() == 0) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.b("Ad unit id must be a non-empty string");
        } else {
            lj3 lj3Var = pj3Var.s;
            pj3.m(lj3Var);
            lj3Var.F(new db3(this, str, j, 0));
        }
    }

    public final void y(long j, String str) {
        pj3 pj3Var = (pj3) this.m;
        if (str == null || str.length() == 0) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.b("Ad unit id must be a non-empty string");
        } else {
            lj3 lj3Var = pj3Var.s;
            pj3.m(lj3Var);
            lj3Var.F(new db3(this, str, j, 1));
        }
    }

    public final void z(long j) {
        dn3 dn3Var = ((pj3) this.m).x;
        pj3.l(dn3Var);
        tm3 C = dn3Var.C(false);
        hi hiVar = this.n;
        Iterator it = ((ei) hiVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            B(str, j - ((Long) hiVar.get(str)).longValue(), C);
        }
        if (!hiVar.isEmpty()) {
            A(j - this.p, C);
        }
        C(j);
    }
}
