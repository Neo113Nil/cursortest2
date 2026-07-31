package u0;

import e2.InterfaceC0426e;
import p.C0758d0;
import q2.C0821h;

/* loaded from: classes.dex */
public final class Q extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9242h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9243i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f9244j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s3, V1.d dVar) {
        super(2, dVar);
        this.f9244j = s3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Q) o((V1.d) obj2, (C1122r0) obj)).q(R1.y.f4171a);
        return W1.a.f4608d;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        Q q3 = new Q(this.f9244j, dVar);
        q3.f9243i = obj;
        return q3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9242h;
        if (i3 == 0) {
            R1.a.e(obj);
            C1122r0 c1122r0 = (C1122r0) this.f9243i;
            this.f9243i = c1122r0;
            S s3 = this.f9244j;
            this.f9242h = 1;
            C0821h c0821h = new C0821h(1, l0.c.B(this));
            c0821h.r();
            I0.A a3 = s3.f9266e;
            I0.u uVar = a3.f3005a;
            uVar.h();
            a3.f3006b.set(new I0.F(a3, uVar));
            c0821h.v(new C0758d0(c1122r0, 8, s3));
            if (c0821h.q() == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        throw new C1.c();
    }
}
