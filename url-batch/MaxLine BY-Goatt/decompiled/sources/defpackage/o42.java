package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o42 {
    public long a;
    public long b;
    public final Object c;
    public final Object d;

    public o42(ep3 ep3Var) {
        this.d = ep3Var;
        pj3 pj3Var = (pj3) ep3Var.m;
        this.c = new zo3(this, pj3Var, 0);
        pj3Var.w.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
        this.b = elapsedRealtime;
    }

    public static final long a(o42 o42Var, long j, long j2) {
        o42Var.getClass();
        if (j2 == 0) {
            return j;
        }
        return (j / 4) + ((j2 / 4) * 3);
    }

    public boolean b(boolean z, boolean z2, long j) {
        ep3 ep3Var = (ep3) this.d;
        ep3Var.v();
        ep3Var.x();
        pj3 pj3Var = (pj3) ep3Var.m;
        boolean b = pj3Var.b();
        vh3 vh3Var = pj3Var.r;
        if (b) {
            qi3 qi3Var = pj3Var.q;
            pj3.k(qi3Var);
            li3 li3Var = qi3Var.B;
            pj3Var.w.getClass();
            li3Var.b(System.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            pj3.m(vh3Var);
            vh3Var.z.c(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        pj3.m(vh3Var);
        vh3Var.z.c(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !pj3Var.p.K();
        dn3 dn3Var = pj3Var.x;
        pj3.l(dn3Var);
        zq3.o0(dn3Var.C(z3), bundle, true);
        if (!z2) {
            jm3 jm3Var = pj3Var.y;
            pj3.l(jm3Var);
            jm3Var.D("auto", "_e", bundle);
        }
        this.a = j;
        zo3 zo3Var = (zo3) this.c;
        zo3Var.c();
        zo3Var.b(((Long) ug3.q0.a(null)).longValue());
        return true;
    }

    public o42() {
        int i = qt1.a;
        this.c = new kn1(6);
        this.d = new kn1(6);
    }
}
