package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jn3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ cs3 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ jo3 p;
    public final /* synthetic */ i1 q;

    public jn3(jo3 jo3Var, cs3 cs3Var, boolean z, yb3 yb3Var) {
        this.m = 2;
        this.n = cs3Var;
        this.o = z;
        this.q = yb3Var;
        Objects.requireNonNull(jo3Var);
        this.p = jo3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        i1 i1Var = this.q;
        boolean z = this.o;
        cs3 cs3Var = this.n;
        jo3 jo3Var = this.p;
        switch (i) {
            case 0:
                yg3 yg3Var = jo3Var.p;
                if (yg3Var != null) {
                    jo3Var.O(yg3Var, z ? null : (tq3) i1Var, cs3Var);
                    jo3Var.J();
                    break;
                } else {
                    vh3 vh3Var = ((pj3) jo3Var.m).r;
                    pj3.m(vh3Var);
                    vh3Var.r.b("Discarding data. Failed to set user property");
                    break;
                }
            case 1:
                yg3 yg3Var2 = jo3Var.p;
                if (yg3Var2 != null) {
                    jo3Var.O(yg3Var2, z ? null : (kd3) i1Var, cs3Var);
                    jo3Var.J();
                    break;
                } else {
                    vh3 vh3Var2 = ((pj3) jo3Var.m).r;
                    pj3.m(vh3Var2);
                    vh3Var2.r.b("Discarding data. Failed to send event to service");
                    break;
                }
            default:
                yg3 yg3Var3 = jo3Var.p;
                if (yg3Var3 != null) {
                    jo3Var.O(yg3Var3, z ? null : (yb3) i1Var, cs3Var);
                    jo3Var.J();
                    break;
                } else {
                    vh3 vh3Var3 = ((pj3) jo3Var.m).r;
                    pj3.m(vh3Var3);
                    vh3Var3.r.b("Discarding data. Failed to send conditional user property to service");
                    break;
                }
        }
    }

    public /* synthetic */ jn3(jo3 jo3Var, cs3 cs3Var, boolean z, i1 i1Var, int i) {
        this.m = i;
        this.n = cs3Var;
        this.o = z;
        this.q = i1Var;
        this.p = jo3Var;
    }
}
