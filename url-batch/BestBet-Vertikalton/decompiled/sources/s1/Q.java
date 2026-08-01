package s1;

/* loaded from: classes.dex */
public final class Q extends P {

    /* renamed from: e, reason: collision with root package name */
    public final U f4021e;

    /* renamed from: f, reason: collision with root package name */
    public final S f4022f;

    /* renamed from: g, reason: collision with root package name */
    public final C0325h f4023g;
    public final Object h;

    public Q(U u2, S s2, C0325h c0325h, Object obj) {
        this.f4021e = u2;
        this.f4022f = s2;
        this.f4023g = c0325h;
        this.h = obj;
    }

    @Override // j1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return X0.g.f1277c;
    }

    @Override // s1.P
    public final void o(Throwable th) {
        C0325h c0325h = this.f4023g;
        U u2 = this.f4021e;
        u2.getClass();
        C0325h D2 = U.D(c0325h);
        S s2 = this.f4022f;
        Object obj = this.h;
        if (D2 != null) {
            while (AbstractC0335s.e(D2.f4045e, false, new Q(u2, s2, D2, obj), 1) == W.f4032a) {
                D2 = U.D(D2);
                if (D2 == null) {
                }
            }
            return;
        }
        u2.g(u2.t(s2, obj));
    }
}
