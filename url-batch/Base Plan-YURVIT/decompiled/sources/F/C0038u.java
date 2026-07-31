package F;

import W0.AbstractC0081v;
import a.AbstractC0086a;

/* renamed from: F.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038u extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public C0022d f430i;

    /* renamed from: j, reason: collision with root package name */
    public int f431j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f432k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f433l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0038u(P p2, G0.d dVar) {
        super(2, dVar);
        this.f433l = p2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        C0038u c0038u = new C0038u(this.f433l, dVar);
        c0038u.f432k = obj;
        return c0038u;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((C0038u) b((G0.d) obj2, (Z0.e) obj)).m(D0.h.f206a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r2.a(r12, r11) == r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if ((r0 instanceof F.b0) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        Z0.e eVar;
        l0 l0Var;
        int i2 = this.f431j;
        D0.h hVar = D0.h.f206a;
        P p2 = this.f433l;
        H0.a aVar = H0.a.f511e;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            Z0.e eVar2 = (Z0.e) this.f432k;
            this.f432k = eVar2;
            this.f431j = 1;
            Object m2 = AbstractC0081v.m(p2.f290g.c(), new I(p2, null), this);
            if (m2 != aVar) {
                eVar = eVar2;
                obj = m2;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0086a.I(obj);
                return hVar;
            }
            l0Var = this.f430i;
            eVar = (Z0.e) this.f432k;
            AbstractC0086a.I(obj);
            Z0.i iVar = new Z0.i(new B0.E(3, new N.P(4, new N.P(5, new N.P(3, new C0034p(p2, null), (Z0.p) p2.f295l.f20f), new C0035q(2, null)), new r(l0Var, null))), new C0036s(p2, (I0.b) null));
            this.f432k = null;
            this.f430i = null;
            this.f431j = 3;
            if (!(eVar instanceof Z0.s)) {
                throw ((Z0.s) eVar).f1134e;
            }
            Object m3 = iVar.m(eVar, this);
            if (m3 != aVar) {
                m3 = hVar;
            }
            return m3 == aVar ? aVar : hVar;
        }
        Z0.e eVar3 = (Z0.e) this.f432k;
        AbstractC0086a.I(obj);
        eVar = eVar3;
        l0Var = (l0) obj;
        if (l0Var instanceof C0022d) {
            Object obj2 = ((C0022d) l0Var).f342b;
            this.f432k = eVar;
            this.f430i = (C0022d) l0Var;
            this.f431j = 2;
        } else {
            if (l0Var instanceof m0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (l0Var instanceof d0) {
                throw ((d0) l0Var).f344b;
            }
        }
        Z0.i iVar2 = new Z0.i(new B0.E(3, new N.P(4, new N.P(5, new N.P(3, new C0034p(p2, null), (Z0.p) p2.f295l.f20f), new C0035q(2, null)), new r(l0Var, null))), new C0036s(p2, (I0.b) null));
        this.f432k = null;
        this.f430i = null;
        this.f431j = 3;
        if (!(eVar instanceof Z0.s)) {
        }
    }
}
