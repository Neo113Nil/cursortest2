package e1;

import k2.AbstractC0552y;
import k2.EnumC0551x;
import k2.m0;
import n2.C0705k;

/* renamed from: e1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368q extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f4731e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0351N f4733g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0368q(C0351N c0351n, P1.d dVar) {
        super(2, dVar);
        this.f4733g = c0351n;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0368q c0368q = new C0368q(this.f4733g, dVar);
        c0368q.f4732f = obj;
        return c0368q;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0368q) create((m2.r) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4731e;
        if (i3 == 0) {
            I2.l.Q(obj);
            m2.r rVar = (m2.r) this.f4732f;
            EnumC0551x enumC0551x = EnumC0551x.f5396e;
            C0351N c0351n = this.f4733g;
            m0 q2 = AbstractC0552y.q(rVar, null, enumC0551x, new C0367p(c0351n, null), 1);
            C0705k c0705k = new C0705k(new G.d(new C0365n(q2, null), 1, c0351n.f4643e), new c.d(q2, null, 1));
            G1.o oVar = new G1.o(3, rVar);
            this.f4731e = 1;
            if (c0705k.collect(oVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
