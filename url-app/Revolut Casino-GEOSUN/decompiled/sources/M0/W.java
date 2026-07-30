package M0;

import u0.C0247g;

/* loaded from: classes.dex */
public final class W extends U {

    /* renamed from: i, reason: collision with root package name */
    public final Z f638i;

    /* renamed from: j, reason: collision with root package name */
    public final X f639j;

    /* renamed from: k, reason: collision with root package name */
    public final C0052j f640k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f641l;

    public W(Z z2, X x2, C0052j c0052j, Object obj) {
        this.f638i = z2;
        this.f639j = x2;
        this.f640k = c0052j;
        this.f641l = obj;
    }

    @Override // E0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return C0247g.f3005a;
    }

    @Override // M0.U
    public final void o(Throwable th) {
        C0052j c0052j = this.f640k;
        Z z2 = this.f638i;
        z2.getClass();
        C0052j K2 = Z.K(c0052j);
        X x2 = this.f639j;
        Object obj = this.f641l;
        if (K2 != null) {
            while (AbstractC0063v.e(K2.f667i, false, new W(z2, x2, K2, obj), 1) == b0.f654e) {
                K2 = Z.K(K2);
                if (K2 == null) {
                }
            }
            return;
        }
        z2.o(z2.x(x2, obj));
    }
}
