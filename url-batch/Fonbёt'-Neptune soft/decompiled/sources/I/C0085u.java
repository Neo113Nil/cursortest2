package I;

import Y0.AbstractC0127v;

/* renamed from: I.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085u extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public C0069d f709i;

    /* renamed from: j, reason: collision with root package name */
    public int f710j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f711k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f712l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0085u(P p2, H0.d dVar) {
        super(2, dVar);
        this.f712l = p2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        C0085u c0085u = new C0085u(this.f712l, dVar);
        c0085u.f711k = obj;
        return c0085u;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0085u) b((H0.d) obj2, (b1.e) obj)).l(F0.h.f469a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    @Override // J0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        b1.e eVar;
        k0 k0Var;
        I0.a aVar = I0.a.f733e;
        int i2 = this.f710j;
        F0.h hVar = F0.h.f469a;
        P p2 = this.f712l;
        if (i2 == 0) {
            i1.a.G(obj);
            b1.e eVar2 = (b1.e) this.f711k;
            this.f711k = eVar2;
            this.f710j = 1;
            Object n2 = AbstractC0127v.n(p2.f571g.h(), new I(p2, null), this);
            if (n2 == aVar) {
                return aVar;
            }
            eVar = eVar2;
            obj = n2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i1.a.G(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k0Var = this.f709i;
                eVar = (b1.e) this.f711k;
                i1.a.G(obj);
                b1.i iVar = new b1.i(new B.m(5, new P.O(5, new P.O(6, new P.O(4, new C0081p(p2, null), (b1.p) p2.f576l.f78f), new C0082q(2, null)), new r(k0Var, null))), new C0083s(p2, (H0.d) null));
                this.f711k = null;
                this.f709i = null;
                this.f710j = 3;
                if (!(eVar instanceof b1.s)) {
                    throw ((b1.s) eVar).f1962e;
                }
                Object k2 = iVar.k(eVar, this);
                if (k2 != aVar) {
                    k2 = hVar;
                }
                return k2 == aVar ? aVar : hVar;
            }
            b1.e eVar3 = (b1.e) this.f711k;
            i1.a.G(obj);
            eVar = eVar3;
        }
        k0Var = (k0) obj;
        if (k0Var instanceof C0069d) {
            Object obj2 = ((C0069d) k0Var).f623b;
            this.f711k = eVar;
            this.f709i = (C0069d) k0Var;
            this.f710j = 2;
            if (eVar.a(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (k0Var instanceof l0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (k0Var instanceof d0) {
                throw ((d0) k0Var).f625b;
            }
            if (k0Var instanceof b0) {
                return hVar;
            }
        }
        b1.i iVar2 = new b1.i(new B.m(5, new P.O(5, new P.O(6, new P.O(4, new C0081p(p2, null), (b1.p) p2.f576l.f78f), new C0082q(2, null)), new r(k0Var, null))), new C0083s(p2, (H0.d) null));
        this.f711k = null;
        this.f709i = null;
        this.f710j = 3;
        if (!(eVar instanceof b1.s)) {
        }
    }
}
