package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tx2 extends we2 implements Runnable {
    public final long s;

    public tx2(long j, r30 r30Var) {
        super(r30Var, r30Var.getContext());
        this.s = j;
    }

    @Override // defpackage.n61
    public final String W() {
        return super.W() + "(timeMillis=" + this.s + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        n90.b(this.q);
        u(new sx2("Timed out waiting for " + this.s + " ms", this));
    }
}
