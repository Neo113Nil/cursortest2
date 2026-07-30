package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class xq1 {
    public tq1 a;
    public boolean b;

    public final void a() {
        tq1 tq1Var = this.a;
        if (tq1Var == null) {
            lh.g("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            tq1Var.d(this, null);
        }
        yq1 yq1Var = tq1Var.b;
        k4 k4Var = tq1Var.a;
        yq1Var.getClass();
        if (equals(yq1Var.h) && -1 == yq1Var.g) {
            vq1 vq1Var = yq1Var.f;
            if (vq1Var == null) {
                vq1Var = yq1Var.c(-1);
            }
            yq1Var.f = null;
            yq1Var.g = 0;
            yq1Var.h = null;
            if (vq1Var == null) {
                ((ru1) k4Var.n).a.run();
            } else {
                vq1Var.b();
            }
            vo2 vo2Var = yq1Var.a;
            zq1 zq1Var = zq1.s;
            vo2Var.getClass();
            vo2Var.j(null, zq1Var);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
