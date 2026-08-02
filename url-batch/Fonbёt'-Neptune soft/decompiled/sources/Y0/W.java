package Y0;

/* loaded from: classes.dex */
public final class W extends U {

    /* renamed from: i, reason: collision with root package name */
    public final Z f1181i;

    /* renamed from: j, reason: collision with root package name */
    public final X f1182j;

    /* renamed from: k, reason: collision with root package name */
    public final C0116j f1183k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1184l;

    public W(Z z2, X x2, C0116j c0116j, Object obj) {
        this.f1181i = z2;
        this.f1182j = x2;
        this.f1183k = c0116j;
        this.f1184l = obj;
    }

    @Override // P0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return F0.h.f469a;
    }

    @Override // Y0.U
    public final void o(Throwable th) {
        C0116j c0116j = this.f1183k;
        Z z2 = this.f1181i;
        z2.getClass();
        C0116j M2 = Z.M(c0116j);
        X x2 = this.f1182j;
        Object obj = this.f1184l;
        if (M2 != null) {
            while (AbstractC0127v.e(M2.f1210i, false, new W(z2, x2, M2, obj), 1) == b0.f1197e) {
                M2 = Z.M(M2);
                if (M2 == null) {
                }
            }
            return;
        }
        z2.q(z2.z(x2, obj));
    }
}
