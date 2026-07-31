package q2;

/* loaded from: classes.dex */
public final class r0 extends v2.q implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final long f7923h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r0(long j3, s0 s0Var) {
        super(s0Var, r0);
        V1.i iVar = s0Var.f4642e;
        f2.j.c(iVar);
        this.f7923h = j3;
    }

    @Override // q2.f0
    public final String X() {
        return super.X() + "(timeMillis=" + this.f7923h + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0837y.i(this.f7877f);
        E(new q0("Timed out waiting for " + this.f7923h + " ms", this));
    }
}
