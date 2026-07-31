package x;

import e2.InterfaceC0426e;
import n0.C0702C;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* renamed from: x.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1211y extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10287h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0702C f10288i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z f10289j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1211y(C0702C c0702c, Z z3, V1.d dVar) {
        super(2, dVar);
        this.f10288i = c0702c;
        this.f10289j = z3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1211y) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C1211y(this.f10288i, this.f10289j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10287h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f10287h = 1;
            Object e3 = AbstractC0837y.e(new U(this.f10288i, this.f10289j, null), this);
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
