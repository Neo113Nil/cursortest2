package s7;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z extends b0 {

    /* renamed from: e, reason: collision with root package name */
    public final s.e f9135e;

    /* renamed from: i, reason: collision with root package name */
    public final s.e f9136i;

    /* renamed from: r, reason: collision with root package name */
    public long f9137r;

    public z(q1 q1Var) {
        super(q1Var);
        this.f9136i = new s.e(0);
        this.f9135e = new s.e(0);
    }

    public final void t(String str, long j) {
        q1 q1Var = (q1) this.f1478d;
        if (str == null || str.length() == 0) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.a("Ad unit id must be a non-empty string");
        } else {
            o1 o1Var = q1Var.f8938u;
            q1.l(o1Var);
            o1Var.B(new a(this, str, j, 0));
        }
    }

    public final void u(String str, long j) {
        q1 q1Var = (q1) this.f1478d;
        if (str == null || str.length() == 0) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.a("Ad unit id must be a non-empty string");
        } else {
            o1 o1Var = q1Var.f8938u;
            q1.l(o1Var);
            o1Var.B(new a(this, str, j, 1));
        }
    }

    public final void v(long j) {
        b3 b3Var = ((q1) this.f1478d).f8943z;
        q1.k(b3Var);
        y2 w6 = b3Var.w(false);
        s.e eVar = this.f9135e;
        Iterator it = ((s.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            x(str, j - ((Long) eVar.get(str)).longValue(), w6);
        }
        if (!eVar.isEmpty()) {
            w(j - this.f9137r, w6);
        }
        y(j);
    }

    public final void w(long j, y2 y2Var) {
        q1 q1Var = (q1) this.f1478d;
        if (y2Var == null) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.B.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.B.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            p4.o0(y2Var, bundle, true);
            q2 q2Var = q1Var.A;
            q1.k(q2Var);
            q2Var.z("am", "_xa", bundle);
        }
    }

    public final void x(String str, long j, y2 y2Var) {
        q1 q1Var = (q1) this.f1478d;
        if (y2Var == null) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.B.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                v0 v0Var2 = q1Var.f8937t;
                q1.l(v0Var2);
                v0Var2.B.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            p4.o0(y2Var, bundle, true);
            q2 q2Var = q1Var.A;
            q1.k(q2Var);
            q2Var.z("am", "_xu", bundle);
        }
    }

    public final void y(long j) {
        s.e eVar = this.f9135e;
        Iterator it = ((s.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.f9137r = j;
    }
}
