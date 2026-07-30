package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qd2 implements fd1, AutoCloseable {
    public final String m;
    public final pd2 n;
    public boolean o;

    public qd2(String str, pd2 pd2Var) {
        this.m = str;
        this.n = pd2Var;
    }

    @Override // defpackage.fd1
    public final void o(id1 id1Var, yc1 yc1Var) {
        if (yc1Var == yc1.ON_DESTROY) {
            this.o = false;
            id1Var.getLifecycle().c(this);
        }
    }

    public final void p(ad1 ad1Var, wd2 wd2Var) {
        wd2Var.getClass();
        ad1Var.getClass();
        if (this.o) {
            lh.g("Already attached to lifecycleOwner");
            return;
        }
        this.o = true;
        ad1Var.a(this);
        wd2Var.c(this.m, (gc0) this.n.b.r);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
