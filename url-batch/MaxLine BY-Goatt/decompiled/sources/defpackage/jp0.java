package defpackage;

import kotlin.Unit;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jp0 implements hp0 {
    public final u9 a;
    public final v9 b;
    public final tt1 c;
    public final op0 d;
    public final at0 e;
    public final a0 f;

    public jp0(u9 u9Var, v9 v9Var) {
        tt1 tt1Var = kp0.a;
        op0 op0Var = new op0(kp0.b);
        at0 at0Var = new at0(11);
        this.a = u9Var;
        this.b = v9Var;
        this.c = tt1Var;
        this.d = op0Var;
        this.e = at0Var;
        this.f = new a0(4, this);
    }

    public final j13 a(g13 g13Var) {
        tt1 tt1Var = this.c;
        ek ekVar = new ek(2, this, g13Var);
        synchronized (((dq2) tt1Var.n)) {
            j13 j13Var = (j13) ((yg1) tt1Var.o).c(g13Var);
            if (j13Var != null) {
                if (j13Var.c()) {
                    return j13Var;
                }
            }
            try {
                j13 j13Var2 = (j13) ekVar.invoke(new ek(8, tt1Var, g13Var));
                synchronized (((dq2) tt1Var.n)) {
                    try {
                        if (((yg1) tt1Var.o).c(g13Var) == null && j13Var2.c()) {
                            ((yg1) tt1Var.o).d(g13Var, j13Var2);
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return j13Var2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final j13 b(ip0 ip0Var, jq0 jq0Var, int i, int i2) {
        v9 v9Var = this.b;
        v9Var.getClass();
        int i3 = v9Var.m;
        jq0 jq0Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? jq0Var : new jq0(d.c(jq0Var.m + i3, 1, 1000));
        this.a.getClass();
        return a(new g13(ip0Var, jq0Var2, i, i2, null));
    }
}
