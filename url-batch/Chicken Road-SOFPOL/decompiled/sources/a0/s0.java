package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f140e;

    public /* synthetic */ s0(u0 u0Var, int i) {
        this.f139d = i;
        this.f140e = u0Var;
    }

    @Override // p6.a
    public final Object b() {
        switch (this.f139d) {
            case 0:
                z.p pVar = this.f140e.f149s.f9013a;
                return Float.valueOf((((m0.e1) pVar.f9081e.f3283b).g() * 500) + ((m0.e1) pVar.f9081e.f3284c).g());
            case 1:
                z.p pVar2 = this.f140e.f149s.f9013a;
                int g3 = ((m0.e1) pVar2.f9081e.f3283b).g();
                int g7 = ((m0.e1) pVar2.f9081e.f3284c).g();
                return Float.valueOf(pVar2.d() ? (g3 * 500) + g7 + 100 : (g3 * 500) + g7);
            default:
                u0 u0Var = this.f140e;
                z.p pVar3 = u0Var.f149s.f9013a;
                int g8 = (int) (pVar3.g().f9053o == u.j0.f7027d ? pVar3.g().g() & 4294967295L : pVar3.g().g() >> 32);
                z.p pVar4 = u0Var.f149s.f9013a;
                return Float.valueOf(g8 - ((-pVar4.g().f9050l) + pVar4.g().f9054p));
        }
    }
}
