package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u0 implements p6.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8300e;

    public /* synthetic */ u0(int i, Object obj) {
        this.f8299d = i;
        this.f8300e = obj;
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f8299d) {
            case 0:
                m0.s sVar = (m0.s) obj2;
                ((Number) obj3).intValue();
                sVar.V(-1608161351);
                p6.c cVar = (p6.c) this.f8300e;
                boolean f6 = sVar.f(cVar);
                Object K = sVar.K();
                if (f6 || K == m0.n.f5019a) {
                    K = new s(cVar);
                    sVar.f0(K);
                }
                s sVar2 = (s) K;
                sVar.p(false);
                return sVar2;
            default:
                m0.s sVar3 = (m0.s) obj2;
                ((Number) obj3).intValue();
                sVar3.V(-1415685722);
                r0 r0Var = (r0) this.f8300e;
                boolean f8 = sVar3.f(r0Var);
                Object K2 = sVar3.K();
                if (f8 || K2 == m0.n.f5019a) {
                    K2 = new a0(r0Var);
                    sVar3.f0(K2);
                }
                a0 a0Var = (a0) K2;
                sVar3.p(false);
                return a0Var;
        }
    }
}
