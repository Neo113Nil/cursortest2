package W0;

/* loaded from: classes.dex */
public final class W extends U {

    /* renamed from: i, reason: collision with root package name */
    public final Z f927i;

    /* renamed from: j, reason: collision with root package name */
    public final X f928j;

    /* renamed from: k, reason: collision with root package name */
    public final C0070j f929k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f930l;

    public W(Z z2, X x2, C0070j c0070j, Object obj) {
        this.f927i = z2;
        this.f928j = x2;
        this.f929k = c0070j;
        this.f930l = obj;
    }

    @Override // O0.l
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        p((Throwable) obj);
        return D0.h.f206a;
    }

    @Override // W0.U
    public final void p(Throwable th) {
        C0070j L2 = Z.L(this.f929k);
        Z z2 = this.f927i;
        X x2 = this.f928j;
        Object obj = this.f930l;
        if (L2 != null) {
            while (AbstractC0081v.e(L2.f956i, false, new W(z2, x2, L2, obj), 1) == b0.f943e) {
                L2 = Z.L(L2);
                if (L2 == null) {
                }
            }
            return;
        }
        z2.p(z2.y(x2, obj));
    }
}
