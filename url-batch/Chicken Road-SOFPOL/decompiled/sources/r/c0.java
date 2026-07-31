package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0.e f6242a = new o0.e(new a0[16]);

    /* renamed from: b, reason: collision with root package name */
    public final m0.h1 f6243b = m0.b.q(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public long f6244c = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final m0.h1 f6245d = m0.b.q(Boolean.TRUE);

    public final void a(m0.s sVar, int i) {
        sVar.W(-318043801);
        int i8 = (sVar.h(this) ? 4 : 2) | i;
        if (sVar.N(i8 & 1, (i8 & 3) != 2)) {
            Object K = sVar.K();
            m0.v0 v0Var = m0.n.f5019a;
            if (K == v0Var) {
                K = m0.b.q(null);
                sVar.f0(K);
            }
            m0.z0 z0Var = (m0.z0) K;
            if (((Boolean) this.f6245d.getValue()).booleanValue() || ((Boolean) this.f6243b.getValue()).booleanValue()) {
                sVar.V(-144783432);
                boolean h8 = sVar.h(this);
                Object K2 = sVar.K();
                if (h8 || K2 == v0Var) {
                    K2 = new c2.a(z0Var, this, null);
                    sVar.f0(K2);
                }
                m0.b.f(this, sVar, (p6.e) K2);
                sVar.p(false);
            } else {
                sVar.V(-143396709);
                sVar.p(false);
            }
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new b6.j0(i, 7, this);
        }
    }
}
