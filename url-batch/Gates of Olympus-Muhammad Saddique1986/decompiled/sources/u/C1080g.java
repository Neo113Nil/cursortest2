package u;

import R1.y;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t0.AbstractC0993f;
import t0.b0;

/* renamed from: u.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1080g extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9103h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1082i f9104i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ K2.i f9105j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1080g(C1082i c1082i, K2.i iVar, V1.d dVar) {
        super(2, dVar);
        this.f9104i = c1082i;
        this.f9105j = iVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1080g) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C1080g(this.f9104i, this.f9105j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        InterfaceC1074a interfaceC1074a;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9103h;
        if (i3 == 0) {
            R1.a.e(obj);
            C1082i c1082i = this.f9104i;
            if (c1082i.f4501p) {
                if (c1082i.f4489d.f4501p) {
                    interfaceC1074a = (InterfaceC1074a) AbstractC0993f.j(c1082i, C1082i.f9111s);
                    if (interfaceC1074a == null) {
                        interfaceC1074a = new C1083j(c1082i);
                    }
                } else {
                    interfaceC1074a = null;
                }
                if (interfaceC1074a != null) {
                    b0 s3 = AbstractC0993f.s(c1082i);
                    this.f9103h = 1;
                    if (interfaceC1074a.P(s3, this.f9105j, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return y.f4171a;
    }
}
