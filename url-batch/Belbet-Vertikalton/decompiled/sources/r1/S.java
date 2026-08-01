package r1;

/* loaded from: classes.dex */
public final class S extends Q {
    public final V e;

    /* renamed from: f, reason: collision with root package name */
    public final T f4050f;

    /* renamed from: g, reason: collision with root package name */
    public final C0359i f4051g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4052h;

    public S(V v2, T t2, C0359i c0359i, Object obj) {
        this.e = v2;
        this.f4050f = t2;
        this.f4051g = c0359i;
        this.f4052h = obj;
    }

    @Override // i1.InterfaceC0192l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return W0.i.f1345a;
    }

    @Override // r1.Q
    public final void o(Throwable th) {
        C0359i c0359i = this.f4051g;
        V v2 = this.e;
        v2.getClass();
        C0359i y2 = V.y(c0359i);
        T t2 = this.f4050f;
        Object obj = this.f4052h;
        if (y2 != null) {
            while (AbstractC0369t.f(y2.e, false, new S(v2, t2, y2, obj), 1) == X.f4062a) {
                y2 = V.y(y2);
                if (y2 == null) {
                }
            }
            return;
        }
        v2.e(v2.n(t2, obj));
    }
}
