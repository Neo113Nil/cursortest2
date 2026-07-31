package k2;

/* loaded from: classes.dex */
public final class r0 extends p2.r implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final long f5384h;

    public r0(long j3, s0 s0Var) {
        super(s0Var, s0Var.getContext());
        this.f5384h = j3;
    }

    @Override // k2.f0
    public final String T() {
        return super.T() + "(timeMillis=" + this.f5384h + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0552y.h(this.f5338f);
        s(new q0("Timed out waiting for " + this.f5384h + " ms", this));
    }
}
