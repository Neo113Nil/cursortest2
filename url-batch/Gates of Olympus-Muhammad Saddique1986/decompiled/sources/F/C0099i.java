package F;

import I.C0167p;
import e2.InterfaceC0426e;

/* renamed from: F.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099i extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1572f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q.a f1573g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0099i(InterfaceC0426e interfaceC0426e, Q.a aVar, int i3) {
        super(2);
        this.f1571e = i3;
        this.f1572f = interfaceC0426e;
        this.f1573g = aVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        R1.y yVar = R1.y.f4171a;
        int i3 = 0;
        InterfaceC0426e interfaceC0426e = this.f1572f;
        Q.a aVar = this.f1573g;
        switch (this.f1571e) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p.x()) {
                    c0167p.Q(1497073862);
                    if (interfaceC0426e != null) {
                        interfaceC0426e.h(c0167p, 0);
                    }
                    c0167p.p(false);
                    aVar.h(c0167p, 0);
                    break;
                } else {
                    c0167p.L();
                    break;
                }
                break;
            default:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p2.x()) {
                    float f3 = AbstractC0107m.f1658a;
                    AbstractC0107m.b(Q.f.b(1887135077, new C0099i(interfaceC0426e, aVar, i3), c0167p2), c0167p2, 438);
                    break;
                } else {
                    c0167p2.L();
                    break;
                }
        }
        return yVar;
    }
}
