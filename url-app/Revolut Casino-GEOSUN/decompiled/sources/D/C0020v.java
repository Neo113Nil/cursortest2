package D;

import M0.AbstractC0063v;
import u0.C0247g;

/* renamed from: D.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020v extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public C0003d f268i;

    /* renamed from: j, reason: collision with root package name */
    public int f269j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f270k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f271l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0020v(S s2, w0.d dVar) {
        super(2, dVar);
        this.f271l = s2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        C0020v c0020v = new C0020v(this.f271l, dVar);
        c0020v.f270k = obj;
        return c0020v;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0020v) b((P0.e) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    @Override // y0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        P0.e eVar;
        m0 m0Var;
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f269j;
        C0247g c0247g = C0247g.f3005a;
        S s2 = this.f271l;
        if (i2 == 0) {
            o.g.z(obj);
            P0.e eVar2 = (P0.e) this.f270k;
            this.f270k = eVar2;
            this.f269j = 1;
            Object n2 = AbstractC0063v.n(s2.f128g.m(), new J(s2, null), this);
            if (n2 == aVar) {
                return aVar;
            }
            eVar = eVar2;
            obj = n2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        o.g.z(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m0Var = this.f268i;
                eVar = (P0.e) this.f270k;
                o.g.z(obj);
                P0.i iVar = new P0.i(new A.j(2, new L.Q(2, new L.Q(3, new L.Q(1, new C0015p(s2, null), (P0.q) s2.f133l.f30f), new C0016q(2, null)), new r(m0Var, null))), new C0017s(s2, (w0.d) null));
                this.f270k = null;
                this.f268i = null;
                this.f269j = 3;
                if (!(eVar instanceof P0.t)) {
                    throw ((P0.t) eVar).f829e;
                }
                Object d2 = iVar.d(eVar, this);
                if (d2 != aVar) {
                    d2 = c0247g;
                }
                return d2 == aVar ? aVar : c0247g;
            }
            P0.e eVar3 = (P0.e) this.f270k;
            o.g.z(obj);
            eVar = eVar3;
        }
        m0Var = (m0) obj;
        if (m0Var instanceof C0003d) {
            Object obj2 = ((C0003d) m0Var).f175b;
            this.f270k = eVar;
            this.f268i = (C0003d) m0Var;
            this.f269j = 2;
            if (eVar.a(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (m0Var instanceof n0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (m0Var instanceof f0) {
                throw ((f0) m0Var).f189b;
            }
            if (m0Var instanceof d0) {
                return c0247g;
            }
        }
        P0.i iVar2 = new P0.i(new A.j(2, new L.Q(2, new L.Q(3, new L.Q(1, new C0015p(s2, null), (P0.q) s2.f133l.f30f), new C0016q(2, null)), new r(m0Var, null))), new C0017s(s2, (w0.d) null));
        this.f270k = null;
        this.f268i = null;
        this.f269j = 3;
        if (!(eVar instanceof P0.t)) {
        }
    }
}
