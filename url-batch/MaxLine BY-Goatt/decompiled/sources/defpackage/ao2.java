package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ao2 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ bo2 n;
    public final /* synthetic */ d90 o;

    public /* synthetic */ ao2(d90 d90Var, bo2 bo2Var, int i) {
        this.m = i;
        this.o = d90Var;
        this.n = bo2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        bo2 bo2Var = this.n;
        d90 d90Var = this.o;
        switch (i) {
            case 0:
                if (d90Var.b.contains(bo2Var)) {
                    in1.a(bo2Var.c.mView, bo2Var.a);
                    break;
                }
                break;
            default:
                d90Var.b.remove(bo2Var);
                d90Var.c.remove(bo2Var);
                break;
        }
    }
}
