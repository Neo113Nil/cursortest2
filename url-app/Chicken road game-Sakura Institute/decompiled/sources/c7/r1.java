package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r1 extends h7.p implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public final long f1737j;

    public r1(long j8, s1 s1Var) {
        super(s1Var, s1Var.getContext());
        this.f1737j = j8;
    }

    @Override // c7.f1
    public final String R() {
        return super.R() + "(timeMillis=" + this.f1737j + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0.h(this.f1659h);
        m(new q1("Timed out waiting for " + this.f1737j + " ms", this));
    }
}
