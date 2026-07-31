package Q1;

import B.Y;
import G1.m;
import G1.n;
import R1.y;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class i extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f3987h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f3988i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J1.d f3989j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, J1.d dVar, V1.d dVar2) {
        super(2, dVar2);
        this.f3988i = jVar;
        this.f3989j = dVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((i) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new i(this.f3988i, this.f3989j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f3987h;
        y yVar = y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            K1.a aVar2 = (K1.a) this.f3988i.f3990b.f2917h;
            this.f3987h = 1;
            Y y3 = aVar2.f3256a;
            J1.d dVar = this.f3989j;
            Object delete = ((m) ((G1.j) y3.f334d)).delete(new n(dVar.f3175a, dVar.f3176b, dVar.f3177c, dVar.f3178d, dVar.f3179e, dVar.f3180f, dVar.f3181g), this);
            if (delete != aVar) {
                delete = yVar;
            }
            if (delete != aVar) {
                delete = yVar;
            }
            if (delete == aVar) {
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
