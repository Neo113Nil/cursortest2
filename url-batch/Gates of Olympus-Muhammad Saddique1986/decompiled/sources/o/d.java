package o;

import R1.y;
import e2.InterfaceC0426e;
import n.r;
import n0.C0702C;

/* loaded from: classes.dex */
public final class d extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7388h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7389i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f7390j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, V1.d dVar) {
        super(2, dVar);
        this.f7390j = nVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((d) o((V1.d) obj2, (C0702C) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        d dVar2 = new d(this.f7390j, dVar);
        dVar2.f7389i = obj;
        return dVar2;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7388h;
        y yVar = y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            C0702C c0702c = (C0702C) this.f7389i;
            A0.l lVar = new A0.l(26, this.f7390j);
            this.f7388h = 1;
            Object g3 = r.g(c0702c, new e(lVar, null), this);
            if (g3 != aVar) {
                g3 = yVar;
            }
            if (g3 == aVar) {
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
