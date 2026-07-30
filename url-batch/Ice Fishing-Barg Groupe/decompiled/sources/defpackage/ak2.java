package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ak2 extends f02 implements Runnable {
    public final long r3s1LDPKFs1S;

    public ak2(long j, ct ctVar) {
        super(ctVar, ctVar.e9gEMXR7LXtO());
        this.r3s1LDPKFs1S = j;
    }

    @Override // defpackage.et0
    public final String bEKsvqmvPh2y() {
        return super.bEKsvqmvPh2y() + "(timeMillis=" + this.r3s1LDPKFs1S + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.S9EYkSpbGuxq(this.x50lh2ztY7Y5);
        VhhvGxCb8gfr(new zj2("Timed out waiting for " + this.r3s1LDPKFs1S + " ms", this));
    }
}
