package x;

import e2.InterfaceC0426e;
import n0.C0702C;
import p.S0;
import p.U0;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* renamed from: x.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1212z extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10290h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0702C f10291i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B.a0 f10292j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1212z(C0702C c0702c, B.a0 a0Var, V1.d dVar) {
        super(2, dVar);
        this.f10291i = c0702c;
        this.f10292j = a0Var;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1212z) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C1212z(this.f10291i, this.f10292j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10290h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            C1198k c1198k = new C1198k(this.f10292j, 1);
            this.f10290h = 1;
            Object e3 = AbstractC0837y.e(new S0(this.f10291i, U0.f7613a, null, null, c1198k, null), this);
            if (e3 != aVar) {
                e3 = yVar;
            }
            if (e3 == aVar) {
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
