package u2;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t2.AbstractC1035F;
import t2.InterfaceC1054g;

/* renamed from: u2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1153e extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9684h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9685i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1054g f9686j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC1155g f9687k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1153e(InterfaceC1054g interfaceC1054g, AbstractC1155g abstractC1155g, V1.d dVar) {
        super(2, dVar);
        this.f9686j = interfaceC1054g;
        this.f9687k = abstractC1155g;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1153e) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1153e c1153e = new C1153e(this.f9686j, this.f9687k, dVar);
        c1153e.f9685i = obj;
        return c1153e;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9684h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            s2.v i4 = this.f9687k.i((InterfaceC0835w) this.f9685i);
            this.f9684h = 1;
            Object i5 = AbstractC1035F.i(this.f9686j, i4, true, this);
            if (i5 != aVar) {
                i5 = yVar;
            }
            if (i5 == aVar) {
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
