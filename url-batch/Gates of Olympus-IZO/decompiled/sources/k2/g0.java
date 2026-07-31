package k2;

/* loaded from: classes.dex */
public final class g0 extends m0 {

    /* renamed from: g, reason: collision with root package name */
    public final P1.d f5360g;

    public g0(P1.i iVar, Y1.e eVar) {
        super(iVar, false);
        this.f5360g = M1.B.w(this, this, eVar);
    }

    @Override // k2.f0
    public final void X() {
        try {
            p2.a.j(M1.B.G(this.f5360g), L1.z.f2729a);
        } catch (Throwable th) {
            resumeWith(I2.l.t(th));
            throw th;
        }
    }
}
