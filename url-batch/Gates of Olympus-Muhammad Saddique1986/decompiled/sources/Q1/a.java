package Q1;

import B.Y;
import R1.y;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class a extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f3959h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f3960i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J1.a f3961j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, J1.a aVar, V1.d dVar) {
        super(2, dVar);
        this.f3960i = cVar;
        this.f3961j = aVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((a) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new a(this.f3960i, this.f3961j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f3959h;
        y yVar = y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            K1.b bVar = (K1.b) this.f3960i.f3969b.f2914e;
            this.f3959h = 1;
            Y y3 = bVar.f3257a;
            J1.a aVar2 = this.f3961j;
            Object delete = ((G1.g) ((G1.b) y3.f334d)).delete(new G1.h(aVar2.f3159a, aVar2.f3160b, aVar2.f3161c, aVar2.f3162d, aVar2.f3163e), this);
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
