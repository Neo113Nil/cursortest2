package h1;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t2.C1073z;

/* renamed from: h1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0498p extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f6182h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M f6183i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0498p(M m3, V1.d dVar) {
        super(2, dVar);
        this.f6183i = m3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((C0498p) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
        return W1.a.f4608d;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0498p(this.f6183i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6182h;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
            throw new C1.c();
        }
        R1.a.e(obj);
        C1073z c1073z = this.f6183i.f6095g;
        C0497o c0497o = C0497o.f6181d;
        this.f6182h = 1;
        c1073z.f9086d.d(c0497o, this);
        return aVar;
    }
}
