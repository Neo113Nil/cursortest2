package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n1 extends f7.q implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final long f284h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n1(long j7, o1 o1Var) {
        super(o1Var, r0);
        g6.h hVar = o1Var.f3460e;
        q6.i.b(hVar);
        this.f284h = j7;
    }

    @Override // a7.a1
    public final String U() {
        return super.U() + "(timeMillis=" + this.f284h + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.f(this.f239f);
        B(new m1("Timed out waiting for " + this.f284h + " ms", this));
    }
}
