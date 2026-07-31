package u1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i0 extends y0.l implements w1.u {

    /* renamed from: r, reason: collision with root package name */
    public p6.c f7223r;

    /* renamed from: s, reason: collision with root package name */
    public long f7224s;

    @Override // y0.l
    public final boolean g0() {
        return true;
    }

    @Override // w1.u
    public final void o(long j7) {
        if (r2.k.a(this.f7224s, j7)) {
            return;
        }
        this.f7223r.i(new r2.k(j7));
        this.f7224s = j7;
    }
}
