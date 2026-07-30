package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tq1 {
    public final k4 a;
    public final yq1 b = new yq1();
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public tq1(k4 k4Var) {
        this.a = k4Var;
        new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
    }

    public static void a(tq1 tq1Var, vq1 vq1Var) {
        tq1Var.getClass();
        vq1Var.getClass();
        if (tq1Var.c.add(vq1Var)) {
            yq1 yq1Var = tq1Var.b;
            yq1Var.getClass();
            if (vq1Var.e != null) {
                b71.p(vq1Var, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            yq1Var.e.addFirst(vq1Var);
            vq1Var.e = tq1Var;
            yq1Var.b();
        }
    }

    public final void b(xq1 xq1Var) {
        if (this.d.add(xq1Var)) {
            this.b.a(this, xq1Var, -1);
        }
    }

    public final void c(lu1 lu1Var, int i) {
        if (i != 1 && i != 0) {
            lh.c(in1.k(i, "Unsupported priority value: "));
        } else if (this.d.add(lu1Var)) {
            this.b.a(this, lu1Var, i);
        }
    }

    public final void d(xq1 xq1Var, sq1 sq1Var) {
        yq1 yq1Var = this.b;
        yq1Var.getClass();
        if (yq1Var.g != 0) {
            return;
        }
        vq1 c = yq1Var.c(-1);
        yq1Var.f = c;
        yq1Var.g = -1;
        yq1Var.h = xq1Var;
        if (sq1Var != null) {
            if (c != null) {
                c.d(sq1Var);
            }
            vo2 vo2Var = yq1Var.a;
            ar1 ar1Var = new ar1(sq1Var);
            vo2Var.getClass();
            vo2Var.j(null, ar1Var);
        }
    }
}
