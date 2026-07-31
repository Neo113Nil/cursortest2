package F;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: F.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085b0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f1478h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0100i0 f1479i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0094f0 f1480j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0085b0(C0100i0 c0100i0, C0094f0 c0094f0, V1.d dVar) {
        super(2, dVar);
        this.f1479i = c0100i0;
        this.f1480j = c0094f0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0085b0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0085b0(this.f1479i, this.f1480j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f1478h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            C0094f0 c0094f0 = this.f1480j;
            this.f1478h = 1;
            C0100i0 c0100i0 = this.f1479i;
            c0100i0.f1574a = c0094f0.f1533a;
            c0100i0.f1575b = c0094f0.f1534b;
            c0100i0.f1576c = c0094f0.f1536d;
            c0100i0.f1577d = c0094f0.f1535c;
            Object b3 = c0100i0.b(this);
            if (b3 != aVar) {
                b3 = yVar;
            }
            if (b3 == aVar) {
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
