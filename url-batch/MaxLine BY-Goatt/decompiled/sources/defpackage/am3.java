package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class am3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ xk3 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ jm3 q;

    public /* synthetic */ am3(jm3 jm3Var, xk3 xk3Var, long j, boolean z, int i) {
        this.m = i;
        this.n = xk3Var;
        this.o = j;
        this.p = z;
        this.q = jm3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        long j = this.o;
        boolean z = this.p;
        xk3 xk3Var = this.n;
        jm3 jm3Var = this.q;
        switch (i) {
            case 0:
                jm3Var.A(xk3Var);
                jm3Var.M(xk3Var, j, z);
                break;
            default:
                jm3Var.A(xk3Var);
                jm3Var.M(xk3Var, j, z);
                break;
        }
    }
}
