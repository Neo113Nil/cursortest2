package t;

import e2.InterfaceC0426e;
import n.e0;
import q2.InterfaceC0835w;
import s.C0935d;
import s.C0948q;
import s.C0951t;
import z.C1256t;

/* loaded from: classes.dex */
public final class E extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f8428h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F f8429i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8430j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f3, int i3, V1.d dVar) {
        super(2, dVar);
        this.f8429i = f3;
        this.f8430j = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((E) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new E(this.f8429i, this.f8430j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f8428h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            C0935d c0935d = this.f8429i.f8432r;
            this.f8428h = 1;
            c0935d.getClass();
            C1256t c1256t = C0951t.f8316w;
            C0951t c0951t = c0935d.f8226a;
            c0951t.getClass();
            Object d3 = c0951t.d(e0.f7122d, new C0948q(c0951t, this.f8430j, 0, null), this);
            if (d3 != aVar) {
                d3 = yVar;
            }
            if (d3 != aVar) {
                d3 = yVar;
            }
            if (d3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return yVar;
    }
}
