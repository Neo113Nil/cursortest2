package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e1 implements Runnable {
    public final h1 m;
    public final bf1 n;

    public e1(h1 h1Var, bf1 bf1Var) {
        this.m = h1Var;
        this.n = bf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.m.value != this) {
            return;
        }
        if (h1.ATOMIC_HELPER.b(this.m, this, h1.getFutureValue(this.n))) {
            h1.complete(this.m);
        }
    }
}
