package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z80 implements Runnable {
    public final /* synthetic */ bo2 m;
    public final /* synthetic */ bo2 n;
    public final /* synthetic */ boolean o;

    public z80(bo2 bo2Var, bo2 bo2Var2, boolean z, hi hiVar) {
        this.m = bo2Var;
        this.n = bo2Var2;
        this.o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fr0 fr0Var = this.m.c;
        fr0 fr0Var2 = this.n.c;
        vs0 vs0Var = qs0.a;
        if (this.o) {
            fr0Var2.getEnterTransitionCallback();
        } else {
            fr0Var.getEnterTransitionCallback();
        }
    }
}
