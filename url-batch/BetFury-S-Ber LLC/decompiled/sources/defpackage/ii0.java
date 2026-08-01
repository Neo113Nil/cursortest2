package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ii0 extends vb0 implements Runnable {
    public final long j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ii0(long j, ie ieVar) {
        super(r0, ieVar);
        qg qgVar = ieVar.g;
        qgVar.getClass();
        this.j = j;
    }

    @Override // defpackage.mw
    public final String H() {
        return super.H() + "(timeMillis=" + this.j + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        d50.t(this.h);
        g(new hi0("Timed out waiting for " + this.j + " ms", this));
    }
}
