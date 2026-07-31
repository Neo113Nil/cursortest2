package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f3757e;

    public /* synthetic */ l0(m0 m0Var, int i) {
        this.f3756d = i;
        this.f3757e = m0Var;
    }

    @Override // p6.a
    public final Object b() {
        int i = this.f3756d;
        m0 m0Var = this.f3757e;
        switch (i) {
            case 0:
                if (((v1) w1.f.i(m0Var, w1.f3934a)) == null) {
                    i0.a aVar = m0Var.f3772x;
                    if (aVar != null) {
                        m0Var.s0(aVar);
                    }
                    m0Var.f3772x = null;
                } else if (m0Var.f3772x == null) {
                    b1.b bVar = new b1.b(15, m0Var);
                    l0 l0Var = new l0(m0Var, 1);
                    v.i iVar = m0Var.f3768t;
                    boolean z3 = m0Var.f3769u;
                    float f6 = m0Var.f3770v;
                    r.q1 q1Var = i0.f.f3277a;
                    i0.a aVar2 = new i0.a(iVar, z3, f6, bVar, l0Var);
                    m0Var.r0(aVar2);
                    m0Var.f3772x = aVar2;
                }
                return c6.m.f1757a;
            default:
                return m.f3767c;
        }
    }
}
