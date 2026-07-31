package p;

import e2.InterfaceC0426e;
import n0.C0700A;
import n0.EnumC0712j;

/* loaded from: classes.dex */
public final class I0 extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public int f7536f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7537g;

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((I0) o((V1.d) obj2, (C0700A) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        I0 i02 = new I0(2, dVar);
        i02.f7537g = obj;
        return i02;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7536f;
        if (i3 == 0) {
            R1.a.e(obj);
            C0700A c0700a = (C0700A) this.f7537g;
            this.f7536f = 1;
            obj = U0.d(c0700a, EnumC0712j.f7296e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return obj;
    }
}
