package n;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t2.InterfaceC1053f;

/* renamed from: n.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660C extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7024h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0661D f7025i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0660C(C0661D c0661d, V1.d dVar) {
        super(2, dVar);
        this.f7025i = c0661d;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0660C) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0660C(this.f7025i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7024h;
        if (i3 == 0) {
            R1.a.e(obj);
            f2.s sVar = new f2.s();
            f2.s sVar2 = new f2.s();
            f2.s sVar3 = new f2.s();
            C0661D c0661d = this.f7025i;
            InterfaceC1053f a3 = c0661d.f7026q.a();
            C0659B c0659b = new C0659B(sVar, sVar2, sVar3, c0661d, 0);
            this.f7024h = 1;
            if (a3.d(c0659b, this) == aVar) {
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
