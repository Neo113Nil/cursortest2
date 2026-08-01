package k0;

/* loaded from: classes.dex */
public final class P extends O {

    /* renamed from: f, reason: collision with root package name */
    public final T f891f;

    /* renamed from: g, reason: collision with root package name */
    public final Q f892g;

    /* renamed from: h, reason: collision with root package name */
    public final C0048i f893h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f894i;

    public P(T t, Q q2, C0048i c0048i, Object obj) {
        this.f891f = t;
        this.f892g = q2;
        this.f893h = c0048i;
        this.f894i = obj;
    }

    @Override // d0.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return U.g.f433a;
    }

    @Override // k0.O
    public final void o(Throwable th) {
        C0048i c0048i = this.f893h;
        T t = this.f891f;
        t.getClass();
        C0048i D2 = T.D(c0048i);
        Q q2 = this.f892g;
        Object obj = this.f894i;
        if (D2 != null) {
            while (AbstractC0058t.d(D2.f919f, false, new P(t, q2, D2, obj), 1) == V.f905b) {
                D2 = T.D(D2);
                if (D2 == null) {
                }
            }
            return;
        }
        t.m(t.u(q2, obj));
    }
}
