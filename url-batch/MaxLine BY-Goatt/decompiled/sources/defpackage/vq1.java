package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class vq1 {
    public final s03 a;
    public final ah0 b;
    public final ah0 c;
    public boolean d;
    public tq1 e;

    public vq1(s03 s03Var, boolean z) {
        this.a = s03Var;
        ah0 ah0Var = ah0.m;
        this.b = ah0Var;
        this.c = ah0Var;
        this.d = z;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(sq1 sq1Var);

    public abstract void d(sq1 sq1Var);

    public final void e() {
        tq1 tq1Var = this.e;
        if (tq1Var == null || !tq1Var.c.remove(this)) {
            return;
        }
        yq1 yq1Var = tq1Var.b;
        yq1Var.getClass();
        if (equals(yq1Var.f)) {
            if (yq1Var.g == -1) {
                a();
            }
            yq1Var.f = null;
            yq1Var.g = 0;
            yq1Var.h = null;
        }
        yq1Var.d.remove(this);
        yq1Var.e.remove(this);
        this.e = null;
        yq1Var.b();
    }

    public final void f(boolean z) {
        yq1 yq1Var;
        if (this.d == z) {
            return;
        }
        this.d = z;
        tq1 tq1Var = this.e;
        if (tq1Var == null || (yq1Var = tq1Var.b) == null) {
            return;
        }
        yq1Var.b();
    }
}
