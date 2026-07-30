package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vm3 implements Runnable {
    public final /* synthetic */ tm3 m;
    public final /* synthetic */ tm3 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ dn3 q;

    public vm3(dn3 dn3Var, tm3 tm3Var, tm3 tm3Var2, long j, boolean z) {
        this.m = tm3Var;
        this.n = tm3Var2;
        this.o = j;
        this.p = z;
        this.q = dn3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.G(this.m, this.n, this.o, this.p, null);
    }
}
