package n6;

/* loaded from: classes.dex */
public final class r0 extends s6.q implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    public final long f7078m;

    public r0(long j, X5.c cVar) {
        super(cVar, cVar.getContext());
        this.f7078m = j;
    }

    @Override // n6.f0
    public final String L() {
        return super.L() + "(timeMillis=" + this.f7078m + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0792z.f(this.f7037i);
        n(new q0("Timed out waiting for " + this.f7078m + " ms", this));
    }
}
