package o1;

/* loaded from: classes.dex */
public final class Q extends P {

    /* renamed from: e, reason: collision with root package name */
    public final U f3318e;

    /* renamed from: f, reason: collision with root package name */
    public final S f3319f;

    /* renamed from: g, reason: collision with root package name */
    public final C0289h f3320g;
    public final Object h;

    public Q(U u2, S s2, C0289h c0289h, Object obj) {
        this.f3318e = u2;
        this.f3319f = s2;
        this.f3320g = c0289h;
        this.h = obj;
    }

    @Override // f1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return U0.i.f864a;
    }

    @Override // o1.P
    public final void o(Throwable th) {
        C0289h c0289h = this.f3320g;
        U u2 = this.f3318e;
        u2.getClass();
        C0289h C2 = U.C(c0289h);
        S s2 = this.f3319f;
        Object obj = this.h;
        if (C2 != null) {
            while (AbstractC0299s.f(C2.f3342e, false, new Q(u2, s2, C2, obj), 1) == W.f3329a) {
                C2 = U.C(C2);
                if (C2 == null) {
                }
            }
            return;
        }
        u2.f(u2.r(s2, obj));
    }
}
