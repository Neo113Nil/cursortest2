package z;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import u0.AbstractC1138z0;

/* renamed from: z.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257u extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10468h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1258v f10469i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1241e f10470j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1257u(C1258v c1258v, C1241e c1241e, V1.d dVar) {
        super(2, dVar);
        this.f10469i = c1258v;
        this.f10470j = c1241e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((C1257u) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
        return W1.a.f4608d;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C1257u(this.f10469i, this.f10470j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10468h;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
            throw new C1.c();
        }
        R1.a.e(obj);
        this.f10468h = 1;
        AbstractC1138z0.a(this.f10469i, this.f10470j, this);
        return aVar;
    }
}
