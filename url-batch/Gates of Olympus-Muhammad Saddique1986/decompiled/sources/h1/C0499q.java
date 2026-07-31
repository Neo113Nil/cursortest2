package h1;

import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.EnumC0836x;
import q2.m0;
import t2.C1058k;

/* renamed from: h1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499q extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f6184h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6185i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M f6186j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0499q(M m3, V1.d dVar) {
        super(2, dVar);
        this.f6186j = m3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0499q) o((V1.d) obj2, (s2.t) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0499q c0499q = new C0499q(this.f6186j, dVar);
        c0499q.f6185i = obj;
        return c0499q;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6184h;
        if (i3 == 0) {
            R1.a.e(obj);
            s2.t tVar = (s2.t) this.f6185i;
            EnumC0836x enumC0836x = EnumC0836x.f7935e;
            M m3 = this.f6186j;
            m0 r3 = AbstractC0837y.r(tVar, null, enumC0836x, new C0498p(m3, null), 1);
            C1058k c1058k = new C1058k(new G.h(new C0496n(r3, null), 2, m3.f6096h), new c.d(r3, null, 1));
            F.C c2 = new F.C(1, tVar);
            this.f6184h = 1;
            if (c1058k.d(c2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return R1.y.f4171a;
    }
}
