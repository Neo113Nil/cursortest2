package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v0 extends q6.j implements p6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0 f7796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(w0 w0Var, int i) {
        super(0);
        this.f7795e = i;
        this.f7796f = w0Var;
    }

    @Override // p6.a
    public final Object b() {
        u1.k0 placementScope;
        switch (this.f7795e) {
            case 0:
                w0 w0Var = this.f7796f;
                j0 j0Var = w0Var.i;
                j0Var.i = 0;
                o0.e x7 = j0Var.f7686a.x();
                Object[] objArr = x7.f5578d;
                int i = x7.f5580f;
                for (int i8 = 0; i8 < i; i8++) {
                    w0 w0Var2 = ((f0) objArr[i8]).G.f7700p;
                    w0Var2.f7801k = w0Var2.f7802l;
                    w0Var2.f7802l = Integer.MAX_VALUE;
                    w0Var2.f7812v = false;
                    if (w0Var2.f7805o == d0.f7611e) {
                        w0Var2.f7805o = d0.f7612f;
                    }
                }
                f0 f0Var = j0Var.f7686a;
                f0 f0Var2 = j0Var.f7686a;
                o0.e x8 = f0Var.x();
                Object[] objArr2 = x8.f5578d;
                int i9 = x8.f5580f;
                for (int i10 = 0; i10 < i9; i10++) {
                    ((f0) objArr2[i10]).G.f7700p.f7816z.getClass();
                }
                w0Var.m().m0().b();
                o0.e x9 = f0Var2.x();
                Object[] objArr3 = x9.f5578d;
                int i11 = x9.f5580f;
                for (int i12 = 0; i12 < i11; i12++) {
                    f0 f0Var3 = (f0) objArr3[i12];
                    j0 j0Var2 = f0Var3.G;
                    if (j0Var2.f7700p.f7801k != f0Var3.t()) {
                        f0Var2.N();
                        f0Var2.A();
                        if (f0Var3.t() == Integer.MAX_VALUE) {
                            if (j0Var2.f7688c) {
                                s0 s0Var = j0Var2.f7701q;
                                q6.i.b(s0Var);
                                s0Var.Z(false);
                            }
                            j0Var2.f7700p.f0();
                        }
                    }
                }
                o0.e x10 = f0Var2.x();
                Object[] objArr4 = x10.f5578d;
                int i13 = x10.f5580f;
                for (int i14 = 0; i14 < i13; i14++) {
                    g0 g0Var = ((f0) objArr4[i14]).G.f7700p.f7816z;
                    g0Var.getClass();
                    g0Var.f7667c = false;
                }
                break;
            case 1:
                w0 w0Var3 = this.f7796f;
                w0Var3.i.a().e(w0Var3.D);
                break;
            default:
                w0 w0Var4 = this.f7796f;
                j0 j0Var3 = w0Var4.i;
                d1 d1Var = j0Var3.a().f7616t;
                if (d1Var == null || (placementScope = d1Var.f7731o) == null) {
                    placementScope = ((x1.t) i0.a(j0Var3.f7686a)).getPlacementScope();
                }
                p6.c cVar = w0Var4.I;
                if (cVar == null) {
                    d1 a8 = j0Var3.a();
                    long j7 = w0Var4.J;
                    float f6 = w0Var4.K;
                    placementScope.getClass();
                    u1.k0.a(placementScope, a8);
                    a8.U(r2.i.c(j7, a8.f7234h), f6, null);
                } else {
                    d1 a9 = j0Var3.a();
                    long j8 = w0Var4.J;
                    float f8 = w0Var4.K;
                    placementScope.getClass();
                    u1.k0.a(placementScope, a9);
                    a9.U(r2.i.c(j8, a9.f7234h), f8, cVar);
                }
                break;
        }
        return c6.m.f1757a;
    }
}
